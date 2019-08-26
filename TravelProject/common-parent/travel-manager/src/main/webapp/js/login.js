function savePass(ch) {
    ch.checked = !ch.checked;
}


$('.user').mouseover(function () {
    //鼠标移入
    $('.list').css('display', 'block');
});
$('.user').mouseout(function () {
    //鼠标移出
    $('.list').css('display', 'none');
});
$('.list').mouseover(function () {
    //鼠标移入
    $('.list').css('display', 'block');
});
$('.list').mouseout(function () {
    //鼠标移出
    $('.list').css('display', 'none');
});

function ejectLogin() {
    $('.dialog').css('dialog', 'block')
    $('#loginOrReg').css('display', 'block');
    $('.mask').css('opacity', 0.5);
    $('#loginOrReg').removeClass('mod-login-hide');
    $('#loginOrReg').removeClass('mod-login-show');
    $('#loginOrReg').removeClass('mod-login');
    $('#loginOrReg').addClass('mod-login mod-login-show');
    $('.panel.login').css('display', 'block');
    $('.panel.reg').css('display', 'none');
    $('#judge').val(false);
}

function ejectReg() {
    $('#judge').val(true);
    $('.panel.reg').css('display', 'block');
    $('.panel.login').css('display', 'none');
}

function closeAll() {
    $('#judge').val(false);
    $('.dialog').css('dialog', 'none')
    $('#loginOrReg').css('display', 'none');
    $('.mask').css('opacity', 0);
    $('#loginOrReg').removeClass('mod-login-hide');
    $('#loginOrReg').removeClass('mod-login-show');
    $('#loginOrReg').removeClass('mod-login');
    $('#loginOrReg').addClass('mod-login mod-login-hide');
    $('.panel.reg').css('display', 'none');
    $('.panel.login').css('display', 'none');
}