<!DOCTYPE html>
<html lang="zh-CN">
 <head> 
  <meta charset="utf-8" /> 
  <title>同游 - 发起</title> 
  <meta name="renderer" content="webkit" /> 
  <meta http-equiv="mobile-agent" content="format=html5; url=http://m.liantu.cntongyou_add.html" /> 
  <meta http-equiv="Cache-Control" content="no-transform" /> 
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" /> 
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css" /> 
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/create.css" /> 
  <script type="text/javascript">
var TU={
wwwUrl:'http://www.liantu.cn',
myUrl:'http://my.liantu.cn',
imageUrl:'http://static.liantu.cn/image/',
domain:'liantu.cn',
today:'2016-03-08',
mobile_agent:'http://m.liantu.cntongyou_add.html'
};
var isMobi = (function(){
var u = navigator.userAgent.toLowerCase();
return  u.indexOf("mobi") > 0 || u.indexOf("nexus 7") > 0 || u.indexOf("480") > 0;
})();
if(isMobi&&TU.mobile_agent!=''){
location.href = TU.mobile_agent;
}
</script> 
  <script type="text/javascript" id="js-prelogin" src="${pageContext.request.contextPath}/js/cas.js"></script> 
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.seajs.js" id="seajsnode"></script> 
  <!--[if lte IE 8]>
