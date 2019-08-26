<!DOCTYPE html>
<html lang="zh-CN">
 <head> 
  <meta charset="utf-8" /> 
  <meta name="renderer" content="webkit" /> 
  <title>申请成为向导</title> 
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" /> 
  <meta http-equiv="Cache-Control" content="no-transform" /> 
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/apply_common.css" /> 
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/apply_index.css" /> 
  <script type="text/javascript">
    var TU = {
        wwwUrl: 'http://www.liantu.cn',
        myUrl: 'http://my.liantu.cn',
        imageUrl: 'http://static.liantu.cn/image/',
        domain: '',
        today: '2016-03-08'
    };
    var isMobi = (function(){
        var u = navigator.userAgent.toLowerCase();
        return  u.indexOf("mobi") > 0 || u.indexOf("nexus 7") > 0 || u.indexOf("480") > 0;
    })();
    PL = {
        'MID':0    }
</script> 
  <script type="text/javascript" id="js-prelogin" src="${pageContext.request.contextPath}/js/cas.js"></script>
 </head> 
 <body> 
  <div class="header"> 
   <div class="top-bg"></div> 
   <div class="mod-head"> 
    <a href="index.jsp" class="logo"><img src="${pageContext.request.contextPath}/images/logo.png" alt="联途" /></a>
    <div class="search"> 
     <div class="box"> 
      <div class="sbox"> 
       <input type="text" class="text" id="search_text" placeholder="输入想去的地方（例如：北京）" /> 
       <div class="ico" id="search_ico">
        <span></span>
       </div> 
      </div> 
     </div> 
    </div> 
    <div class="link">
     <a href="apply.jsp" target="_blank">申请成为向导</a>
    </div> 
    <div class="login pl-login-info" id="pl-login-info"> 
     <div class="info"> 
      <a href="javascript:;" onclick="TU.login();">登录</a> 
     </div> 
    </div> 
   </div> 
  </div>
  <div class="mod-hd"> 
   <div class="apply"> 
    <ul> 
     <li class="first"> <span class="text"> <span class="mask-p"></span> <span class="big">为什么要成为向导!</span> </span> </li> 
     <li> <span class="text"> <span class="mask-p"></span> <span>假如您热爱您所在的城市，这个独一无二的平台，可以帮助您</span> </span> </li> 
     <li> <span class="text"> <span class="mask-p"></span> <span>向全世界推介您的城市，展示您设计的新鲜又独特的服务</span> </span> </li> 
     <li class="last"> <a href="/merchant/apply/form/">申请成为向导</a> </li> 
    </ul> 
   </div> 
  </div> 
  <div class="wrapper"> 
   <div class="container"> 
    <div class="mod-info"> 
    </div> 
    <div class="mod-info"> 
     <div class="hd">
      联途旅游有何不同
     </div> 
     <p class="title">每位向导都是城市文明的传播者，更是当地形象的代言人，<br />联途旅游让你重新定义你的城市</p> 
     <ul> 
      <li class="first"> <span>完全由你决定</span> <p>你可以自己设定你所提供的服务、接待的人数、愿意优先接待的旅行者和暂不接待的旅行者。</p> </li> 
      <li class="second"> <span>人人都能成为向导</span> <p>无论你是个人还是企业主，无论你是学生、专车司机、家庭旅馆老板、当地居民，都可以成为向导。</p> </li> 
      <li class="third"> <span>安全无风险</span> <p>联途旅游提供安全无忧的平台担保服务。你的背后有我们的支持，联途旅游支持团队全天24小时为你提供服务。 </p> </li> 
      <li class="fourth"> <span>完全免费</span> <p>你可以免费发布服务，联途旅游不收取任何发布费用，提供免费展示平台。 </p> </li> 
     </ul> 
    </div> 
    <div class="mod-info guide"> 
     <div class="hd">
      联途旅游的向导
     </div> 
     <ul> 
      <li class="first"> <span>丰富的当地生活经验</span> </li> 
      <li class="second"> <span>熟悉当地好玩好吃的地方</span> </li> 
      <li class="third"> <span>乐于分享的心</span> </li> 
     </ul> 
    </div> 
    <div class="mod-info flow"> 
     <div class="hd">
      服务流程
     </div> 
     <ul> 
      <li> <span>01、发布服务</span> <p>假如你申请成为了我们的向导，你就可以提交服务了，我们拥有专业的编辑团队协助编辑你的资料。我们的编审团队将尽快审核你提交的服务，安排专人和你联系，打电话了解更多信息，并最终批准。</p> </li> 
      <li> <span>02、收到预约</span> <p>一旦你通过了我们编审团队的审核，你将会收到来自一个或多个旅客的预约，你可以选择是否接受对方的预约。</p> </li> 
      <li> <span>03、提供服务</span> <p>现在，在约定的日期和行程里带领你的客人充分感受你的热情，了解当地文化，体会当地气息，体验你所带给他们的独特旅行。</p> </li> 
      <li class="fourth"> <span>04、接受报酬</span> <p>收到来自旅客的报酬，报酬是由你和旅客预先约定的，服务费用将在服务圆满结束后转给向导。</p> </li> 
     </ul> 
    </div> 
   </div> 
  </div> 
  <div class="mod-apply"> 
   <i></i> 
   <p>做一次你所在城市的主人，让旅客有一次不一样的体验</p> 
   <a href="/merchant/apply/form/" class="apply-btn" mid="0">申请成为向导</a> 
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
       <a href="http://www.liantu.cnabout.html" target="_blank" rel="nofollow">关于我们</a>
      </dd> 
      <dd>
       <a href="http://www.liantu.cncopyright.html" target="_blank" rel="nofollow">免责声明</a>
      </dd> 
      <dd>
       <a href="http://www.liantu.cncontact.html" target="_blank" rel="nofollow">联系我们</a>
      </dd> 
      <dd>
       <a href="http://www.liantu.cnjoin.html" target="_blank" rel="nofollow">加入我们</a>
      </dd> 
     </dl> 
     <dl> 
      <dt>
       帮助中心
      </dt> 
      <dd>
       <a href="http://www.liantu.cnxieyi.html" target="_blank" rel="nofollow">用户协议</a>
      </dd> 
      <dd>
       <a href="http://www.liantu.cnsafe.html" target="_blank" rel="nofollow">安全保障</a>
      </dd> 
      <dd>
       <a href="http://www.liantu.cnprocess.html" target="_blank" rel="nofollow">预定流程</a>
      </dd> 
     </dl> 
     <dl class="app"> 
      <dt>
       发现
      </dt> 
      <dd>
       <a href="http://www.liantu.cn/app/" target="_blank">Android客户端</a>
      </dd> 
      <dd>
       <a href="http://www.liantu.cn/app/" target="_blank">iOS客户端</a>
      </dd> 
      <dd>
       <a href="http://www.liantu.cn/app/huilv/" target="_blank">联途汇率</a>
      </dd> 
      <dd>
       <a href="http://www.liantu.cn/app/tongyou/" target="_blank">联途同游</a>
      </dd> 
     </dl> 
    </div> 
    <div class="copyright"> 
     <a href="http://www.miitbeian.gov.cn/" target="_blank" rel="nofollow">闽ICP备15007411号-1</a> Copyright &copy; 2016 liantu.cn, All Rights Reserved stat 
    </div> 
   </div> 
  </div>  
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.seajs.js" id="seajsnode"></script> 
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
	seajs.use('modules/my/common/common.login.js');
	</script> 
  <div class="hide"> 
  </div>  
 </body>
</html>