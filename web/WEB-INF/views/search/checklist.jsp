<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <table class="table table-hover">
        <tr>
            <th>Check List</th>
            <th>Check List2</th>
            <th>Check List3</th>
            <th>Check List4</th>
            <th>Check List5</th>
            <th>Check List6</th>
            <th>Check List7</th>
            <th>Check List8</th>
            <th>Check List9</th>
            <th>Check List10</th>
            <th>Check List11</th>
            <th>Check List12</th>
            <th>Check List13</th>
            <th>Check List14</th>
            <th>Check List15</th>
            <th>Check List16</th>
            <th>Check List17</th>
            <th>Check List18</th>


        </tr>

        <c:forEach items="${checkList}" var="checklist">
            <tr>
                <td>${checklist.examNo}</td>
                <td>${checklist.patientId}</td>
                <td>${checklist.visitId}</td>
                <td>${checklist.examsubClass}</td>
                <td>${checklist.clinicSymptom}</td>
                <td>${checklist.physicSign}</td>
                <td>${checklist.relevantDiag}</td>
                <td>${checklist.clinicDiag}</td>
                <td>${checklist.performedby}</td>
                <td>${checklist.patientsource}</td>
                <td>${checklist.requestDateTime}</td>
                <td>${checklist.requestDept}</td>
                <td>${checklist.scheduledDateTime}</td>
                <td>${checklist.notice}</td>
                <td>${checklist.resultStatus}</td>
                <td>${checklist.chargeIndicator}</td>
                <td>${checklist.chargeType}</td>
                <td>${checklist.realReportDateTime}</td>

            </tr>
        </c:forEach>
    </table>

</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/resources/jQuery/jquery-3.1.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/resources/Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
