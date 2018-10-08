package com.klxc.tool.task;

import java.util.Date;
import java.util.List;

import com.klxc.common.Const;
import com.klxc.pojo.InsuranceData;
import com.klxc.pojo.InsuranceInfo;
import com.klxc.pojo.PayForInfo;
import com.klxc.service.InsuranceService;
import com.klxc.tool.Log;
import com.klxc.tool.UtilTool;
import com.klxc.tool.email.EmailTool;
import com.klxc.util.TimeTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailTaskJob {

    private String[] address_nw = {"qiujing@klxc123.com", "qiujing@klxc123.com"};
    private String[] address_zs = {"tevin.zhao@bigins.cn", "yi.che@bigins.cn"};
    private String[] address = Const.isTest ? address_nw : address_zs;

    @Autowired
    private InsuranceService service;

    private void doInsuranceJob() {
        if (service == null) return;

        new Thread() {
            public void run() {
                String time = TimeTool.formatShortDateTime(new Date());
                List<InsuranceInfo> list = service.getInsuranceList();
                if (UtilTool.isExtNull(list)) {
                    return;
                }
                String title = "快来学车预报案人员信息-" + time;
                EmailTool.sendHtml(title, address[0], address[1], InsuranceData.getInsuranceHtml(title, list));
            }
        }.start();
    }

    private void doPayForJob() {
        if (service == null) return;

        new Thread() {
            public void run() {
                String time = TimeTool.formatShortDateTime(new Date());
                List<PayForInfo> list = service.getPayForList();
                if (UtilTool.isExtNull(list)) {
                    return;
                }
                String title = "快来学车理赔人员信息-" + time;
                EmailTool.sendHtml(title, address[0], address[1], InsuranceData.getPayForHtml(title, list));
            }
        }.start();
    }

    public void sendEmail() {
        Log.w("任务进行中。。。");
        doInsuranceJob();
        doPayForJob();
        Log.w("发送成功");
    }
}
