$(function(){
	var _this=$("#leftTimeP");
	if(!_this.hasClass("on")){
		$.leftTime(2700,function(d){
			if(d.status){
				_this.addClass("on");
				_this.html(d.m+":"+d.s);
			}else{
				_this.removeClass("on");
				alert("答题时间到，将自动提交答案。");
				$("input").attr("disabled");
				$.ajax({
					type:'POST',
					async:false,
					url:'/examen/testSubmit',
					data:$('#exam_form').serialize(),
					dataType:'json',
					success:function(data){
						if(data.state == '1') {
							location.href=data.url;
						} else {
							alert('请将试卷完成！');
						}
					},
					error:function(XMLHttpRequest, textStatus, errorThrown){
						alert(textStatus+XMLHttpRequest.status);  
					}
				});
			}
		});
	}
});