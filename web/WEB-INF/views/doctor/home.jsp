<%--
  Created by IntelliJ IDEA.
  User: MacBook
  Date: 17/3/24
  Time: 上午12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Just Demo--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
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
<c:set var="username" value="${username}" scope="session"/>
<jsp:include page="../component/navbar.jsp" flush="true">
    <jsp:param name="pages" value="checklist"/>
</jsp:include>
<!—自适应布局-->
<div class="container-fluid">
    <div class="row">
        <!—左侧导航栏-->
        <jsp:include page="../search/sidebar.jsp" flush="true">
            <jsp:param name="pages" value="checklist"/>
        </jsp:include>

        <div class="main">
            
            <p>
                <!—一组按钮控件-->
                <a href="/doctor/search/checklist"><button type="button"  class="btn btn-lg btn-success">病患多维查询</button></a>
                <button type="button" class="btn btn-lg btn-primary">1</button>
                <button type="button" class="btn btn-lg btn-info">2</button>

            </p>
            <div class="row">
                <div class="col-md-6">
                    <!—panel面板，里面放置一些控件，下同-->
                    <div class="panel panel-primary">
                        <!—panel面板的标题，下同-->
                        <div class="panel-heading">
                            <h3 class="panel-title">最新病人列表</h3>
                        </div>
                        <!—panel面板的内容，下同-->
                        <div class="panel-body">
                            <div class="alert alert-danger" role="alert">
                                <strong>病人：</strong>王二<button type="button" class="btn  btn-success pull-right">详情</button>
                            </div>
                            <div class="alert alert-success" role="alert">
                                <strong>病人：</strong>王五<button type="button" class="btn  btn-success pull-right">详情</button>
                            </div>
                            <div class="alert alert-warning" role="alert">
                                <strong>病人：</strong>王六<button type="button" class="btn  btn-success pull-right">详情</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">

                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">数据展示</h3>
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked" role="tablist">
                                <li role="presentation">
                                    <a href="/doctor/statistics/patient" class="alert alert-info">
                                        <span class="badge pull-right">${patientQuantity}</span>
                                        患者数量
                                    </a>
                                </li>
                                <li role="presentation">
                                    <a href="/doctor/statistics/check" class="alert alert-info">
                                        <span class="badge pull-right">${checkItemQuantity}</span>
                                        检查项目数量
                                    </a>
                                </li>
                                <li role="presentation">
                                    <a href="/doctor/statistics/test" class="alert alert-info">
                                        <span class="badge pull-right">${testItemQuantity}</span>
                                        检验项目数量
                                    </a>
                                </li>
                                <li>
                                <li role="presentation">
                                    <p>&nbsp</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">病人动态</h3>
                        </div>
                        <div class="panel-body">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>时间段</th>
                                        <th>检查指标数量</th>
                                        <th>检验指标数量</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>最近一周</td>
                                        <td>${checkQuantityOfLastWeek}</td>
                                        <td>${testQuantityOfLastWeek}</td>
                                    </tr>
                                    <tr>
                                        <td>最近一月</td>
                                        <td>${checkQuantityOfLastMonth}</td>
                                        <td>${testQuantityOfLastMonth}</td>

                                    </tr>
                                    <tr>
                                        <td>最近一年</td>
                                        <td>${checkQuantityOfLastYear}</td>
                                        <td>${testQuantityOfLastYear}</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="/resources/jQuery/jquery-3.1.1.min.js"></script>
<script src="/resources/Bootstrap/js/bootstrap.min.js"></script>

</body>
