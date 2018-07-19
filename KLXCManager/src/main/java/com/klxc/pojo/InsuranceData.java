package com.klxc.pojo;

import java.util.List;

public class InsuranceData {
    public static String getInsuranceHtml(String title, List<InsuranceInfo> list) {
        String html = "<!DOCTYPE html>";
        html += "<html lang=\"en\">";
        html += "<head>";
        html += "<meta charset=\"UTF-8\">";
        html += "<title>快来学车预报案人员信息</title>";
        html += "<style type=\"text/css\">";
        html += "body,table{";
        html += "font-size:12px;";
        html += "}";
        html += "table{";
        html += "table-layout:fixed;";
        html += "empty-cells:show;";
        html += "border-collapse: collapse;";
        html += "margin:0 auto;";
        html += "}";
        html += "td{";
        html += "height:30px;";
        html += "}";
        html += "h1,h2,h3{";
        html += "font-size:12px;";
        html += "margin:0;";
        html += "padding:0;";
        html += "}";
        html += ".table{";
        html += "border:1px solid #cad9ea;";
        html += "color:#666;";
        html += "}";
        html += ".table th {";
        html += "background-repeat:repeat-x;";
        html += "height:30px;";
        html += "}";
        html += ".table td,.table th{";
        html += "border:1px solid #cad9ea;";
        html += "padding:0 1em 0;";
        html += "}";
        html += ".table tr.alter{";
        html += "background-color:#f5fafe;";
        html += "}";
        html += ".info{";
        html += "margin:0 auto; display:table;font-family:微软雅黑;margin-bottom:10px;color:#666;";
        html += "font-size: 18px;";
        html += "}";
        html += "</style>";
        html += "</head>";
        html += "<body>";
        html += "<h1 class=\"info\">" + title + "</h1>";
        html += "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin:0 auto;\" class=\"table\">";
        html += "<thead>";
        html += "<tr><td>姓名</td><td>手机</td><td>身份证号</td><td>邮箱</td><td>时间</td></tr>";
        html += "</thead>";
        html += "<tbody>";
        for (InsuranceInfo info : list) {
            html += "<tr class=\"alter\">" + "<td>" + info.getName() + "</td>" + "<td>" + info.getPhone() + "</td>"
                    + "<td>" + info.getId_num() + "</td>" + "<td>" + info.getEmail() + "</td>" + "<td>"
                    + info.getCreate_time() + "</td></tr>";
        }
        html += "</tbody>";
        html += "</table>";
        html += "</body>";
        html += "</html>";
        return html;
    }

    public static String getPayForHtml(String title, List<PayForInfo> list) {
        String html = "<!DOCTYPE html>";
        html += "<html lang=\"en\">";
        html += "<head>";
        html += "<meta charset=\"UTF-8\">";
        html += "<title>快来学车预报案人员信息</title>";
        html += "<style type=\"text/css\">";
        html += "body,table{";
        html += "font-size:12px;";
        html += "}";
        html += "table{";
        html += "table-layout:fixed;";
        html += "empty-cells:show;";
        html += "border-collapse: collapse;";
        html += "margin:0 auto;";
        html += "}";
        html += "td{";
        html += "height:30px;";
        html += "}";
        html += "h1,h2,h3{";
        html += "font-size:12px;";
        html += "margin:0;";
        html += "padding:0;";
        html += "}";
        html += ".table{";
        html += "border:1px solid #cad9ea;";
        html += "color:#666;";
        html += "}";
        html += ".table th {";
        html += "background-repeat:repeat-x;";
        html += "height:30px;";
        html += "}";
        html += ".table td,.table th{";
        html += "border:1px solid #cad9ea;";
        html += "padding:0 1em 0;";
        html += "}";
        html += ".table tr.alter{";
        html += "background-color:#f5fafe;";
        html += "}";
        html += ".info{";
        html += "margin:0 auto; display:table;font-family:微软雅黑;margin-bottom:10px;color:#666;";
        html += "font-size: 18px;";
        html += "}";
        html += ".img_wid{";
        html += "width: 150px;";
        html += "height: 107px;";
        html += "margin-top: 7px;";
        html += "margin-bottom: 7px;";
        html += "}";
        html += "</style>";
        html += "</head>";
        html += "<body>";
        html += "<h1 class=\"info\">" + title + "</h1>";
        html += "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin:0 auto;\" class=\"table\">";
        html += "<thead>";
        html += "<tr><td>开户行</td><td>银行卡号</td><td>身份证正面</td><td>身份证反面</td><td>成绩单</td><td>时间</td></tr>";
        html += "</thead>";
        html += "<tbody>";
        for (PayForInfo info : list) {
            html += "<tr class=\"alter\">"
                    + "<td>" + info.getBank_name() + "</td>"
                    + "<td>" + info.getCard_no() + "</td>"
                    + "<td><img class=\"img_wid\" src=\"" + info.getSfz_up_url() + "\"></td>"
                    + "<td><img class=\"img_wid\" src=\"" + info.getSfz_down_url() + "\"></td>"
                    + "<td><img class=\"img_wid\" src=\"" + info.getExam_url() + "\"></td>"
                    + "<td>" + info.getCreate_time() + "</td></tr>";
        }
        html += "</tbody>";
        html += "</table>";
        html += "</body>";
        html += "</html>";
        return html;
    }
}
