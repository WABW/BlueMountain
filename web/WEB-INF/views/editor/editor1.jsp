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
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <script type="text/javascript" charset="utf-8" src="/resources/Bycss/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="/resources/Bycss/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="/resources/Bycss/zh-cn.js"></script>
    <script src="/resources/checkScript/echarts.js"></script>



    <style>
        @import url('http://cdn.gbtags.com/twitter-bootstrap/3.2.0/css/bootstrap.css');
        @import url('http://cdn.gbtags.com/font-awesome/4.1.0/css/font-awesome.min.css');
        @import url('http://cdn.gbtags.com/summernote/0.5.2/summernote.css');
    </style>

    <!-- Bootstrap -->

</head>
<body>
<jsp:include page="../component/navbar.jsp" flush="true">
    <jsp:param name="pages" value="checklist"/>
</jsp:include>
<div class="container">
    <jsp:include page="../search/sidebar.jsp" flush="true">
        <jsp:param name="pages" value="checklist"/>
    </jsp:include>
    <div class="main">

        <div class="container-fluid">
            <div class="row-fluid">

                <div class="span12">
                    <div class="carousel slide" id="carousel-870859">
                        <ol class="carousel-indicators">
                            <li class="active" data-slide-to="0" data-target="#carousel-870859">
                            </li>
                            <li data-slide-to="1" data-target="#carousel-870859">
                            </li>
                            <li data-slide-to="2" data-target="#carousel-870859">
                            </li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="item active">
                                <center><img alt="" src="/resources/images/11.jpg" /></center>
                                <div class="carousel-caption">
                                    <h4>
                                        健康
                                    </h4>
                                    <p>
                                        爱运动，爱健康
                                    </p>
                                </div>
                            </div>
                            <div class="item">
                                <center><img alt="" src="/resources/images/22.jpg" /></center>
                                <div class="carousel-caption">
                                    <h4>
                                        健康
                                    </h4>
                                    <p>
                                        爱运动，爱健康
                                    </p>
                                </div>
                            </div>
                            <div class="item">
                                <center><img alt="" src="/resources/images/33.jpg" /></center>
                                <div class="carousel-caption">
                                    <h4>
                                        健康
                                    </h4>
                                    <p>
                                        爱运动，爱健康
                                    </p>
                                </div>
                            </div>
                        </div> <a data-slide="prev" href="#carousel-870859" class="left carousel-control">‹</a> <a data-slide="next" href="#carousel-870859" class="right carousel-control">›</a>
                    </div>
                </div>
            </div>
        </div>
        <p>&nbsp</p>

        <div class="container">
            <div class="row clearfix">
                <div class="col-md-10 column">
                    <div class="page-header">
                        <h3>
                            经常步行的人，最终会是这样的结果!
                        </h3>
                    </div>
                    <p>
                        世界上最好的运动是什么?走路!数据统计：每走一步，可推动人体50%的血液流动起来，活血化瘀;可挤压人体50%的血管，是简单的“血管体操”;至少可运动50%的肌肉，有助于保持肌肉总量。一起来看看走路的16条益处!<br/>1、增强记忆力随着年龄的增长，人的记忆力也在退转。步行能够增强记忆力，每天早上走路，记忆力会越来越强...
                    </p>    　　
                    <p>
                        <a class="btn" href="#">更多 »</a>
                    </p>
                </div>
            </div>
        </div>
        <p>&nbsp</p>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-10 column">
                    <div class="page-header">
                        <h3>

                            要想一辈子健康，记住医生的这10句话
                        </h3>
                    </div>
                    <p>
                        1、只吃七分饱<br/>饮食上吃到八分饱，限制总的能量摄入。而且每顿饭最好有主食，一汤三菜，外加水果和乳制品。少吃高盐、高脂、高能量食物，最朴素的、最天然的才是最健康的。<br/>
                        2、尽量少下馆子<br/>下馆子吃饭，一顿饭摄入的脂肪和钠就超过了全天推荐的摄入量(中国疾病预防控制中心北京调查数据)。因此，经常下馆子者易...
                    </p>
                    <p>
                        <a class="btn" href="#">更多 »</a>
                    </p>
                </div>
            </div>
        </div>
        <p>&nbsp</p>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-10 column">
                    <div class="page-header">
                        <h3>
                            饭后11件事为健康加分
                        </h3>
                    </div>
                    <p>
                        音乐不仅是艺术，而且可以养生健体、益寿延年，甚至可以治病疗疾。古籍《寿世保元》中有句话叫：“脾好音乐，闻声即动而磨食。”而道家也有“脾脏闻乐则磨”的说法。实际上，这两句话说的都是一个意思：音乐能够帮助消化<br/>
                        柔和轻快的音乐，乃至赏心悦目加环境，都可以作为一种良性刺激而通过中枢神经系统调节人...
                    </p>
                    <p>
                        <a class="btn" href="#">更多 »</a>
                    </p>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <ul class="pagination">
                        <li>
                            <a href="#">Prev</a>
                        </li>
                        <li>
                            <a href="#">1</a>
                        </li>
                        <li>
                            <a href="#">2</a>
                        </li>
                        <li>
                            <a href="#">3</a>
                        </li>
                        <li>
                            <a href="#">4</a>
                        </li>
                        <li>
                            <a href="#">5</a>
                        </li>
                        <li>
                            <a href="#">Next</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- 定义一个div容器 -->
        <sf:form method="POST">
            <div id="editor">
            </div>
            <div class="pull-right">
            <button class="btn btn-default" type="submit">Submit</button>
            </div>
        </sf:form>
        <p>&nbsp</p>
        <%--结束--%>
</div>

<script src="http://cdn.gbtags.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.gbtags.com/twitter-bootstrap/3.2.0/js/bootstrap.js"></script>
<script src="http://cdn.gbtags.com/summernote/0.5.2/summernote.min.js"></script>
<script>
    $('#editor').summernote();
</script>
</body>
</html>

