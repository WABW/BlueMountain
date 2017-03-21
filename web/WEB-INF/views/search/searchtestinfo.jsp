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
    <div class="panel panel-default">
        <sf:form action="/search/searchtestinfo" method="POST">
            检验项：<select name="testItems">
            <option value=""><c:out value="- 不限 -" /></option>
            　　<c:forEach items="${checkItem}" var="checkItem">
            　　　　<option value="${checkItem.examclass}">${checkItem.examclass}</option>
        </c:forEach>
            </select>

            <div id="select-container">
            </div>
            <a id="add" onclick="addSelect('select-container');">增加查询条件</a>
            <%--==================================--%>



            <span class="input-group-btn">
                <button class="btn btn-default" type="submit">Submit</button>
            </span>



        </sf:form>




    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/resources/jQuery/jquery-3.1.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/resources/Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
