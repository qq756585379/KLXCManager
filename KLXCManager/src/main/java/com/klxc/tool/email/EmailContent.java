package com.klxc.tool.email;

public class EmailContent {
    private static final String txtContent = "" + "亲爱的用户：\n" + "您好！\n\n" + "感谢您使用30000天,点击下面链接可以激活绑定\n";

    private static final String txtContent1 = "\n\n" + "(如果您无法点击此链接，请将它复制到浏览器地址栏后访问)\n\n"
            + "如确认为本人操作，请忽略此邮件，由此给您带来的不便请谅解！";

    public static String getEmailTxt(int userId, String token) {
        String urlStr = "";// Version.host+"bind/bindEmail?userId="+userId+"&token="+token;
        return txtContent + urlStr + txtContent1;
    }

    public static String getHtml() {
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
        html += "<h1 class=\"info\">快来学车预报案人员信息</h1>";
        html += "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin:0 auto;\" class=\"table\">";
        html += "<thead>";
        html += "<tr><td>姓名</td><td>手机</td><td>身份证号</td><td>邮箱</td><td>时间</td></tr>";
        html += "</thead>";
        html += "<tbody>";
        html += "<tr class=\"alter\"><td>ios</td><td>1515115551</td><td>44545454545</td><td>454545454545445</td><td>4545454545</td></tr>";
        html += "</tbody>";
        html += "</table>";
        html += "</body>";
        html += "</html>";
        return html;
    }
}
