<!DOCTYPE html>
<html>
 <head> 
  <meta charset="utf-8" /> 
  <meta name="renderer" content="webkit" /> 
  <title>忘记密码</title> 
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" /> 
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css" /> 
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/phone.css" /> 
 </head> 
 <body> 
  <div class="content"> 
   <div class="main"> 
    <div class="hd"> 
     <a href="index.jsp" class="logo"> <img src="${pageContext.request.contextPath}/images/logo_blue.png" alt="联途旅游" /> </a>
     <p>同行之路，有你才有意义</p> 
    </div> 
    <div class="formbox panel"> 
     <ul> 
      <li class="title">验证手机</li> 
      <li class="num"> <label>请输入手机号码</label> <input type="text" placeholder="请输入手机号码" id="user" autocomplete="off" maxlength="13" name="phonenumber" /> <span class="hint"></span> </li> 
      <li class="captcha"> <label>验证码</label> <input type="text" placeholder="验证码" id="captcha" autocomplete="off" maxlength="4" name="captcha" /> <a href="javascript:"><img src="/i/captcha" alt="更换验证码" title="更换验证码" /></a> <span class="hint"></span> </li> 
      <li class="code"> <label>短信验证码</label> <input type="text" placeholder="短信验证码" id="code" autocomplete="off" maxlength="4" name="code" /> <a href="javascript:" class="getcode">发送验证码</a> <span class="hint"></span> </li> 
      <li class="btn"> <a href="javascript:" class="next">下一步</a> </li> 
     </ul> 
    </div> 
    <div class="nextbox panel"> 
     <ul> 
      <li class="title">找回密码</li> 
      <li class="newPass"> <label>新密码</label> <input type="password" class="newPass" placeholder="新密码" id="newPass" autocomplete="off" name="password" /> <span class="hint"></span> </li> 
      <li clas="checkPass"> <label>确认新密码</label> <input type="password" class="checkPass" placeholder="确认新密码" id="checkPass" autocomplete="off" name="checkPass" /> <span class="hint"></span> </li> 
      <li class="btn"><a href="javascript:" class="submit">确认</a></li> 
     </ul> 
    </div> 
    <div class="other"></div> 
   </div> 
  </div> 
  <div class="flclear"></div> 
  <div class="footer"> 
   <div class="mod-back"> 
    <span class="qrcode"> <span class="ico"></span> <img src="${pageContext.request.contextPath}/images/qrcode.jpg" alt="联途微信二维码" width="200" height="200" />官方微信服务号 </span> 
    <a href="javascript:" class="code" id="code"></a> 
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
       <br /> 
       <a href="http://www.liantu.cn/app/" target="_blank">iOS客户端</a> 
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
                                    seajs.use('modules/my/member/passwd/phone.js');
                        </script> 
  <div class="hide"> 
  </div>   
 </body>
</html>