<script type="text/javascript">
$(function(){
var $body=$('body');
var $window =  $(window);
$window.resize(function() {
var width = $window.width();
if(width<768){
$body.addClass("media-small").removeClass("media-medium");
}else if(width<1300){
$body.addClass("media-medium").removeClass("media-small");
}else{
$body.removeClass("media-small").removeClass("media-medium");
}
}).resize();
});
</script>
<![endif]--> 
 </head> 
 <body> 
  <div class="wrapper"> 
   <div class="header"> 
    <div class="mod-head"> 
     <div class="bg"></div> 
     <div class="box"> 
      <div class="logo">
       <a href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt="联途" /></a>
      </div> 
      <div class="J_search search"> 
       <div class="sbox"> 
        <input type="text" class="text" placeholder="输入想去的地方（例如：北京）" /> 
        <span class="ico"><span></span></span> 
       </div> 
      </div> 
      <div class="login pl-login-info" id="pl-login-info"></div> 
     </div> 
    </div> 
   </div>
   <div class="container"> 
    <div class="inner"> 
     <div class="main"> 
      <div class="mod-crumbs"> 
       <a href="index.jsp">首页</a>
       <span class="symbol"> &gt; </span> 
       <a href="/tongyou/">同游</a>
       <span class="symbol"> &gt; </span>
       <span>发布同游</span> 
      </div> 
      <div class="mod-main"> 
       <div class="hd"> 
        <h1>发布一个同游</h1> 
       </div> 
       <div class="bd"> 
        <ul> 
         <li class="item z-index5"> <label>哪里</label> 
          <div class="suggset box"> 
           <input type="text" class="input-text place station " name="from" placeholder="出发地" value="" data-error="请输入出发地" /> 
          </div> <span class="text txt-place">~</span> 
          <div class="suggset box"> 
           <input type="text" class="input-text place station" name="to" placeholder="目的地" value="" data-error="请输入目的地" /> 
          </div> <span class="date-text"> <input type="text" class="input-text mouse-click day date" placeholder="出发日期" id="date" name="startdate" value="" readonly="" /> <label for="date" class="calendar"></label> </span> <span class="text">日</span> <span class="text">共</span> 
          <div class="select-div select-date" onselectstart="return false;"> 
           <select name="day" class="select"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option> <option value="4">4</option> <option value="5">5</option> <option value="6">6</option> <option value="7">7</option> <option value="8">8</option> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> <option value="31">31</option> </select> 
          </div> <span class="text">天</span> </li> 
         <li class="item"> <label>标题</label> 
          <div class="suggset tit"> 
           <input type="text" class="input-text title long-text" name="title" value="" readonly="readonly" disabled="disabled" /> 
          </div> </li> 
         <li class="item"> <label>内容</label> 
          <div class="suggset tit"> 
           <textarea type="text" class="text-main textarea" name="description" placeholder="可以谈谈想法或者计划、行程，越生动详细越会吸引人哦~" value="" data-error="请输入描述"></textarea> 
           <span class="text-count"> 还可以输入<span class="word">0</span>字 </span> 
          </div> </li> 
         <li class="item z-index5"> 
          <div class="info"> 
           <label>联系方式</label> 
           <div class="select-div contact-div"> 
            <select name="contacttype" class="contact-type"> <option value="qq">QQ</option> <option value="mobile">手机</option> <option value="wechat">微信</option> </select> 
           </div> 
           <div class="suggset way"> 
            <input type="text" class="input-text contactnumber" name="contactnumber" data-error="请输入联系方式" data-mobile="18005151538" data-qq="" /> 
           </div> 
          </div> 
          <div class="more"> 
           <label>最多</label> 
           <div class="select-div"> 
            <select name="person" class="person" id=""> <option value="2">2</option> <option value="3">3</option> <option value="4">4</option> <option value="5">5</option> <option value="6">6</option> <option value="7">7</option> <option value="8">8</option> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> <option value="31">31</option> <option value="32">32</option> <option value="33">33</option> <option value="34">34</option> <option value="35">35</option> <option value="36">36</option> <option value="37">37</option> <option value="38">38</option> <option value="39">39</option> <option value="40">40</option> <option value="41">41</option> <option value="42">42</option> <option value="43">43</option> <option value="44">44</option> <option value="45">45</option> <option value="46">46</option> <option value="47">47</option> <option value="48">48</option> <option value="49">49</option> <option value="50">50</option> <option value="51">51</option> <option value="52">52</option> <option value="53">53</option> <option value="54">54</option> <option value="55">55</option> <option value="56">56</option> <option value="57">57</option> <option value="58">58</option> <option value="59">59</option> <option value="60">60</option> <option value="61">61</option> <option value="62">62</option> <option value="63">63</option> <option value="64">64</option> <option value="65">65</option> <option value="66">66</option> <option value="67">67</option> <option value="68">68</option> <option value="69">69</option> <option value="70">70</option> <option value="71">71</option> <option value="72">72</option> <option value="73">73</option> <option value="74">74</option> <option value="75">75</option> <option value="76">76</option> <option value="77">77</option> <option value="78">78</option> <option value="79">79</option> <option value="80">80</option> <option value="81">81</option> <option value="82">82</option> <option value="83">83</option> <option value="84">84</option> <option value="85">85</option> <option value="86">86</option> <option value="87">87</option> <option value="88">88</option> <option value="89">89</option> <option value="90">90</option> <option value="91">91</option> <option value="92">92</option> <option value="93">93</option> <option value="94">94</option> <option value="95">95</option> <option value="96">96</option> <option value="97">97</option> <option value="98">98</option> <option value="99">99</option> <option value="100">100</option> </select> 
           </div> 
           <span class="text">人</span> 
          </div> </li> 
         <li class="item pd8"> 
          <div class="ajaxmsg"></div> </li> 
         <li class="item pd20"> 
          <div class="btn"> 
           <input type="submit" class="submit" value="发布同游" /> 
          </div> </li> 
        </ul> 
       </div> 
      </div> 
      <div class="mod-newshare"> 
       <div class="share"> 
        <span>分享到：</span> 
        <div class="bdsharebuttonbox"> 
        </div> 
       </div> 
       <p>友情提示：</p> 
       <p>1.标题有新意、附带真实头像和详细行程的结伴更受欢迎</p> 
       <p>2.非旅行相关的诸如租房、求职、征婚、招聘类帖子将被删除</p> 
      </div> 
     </div> 
    </div> 
   </div> 
   <div class="footer"> 
    <div class="mod-back"> 
     <span class="qrcode"> <span class="ico"></span> <img src="${pageContext.request.contextPath}/images/qrcode.jpg" alt="联途微信二维码" width="200" height="200" />官方微信服务号 </span> 
     <a href="javascript:" class="code" id="code"></a> 
     <a href="index.jsp" class="customer"></a>
     <a href="#" class="goback"></a> 
    </div> 
    <div class="mod-foot"> 
     <div class="info"> 
      <div class="contact"> 
       <p class="logo"> <a href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt="联途" width="136" height="50" /></a> <span>同行之路，有你才有意义</span> </p>
       <p class="tell">4006 666863</p> 
       <p>24小时服务热线</p> 
      </div> 
      <dl> 
       <dt>
        公司信息
       </dt> 
       <dd>
        <a href="about.jsp" target="_blank" rel="nofollow">关于我们</a>
       </dd> 
       <dd>
        <a href="copyright.jsp" target="_blank" rel="nofollow">免责声明</a>
       </dd> 
       <dd>
        <a href="contact.jsp" target="_blank" rel="nofollow">联系我们</a>
       </dd> 
       <dd>
        <a href="join.jsp" target="_blank" rel="nofollow">加入我们</a>
       </dd> 
      </dl> 
      <dl> 
       <dt>
        帮助中心
       </dt> 
       <dd>
        <a href="xieyi.jsp" target="_blank" rel="nofollow">用户协议</a>
       </dd> 
       <dd>
        <a href="safe.jsp" target="_blank" rel="nofollow">安全保障</a>
       </dd> 
       <dd>
        <a href="process.jsp" target="_blank" rel="nofollow">预定流程</a>
       </dd> 
      </dl> 
      <dl class="app"> 
       <dt>
        发现
       </dt> 
       <dd>
        <a href="/app/" target="_blank">Android客户端</a>
       </dd> 
       <dd>
        <a href="/app/" target="_blank">iOS客户端</a>
       </dd> 
       <dd>
        <a href="/app/huilv/" target="_blank">联途汇率</a>
       </dd> 
       <dd>
        <a href="/app/tongyou/" target="_blank">联途同游</a>
       </dd> 
      </dl> 
     </div> 
     <div class="copyright"> 
      <a href="http://www.miitbeian.gov.cn/" target="_blank" rel="nofollow">闽ICP备15007411号-1</a> Copyright &copy; 2016 liantu.cn, All Rights Reserved stat 
     </div> 
    </div> 
   </div> 
  </div> 
  <script type="text/javascript">
