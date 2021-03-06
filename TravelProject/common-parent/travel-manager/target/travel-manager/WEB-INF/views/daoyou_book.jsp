<!DOCTYPE html>
<html lang="zh-CN">
    <head> 
        <meta charset="utf-8" /> 
        <title>填写预约申请 导游</title> 
        <meta name="renderer" content="webkit" /> 
        <meta http-equiv="mobile-agent" content="format=html5; url=http://m.liantu.cn/order/guide/?gid=65581&amp;type=daoyou&amp;startdate=2016-03-10&amp;enddate=2016-03-18&amp;adult=1&amp;service=" /> 
        <meta http-equiv="Cache-Control" content="no-transform" /> 
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/guide.css" /> 
        <script type="text/javascript">
            var TU = {
                wwwUrl: 'http://www.liantu.cn',
                myUrl: 'http://my.liantu.cn',
                imageUrl: 'http://static.liantu.cn/image/',
                domain: 'liantu.cn',
                today: '2016-03-08',
                mobile_agent: 'http://m.liantu.cn/order/guide/?gid=65581&type=daoyou&startdate=2016-03-10&enddate=2016-03-18&adult=1&service='
            };
            var isMobi = (function() {
                var u = navigator.userAgent.toLowerCase();
                return  u.indexOf("mobi") > 0 || u.indexOf("nexus 7") > 0 || u.indexOf("480") > 0;
            })();
            if (isMobi && TU.mobile_agent != '') {
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
                        <div class="mod-order-step"> 
                            <ul> 
                                <li> <span class="step-bg"></span> <span class="step">STEP01</span> <span>选择导游或伴游</span> </li> 
                                <li class="active"> <span class="step-bg"></span> <span class="step">STEP02</span> <span>填写预约申请</span> </li> 
                                <li> <span class="step-bg"></span> <span class="step">STEP03</span> <span>等待导/伴游接受</span> </li> 
                                <li> <span class="step-bg"></span> <span class="step">STEP04</span> <span>在线支付费用</span> </li> 
                            </ul> 
                        </div> 
                        <div class="content"> 
                            <div class="mod-base"> 
                                <div class="hd">
                                    基础信息
                                </div> 
                                <input type="hidden" name="gid" value="65581" /> 
                                <div class="bd"> 
                                    <div class="list"> 
                                        <div class="fixed"> 
                                            <div class="inner"> 
                                                <div class="steps"> 
                                                    <p><span class="ico"></span><span class="step">1</span>选择导游或伴游</p> 
                                                    <p class="active"><span class="ico"></span><span class="step">2</span>填写预约申请</p> 
                                                    <p><span class="ico"></span><span class="step">3</span>等待导/伴游接受</p> 
                                                    <p><span class="ico"></span><span class="step">4</span>在线支付费用</p> 
                                                </div> 
                                                <div class="items"> 
                                                    <div class="time"> 
                                                        <span class="titles">出行时间</span> 
                                                        <div class="date"> 
                                                            <input type="input" class="input-date" name="startdate" value="2016-03-10" readonly="readonly" id="from" /> 
                                                            <label for="from"></label> 
                                                        </div> 
                                                        <span class="between">~</span> 
                                                        <div class="date"> 
                                                            <input type="input" class="input-date" name="enddate" value="2016-03-18" readonly="readonly" id="to" /> 
                                                            <label for="to"></label> 
                                                        </div> 
                                                        <span>共<label class="diff-day">9</label>天</span> 
                                                    </div> 
                                                    <div class="count"> 
                                                        <span class="titles">同行人数</span> 
                                                        <p> <a href="javascript:" class="btn min"></a> <input type="input" class="num" name="adult" value="1" data-max="1" data-min="1" /> <span class="label">成人</span> <a href="javascript:" class="btn plus"></a> </p> 
                                                        <p> <a href="javascript:" class="btn min"></a> <input type="input" class="num" name="children" value="0" /> <span class="label">儿童</span> <a href="javascript:" class="btn plus"></a> </p> 
                                                    </div> 
                                                </div> 
                                            </div> 
                                        </div> 
                                    </div> 
                                    <ul> 
                                        <li class="location"> <span class="titles">服务城市</span> <input type="hidden" name="servicecityid" value="1" /> <span class="to" data-id="1">北京</span> </li> 
                                    </ul> 
                                </div> 
                            </div> 
                            <div class="mod-demand"> 
                                <div class="hd">
                                    行程需求
                                </div> 
                                <div class="bd"> 
                                    <ul class="trip-list"> 
                                        <li class="title"> 
                                            <div class="sub-list"> 
                                                <div class="part-one">
                                                    日期
                                                </div> 
                                                <div class="part-two">
                                                    选择所需服务
                                                </div> 
                                                <div class="part-three">
                                                    行程内容
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>1</span>
                                                        </div> 
                                                        <p class="day">2016-03-10</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[0]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>2</span>
                                                        </div> 
                                                        <p class="day">2016-03-11</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[1]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>3</span>
                                                        </div> 
                                                        <p class="day">2016-03-12</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[2]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>4</span>
                                                        </div> 
                                                        <p class="day">2016-03-13</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[3]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>5</span>
                                                        </div> 
                                                        <p class="day">2016-03-14</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[4]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>6</span>
                                                        </div> 
                                                        <p class="day">2016-03-15</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[5]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>7</span>
                                                        </div> 
                                                        <p class="day">2016-03-16</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[6]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>8</span>
                                                        </div> 
                                                        <p class="day">2016-03-17</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[7]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                        <li class="order"> 
                                            <div class="sub-list"> 
                                                <div class="cols"> 
                                                    <div class="part-one"> 
                                                        <div class="count">
                                                            Day
                                                            <span>9</span>
                                                        </div> 
                                                        <p class="day">2016-03-18</p> 
                                                    </div> 
                                                    <div class="part-two"> 
                                                        <div class="item"> 
                                                            <div class="select-div"> 
                                                                <select name="service[8]"> <option value="">请选择</option> <option value="28" data-type="base" data-unit="元/天" data-price="100">基础导游服务 ￥100元/天</option> </select> 
                                                            </div> 
                                                            <a href="javascript:" class="del"></a> 
                                                        </div> 
                                                        <a href="javascript:" class="add"><span></span>添加服务</a> 
                                                    </div> 
                                                    <div class="price">
                                                        ￥
                                                        <span>0</span>元/天
                                                    </div> 
                                                </div> 
                                                <div class="part-three"> 
                                                    <div class="info"> 
                                                        <textarea class="remark input-placeholder" placeholder="可备注当日行程安排、航班、酒店等信息" name="remark"> </textarea> 
                                                        <label class="placeholder">可备注当日行程安排、航班、酒店等信息</label> 
                                                    </div> 
                                                </div> 
                                            </div> </li> 
                                    </ul> 
                                    <div class="balance"> 
                                        <p>应付费用<span>￥<span class="bigger" id="total">0</span>元</span></p> 
                                        <p class="hint">(提示：如果对方同意了您的预订申请，您就可以在线支付所需支付费用)</p> 
                                    </div> 
                                </div> 
                            </div> 
                            <div class="mod-btn"> 
                                <input type="submit" class="submit" value="提交预订申请" id="submit" /> 
                            </div> 
                        </div> 
                        <div class="side"> 
                            <div class="mod-service"> 
                                <p class="title">乔蕊提供的服务</p> 
                                <ul> 
                                    <li> <p>基础导游服务</p> <p class="price">￥<span><span class="bigger">100</span>元/天</span></p> </li> 
                                </ul> 
                            </div> 
                            <div class="mod-calendar" id="j-calendar"> 
                                <div class="hd">
                                    服务日历
                                </div> 
                                <div class="calendar cal-pd"></div> 
                            </div> 
                            <div class="mod-help"> 
                                <div class="hd">
                                    帮助
                                </div> 
                                <div class="bd"> 
                                    <ul> 
                                        <li> <p><a href="javascript:">如何知道我的预订申请被对方接受？</a></p> <p class="intro active"> 向导会在预订申请提交后3个小时内处理你的订单，向导若接受或者拒绝订单，系统会短信通知你。详情请登入个人中心【我的订单】查看。 </p> </li> 
                                        <li> <p><a href="javascript:">我什么时候可以得到导游的联系方式</a></p> <p class="intro"> 支付成功后，在个人中心【我的订单】中，可查看导游的联系方式。 </p> </li> 
                                    </ul> 
                                </div> 
                            </div> 
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
            (function() {
                var $info3 = $('.pl-login-info');
                PL.init({
                    domain: 'http://my.liantu.cn',
                    callback: function(nickName, html) {
                        !PL.MID ? (function() {
                            html.push('<div class="info"><a href="javascript:;" onclick="TU.login();">登录</a></div>');
                        })() : (function() {
                            var num = PL.type ? (PL.merchantlaunchordernum + PL.merchantordernum) : PL.memberordernum;
                            html.push('<div class="user">' + (num > 0 ? '<span class="num"><span>' + num + '</span></span>' : '') + '<img src="' + PL.avatar + '" alt="' + nickName + '" width="40" height="40"/><span class="name">' + nickName + '</span><span class="ico"></span></div>');
                            if (PL.type) {
                                html.push('\
      <div class="list">\
      <div class="ico"></div>\
      <ul>\
      <li class="d-pc"><a href="http://my.liantu.cn/merchant/">商户信息</a></li>\
      <li><a href="http://my.liantu.cn/merchant/order/reserve/">' + (PL.merchantlaunchordernum ? '<span class="num"><span>' + PL.merchantlaunchordernum + '</span></span>' : '') + '预约管理</a></li>\
      <li><a href="http://my.liantu.cn/merchant/order/">' + (PL.merchantordernum ? '<span class="num"><span>' + PL.merchantordernum + '</span></span>' : '') + '订单管理</a></li>\
      <li class="d-m"><a href="http://my.liantu.cn/merchant/account/">我的钱包</a></li>\
      <li class="d-m"><a href="/banyou/">伴游</a></li>\
      <li class="d-m"><a href="/daoyou/">导游</a></li>\
      <li class="d-m"><a href="/tongyou/">同游</a></li>\
      <li class="d-pc"><a href="javascript:;" onclick="TU.logout();">退出</a></li>\
      </ul>\
      </div>');
                            } else {
                                html.push('\
      <div class="list">\
      <div class="ico"></div>\
      <ul>\
      <li class="d-pc"><a href="member_info.jsp">个人信息</a></li>\
      <li><a href="member_order.jsp">' + (PL.memberordernum > 0 ? '<span class="num"><span>' + PL.memberordernum + '</span></span>' : '') + '我的订单</a></li>\
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
                        if (!pl_status && !PL.type) {
                            var div = document.createElement('div');
                            div.className = 'link';
                            div.innerHTML = '<a href="apply.jsp" target="_blank">申请成为向导</a>';
                            var $info = document.getElementById('pl-login-info');
                            if ($info) {
                                $info.parentNode.insertBefore(div, $info);
                            }
                        }
                        pl_status = 1;
                    }
                });
            })();
            var pl_status = 0;
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
            seajs.use('modules/www/order/guide.js');
        </script>
        <div class="hide"> 
        </div>
    </body>
</html>