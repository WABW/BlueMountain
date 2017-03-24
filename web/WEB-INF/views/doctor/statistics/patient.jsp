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
<jsp:include page="../../search/navbar.jsp" flush="true">
    <jsp:param name="pages" value="checklist"/>
</jsp:include>

<div class="container">
    <div class="row">
        <!—左侧导航栏-->
        <jsp:include page="../../search/sidebar.jsp" flush="true">
            <jsp:param name="pages" value="checklist"/>
        </jsp:include>

        <!—右侧管理控制台-->
        <div class="main">
            <sf:form method="POST">
                <div class="row">

                    <%--<form class="form-inline" method="post">--%>
                        <div class="form-group">


                            <label for="gender" ></label>
                            <div class="col-xs-2">
                                <select name="gender" id="gender" class="form-control" >
                                    <option value="">-所有性别-</option>
                                    <option value="男">- 男性 -</option>
                                    <option value="女">- 女性 -</option>
                                </select>
                            </div>

                            <label for="department" ></label>
                            <div class="col-xs-2">
                                <select name="department" id="department" class="form-control" >
                                    <option value=""><c:out value="-所有科室-" /></option>
                                    <c:forEach items="${departments}" var="department">
                                        　　　　<option value="${department.departmentName}">${department.departmentName}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="col-xs-2">
                                <input type="text" class="form-control" id="min" name="min" value="" placeholder="最小年龄">
                            </div>
                            <div class="col-xs-2">
                                <input type="text" class="form-control" id="max" name="max" value="" placeholder="最大年龄">
                            </div>


                            <button class="btn btn-default" type="submit">Submit</button>
                        </div>
                    <%--</form>--%>

                    <table class="table table-hover">

                        <tr>
                            <th>病患ID</th>
                            <th>病患性别</th>
                            <th>出生日期</th>
                            <th>检查项数目</th>
                            <th>检验项数目</th>

                        </tr>

                        <c:forEach items="${patients}" var="patient">
                            <tr>
                                <td>${patient.patientId}</td>
                                <td>${patient.sex}</td>
                                <td>${patient.dateOfBirth}</td>
                                <td>${patient.checkCount}</td>
                                <td>${patient.testCount}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </sf:form>
        </div>
    </div>
</div>



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/resources/jQuery/jquery-3.1.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/resources/Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
