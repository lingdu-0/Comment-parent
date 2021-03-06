<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>编辑同游</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/edit.css">
    <script type="text/javascript">
        var TU = {
            myUrl: 'http://my.liantu.cn'
        };
    </script>
</head>
<body>
    <div class="container">
                <div class="mod-main">
            <div class="hd">
                <h1>编辑同游<i class="close"></i></h1>
            </div>
            <div class="bd">
                <ul>
                    <li class="item">
                        <label>哪里</label>
                        <div class="suggset box">
                            <input type="text" class="input-text place station disabled" name="from" placeholder="出发地" value="南京" disabled="disabled">
                        </div>
                        <span class="text txt-place">~</span>
                        <div class="suggset box">
                            <input type="text" class="input-text place station disabled" name="to" placeholder="目的地" value="北京" disabled="disabled">
                        </div>
                        <span class="date-text">
                            <input type="text" class="input-text day date disabled" id="date" name="startdate" value="2016-03-17" disabled="disabled">
                            <label for="date" class="calendar"></label>
                        </span>
                        <span class="text">日</span>
                        <span class="text">共</span>
                        <input type="text" name="day" class="input-text disabled w100" disabled="disabled" value="1">
                        <span class="text">天</span>
                    </li>
                    <li class="item">
                        <label>标题</label>
                        <div class="suggset tit">
                            <label class="msg">请输入标题</label>
                            <input type="text" class="title long-text" name="title" value="03月17日 南京到北京 4日游 求结伴同游"  readonly="readonly" disabled="disabled">
                    </li>
                    <li class="item">
                        <label>内容</label>
                        <div class="suggset tit">
                            <label class="msg">请输入描述</label>
                            <textarea type="text" class="text-main textarea" name="description" placeholder="可以谈谈想法或者计划、行程，越生动详细越会吸引人哦~" value="">打算大大说的啊飒飒飒飒飒飒飒飒飒飒是hj</textarea>
                            <span class="text-count">
                                还可以输入<span class="word">0</span>字
                            </span>
                        </div>
                    </li>
                                            <li class="item z-index5">
                        <div class="info">
                            <label>联系方式</label>
                            <div class="select-div contact-div" onselectstart="return false;">
                                <select name="contacttype" class="contact-type" id="">
                                    <option value="qq" selected="selected">QQ</option>
                                    <option value="mobile" >手机</option>
                                    <option value="wechat" >微信</option>
                                </select>
                            </div>
                            <div class="suggset way">
                                <input type="text" class="input-text contactnumber" name="contactnumber" value="87423000" data-mobile="12345678998">
                            </div>
                        </div>
                        <div class="more">
                            <label>最多</label>
                            <div class="select-div" onselectstart="return false;">
                                <select name="person" class="person" id="">
                                                                        <option value="2" selected="selected">2</option>
                                                                        <option value="3" >3</option>
                                                                        <option value="4" >4</option>
                                                                        <option value="5" >5</option>
                                                                        <option value="6" >6</option>
                                                                        <option value="7" >7</option>
                                                                        <option value="8" >8</option>
                                                                        <option value="9" >9</option>
                                                                        <option value="10" >10</option>
                                                                        <option value="11" >11</option>
                                                                        <option value="12" >12</option>
                                                                        <option value="13" >13</option>
                                                                        <option value="14" >14</option>
                                                                        <option value="15" >15</option>
                                                                        <option value="16" >16</option>
                                                                        <option value="17" >17</option>
                                                                        <option value="18" >18</option>
                                                                        <option value="19" >19</option>
                                                                        <option value="20" >20</option>
                                                                        <option value="21" >21</option>
                                                                        <option value="22" >22</option>
                                                                        <option value="23" >23</option>
                                                                        <option value="24" >24</option>
                                                                        <option value="25" >25</option>
                                                                        <option value="26" >26</option>
                                                                        <option value="27" >27</option>
                                                                        <option value="28" >28</option>
                                                                        <option value="29" >29</option>
                                                                        <option value="30" >30</option>
                                                                    </select>
                            </div>
                            <span class="text">人</span>
                        </div>
                    </li>
                    <li class="item pd0">
                        <div class="ajaxmsg"></div>
                    </li>
                    <li class="item pd20">
                        <div class="btn">
                            <input type="submit" class="submit" data-tid="115" value="保存">
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>

<script type="text/javascript" src="http://static.liantu.cn/script/dist/lib/jquery.seajs.js" id="seajsnode"></script>

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
    seajs.use('modules/my/member/travel/edit.js');
</script>
</body>
</html>
