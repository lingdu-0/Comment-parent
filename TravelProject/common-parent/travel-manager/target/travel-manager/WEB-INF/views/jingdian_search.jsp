<!DOCTYPE html>
<html>
 <head> 
  <meta charset="UTF-8" /> 
  <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0;" name="viewport" /> 
  <meta name="applicable-device" content="pc,mobile" /> 
  <title>景点搜索 联途</title> 
  <link href="${pageContext.request.contextPath}/css/list_common.css" type="text/css" rel="stylesheet" /> 
  <link href="${pageContext.request.contextPath}/css/list.css" type="text/css" rel="stylesheet" /> 
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script> 
 </head> 
 <body> 
  <div class="wraper"> 
   <div class="header"> 
    <div class="hd-box"> 
     <div class="logo">
      <a href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt="联途" /></a>
     </div> 
     <div class="nav"> 
      <div class="trigger"></div> 
      <ul> 
       <li><a href="gonglue.jsp">旅游攻略</a></li>
       <li class="active"><a href="jingdian.jsp">旅游景点</a></li>
      </ul> 
     </div> 
     <div id="search" class="search"> 
      <form action="/jingdian/search.asp" method="GET" id="hd_form"> 
       <input type="hidden" name="c" value="1" /> 
       <input type="text" class="input-text" value="" id="hd-input" name="keyword" placeholder="请输入景点名称" /> 
       <input type="submit" class="input-button" value="搜索" /> 
      </form> 
     </div> 
    </div> 
   </div> 
   <div class="container"> 
    <div class="main"> 
     <div class="breadcrumb"> 
      <a href="index.jsp">联途</a>
      <span>&gt;</span> 
      <a href="jingdian.jsp">旅游景点</a>
      <span>&gt;</span> 
      <strong>旅游景点搜索</strong> 
      <div class="share" id="bdshare"> 
       <div class="bdsharebuttonbox"></div> 
      </div> 
     </div> 
     <div class="list"> 
      <div class="hd">
       旅游景点搜索
      </div> 
      <div class="bd"> 
       <ul> 
        <li><a href="/jingdian/1895.htm" target="_blank">罗山湖水上乐园</a><span>广西省桂林市临桂区</span></li> 
        <li><a href="/jingdian/1867.htm" target="_blank">愚自乐园</a><span>广西省桂林市阳朔县</span></li> 
        <li><a href="/jingdian/1822.htm" target="_blank">上思十万大山百鸟乐园</a><span>广西省防城港市上思县</span></li> 
        <li><a href="/jingdian/1731.htm" target="_blank">哈尔滨游乐园</a><span>黑龙江省哈尔滨市南岗区</span></li> 
        <li><a href="/jingdian/1600.htm" target="_blank">潍坊金宝乐园</a><span>山东省潍坊市奎文区</span></li> 
        <li><a href="/jingdian/1592.htm" target="_blank">青云山民俗游乐园</a><span>山东省潍坊市安丘市</span></li> 
        <li><a href="/jingdian/1553.htm" target="_blank">徐州乐园</a><span>江苏省徐州市云龙区</span></li> 
        <li><a href="/jingdian/1544.htm" target="_blank">常州淹城春秋乐园</a><span>江苏省常州市武进区</span></li> 
        <li><a href="/jingdian/1478.htm" target="_blank">苏州乐园</a><span>江苏省苏州市虎丘区</span></li> 
        <li><a href="/jingdian/1391.htm" target="_blank">温州乐园</a><span>浙江省温州市瓯海区</span></li> 
       </ul>
       <ul> 
        <li><a href="/jingdian/1370.htm" target="_blank">宁波凤凰山主题乐园</a><span>浙江省宁波市北仑区</span></li> 
        <li><a href="/jingdian/1342.htm" target="_blank">杭州乐园</a><span>浙江省杭州市萧山区</span></li> 
        <li><a href="/jingdian/1219.htm" target="_blank">石景山游乐园</a><span>北京石景山区</span></li> 
        <li><a href="/jingdian/919.htm" target="_blank">郑州世纪欢乐园</a><span>河南省郑州市管城回族区</span></li> 
        <li><a href="/jingdian/861.htm" target="_blank">金宝乐园</a><span>山东省潍坊市奎文区</span></li> 
        <li><a href="/jingdian/678.htm" target="_blank">温州乐园</a><span>浙江省温州市瓯海区</span></li> 
        <li><a href="/jingdian/668.htm" target="_blank">凤凰山海港乐园</a><span>浙江省宁波市北仑区</span></li> 
        <li><a href="/jingdian/618.htm" target="_blank">淹城春秋乐园</a><span>江苏省常州市武进区</span></li> 
        <li><a href="/jingdian/524.htm" target="_blank">黑宝熊乐园</a><span>黑龙江省牡丹江市爱民区</span></li> 
        <li><a href="/jingdian/417.htm" target="_blank">皇家海洋乐园</a><span>辽宁省抚顺市望花区</span></li> 
       </ul>
       <ul> 
        <li><a href="/jingdian/28.htm" target="_blank">香港迪士尼乐园</a><span>香港离岛区</span></li> 
       </ul> 
      </div> 
     </div> 
    </div> 
   </div> 
   <div class="footer"> 
    <div class="ft-box"> 
     <p><a href="index.jsp">联途旅游网</a> &copy;2015</p>
    </div> 
   </div> 
   <script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script> 
   <script type="text/javascript" src="${pageContext.request.contextPath}/js/list.js"></script> 
   <script type="text/javascript">
bdshare();
</script> 
  </div> 
  <div class="hide"> 
   <script type="text/javascript" src="${pageContext.request.contextPath}/js/tongji.js"></script> 
  </div>  
 </body>
</html>