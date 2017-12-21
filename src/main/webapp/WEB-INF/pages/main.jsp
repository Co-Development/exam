<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/tips.css">
<title>tips</title>
</head>
<body>
	<div class="top">
		<div class="pic1"></div>
		<div class="pic2">
		</div>
	</div>
	<c:if test="${exam_finish == true}">
		<div class="main" style="margin-top:180px;">

			<div class="box">
				<div class="box-nav">
				<c:if test="${username!=null}">
				<h3><span style="margin-right: 50px; ">${username}</span>您已完成考试，考试成绩为：</h3>
				</c:if>
					
					<hr>
				</div>
				<div style="text-align: center;">
					
				<c:if test="${exam_score>=60}">
				<p id="score" style="color: blue;">${exam_score}</p>
				</c:if>
				
				<c:if test="${exam_score<60}">
					<p id="score">${exam_score}</p>
				</c:if>
				
				
				</div>
				<div>
					<input class="button" type="button"
						onclick="location.href='${pageContext.request.contextPath}/login.jsp'" value="返回登录">
				</div>
			</div>
		</div>
	</c:if>
	<c:if test="${exam_finish == false}">
		<div class="main">
			<div class="box">
				<div class="box-nav">
					<h1>注意事项(例</h1>
					<hr>
				</div>
				<div>
					<p>1、考生必须自觉服从监考员等考试工作人员管理，不得以任何理由妨碍监考员等考试工作人员履行职责，不得扰乱考场及其他考试工作地点的秩序。</p>
					<p>2、考生凭准考证、身份证，按规定时间和准考证上各科目的考试试室、座位号参加考试。</p>
					<p>3、考生入场，除2B铅笔、书写黑色字迹的钢笔或签字笔、直尺、圆规、三角板、橡皮、手表外，其他任何物品不准带入考试室。高中起点本、专科《数学》考试，可使用没有存储记忆功能的计算器。严禁携带各种无线通讯工具（如寻呼机、移动电话、无线耳机）、电子存储记忆录放设备以及涂改液、修正带等物品进入试室。严禁穿制服进入试室参加考试。考试室内不得自行传递工具、用品等。</p>
					<p>4、考生应在每科开考前20分钟（第一科前移10分钟）凭准考证、有效证件（身份证、现役军人身份证件）进入试室，对号入座，入座后将准考证、身份证等有效证件放在桌面靠走道边上角，以便让监考员核验。考生领到答题卡、条形码和试卷后，须认真核对答题卡的张数，核对条形码上的姓名、考生号与自己准考证上的信息是否一致。如不一致，应向监考员提出更换。在规定的时间内用黑色字迹的签字笔或钢笔准确清楚地填写答题卡上的姓名、考生号、试室号、座位号，用2B铅笔在答题卡上根据所发试卷准确填涂试题类型（A或B），并将条形码横贴在答题卡右上角的“条形码粘贴处”栏框内。凡漏填、错填、全填或字迹不清的答卷、答题卡无效。</p>
					<p>5、开考信号发出后才能开始答题。</p>
					<p>6、开考15分钟后禁止迟到考生进入考场、试室，离每科考试结束前30分钟，方可交卷出场，交卷出场后不得再进入试室，也不准在考场附近逗留或交谈。</p>
				<!-- 	<p>7、考生在答题卡规定的区域答题。选择题用2B铅笔在选择题答题区作答，非选择题用黑色字迹钢笔或签字笔作答。不准用规定以外的笔和纸答题，不准在答卷、答题卡上做任何标记，否则答题卡无效。考生不准随意修改答题卡上的题号，考生必须在指定的题号里作答。凡不在指定答题题号框内作答、超出答题区域作答或擅自更改题号作答，其答案一律无效。如果解答中有画表或辅助线，先用铅笔进行画线、绘图，再用黑色字迹的签字笔或钢笔描黑。</p>
					<p>8、在考场内须保持安静、不准吸烟，不准喧哗，不准交头接耳、左顾右盼、打手势、做暗号，不准夹带、旁窥、抄袭或有意让他人抄袭，不准传抄答案或交换试卷、答题卡，不准将试卷、答题卡或草稿纸带出试室。</p>
					<p>9、遇试卷分发错误及试题字迹模糊等问题，可举手询问；涉及试题内容的疑问，不得向监考人员询问。</p>
					<p>10、考试终了信号发出后，立即停笔，根据监考员指令依次退出试室，不准在试室逗留。</p> -->
				</div>
				<div>
					<input class="button" type="button"
						onclick="location.href='/examen/start'" value="开始考试">
				</div>
			</div>
		</div>
	</c:if>
</body>
</html>