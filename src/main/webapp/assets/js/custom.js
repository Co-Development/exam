$(function(){
	console.log("答案就在每题下面hidden属性的type里。\n不谢。");
	var _this=$("#leftTimeP");
	if(!_this.hasClass("on")){
		$.leftTime(2700,function(d){
			if(d.status){
				_this.addClass("on");
				var time = d.m+":"+d.s;
				_this.html(time);
				$("#examTime").attr("value",time);
			}else{
				_this.removeClass("on");
				alert("答题时间到，将自动提交答案。");
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