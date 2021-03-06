<!DOCTYPE html>
<html>
 <head> 
  <meta charset="UTF-8" /> 
  <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0;" name="viewport" /> 
  <meta name="applicable-device" content="pc,mobile" /> 
  <title>旅游景点</title> 
  <link href="${pageContext.request.contextPath}/css/list_common.css" type="text/css" rel="stylesheet" /> 
  <link href="${pageContext.request.contextPath}/css/list_jingdian.css" type="text/css" rel="stylesheet" /> 
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
      <form action="/jingdian/search.asp" method="GET" id="hd_form" target="_blank"> 
       <input type="text" class="input-text" value="" id="hd-input" name="keyword" placeholder="请输入景点名称" /> 
       <input type="submit" class="input-button" value="搜索" /> 
      </form> 
     </div> 
    </div> 
   </div> 
   <div class="container"> 
    <div class="main"> 
     <div class="breadcrumb"> 
      <div class="breadcrumb-box"> 
       <a href="index.jsp">联途</a>
       <span>&gt;</span> 
       <strong>旅游景点大全</strong> 
      </div> 
      <div class="share" id="bdshare"> 
       <div class="bdsharebuttonbox"></div> 
      </div> 
     </div> 
     <div class="sort"> 
      <div class="hd">
       区域
      </div> 
      <div class="bd"> 
       <div class="bd-box"> 
        <dl> 
         <dt>
          华南
         </dt> 
         <dd> 
          <a href="/jingdian/14/" target="_blank">福建</a> 
          <a href="/jingdian/20/" target="_blank">广东</a> 
          <a href="/jingdian/21/" target="_blank">广西</a> 
          <a href="/jingdian/22/" target="_blank">海南</a> 
         </dd> 
        </dl> 
        <dl> 
         <dt>
          华东
         </dt> 
         <dd> 
          <a href="/jingdian/13/" target="_blank">安徽</a> 
          <a href="/jingdian/11/" target="_blank">江苏</a> 
          <a href="/jingdian/16/" target="_blank">山东</a> 
          <a href="/jingdian/9/" target="_blank">上海</a> 
          <a href="/jingdian/12/" target="_blank">浙江</a> 
         </dd> 
        </dl> 
        <dl> 
         <dt>
          西南
         </dt> 
         <dd> 
          <a href="/jingdian/23/" target="_blank">重庆</a> 
          <a href="/jingdian/25/" target="_blank">贵州</a> 
          <a href="/jingdian/24/" target="_blank">四川</a> 
          <a href="/jingdian/27/" target="_blank">西藏</a> 
          <a href="/jingdian/26/" target="_blank">云南</a> 
         </dd> 
        </dl> 
        <dl> 
         <dt>
          中南
         </dt> 
         <dd> 
          <a href="/jingdian/18/" target="_blank">湖北</a> 
          <a href="/jingdian/19/" target="_blank">湖南</a> 
          <a href="/jingdian/17/" target="_blank">河南</a> 
          <a href="/jingdian/15/" target="_blank">江西</a> 
         </dd> 
        </dl> 
        <dl> 
         <dt>
          华北
         </dt> 
         <dd> 
          <a href="/jingdian/1/" target="_blank">北京</a> 
          <a href="/jingdian/3/" target="_blank">河北</a> 
          <a href="/jingdian/5/" target="_blank">内蒙古</a> 
          <a href="/jingdian/4/" target="_blank">山西</a> 
          <a href="/jingdian/2/" target="_blank">天津</a> 
         </dd> 
        </dl> 
        <dl> 
         <dt>
          东北
         </dt> 
         <dd> 
          <a href="/jingdian/8/" target="_blank">黑龙江</a> 
          <a href="/jingdian/7/" target="_blank">吉林</a> 
          <a href="/jingdian/6/" target="_blank">辽宁</a> 
         </dd> 
        </dl> 
        <dl> 
         <dt>
          西北
         </dt> 
         <dd> 
          <a href="/jingdian/29/" target="_blank">甘肃</a> 
          <a href="/jingdian/31/" target="_blank">宁夏</a> 
          <a href="/jingdian/30/" target="_blank">青海</a> 
          <a href="/jingdian/28/" target="_blank">陕西</a> 
          <a href="/jingdian/32/" target="_blank">新疆</a> 
         </dd> 
        </dl> 
        <dl> 
         <dt>
          港澳台
         </dt> 
         <dd> 
          <a href="/jingdian/34/" target="_blank">澳门</a> 
          <a href="/jingdian/10/" target="_blank">台湾</a> 
          <a href="/jingdian/33/" target="_blank">香港</a> 
         </dd> 
        </dl> 
       </div> 
      </div> 
     </div> 
     <div class="recommend"> 
      <div class="hd"> 
       <span>热门旅游景点推荐</span> 
       <!--<a href="" target="_blank">更多>></a>--> 
      </div> 
      <div class="bd bd2"> 
       <ul> 
        <li><a href="/jingdian/248.htm" target="_blank">武侯祠</a><span>四川省成都市武侯区</span></li> 
        <li><a href="/jingdian/781.htm" target="_blank">太姥山</a><span>福建省宁德市福鼎市</span></li> 
        <li><a href="/jingdian/11.htm" target="_blank">大炮台</a><span>澳门圣安多尼堂区</span></li> 
        <li><a href="/jingdian/796.htm" target="_blank">龙硿洞</a><span>福建省龙岩市新罗区</span></li> 
        <li><a href="/jingdian/590.htm" target="_blank">何园</a><span>江苏省扬州市广陵区</span></li> 
        <li><a href="/jingdian/756.htm" target="_blank">古井酒文化博览园</a><span>安徽省亳州市谯城区</span></li> 
        <li><a href="/jingdian/873.htm" target="_blank">浮来山</a><span>山东省日照市莒县</span></li> 
        <li><a href="/jingdian/552.htm" target="_blank">中华礼乐城</a><span>陕西省宝鸡市渭滨区</span></li> 
        <li><a href="/jingdian/634.htm" target="_blank">官渡古镇</a><span>云南省昆明市官渡区</span></li> 
        <li><a href="/jingdian/337.htm" target="_blank">天门山</a><span>湖南省张家界市永定区</span></li> 
        <li><a href="/jingdian/822.htm" target="_blank">得雨生态园</a><span>江西省景德镇市昌江区</span></li> 
        <li><a href="/jingdian/510.htm" target="_blank">梅花河狩猎场</a><span>黑龙江省伊春市乌马河区</span></li> 
        <li><a href="/jingdian/614.htm" target="_blank">大伊山</a><span>江苏省连云港市灌云县</span></li> 
        <li><a href="/jingdian/283.htm" target="_blank">三清山</a><span>江西省上饶市玉山县德兴市</span></li> 
        <li><a href="/jingdian/838.htm" target="_blank">七星景区</a><span>广西省桂林市七星区</span></li> 
        <li><a href="/jingdian/130.htm" target="_blank">青海湖鸟岛</a><span>青海海北藏族自治州刚察县</span></li> 
        <li><a href="/jingdian/740.htm" target="_blank">王稼祥纪念园</a><span>安徽省芜湖市镜湖区</span></li> 
        <li><a href="/jingdian/900.htm" target="_blank">星湖湿地公园</a><span>广东省肇庆市端州区</span></li> 
        <li><a href="/jingdian/102.htm" target="_blank">葡萄沟</a><span>新疆吐鲁番市</span></li> 
        <li><a href="/jingdian/987.htm" target="_blank">镜泊湖</a><span>黑龙江省牡丹江市宁安市</span></li> 
        <li><a href="/jingdian/101.htm" target="_blank">老虎滩海洋公园</a><span>辽宁省大连市中山区</span></li> 
        <li><a href="/jingdian/251.htm" target="_blank">宏村</a><span>安徽省黄山市黟县</span></li> 
        <li><a href="/jingdian/207.htm" target="_blank">木府</a><span>云南省丽江市古城区</span></li> 
        <li><a href="/jingdian/800.htm" target="_blank">客家祖地</a><span>福建省三明市宁化县</span></li> 
        <li><a href="/jingdian/473.htm" target="_blank">五泉山公园</a><span>甘肃兰州市城关区</span></li> 
        <li><a href="/jingdian/772.htm" target="_blank">神龙峡</a><span>重庆南川区</span></li> 
        <li><a href="/jingdian/1018.htm" target="_blank">曲阜三孔</a><span>山东省济宁市曲阜市</span></li> 
        <li><a href="/jingdian/1.htm" target="_blank">漓江</a><span>广西省桂林市阳朔县</span></li> 
        <li><a href="/jingdian/854.htm" target="_blank">周村古商城</a><span>山东省淄博市周村区</span></li> 
        <li><a href="/jingdian/416.htm" target="_blank">清福陵</a><span>辽宁省沈阳市</span></li> 
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
   <script type="text/javascript">
<!--
bdshare();
//-->
</script> 
  </div> 
  <div class="hide"> 
   <script type="text/javascript" src="${pageContext.request.contextPath}/js/tongji.js"></script> 
  </div>  
 </body>
</html>