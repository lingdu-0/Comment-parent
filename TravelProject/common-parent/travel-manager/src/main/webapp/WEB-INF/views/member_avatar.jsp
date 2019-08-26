<!DOCTYPE html>
<html lang="zh-CN">
    <head> 
        <meta charset="utf-8" /> 
        <meta name="renderer" content="webkit" /> 
        <title>更改头像</title> 
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common_member.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/portrait.css" /> 
        <script type="text/javascript">
            var TU = {
                myUrl: 'http://my.liantu.cn',
                wwwUrl: 'http://www.liantu.cn'
            };
        </script> 
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
                    <a href="apply.jsp" rel="nofollow" target="_blank">申请成为向导</a>
                </div> 
                <div class="login pl-login-info" id="pl-login-info"> 
                    <div class="name"> 
                        <img width="40" height="40" alt="" src="${pageContext.request.contextPath}/images/man_100x100.jpg" />
                        <span class="name-text">180*****538</span>
                        <span class="ico"></span>
                    </div> 
                    <div class="list"> 
                        <div class="ico"></div> 
                        <div class="login-box"> 
                            <div class="bg"></div> 
                            <p> <a member_info.html>个人信息</a> <a href="member_order.jsp">我的订单</a> <a href="member_tongyou.jsp">我的同游</a> <a href="/member/logout/" class="js-pl-logout">退出</a> </p>
                        </div> 
                    </div> 
                </div> 
            </div> 
        </div> 
        <div class="container"> 
            <div class="home"> 
                <a href="index.jsp"> <span class="plus"></span>返回首页 </a>
            </div> 
            <div class="wrap"> 
                <div class="side"> 
                    <div class="avatar"> 
                        <img src="${pageContext.request.contextPath}/images/man_160x160.jpg" alt="用户中心" /> 
                        <p><span class="usr-name">180*****538</span> <span class="gender male "></span> </p> 
                    </div> 
                    <ul class="menu"> 
                        <li> <a href="member_info.jsp" class="info">基本信息</a>
                            <div class="sub-menu"> 
                                <p><a href="member_avatar.jsp" class="sc2">更换头像</a></p>
                                <p><a href="member_pwd.jsp" class="sc2">修改密码</a></p>
                            </div> </li> 
                        <li> <a href="member_order.jsp" class="order">我的订单</a> </li>
                        <li> <a href="member_withdraw.jsp" class="wallet">我的钱包</a> </li>
                        <li> <a href="member_tongyou.jsp" class="gowith">结伴同游</a> </li>
                    </ul> 
                </div> 
                <div class="content"> 
                    <h2>更改头像</h2> 
                    <div class="mod-box"> 
                        <div class="box-portrait" id="j-portrait"> 
                            <div class="portrait"> 
                                <div class="pic200">
                                    <img src="${pageContext.request.contextPath}/images/man.jpg" id="j-curimg" class="cur-portrait" alt="当前头像" width="200" height="200" /> 
                                </div> 
                            </div> 
                            <form action="/member/profile/portraitimg" method="POST" name="form" enctype="multipart/form-data" target="callback"> 
                                <a href="javascript:;" id="j-upload" class="btn-portrait" title="选择头像"><input class="input-file" type="file" name="portrait" accept=".png,.jpg,.gif,.JPG,.PNG,.GIF" /><span>选择头像</span></a> 
                            </form> 
                            <a href="" id="j-confirm" class="btn-confirm" title="保存">保存</a> 
                            <p>请上传 .jpg 或 .gif 或 .png 格式的图片（照片大小需小于2M）</p> 
                        </div> 
                    </div> 
                </div> 
                <div class="pop-portrait" id="j-dialog"> 
                    <a href="javascript;" class="close" title="关闭">关闭</a> 
                    <div class="portrait-box"> 
                        <div class="portrait pop"> 
                            <div class="pop-box"> 
                                <img src="${pageContext.request.contextPath}/images/man.jpg" /> 
                            </div> 
                        </div> 
                        <form action="/member/profile/portraitimg" method="POST" name="form" enctype="multipart/form-data" target="callback"> 
                            <a href="javascript:;" id="j-chose" class="btn-select" title="重新选择"><input class="input-file" type="file" name="portrait" /> 重新选择</a> 
                            <iframe id="callback" name="callback" class="callback"></iframe> 
                        </form> 
                        <p>请上传 .jpg 或 .gif 或 .png 格式的图片（照片大小需小于2M）</p> 
                    </div> 
                </div> 
                <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.Jcrop.css" type="text/css" /> 
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
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.jcrop.min.js"></script> 
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

            seajs.use('modules/my/common/common.js');

            seajs.use('modules/my/public/portrait.js');
        </script> 
        <div class="hide"> 
        </div>  
    </body>
</html>