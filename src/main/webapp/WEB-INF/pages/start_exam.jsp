<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Document</title>
		<link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css">
		<script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
		<script src="../assets/js/leftTime.min.js"></script>
		<script src="../assets/js/custom.js"></script>
	</head>
	<body style="padding-top: 70px;">
	
		<!--nav导航栏-->
		<form>
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container">
				
				<p class="navbar-text">剩余时间</p>
				<p class="navbar-text" id="leftTimeP">00:00</p>

				<input class="navbar-right btn btn-default navbar-btn" type="button" id="submit" value="交卷">
			</div>
		</nav>
		
		<!---->

		<div class="jumbotron">
			<div class="container">
				<h2>考核</h2>
				<p>这里可以写规则注意事项之类的</p>
			</div>
		</div>

		<div class="container">
			
				<!-- 三选一 -->
				<h2>单选题</h2>
				<c:forEach items="${list1}" var="test1" varStatus="status">
					<div class="form-group">
						<label>${status.count}、${test1.test_question}</label>
						<div class="radio">
							<label>
								<input type="radio" name="x1_${status.count}" value="${test1.test_a}">
								A. ${test1.test_a}
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="x1_${status.count}">
								B. ${test1.test_b} 
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="x1_${status.count}">
								C. ${test1.test_c}
							</label>
						</div>
						<input name="y1_${status.count}" type="hidden" value="${test1.test_right}">
					</div>
					<hr>
				</c:forEach>

				<!-- 四选一 -->
				<c:forEach items="${list2}" var="test2" varStatus="status">
					<div class="form-group">
						<label>${status.count+35}、${test2.test_question}</label>
						<div class="radio">
							<label>
								<input type="radio" name="x1_${status.count+35}" value="${test2.test_a}">
								A. ${test2.test_a}
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="x1_${status.count+35}" value="${test2.test_b}">
								B. ${test2.test_b}
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="x1_${status.count+35}" value="${test2.test_c}">
								C. ${test2.test_c}
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="x1_${status.count+35}" value="${test2.test_d}">
								D. ${test2.test_d}
							</label>
						</div>
						<input name="y1_${status.count+35}" type="hidden" value="${test2.test_right}">
					</div>
					<hr>
				</c:forEach>

				<!-- 多选 -->
				<h2>多选题</h2>
				<c:forEach items="${list3}" var="test3" varStatus="status">
					<div class="form-group">
						<label>${status.count+45}、${test3.test_question}</label>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="x2_${status.count+45}" value="${test3.test_a} ">
								A. ${test3.test_a} 
							</label>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="x2_${status.count+45}" value="${test3.test_b}">
								B. ${test3.test_b}
							</label>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="x2_${status.count+45}" value="${test3.test_c}">
								C. ${test3.test_c}
							</label>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="x2_${status.count+45}" value="${test3.test_d}">
								D. ${test3.test_d}
							</label>
						</div>
						<input name="y2_${status.count+45}" type="hidden" value="${test3.test_right}">
					</div>
					<hr>
				</c:forEach>

				<!-- 判断 -->
				<h2>判断题</h2>
				<c:forEach items="${list4}" var="test4" varStatus="status">
					<div class="form-group">
						<label>${status.count+65}、${test4.test_question}</label>
						<div>
						<label class="radio-inline">
							<input type="radio" name="x3_${status.count+65}" value="1"> 正确
						</label>

						<label class="radio-inline">
							<input type="radio" name="x3_${status.count+65}" value="0"> 错误
						</label>

						<input name="y3_${status.count+65}" type="hidden" value="${test4.test_result}">
						</div>
					</div>
					<hr>
				</c:forEach>

		</div>
		</form>
		
	</body>

	<script type="text/javascript">
	$('#submit').on('click', function(){
		// ajax提交表单
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
	});
	</script>
</html>