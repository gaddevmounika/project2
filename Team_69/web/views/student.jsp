<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Start your quiz</title>
<link type='text/css' rel='stylesheet' href='../css/studentStyle.css' />
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Open Sans" />
<script type='text/javascript'
	src='https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
<script type='text/javascript' src='../js/jsquiz.js'></script>
<script type='text/javascript' src='../js/student.js'></script>
</head>
<body>
	<div id='container'>
		<div id='title'>
			<h1>Quiz Instructions</h1>
		</div>
		<br />
		<div id='quiz'></div>
		<div class='button' id='next'>
			<a href='#'>Next</a>
		</div>
		<div class='button' id='prev'>
			<a href='#'>Prev</a>
		</div>
		<div class='button' id='start'>
			<a href='#'>Start Over</a>
		</div>
		<!-- <button class='' id='next'>Next</a></button>
    		<button class='' id='prev'>Prev</a></button>
    		<button class='' id='start'> Start Over</a></button> -->
	</div>
	<script>
		$(document).ready(function() {
			var jsonDataStr = '<%=request.getAttribute("jsonData")%>';
			var jsonDataObj = JSON.parse(jsonDataStr);
			displayQuiz(jsonDataObj);
			var autoSaveInterval = setInterval(autoSave, 2000);
		});
	</script>
</body>
</html>
