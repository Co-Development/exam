$(function(){
	var _this=$("#leftTimeP");
	if(!_this.hasClass("on")){
		$.leftTime(2100,function(d){
			if(d.status){
				_this.addClass("on");
				_this.html(d.m+":"+d.s);
			}else{
				_this.removeClass("on");
				alert("答题时间到，将自动提交答案。");
				$("input").attr("disabled","disabled");
				$.ajax({
					type:'POST',
					async:false,
					url:'/examen/testSubmit',
					data:$('#exam_form').serialize(),
					dataType:'json',
					success:function(data){
							location.href=data.url;
					},
					error:function(XMLHttpRequest, textStatus, errorThrown){
						alert(textStatus+XMLHttpRequest.status);  
					}
				});
			}
		});
	}
});
//
//var intDiff = parseInt(2100);//倒计时总秒数量
//function timer(intDiff){
//    window.setInterval(function(){
//    var day=0,
//        hour=0,
//        minute=0,
//        second=0;//时间默认值        
//    if(intDiff > 0){
//        minute = Math.floor(intDiff / 60) - (day * 24 * 60) - (hour * 60);
//        second = Math.floor(intDiff) - (day * 24 * 60 * 60) - (hour * 60 * 60) - (minute * 60);
//    }
//    if (minute <= 9) minute = '0' + minute;
//    if (second <= 9) second = '0' + second;
//    $('#lefttimeP').html(minute+':'+second);
//    intDiff--;
//    }, 1000);
//}
//$(function(){
//    timer(intDiff);
//});