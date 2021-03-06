<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <title>同游</title>
    <meta name="renderer" content="webkit"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="keywords" content="同游,结伴自助游,结伴游,结伴出游,结伴旅游,结伴同游,结伴同行"/>
    <meta name="description" content="联途同游：旅途乐趣，也许不由风景决定。方便快速的免费发布同游信息，寻找志同道合的伙伴一起旅行，随时随地结伴旅游，结伴自助游，在联途安全放心旅游。"/>
    <meta http-equiv="Cache-Control" content="no-transform"/>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico"/>
    <link rel="canonical" href="http://www.liantu.cn/tongyou/tongyou.jsp"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/tongyou_index.css"/>
    <script type="text/javascript">
        var TU = {
            wwwUrl: 'http://www.liantu.cn',
            myUrl: 'http://my.liantu.cn',
            imageUrl: 'http://static.liantu.cn/image/',
            domain: 'liantu.cn',
            today: '2016-03-08',
            mobile_agent: ''
        };
        var isMobi = (function () {
            var u = navigator.userAgent.toLowerCase();
            return u.indexOf("mobi") > 0 || u.indexOf("nexus 7") > 0 || u.indexOf("480") > 0;
        })();
        if (isMobi && TU.mobile_agent != '') {
            location.href = TU.mobile_agent;
        }
    </script>
    <script type="text/javascript" id="js-prelogin" src="${pageContext.request.contextPath}/js/cas.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.seajs.js" id="seajsnode"></script>
    <!--[if lte IE 8]>
    <script type="text/javascript">
        $(function () {
            var $body = $('body');
            var $window = $(window);
            $window.resize(function () {
                var width = $window.width();
                if (width < 768) {
                    $body.addClass("media-small").removeClass("media-medium");
                } else if (width < 1300) {
                    $body.addClass("media-medium").removeClass("media-small");
                } else {
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
                    <a href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt="联途"/></a>
                </div>
                <div class="J_search search">
                    <div class="sbox">
                        <input type="text" class="text" placeholder="输入想去的地方（例如：北京）"/>
                        <span class="ico"><span></span></span>
                    </div>
                </div>
                <div class="login pl-login-info" id="pl-login-info"></div>
            </div>
        </div>
        <div class="mod-mhead">
            <div class="box">
                <a class="pulish" href="tongyou_add.jsp" rel="nofollow" onclick="TU.login('reg');">发布</a>
                <a class="icon-menu" href="javascript:;" rel="nofollow">菜单</a>
                <a class="logo" href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt="联途"/></a>
            </div>
            <div class="sidebar">
                <div class="mask"></div>
                <div class="panel pl-login-info"></div>
            </div>
        </div>
        <div class="mod-mcity">
            <div class="hd">
                <a class="close" href="javascript:;"></a>
                <span>寻找城市</span>
            </div>
            <div class="bd">
                <form method="get" action="">
                    <div class="item">
                        <input type="text" class="station" name="from" placeholder="出发地" value="" data-text=""
                               autocomplete="off"/>
                        <label></label>
                    </div>
                    <div class="item">
                        <input type="text" class="station" name="to" placeholder="目的地" value="" data-text=""
                               autocomplete="off" data-list="8"/>
                        <label></label>
                    </div>
                    <div class="item">
                        <input class="mdate" type="text" name="startdate" placeholder="出发日期"/>
                    </div>
                    <div class="item">
                        <input class="mdate" type="text" name="enddate" placeholder="返回日期"/>
                    </div>
                    <div>
                        <input class="btn" type="submit" value="寻 找"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="full-column">
            <div class="mod-bg">
                <img class="fixed" src="${pageContext.request.contextPath}/images/1.jpg"/>
                <img class="static" src="${pageContext.request.contextPath}/images/1.jpg"/>
            </div>
            <div class="mod-sort">
                <h1>同游</h1>
                <h2><span>旅途的乐趣</span> <span>也许不由风景决定</span></h2>
            </div>
            <div class="mod-condition">
                <div class="bg"></div>
                <div class="search">
                    <div class="place first box">
                        <input type="text" class="station" name="from" placeholder="出发地" value="" data-text=""
                               autocomplete="off"/>
                        <label class=""></label>
                    </div>
                    <div class="place box">
                        <input type="text" class="station" name="to" placeholder="目的地" value="" data-text=""
                               autocomplete="off" data-list="8"/>
                        <label class=""></label>
                    </div>
                    <div class="date">
                        <input type="text" class="day" name="startdate" placeholder="出发日期" readonly="readonly"/>
                    </div>
                    <div class="date">
                        <input type="text" class="day" name="enddate" placeholder="返回日期" readonly="readonly"/>
                    </div>
                </div>
            </div>
            <div class="mod-mcondition">
                <div class="box">
                    <input class="input-button" type="button" value="搜索"/>
                    <input class="input-text" type="text" value="" placeholder="你想去哪里？"/>
                </div>
            </div>
        </div>
        <div class="inner">
            <div class="main">
                <div class="content">
                    <div class="mod-list">
                        <div class="nodata">
                            <img src="${pageContext.request.contextPath}/images/nodata.png" alt="这个城市暂时还没有人发布同游，赶紧发布一个吧!"/>
                            <br/> 这个城市暂时还没有人发布同游，赶紧发布一个吧!
                        </div>
                        <ul id="list" class="list">
                            <li class="J_blocklink">
                                <div class="pic">
                                    <div class="avatar">
                                        <img src="${pageContext.request.contextPath}/images/65768.png" alt="征途奇兵" width="120" height="120"/>
                                    </div>
                                    <div class="name">
                                        <span class="man">征途奇兵</span>
                                    </div>
                                    <div class="address">
                                        <span>成都，80后</span>
                                    </div>
                                </div>
                                <div class="text">
                                    <div class="title">
                                        <a href="/tongyou/113.html" target="_blank">#3月28日 成都到拉萨，青藏，川藏，可可西里16日游 求结伴#</a>
                                        <span class="in"> 结伴中 </span>
                                    </div>
                                    <div class="road">
                                        路线：成都~拉萨，青藏，川藏，可可西里
                                    </div>
                                    <div class="info">
                                        <div class="time">
                                            <div class="label">
                                                行程时间
                                                <span>（共16天）</span>
                                            </div>
                                            <p>2016-03-28<span>至</span>2016-04-13</p>
                                        </div>
                                        <div class="num">
                                            <div class="label">
                                                参加人数
                                            </div>
                                            <p>1/8</p>
                                        </div>
                                    </div>
                                    <p class="intro">
                                        3.28号我们出发，走318国道川藏进，时间够的还可以青藏出，一起是16天。目前8名队友报名，再约5-7名队友，我们计划2-3台车走，路上有个照应。索要详细行程计划安排qq/微信474016180.去远方.在路上！ </p>
                                </div>
                            </li>
                            <li class="J_blocklink">
                                <div class="pic">
                                    <div class="avatar">
                                        <img src="http://wx.qlogo.cn/mmopen/0sDCa2E8S1uewRpzMsmNnLRBibwyN7uswhoiavyY6qgOMWlXRBnwiaLaFQF9xIza5jibQMwgzBQ7kzhgUA2xxEEbKvU4PqpFrohD/0"
                                             alt="青鸟飞绝" width="120" height="120"/>
                                    </div>
                                    <div class="name">
                                        <span class="man">青鸟飞绝</span>
                                    </div>
                                    <div class="address">
                                        <span>泉州，80后</span>
                                    </div>
                                </div>
                                <div class="text">
                                    <div class="title">
                                        <a href="/tongyou/112.html" target="_blank">#3月10日 泉州到四川泸沽湖4日游 求结伴#</a>
                                        <span class="in"> 结伴中 </span>
                                    </div>
                                    <div class="road">
                                        路线：泉州~四川泸沽湖
                                    </div>
                                    <div class="info">
                                        <div class="time">
                                            <div class="label">
                                                行程时间
                                                <span>（共4天）</span>
                                            </div>
                                            <p>2016-03-10<span>至</span>2016-03-14</p>
                                        </div>
                                        <div class="num">
                                            <div class="label">
                                                参加人数
                                            </div>
                                            <p>1/3</p>
                                        </div>
                                    </div>
                                    <p class="intro"> 85后，好相处，男女皆可 </p>
                                </div>
                            </li>
                            <li class="J_blocklink">
                                <div class="pic">
                                    <div class="avatar">
                                        <img src="${pageContext.request.contextPath}/images/man_160x160.jpg" alt="150*****624" width="120" height="120"/>
                                    </div>
                                    <div class="name">
                                        <span class="man">150*****624</span>
                                    </div>
                                    <div class="address">
                                        <span>北京，80后</span>
                                    </div>
                                </div>
                                <div class="text">
                                    <div class="title">
                                        <a href="/tongyou/111.html" target="_blank">04月30日 石家庄到青岛 2日游 求结伴同游</a>
                                        <span class="in"> 结伴中 </span>
                                    </div>
                                    <div class="road">
                                        路线：石家庄~青岛
                                    </div>
                                    <div class="info">
                                        <div class="time">
                                            <div class="label">
                                                行程时间
                                                <span>（共2天）</span>
                                            </div>
                                            <p>2016-04-30<span>至</span>2016-05-02</p>
                                        </div>
                                        <div class="num">
                                            <div class="label">
                                                参加人数
                                            </div>
                                            <p>1/2</p>
                                        </div>
                                    </div>
                                    <p class="intro">
                                        五一假期打算去青岛旅游，说说旅游，其实本人是吃货一枚，希望熟悉青岛美食的朋友同游。如果需要我可以开车过去哦，尽量不要太多人，两三人即可。 </p>
                                </div>
                            </li>
                            <li class="J_blocklink">
                                <div class="pic">
                                    <div class="avatar">
                                        <img src="http://wx.qlogo.cn/mmopen/RWFRJSx0db7jDvqAsGvnExJqIxK26SVgDmziaicS891lZib3yxJibewCZ9HGNk7Nu6xVHUujhXRODLCZ7POFJoicJR1iaKVpmmOQcH/0"
                                             alt="程校长" width="120" height="120"/>
                                    </div>
                                    <div class="name">
                                        <span class="man">程校长</span>
                                    </div>
                                    <div class="address">
                                        <span>无锡，80后</span>
                                    </div>
                                </div>
                                <div class="text">
                                    <div class="title">
                                        <a href="/tongyou/110.html" target="_blank">#3月20日 无锡到大阪29日游 求结伴#</a>
                                        <span class="in"> 结伴中 </span>
                                    </div>
                                    <div class="road">
                                        路线：无锡~大阪
                                    </div>
                                    <div class="info">
                                        <div class="time">
                                            <div class="label">
                                                行程时间
                                                <span>（共29天）</span>
                                            </div>
                                            <p>2016-03-20<span>至</span>2016-04-18</p>
                                        </div>
                                        <div class="num">
                                            <div class="label">
                                                参加人数
                                            </div>
                                            <p>1/4</p>
                                        </div>
                                    </div>
                                    <p class="intro"> 大阪自由行 人多就自驾游 </p>
                                </div>
                            </li>
                            <li class="J_blocklink">
                                <div class="pic">
                                    <div class="avatar">
                                        <img src="${pageContext.request.contextPath}/images/woman_160x160.jpg" alt="天天" width="120" height="120"/>
                                    </div>
                                    <div class="name">
                                        <span class="woman">天天</span>
                                    </div>
                                    <div class="address">
                                        <span>长沙，80后</span>
                                    </div>
                                </div>
                                <div class="text">
                                    <div class="title">
                                        <a href="/tongyou/109.html" target="_blank">#3月17日 长沙到清迈6日游 求结伴#</a>
                                        <span class="in"> 结伴中 </span>
                                    </div>
                                    <div class="road">
                                        路线：长沙~清迈
                                    </div>
                                    <div class="info">
                                        <div class="time">
                                            <div class="label">
                                                行程时间
                                                <span>（共6天）</span>
                                            </div>
                                            <p>2016-03-17<span>至</span>2016-03-23</p>
                                        </div>
                                        <div class="num">
                                            <div class="label">
                                                参加人数
                                            </div>
                                            <p>1/2</p>
                                        </div>
                                    </div>
                                    <p class="intro"> 女性，随和，好相处 </p>
                                </div>
                            </li>
                            <li class="J_blocklink">
                                <div class="pic">
                                    <div class="avatar">
                                        <img src="${pageContext.request.contextPath}/images/65768.png" alt="征途奇兵" width="120" height="120"/>
                                    </div>
                                    <div class="name">
                                        <span class="man">征途奇兵</span>
                                    </div>
                                    <div class="address">
                                        <span>成都，80后</span>
                                    </div>
                                </div>
                                <div class="text">
                                    <div class="title">
                                        <a href="/tongyou/108.html" target="_blank">#3月28日 川藏，拉萨，青藏可可西里约伴到拉萨，川藏，纳木措16日游
                                            求结伴#</a>
                                        <span class="in"> 结伴中 </span>
                                    </div>
                                    <div class="road">
                                        路线：川藏，拉萨，青藏可可西里约伴~拉萨，川藏，纳木措
                                    </div>
                                    <div class="info">
                                        <div class="time">
                                            <div class="label">
                                                行程时间
                                                <span>（共16天）</span>
                                            </div>
                                            <p>2016-03-28<span>至</span>2016-04-13</p>
                                        </div>
                                        <div class="num">
                                            <div class="label">
                                                参加人数
                                            </div>
                                            <p>1/8</p>
                                        </div>
                                    </div>
                                    <p class="intro">
                                        3.28号我们出发，走318国道川藏进，时间够的还可以青藏出，一起是16天。目前8名队友报名，再约5-7名队友，我们计划2-3台车走，路上有个照应。索要详细行程计划安排qq/微信474016180.去远方.在路上！ </p>
                                </div>
                            </li>
                            <li class="J_blocklink">
                                <div class="pic">
                                    <div class="avatar">
                                        <img src="${pageContext.request.contextPath}/images/man_160x160.jpg" alt="暖风" width="120" height="120"/>
                                    </div>
                                    <div class="name">
                                        <span class="man">暖风</span>
                                    </div>
                                    <div class="address">
                                        <span>，80后</span>
                                    </div>
                                </div>
                                <div class="text">
                                    <div class="title">
                                        <a href="/tongyou/107.html" target="_blank">#3月21日 上海到成都6日游 求结伴#</a>
                                        <span class="in"> 结伴中 </span>
                                    </div>
                                    <div class="road">
                                        路线：上海~成都
                                    </div>
                                    <div class="info">
                                        <div class="time">
                                            <div class="label">
                                                行程时间
                                                <span>（共6天）</span>
                                            </div>
                                            <p>2016-03-21<span>至</span>2016-03-27</p>
                                        </div>
                                        <div class="num">
                                            <div class="label">
                                                参加人数
                                            </div>
                                            <p>1/4</p>
                                        </div>
                                    </div>
                                    <p class="intro"> 两到四人同游 费用自理 </p>
                                </div>
                            </li>
                            <li class="J_blocklink">
                                <div class="pic">
                                    <div class="avatar">
                                        <img src="http://wx.qlogo.cn/mmopen/b6R2fib6ZfFS6TEcqdIhibYhpL7qjeXU3rEGdZibZbuR34qtW94E73UxUHnzfXvNHrZsiaA4YBIJ50icGXkibyXA8RrYk1jVNW58BR/0"
                                             alt="无名" width="120" height="120"/>
                                    </div>
                                    <div class="name">
                                        <span class="man">无名</span>
                                    </div>
                                    <div class="address">
                                        <span>，80后</span>
                                    </div>
                                </div>
                                <div class="text">
                                    <div class="title">
                                        <a href="/tongyou/106.html" target="_blank">#4月23日 上海到日本15日游 求结伴#</a>
                                        <span class="in"> 结伴中 </span>
                                    </div>
                                    <div class="road">
                                        路线：上海~日本
                                    </div>
                                    <div class="info">
                                        <div class="time">
                                            <div class="label">
                                                行程时间
                                                <span>（共15天）</span>
                                            </div>
                                            <p>2016-04-23<span>至</span>2016-05-08</p>
                                        </div>
                                        <div class="num">
                                            <div class="label">
                                                参加人数
                                            </div>
                                            <p>1/2</p>
                                        </div>
                                    </div>
                                    <p class="intro"> 去过几次了，有一起的吗 </p>
                                </div>
                            </li>
                        </ul>
                        <div class="more">
                            <a href="javascript:"><span></span>查看更多</a>
                        </div>
                    </div>
                </div>
                <div class="side">
                    <div class="mod-travel">
                        <img src="${pageContext.request.contextPath}/images/travel.png" width="100%"/>
                        <a href="tongyou_add.jsp" rel="nofollow" class="box" target="_blank"
                           onclick="TU.login('reg');"> <span>发起同游</span> </a>
                        <a href="member_tongyou.jsp" class="manage">管理我的同游</a>
                    </div>
                    <div class="mod-raiders">
                        <div class="hd">
                            <h1>热门<a href="gonglue.jsp" target="_blank">旅游攻略</a></h1>
                            <span>/</span>
                            <a href="gonglue.jsp" class="hmore" target="_blank" title="旅游攻略">更多</a>
                        </div>
                        <div class="bd">
                            <ul>
                                <li><a href="/gonglue/zhusu/" target="_blank" class="tag">[住宿攻略]</a> <a
                                        href="/gonglue/3255.htm" target="_blank">五大道住宿推荐 去天津五大道旅游住哪里好</a></li>
                                <li><a href="/gonglue/meishi/" target="_blank" class="tag">[美食攻略]</a> <a
                                        href="/gonglue/3254.htm" target="_blank">天津五大道美食指南 五大道附近有吃饭的地方吗</a></li>
                                <li><a href="/gonglue/gouwu/" target="_blank" class="tag">[购物攻略]</a> <a
                                        href="/gonglue/3253.htm" target="_blank">天津五大道特产有什么值得带 五大道购物指南</a></li>
                                <li><a href="/gonglue/zizhuyou/" target="_blank" class="tag">[自助游攻略]</a> <a
                                        href="/gonglue/3252.htm" target="_blank">天津五大道怎么去 天津站到五大道乘车指南</a></li>
                                <li><a href="/gonglue/gouwu/" target="_blank" class="tag">[购物攻略]</a> <a
                                        href="/gonglue/3251.htm" target="_blank">扬州宋夹城景区周边有什么特产 宋夹城周边购物推荐</a></li>
                                <li><a href="/gonglue/zhusu/" target="_blank" class="tag">[住宿攻略]</a> <a
                                        href="/gonglue/3250.htm" target="_blank">扬州宋夹城附近酒店哪家好 宋夹城住宿推荐</a></li>
                                <li><a href="/gonglue/meishi/" target="_blank" class="tag">[美食攻略]</a> <a
                                        href="/gonglue/3249.htm" target="_blank">宋夹城体育休闲公园附近有什么好吃的</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="mod-spot">
                        <div class="hd">
                            <h1>热门<a href="jingdian.jsp" target="_blank">旅游景点</a></h1>
                            <span>/</span>
                            <a href="jingdian.jsp" class="hmore" target="_blank" title="旅游景点">更多</a>
                        </div>
                        <div class="bd">
                            <ul>
                                <li><a href="/jingdian/1910.htm" target="_blank">扬州宋夹城</a>
                                    <p>扬州市邗江区长春路48号（近瘦西湖天沐温泉度假村）</p></li>
                                <li><a href="/jingdian/1909.htm" target="_blank">大阳山国家森林公园</a>
                                    <p>苏州市高新区浒关经济开发区山神湾路</p></li>
                                <li><a href="/jingdian/1908.htm" target="_blank">宿迁三台山森林公园</a>
                                    <p>江苏省宿迁市宿豫区249省道</p></li>
                                <li><a href="/jingdian/1907.htm" target="_blank">东台西溪景区</a>
                                    <p>盐城市东台市惠阳路</p></li>
                                <li><a href="/jingdian/1906.htm" target="_blank">龙宫大白鲸欢乐世界</a>
                                    <p>江苏省淮安市经济开发区南马厂大道99号</p></li>
                                <li><a href="/jingdian/1905.htm" target="_blank">灵山小镇拈花湾</a>
                                    <p>滨湖区马山环山西路88号</p></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">
        <div class="mod-back">
            <span class="qrcode"> <span class="ico"></span> <img src="${pageContext.request.contextPath}/images/qrcode.jpg" alt="联途微信二维码" width="200"
                                                                 height="200"/>官方微信服务号 </span>
            <a href="javascript:" class="code" id="code"></a>
            <a href="index.jsp" class="customer"></a>
            <a href="#" class="goback"></a>
        </div>
        <div class="mod-foot">
            <div class="info">
                <div class="contact">
                    <p class="logo"><a href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt="联途" width="136"
                                                             height="50"/></a> <span>同行之路，有你才有意义</span></p>
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
                <a href="http://www.miitbeian.gov.cn/" target="_blank" rel="nofollow">闽ICP备15007411号-1</a> Copyright
                &copy; 2016 liantu.cn, All Rights Reserved stat
            </div>
        </div>
        <div class="mod-mfoot">
            <div class="info">
                <ul>
                    <li><a href="about.jsp" target="_blank" rel="nofollow">关于我们</a></li>
                    <li><a href="apply.jsp" target="_blank" rel="nofollow">申请成为向导</a></li>
                    <li><a href="/app/" target="_blank" rel="nofollow">APP下载</a></li>
                </ul>
                <div class="contact">
                    <p class="logo"><a href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt="联途" width="100"/></a></p>
                    <p class="tell">4006-6668-63</p>
                </div>
            </div>
            <div class="copyright">
                Copyright &copy; 2016 liantu.cn
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    (function () {
        var $info3 = $('.pl-login-info');
        PL.init({
            domain: 'http://my.liantu.cn',
            callback: function (nickName, html) {
                !PL.MID ? (function () {
                    html.push('<div class="info"><a href="javascript:;" onclick="TU.login();">登录</a></div>');
                })() : (function () {
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
<script type="text/javascript" src="member_info.htmlpre/login?v1457429260"></script>
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
    seajs.use('modules/www/travel/index.js');
</script>
<div class="hide">
</div>
</body>
</html>