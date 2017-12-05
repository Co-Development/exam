$(function(){
	var _this=$("#leftTimeP");
	if(!_this.hasClass("on")){
		$.leftTime(10,function(d){
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