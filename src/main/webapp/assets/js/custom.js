$(function(){
	var _this=$("#leftTimeP");
	if(!_this.hasClass("on")){
		$.leftTime(2700,function(d){
			if(d.status){
				_this.addClass("on");
				_this.html(d.m+":"+d.s);
			}else{
				_this.removeClass("on");
				alert("提示");
			}
		});
	}
});