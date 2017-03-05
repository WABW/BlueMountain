<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MainasuK
  Date: 2017-3-5
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
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
    <div class="row" style="margin-top: 44px">
        <div class="col-md-8">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <c:if test='${null != username && "" != username}'>
                        欢迎登陆，${username}
                    </c:if>
                    Heading
                </div>
                <div class="panel-body">
                    Body
                </div>
                <div class="panel-footer">
                    Footer
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h4>超市管理系统</h4>
                </div>
                <div class="panel-body">
                    <sf:form action="/" method="post">
                        <div class="form-group">
                            <label>用户名</label>
                            <input class="form-control" type="text" name="username">
                        </div>
                        <div class="form-group">
                            <label>密码</label>
                            <input class="form-control" type="password" name="password">
                        </div>
                        <div class="form-group">
                            <input class="form-control btn btn-primary" type="submit" value="登录">
                        </div>
                        <c:if test="${null != param.error}">
                            <!-- Display error message -->
                            <small style="color: red">用户名或密码错误</small>
                        </c:if>
                    </sf:form>
                </div>

            </div>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/resources/jQuery/jquery-3.1.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/resources/Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
