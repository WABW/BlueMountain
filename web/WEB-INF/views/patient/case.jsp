<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--Just Demo--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>Title</title>

    <!-- Bootstrap -->
    <link href="/resources/Bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row">
        <!—左侧导航栏-->
        <jsp:include page="../search/sidebar.jsp" flush="true">
            <jsp:param name="pages" value="checklist"/>
        </jsp:include>
        <table class="table table-bordered">
            <caption>病人信息</caption>
            <tr>
                <td>病人ID：</td>
                <td>年龄：</td>
                <td>性别：</td>
            </tr>
        </table>

        <table class="table table-bordered">
            <caption>检查清单</caption>
            <tr>
                <td colspan="2">检查单号：</td>
                <td colspan="2">检查子类：</td>
            </tr>
            <tr>
                <td colspan="4">临床症状：</td>
            </tr>
            <tr>
                <td colspan="4">体征表现：</td>
            </tr>
            <tr>
                <td colspan="4">临床诊断：</td>
            </tr>
            <tr>
                <td colspan="2">检查医师：</td>
                <td colspan="2">申请时间：</td>
            </tr>
            <tr>
                <td colspan="2">费用指标：</td>
                <td colspan="2">安排时间：</td>
            </tr>
            <tr>
                <td colspan="2">缴费方式：</td>
                <td colspan="2">出单时间：</td>
            </tr>
            <tr>
                <td colspan="4" rowspan="2">健康提醒：</td>
            </tr>
        </table>

        <table class="table table-bordered">
            <caption>检验清单</caption>
            <tr>
                <td colspan="2">检验单号：</td>
                <td colspan="2">临床诊断：</td>
            </tr>
            <tr>
                <td colspan="2">检验样本：</td>
                <td colspan="2">项目编号：</td>
            </tr>

            <tr>
                <td colspan="2">检查时间：</td>
                <td colspan="2">取样时间：</td>
            </tr>
            <tr>
                <td colspan="2">检查状态：</td>
                <td colspan="2">出单时间：</td>
            </tr>
            <tr>
                <td>门诊编号：</td>
                <td>主治医师：</td>
                <td>记录人员：</td>
                <td>验证签字：</td>
            </tr>


        </table>







    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/resources/jQuery/jquery-3.1.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/resources/Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>

