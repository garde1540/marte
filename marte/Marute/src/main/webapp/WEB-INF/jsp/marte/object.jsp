<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<%@ include file="/WEB-INF/Include/navbar.jspf"%>
<title>Insert title here</title>
</head>
<body>
<form>
<div class = "container">
<div class="formation-info">
<div class="row">
<div class="col ml-1 ball1-info">
<span class="label">제목</span><br>
<input type="text" name="GACH_NAME" maxlength="10" > 최대 10글자

<hr>
</div>
<div class="col ml-1 ball1-info">
<span class="label">이벤트 배너</span><br>
<input class="input" type="file" name="GACH_img" maxlength="10" accept="image" >
<hr>
</div>
<div>
<div class="col ml-1 ball1-info">
<span class="label">캐릭터 추가</span><br>
<div id="ch_con"></div>
<hr>
</div>
<div class="col ml-1 ball1-info">
<span class="label">캐릭터</span><br>
<div id="ch_con"></div>
<hr>
</div>
</div>
<div class="col-auto" align="center">
<input type="submit" class="btn btn-sm btn-info" value="추가" >
</div>
</div>
</div>
</div>
</form>
</body>
</html>