(function(){
var $info3 = $('.pl-login-info');
PL.init({
domain:'http://my.liantu.cn',
callback:function(nickName,html){
!PL.MID ? (function () {
html.push('<div class="info"><a href="javascript:;" onclick="TU.login();">登录</a></div>');
})() : (function () {
var num=PL.type?(PL.merchantlaunchordernum+PL.merchantordernum):PL.memberordernum;
html.push('<div class="user">'+(num>0?'<span class="num"><span>'+num+'</span></span>':'')+'<img src="'+PL.avatar+'" alt="' + nickName + '" width="40" height="40"/><span class="name">' + nickName + '</span><span class="ico"></span></div>');
if(PL.type){
html.push('\
<div class="list">\
<div class="ico"></div>\
<ul>\
<li class="d-pc"><a href="http://my.liantu.cn/merchant/">商户信息</a></li>\
<li><a href="http://my.liantu.cn/merchant/order/reserve/">'+(PL.merchantlaunchordernum?'<span class="num"><span>'+PL.merchantlaunchordernum+'</span></span>':'')+'预约管理</a></li>\
<li><a href="http://my.liantu.cn/merchant/order/">'+(PL.merchantordernum?'<span class="num"><span>'+PL.merchantordernum+'</span></span>':'')+'订单管理</a></li>\
<li class="d-m"><a href="http://my.liantu.cn/merchant/account/">我的钱包</a></li>\
<li class="d-m"><a href="/banyou/">伴游</a></li>\
<li class="d-m"><a href="/daoyou/">导游</a></li>\
<li class="d-m"><a href="/tongyou/">同游</a></li>\
<li class="d-pc"><a href="javascript:;" onclick="TU.logout();">退出</a></li>\
</ul>\
</div>');
}else{
html.push('\
<div class="list">\
<div class="ico"></div>\
<ul>\
<li class="d-pc"><a href="member_info.jsp">个人信息</a></li>\
<li><a href="member_order.jsp">'+(PL.memberordernum>0?'<span class="num"><span>'+PL.memberordernum+'</span></span>':'')+'我的订单</a></li>\
<li><a href="member_tongyou.jsp">我的同游</a></li>\
<li class="d-m"><a href="http://my.liantu.cnmember_withdraw.html">我的钱包</a></li>\
<li class="d-m"><a href="/banyou/">伴游</a></li>\
<li class="d-m"><a href="/daoyou/">导游</a></li>\
<li class="d-m"><a href="/tongyou/">同游</a></li>\
<li class="d-pc"><a href="javascript:" onclick="TU.logout();">退出</a></li>\
</ul>\
</div>');
}
})();
if (!pl_status &&!PL.type) {
var div=document.createElement('div');
div.className='link';
div.innerHTML='<a href="apply.jsp" target="_blank">申请成为向导</a>';
var $info=document.getElementById('pl-login-info');
if($info){
$info.parentNode.insertBefore(div,$info);
}
}
pl_status=1;
}
});
})();
var pl_status=0;
</script> 
 
  <script type="text/javascript">
seajs.config({
base: 'http://static.liantu.cn/script/dist',
paths: {
'modules': 'http://static.liantu.cn/script/dist'
},
map: [
[/^(.*?\/script\/(?:src|dist)\/.*?\/.*?\.js$)(?:.*)$/i, '$1?version=v1']
],
charset: 'utf-8'
});
seajs.use('modules/www/public/common.js');
seajs.use('modules/www/travel/create.js');
</script> 
  <div class="hide"> 
  </div>
 </body>
</html>