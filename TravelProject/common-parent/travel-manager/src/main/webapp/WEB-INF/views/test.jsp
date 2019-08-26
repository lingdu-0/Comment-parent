<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="images/favicon.ico"/>
    <link rel="canonical" href="index.jsp"/>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/index.css"/>
    <title>Title</title>
</head>
<body>
<div class="login pl-login-info" id="pl-login-info">
    <!-- <div class="info">
         <a href="javascript:;" onclick="TU.login();">登录</a>
     </div>-->
    <!--                    <div class="user">-->
    <!--                        <span class="num"><span></span></span>-->
    <!--                        &lt;!&ndash;                        <img src="" alt="" width="40" height="40"/>&ndash;&gt;-->
    <!--                        &lt;!&ndash;                        <span class="name"></span>&ndash;&gt;-->
    <!--                        &lt;!&ndash;                        <span class="ico"></span>&ndash;&gt;-->
    <!--                    </div>-->

    <!--                    <div class="list">-->
    <!--                        <div class="ico"></div>-->
    <!--                        <ul>-->
    <!--                            <li class="d-pc"><a href="http://my.liantu.cn/merchant/">商户信息</a></li>-->
    <!--                            <li><a href="http://my.liantu.cn/merchant/order/reserve/">' + (PL.merchantlaunchordernum-->
    <!--                                ? '<span class="num"><span>' + PL.merchantlaunchordernum + '</span></span>' : '') +-->
    <!--                                '预约管理</a></li>-->
    <!--                            <li><a href="http://my.liantu.cn/merchant/order/">' + (PL.merchantordernum ? '<span-->
    <!--                                    class="num"><span>' + PL.merchantordernum + '</span></span>' : '') + '订单管理</a>-->
    <!--                            </li>-->
    <!--                            <li class="d-m"><a href="http://my.liantu.cn/merchant/account/">我的钱包</a></li>-->
    <!--                            <li class="d-m"><a href="/banyou/">伴游</a></li>-->
    <!--                            <li class="d-m"><a href="/daoyou/">导游</a></li>-->
    <!--                            <li class="d-m"><a href="/tongyou/">同游</a></li>-->
    <!--                            <li class="d-pc"><a href="javascript:;" onclick="TU.logout();">退出</a></li>-->
    <!--                        </ul>-->
    <!--                    </div>-->

    <div class="list">
        <div class="ico">
            <ul>
                <li class="d-pc"><a href="member_info.jsp">个人信息</a></li>
                <!--                            <li><a href="member_order.jsp">' + (PL.memberordernum > 0 ? '<span class="num"><span>' + PL.memberordernum + '</span></span>' : '') + '我的订单</a></li>-->
                <li><a href="member_tongyou.jsp">我的同游</a></li>
                <li class="d-m"><a href="http://my.liantu.cnmember_withdraw.html">我的钱包</a></li>
                <li class="d-m"><a href="/banyou/">伴游</a></li>
                <li class="d-m"><a href="/daoyou/">导游</a></li>
                <li class="d-m"><a href="/tongyou/">同游</a></li>
                <li class="d-pc"><a href="javascript:" onclick="TU.logout();">退出</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>