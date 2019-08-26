define("my/member/order/index", ["./mod/detail", "./mod/jquery.raty", "./mod/placeholder", "../../../public/formtip"], function (a) {
    a("./mod/detail"), a("./mod/jquery.raty"), $(".mod-star").raty({
        path: function () {
            return this.getAttribute("data-path")
        }
    }), a("./mod/placeholder");
    var b = a("../../../public/formtip");
    !function () {
        function a() {
            g.hide(), c.hide(), f.hide(), $("body").removeAttr("style"), $("html").removeAttr("style")
        }

        var c = $(".mod-contact"), d = $(".submit"), e = $(".cancel"), f = $(".mod-reviews"), g = $(".mod-popbg"),
            h = $(".message"), i = $(".close").find("a"), j = "/member/order/cancel/", k = $('input[name="score"]');
        $(".again");
        var l = {}, m = c.find(".title span"), n = c.find(".btn"), o = c.find(".phone"), p = c.find(".qq"),
            q = c.find(".wechat");
        c.find(".btn");
        var r = $(".count").find("span"), s = navigator.userAgent.toLocaleLowerCase(), t = 0,
            u = s.indexOf("ie 6") > -1 ? 1 : 0;
        (s.indexOf("ie 6") > -1 || s.indexOf("ie 7") > -1 || s.indexOf("ie 8") > -1) && (t = 1), $(".contact").on("click", function () {
            var a = $(this), b = a.attr("data-nickname"), d = a.attr("data-mobile"), e = a.attr("data-weixin"),
                f = a.attr("data-qq");
            m.html(b), d ? o.show().html(d) : o.hide(), f ? p.show().html(f) : p.hide(), e ? q.show().html(e) : q.hide(), u && (c.css({
                position: "absolute",
                top: ($(window).height() - c.height()) / 2 + "px",
                left: ($(window).width() - c.width()) / 2 + "px",
                "margin-left": "0",
                "margin-top": "0"
            }), c.prependTo($("body")), g.prependTo($("body"))), c.show(), g.show(), $("html").css({overflow: "hidden"}), $("body").css({"overflow-y": "scroll"})
        }), g.on("click", function () {
            a()
        }), n.on("click", function () {
            a()
        }), i.on("click", function () {
            a()
        }), $(".reviews").on("click", function () {
            var a = $(this), b = a.attr("data-sn"), c = a.attr("data-nickname");
            l.sn = b, f.find(".title span").html(c), u && (f.css({position: "absolute"}), f.prependTo("body"), g.prependTo("body")), f.show(), g.show(), $("html").css({overflow: "hidden"}), $("body").css({"overflow-y": "scroll"})
        }), $(".mod-star").on("click", "img", function () {
            var a = $(this), b = a.parent("p").attr("data-name"),
                c = 2 * a.parent("p").find('input[name="score"]').val();
            l[b] = c
        });
        var v = {
            statInputNum: function (a, b, c) {
                var d;
                a[0].setAttribute("maxlength", c), d = a.val().length, b.text(c - d), a.on("input propertychange", function () {
                    b.text(c - $(this).val().length)
                }), t && a.on("input propertychange", function () {
                    this.value.length > c && (this.value = this.value.substr(0, c))
                })
            }, input: function (a, b) {
                b = void 0 === b ? 1 : b;
                var c = a.val(), d = a.attr("name"), e = {status: !0, data: {}};
                return e.data[d] = c, e
            }, removeError: function (a) {
                a.removeClass("input-error")
            }, createNoAcc: function (a, b) {
                var c = [];
                c.push('<div class="no-acc"><p class="msg">' + b + '</p><p class="comfirm"><a href="javascript:;" class="yes">是</a><a href="javascript:;" class="no">否</a></p></div>'), a.prepend(c.join(""))
            }
        }, w = {
            submit: function () {
                var a = 1;
                k.each(function () {
                    "" === $(this).val() ? (a = 0, $(".msg-error").css("visibility", "visible")) : (a = 1, $(".msg-error").css("visibility", "hidden"))
                }), a && this.ajax(l)
            }, ajax: function (a) {
                var c = this;
                $.ajax({
                    type: "GET", url: "/member/order/evaluate/", data: a, error: function () {
                        d.attr("disabled", !1), b.init({status: !1, msg: a.msg})
                    }, beforeSend: function () {
                        f.hide(), g.hide(), $("body").removeAttr("style"), $("html").removeAttr("style"), d.attr("disabled", !0)
                    }, success: function (a) {
                        d.attr("disabled", !1), c.success(a)
                    }
                })
            }, success: function (a) {
                a && (a.status ? b.init({status: !0, msg: a.msg}, function () {
                    location.replace(location.href)
                }) : b.init({status: !1, msg: a.msg}))
            }
        };
        $("#submit").click(function () {
            w.submit()
        }), h.on({
            focus: function () {
                v.removeError($(this))
            }, focusout: function () {
                v.input($(this))
            }, "input propertychange": function () {
                v.statInputNum($(this), r, 120)
            }
        }), e.on("click", function () {
            var a = $(this), c = a.attr("data-id"), d = a.parents(".tb-order");
            $(".no-acc").remove(), v.createNoAcc(d, "是否取消预约？"), $(".yes").click(function () {
                $.ajax({
                    url: j, type: "GET", dataType: "json", data: "id=" + c, success: function (a) {
                        a.status ? b.init({status: !0, msg: a.msg}, function () {
                            location.replace(location.href)
                        }) : b.init({status: !1, msg: a.errmsg}, function () {
                            location.replace(location.href)
                        })
                    }, error: function (a) {
                        b.init({status: !1, msg: a.errmsg})
                    }
                })
            }), $(".no").click(function () {
                $(".no-acc").remove()
            })
        })
    }()
}), define("my/member/order/mod/detail", [], function () {
    $(".btn-detail").on({
        click: function (a) {
            var b = $(a.target).parents(".order-ft");
            $(this).children("i").toggleClass("icon"), b.next(".mod-box").stop().slideToggle("slow")
        }
    }), $(".btn-up a").on({
        click: function (a) {
            var b = $(a.target).parents(".mod-box"), c = b.siblings(".order-ft").find(".btn-detail i");
            b.slideUp("slow"), c.removeClass("icon")
        }
    })
}), define("my/member/order/mod/jquery.raty", [], function () {
    !function (a) {
        "use strict";
        var b = {
            init: function (c) {
                return this.each(function () {
                    this.self = a(this), b.destroy.call(this.self), this.opt = a.extend(!0, {}, a.fn.raty.defaults, c), b._adjustCallback.call(this), b._adjustNumber.call(this), b._adjustHints.call(this), this.opt.score = b._adjustedScore.call(this, this.opt.score), "img" !== this.opt.starType && b._adjustStarType.call(this), b._adjustPath.call(this), b._createStars.call(this), this.opt.cancel && b._createCancel.call(this), this.opt.precision && b._adjustPrecision.call(this), b._createScore.call(this), b._apply.call(this, this.opt.score), b._setTitle.call(this, this.opt.score), b._target.call(this, this.opt.score), this.opt.readOnly ? b._lock.call(this) : (this.style.cursor = "pointer", b._binds.call(this))
                })
            }, _adjustCallback: function () {
                for (var a = ["number", "readOnly", "score", "scoreName", "target", "path"], b = 0; b < a.length; b++) "function" == typeof this.opt[a[b]] && (this.opt[a[b]] = this.opt[a[b]].call(this))
            }, _adjustedScore: function (a) {
                return a ? b._between(a, 0, this.opt.number) : a
            }, _adjustHints: function () {
                if (this.opt.hints || (this.opt.hints = []), this.opt.halfShow || this.opt.half) for (var a = this.opt.precision ? 10 : 2, b = 0; b < this.opt.number; b++) {
                    var c = this.opt.hints[b];
                    "[object Array]" !== Object.prototype.toString.call(c) && (c = [c]), this.opt.hints[b] = [];
                    for (var d = 0; a > d; d++) {
                        var e = c[d], f = c[c.length - 1];
                        void 0 === f && (f = null), this.opt.hints[b][d] = void 0 === e ? f : e
                    }
                }
            }, _adjustNumber: function () {
                this.opt.number = b._between(this.opt.number, 1, this.opt.numberMax)
            }, _adjustPath: function () {
                this.opt.path = this.opt.path || "", this.opt.path && "/" !== this.opt.path.charAt(this.opt.path.length - 1) && (this.opt.path += "/")
            }, _adjustPrecision: function () {
                this.opt.half = !0
            }, _adjustStarType: function () {
                var a = ["cancelOff", "cancelOn", "starHalf", "starOff", "starOn"];
                this.opt.path = "";
                for (var b = 0; b < a.length; b++) this.opt[a[b]] = this.opt[a[b]].replace(".", "-")
            }, _apply: function (a) {
                b._fill.call(this, a), a && (a > 0 && this.score.val(a), b._roundStars.call(this, a))
            }, _between: function (a, b, c) {
                return Math.min(Math.max(parseFloat(a), b), c)
            }, _binds: function () {
                this.cancel && (b._bindOverCancel.call(this), b._bindClickCancel.call(this), b._bindOutCancel.call(this)), b._bindOver.call(this), b._bindClick.call(this), b._bindOut.call(this)
            }, _bindClick: function () {
                var c = this;
                c.stars.on("click.raty", function (d) {
                    var e = !0,
                        f = c.opt.half || c.opt.precision ? c.self.data("score") : this.alt || a(this).data("alt");
                    c.opt.click && (e = c.opt.click.call(c, +f, d)), (e || void 0 === e) && (c.opt.half && !c.opt.precision && (f = b._roundHalfScore.call(c, f)), b._apply.call(c, f))
                })
            }, _bindClickCancel: function () {
                var a = this;
                a.cancel.on("click.raty", function (b) {
                    a.score.removeAttr("value"), a.opt.click && a.opt.click.call(a, null, b)
                })
            }, _bindOut: function () {
                var a = this;
                a.self.on("mouseleave.raty", function (c) {
                    var d = +a.score.val() || void 0;
                    b._apply.call(a, d), b._target.call(a, d, c), b._resetTitle.call(a), a.opt.mouseout && a.opt.mouseout.call(a, d, c)
                })
            }, _bindOutCancel: function () {
                var a = this;
                a.cancel.on("mouseleave.raty", function (c) {
                    var d = a.opt.cancelOff;
                    if ("img" !== a.opt.starType && (d = a.opt.cancelClass + " " + d), b._setIcon.call(a, this, d), a.opt.mouseout) {
                        var e = +a.score.val() || void 0;
                        a.opt.mouseout.call(a, e, c)
                    }
                })
            }, _bindOver: function () {
                var a = this, c = a.opt.half ? "mousemove.raty" : "mouseover.raty";
                a.stars.on(c, function (c) {
                    var d = b._getScoreByPosition.call(a, c, this);
                    b._fill.call(a, d), a.opt.half && (b._roundStars.call(a, d, c), b._setTitle.call(a, d, c), a.self.data("score", d)), b._target.call(a, d, c), a.opt.mouseover && a.opt.mouseover.call(a, d, c)
                })
            }, _bindOverCancel: function () {
                var a = this;
                a.cancel.on("mouseover.raty", function (c) {
                    var d = a.opt.path + a.opt.starOff, e = a.opt.cancelOn;
                    "img" === a.opt.starType ? a.stars.attr("src", d) : (e = a.opt.cancelClass + " " + e, a.stars.attr("class", d)), b._setIcon.call(a, this, e), b._target.call(a, null, c), a.opt.mouseover && a.opt.mouseover.call(a, null)
                })
            }, _buildScoreField: function () {
                return a("<input />", {name: this.opt.scoreName, type: "hidden"}).appendTo(this)
            }, _createCancel: function () {
                var b = this.opt.path + this.opt.cancelOff,
                    c = a("<" + this.opt.starType + " />", {title: this.opt.cancelHint, "class": this.opt.cancelClass});
                "img" === this.opt.starType ? c.attr({
                    src: b,
                    alt: "x"
                }) : c.attr("data-alt", "x").addClass(b), "left" === this.opt.cancelPlace ? this.self.prepend("&#160;").prepend(c) : this.self.append("&#160;").append(c), this.cancel = c
            }, _createScore: function () {
                var c = a(this.opt.targetScore);
                this.score = c.length ? c : b._buildScoreField.call(this)
            }, _createStars: function () {
                for (var c = 1; c <= this.opt.number; c++) {
                    var d = b._nameForIndex.call(this, c), e = {alt: c, src: this.opt.path + this.opt[d]};
                    "img" !== this.opt.starType && (e = {
                        "data-alt": c,
                        "class": e.src
                    }), e.title = b._getHint.call(this, c), a("<" + this.opt.starType + " />", e).appendTo(this), this.opt.space && this.self.append(c < this.opt.number ? "&#160;" : "")
                }
                this.stars = this.self.children(this.opt.starType)
            }, _error: function (b) {
                a(this).text(b), a.error(b)
            }, _fill: function (a) {
                for (var c = 0, d = 1; d <= this.stars.length; d++) {
                    var e, f = this.stars[d - 1], g = b._turnOn.call(this, d, a);
                    if (this.opt.iconRange && this.opt.iconRange.length > c) {
                        var h = this.opt.iconRange[c];
                        e = b._getRangeIcon.call(this, h, g), d <= h.range && b._setIcon.call(this, f, e), d === h.range && c++
                    } else e = this.opt[g ? "starOn" : "starOff"], b._setIcon.call(this, f, e)
                }
            }, _getFirstDecimal: function (a) {
                var b = a.toString().split(".")[1], c = 0;
                return b && (c = parseInt(b.charAt(0), 10), "9999" === b.slice(1, 5) && c++), c
            }, _getRangeIcon: function (a, b) {
                return b ? a.on || this.opt.starOn : a.off || this.opt.starOff
            }, _getScoreByPosition: function (c, d) {
                var e = parseInt(d.alt || d.getAttribute("data-alt"), 10);
                if (this.opt.half) {
                    var f = b._getWidth.call(this), g = parseFloat((c.pageX - a(d).offset().left) / f);
                    e = e - 1 + g
                }
                return e
            }, _getHint: function (a, c) {
                if (0 !== a && !a) return this.opt.noRatedMsg;
                var d = b._getFirstDecimal.call(this, a), e = Math.ceil(a), f = this.opt.hints[(e || 1) - 1], g = f,
                    h = !c || this.move;
                return this.opt.precision ? (h && (d = 0 === d ? 9 : d - 1), g = f[d]) : (this.opt.halfShow || this.opt.half) && (d = h && 0 === d ? 1 : d > 5 ? 1 : 0, g = f[d]), "" === g ? "" : g || a
            }, _getWidth: function () {
                var a = this.stars[0].width || parseFloat(this.stars.eq(0).css("font-size"));
                return a || b._error.call(this, "Could not get the icon width!"), a
            }, _lock: function () {
                var a = b._getHint.call(this, this.score.val());
                this.style.cursor = "", this.title = a, this.score.prop("readonly", !0), this.stars.prop("title", a), this.cancel && this.cancel.hide(), this.self.data("readonly", !0)
            }, _nameForIndex: function (a) {
                return this.opt.score && this.opt.score >= a ? "starOn" : "starOff"
            }, _resetTitle: function () {
                for (var a = 0; a < this.opt.number; a++) this.stars[a].title = b._getHint.call(this, a + 1)
            }, _roundHalfScore: function (a) {
                var c = parseInt(a, 10), d = b._getFirstDecimal.call(this, a);
                return 0 !== d && (d = d > 5 ? 1 : .5), c + d
            }, _roundStars: function (a, c) {
                var d, e = (a % 1).toFixed(2);
                if (c || this.move ? d = e > .5 ? "starOn" : "starHalf" : e > this.opt.round.down && (d = "starOn", this.opt.halfShow && e < this.opt.round.up ? d = "starHalf" : e < this.opt.round.full && (d = "starOff")), d) {
                    var f = this.opt[d], g = this.stars[Math.ceil(a) - 1];
                    b._setIcon.call(this, g, f)
                }
            }, _setIcon: function (a, b) {
                a["img" === this.opt.starType ? "src" : "className"] = this.opt.path + b
            }, _setTarget: function (a, b) {
                b && (b = this.opt.targetFormat.toString().replace("{score}", b)), a.is(":input") ? a.val(b) : a.html(b)
            }, _setTitle: function (a, c) {
                if (a) {
                    var d = parseInt(Math.ceil(a), 10), e = this.stars[d - 1];
                    e.title = b._getHint.call(this, a, c)
                }
            }, _target: function (c, d) {
                if (this.opt.target) {
                    var e = a(this.opt.target);
                    e.length || b._error.call(this, "Target selector invalid or missing!");
                    var f = d && "mouseover" === d.type;
                    if (void 0 === c) c = this.opt.targetText; else if (null === c) c = f ? this.opt.cancelHint : this.opt.targetText; else {
                        "hint" === this.opt.targetType ? c = b._getHint.call(this, c, d) : this.opt.precision && (c = parseFloat(c).toFixed(1));
                        var g = d && "mousemove" === d.type;
                        f || g || this.opt.targetKeep || (c = this.opt.targetText)
                    }
                    b._setTarget.call(this, e, c)
                }
            }, _turnOn: function (a, b) {
                return this.opt.single ? a === b : b >= a
            }, _unlock: function () {
                this.style.cursor = "pointer", this.removeAttribute("title"), this.score.removeAttr("readonly"), this.self.data("readonly", !1);
                for (var a = 0; a < this.opt.number; a++) this.stars[a].title = b._getHint.call(this, a + 1);
                this.cancel && this.cancel.css("display", "")
            }, cancel: function (c) {
                return this.each(function () {
                    var d = a(this);
                    d.data("readonly") !== !0 && (b[c ? "click" : "score"].call(d, null), this.score.removeAttr("value"))
                })
            }, click: function (c) {
                return this.each(function () {
                    a(this).data("readonly") !== !0 && (c = b._adjustedScore.call(this, c), b._apply.call(this, c), this.opt.click && this.opt.click.call(this, c, a.Event("click")), b._target.call(this, c))
                })
            }, destroy: function () {
                return this.each(function () {
                    var b = a(this), c = b.data("raw");
                    c ? b.off(".raty").empty().css({cursor: c.style.cursor}).removeData("readonly") : b.data("raw", b.clone()[0])
                })
            }, getScore: function () {
                var a, b = [];
                return this.each(function () {
                    a = this.score.val(), b.push(a ? +a : void 0)
                }), b.length > 1 ? b : b[0]
            }, move: function (c) {
                return this.each(function () {
                    var d = parseInt(c, 10), e = b._getFirstDecimal.call(this, c);
                    d >= this.opt.number && (d = this.opt.number - 1, e = 10);
                    var f = b._getWidth.call(this), g = f / 10, h = a(this.stars[d]), i = h.offset().left + g * e,
                        j = a.Event("mousemove", {pageX: i});
                    this.move = !0, h.trigger(j), this.move = !1
                })
            }, readOnly: function (c) {
                return this.each(function () {
                    var d = a(this);
                    d.data("readonly") !== c && (c ? (d.off(".raty").children("img").off(".raty"), b._lock.call(this)) : (b._binds.call(this), b._unlock.call(this)), d.data("readonly", c))
                })
            }, reload: function () {
                return b.set.call(this, {})
            }, score: function () {
                var c = a(this);
                return arguments.length ? b.setScore.apply(c, arguments) : b.getScore.call(c)
            }, set: function (b) {
                return this.each(function () {
                    a(this).raty(a.extend({}, this.opt, b))
                })
            }, setScore: function (c) {
                return this.each(function () {
                    a(this).data("readonly") !== !0 && (c = b._adjustedScore.call(this, c), b._apply.call(this, c), b._target.call(this, c))
                })
            }
        };
        a.fn.raty = function (c) {
            return b[c] ? b[c].apply(this, Array.prototype.slice.call(arguments, 1)) : "object" != typeof c && c ? (a.error("Method " + c + " does not exist!"), void 0) : b.init.apply(this, arguments)
        }, a.fn.raty.defaults = {
            cancel: !1,
            cancelClass: "raty-cancel",
            cancelHint: "Cancel this rating!",
            cancelOff: "cancel-off.png",
            cancelOn: "cancel-on.png",
            cancelPlace: "left",
            click: void 0,
            half: !1,
            halfShow: !0,
            hints: ["2分", "4分", "6分", "8分", "10分"],
            iconRange: void 0,
            mouseout: void 0,
            mouseover: void 0,
            noRatedMsg: "Not rated yet!",
            number: 5,
            numberMax: 20,
            path: void 0,
            precision: !1,
            readOnly: !1,
            round: {down: .25, full: .6, up: .76},
            score: void 0,
            scoreName: "score",
            single: !1,
            space: !0,
            starHalf: "star_half.png",
            starOff: "star_off.png",
            starOn: "star_on.png",
            starType: "img",
            target: void 0,
            targetFormat: "{score}",
            targetKeep: !1,
            targetScore: void 0,
            targetText: "",
            targetType: "hint"
        }
    }(jQuery)
}), define("my/member/order/mod/placeholder", [], function () {
    var a = document.createElement("input");
    if ("undefined" == typeof a.placeholder) {
        var b = $(".input-placeholder"), c = $(".placeholder");
        c.show(), b.on({
            focus: function () {
                var a = $(this), b = a.next(".placeholder");
                b.hide()
            }, blur: function () {
                var a = $(this), b = a.next(".placeholder");
                "" === a.val() && b.show()
            }
        }), c.click(function () {
            $(this).hide(), $(this).prev(".input-placeholder").focus()
        })
    }
}), define("public/formtip", [], function (a, b, c) {
    var d = navigator.userAgent.toLowerCase().indexOf("msie 6") > -1, e = 0, f = {
        init: function (a, b) {
            this.addHtml(a), this.callback = b || function () {
            }
        }, addHtml: function (a) {
            if (a = $.extend({
                status: !1,
                msg: "数据错误！"
            }, a), e) return a.status ? e.html('<p><span class="right"></span>' + a.msg + "</p>") : e.html('<p><span class="error"></span>' + a.msg + "</p>"), this.show(), void 0;
            var b = $("<div/>").addClass("mod-formtip"), c = $("<p/>"), f = $("<div/>").addClass("mod-formtip-mask"),
                g = $("<span/>");
            a.status ? g.addClass("right") : g.addClass("error"), c.html(a.msg), c.prepend(g), b.append(c), $("body").append(b), $("body").append(f), this.div = b, this.mask = f, e = b, d && b.css({top: $(document).scrollTop() + $(window).height() / 2 - b.height() / 2 + "px"}), this.hide()
        }, hide: function () {
            if (e) {
                var a = this;
                e.animate({opacity: "0"}, 1e3, function () {
                    e.hide().css({opacity: 1}), a.mask.hide(), a.callback()
                })
            }
        }, show: function () {
            e && (e.show(), this.mask.show(), this.hide())
        }
    };
    c.exports = f
});