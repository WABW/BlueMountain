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
        <sf:form action="/search/searchcheckinfo" method="POST">
            <%--========================--%>
            <%--<div id="addDiv">--%>
                <%--<div id="row1"><a onclick='addRow()'>+</a><a onclick='delRow()'>-</a><br>--%>

                    <%--<select name="row1" id="row1">--%>
                        <%--<option value="并含">并含</option>--%>
                        <%--<option value="并或">并或</option>--%>
                        <%--<option value='不含'>不含</option>--%>
                    <%--</select><input type='text' name='textfield' id='textfield'>--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--===================================--%>

            <%--==================================--%>
            检查项：<select name="department">
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



<%--<script type="text/javascript">--%>

    <%--function addRow(){--%>
        <%--var rownum=document.getElementsByTagName("div").length;--%>
        <%--var tem= rownum;--%>
        <%--var divHtml="<div id='row"+tem+"'><select  id='cloum"+tem+"'><option value='并含'>并含</option><option value='并或'>并或</option><option value='不含'>不含</option> </select><input type='text'  id='textfield"+tem+"'> </div>";--%>

        <%--document.getElementById("row1").innerHTML+=divHtml;--%>

        <%--}--%>
<%--//    }--%>
    <%--function delRow(){--%>

        <%--var index=document.getElementsByTagName("div").length-1;--%>
        <%--if(index>1){--%>
            <%--document.getElementById("row"+index).remove();--%>
        <%--}--%>

    <%--}--%>
<%--</script>--%>

<script>

    function dateGenerate() {
        var date = new Date(), dateArray = new Array(), i;
        curYear = date.getFullYear();
//        for(i = 0; i<5; i++) {
//            dateArray[i] = curYear+i;
//        }
        dateArray[0]="并含";
        dateArray[1]="并或";
        dateArray[2]="不含";
        return dateArray;
    }
    // The Above function will create an array of five consecutive year from the the current year.
    var tem=0;
    var inputtem=0;
    function addSelect(divname) {
        tem++;
        inputtem++;
        var newDiv=document.createElement('div');
        var html = '<select name=item'+tem+' >', dates = dateGenerate(), i;
        for(i = 0; i < dates.length; i++) {
            html += "<option value='"+dates[i]+"'>"+dates[i]+"</option>";
        }
        html += '</select>-<input name=input'+inputtem+'>';
        newDiv.innerHTML= html;
        document.getElementById(divname).appendChild(newDiv);
    }


    function delSelect(){
        var index = document.getElementsByName('div');




    }


</script>



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/resources/jQuery/jquery-3.1.1.min.js"></script>


<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/resources/Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
