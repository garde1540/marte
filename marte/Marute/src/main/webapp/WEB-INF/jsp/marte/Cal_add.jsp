<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="/css/modal.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript"></script>
<%@ include file="/WEB-INF/Include/navbar_admin.jspf"%>
<head>
<meta charset="UTF-8">
<title>관리자페이지</title>
</head>
<body>
<c:set var = "testStr" value = "${requestScope['javax.servlet.forward.request_uri']}"/>
<div>
<div class="container" style="padding-top: 121px">
<div class="row" style="border: 1px solid #999 ;border-radius:10px;">
<div class="rol">
<form action="" method="POST" enctype="multipart/form-data">
	<div class="input-group input-group-sm mt-2 mb-3"">
	<div class="input-group-prepend">
	<span class="input-group-text font-weight-bold">제목</span>
	</div>
	<input type="text"  class="form-control" name="GACH_NAME">
	</div>
	<div class="input-group input-group-sm mt-2 mb-3"">
	<div class="input-group-prepend">
	<span class="input-group-text font-weight-bold">시작일</span>
	</div>
	<input type="date" name="GACH_START">
	<div class="input-group-prepend">
	<span class="input-group-text font-weight-bold">종료일</span>
	</div>
	<input type="date" name="GACH_END">
	</div>
	<div class="input-group input-group-sm mt-2 mb-3"">
	<div class="input-group-prepend">
	<span class="input-group-text font-weight-bold">이미지</span>
	</div>
	<input type="file" name="GACH_IMG">
	</div>
	<c:if test = "${fn:contains(testStr, 'cal_characters')||fn:contains(testStr, 'cal_event')}">
	<div class="formation-info">
	<span class="label">캐릭터</span>
	<br>
	<div id ="characters">
	</div>
	</div>
	</c:if>
	<c:if test = "${fn:contains(testStr, 'cal_weapon')||fn:contains(testStr, 'cal_event')}">
	<div class="formation-info">
	<span class="label">장비</span>
	<br>
	<div id ="weapon"></div>
	</div>
	</c:if>
	<textarea name="GACH_CONTEXT" id="mytextarea"></textarea>
	<input class="btn btn-sm btn-info" type="submit" value="작성">
</form>
<div ></div>
<c:if test = "${fn:contains(testStr, 'cal_characters')||fn:contains(testStr, 'cal_event')}">
<button class="btn btn-sm btn-primary btn-ch mt-2 mt-md-0">캐릭터 추가</button>
</c:if>

<c:if test = "${fn:contains(testStr, 'cal_weapon')||fn:contains(testStr, 'cal_event')}">
<button class="btn btn-sm btn-primary btn-we mt-2 mt-md-0">장비 추가</button>
</c:if>


</div>
</div>
</div>
</div>
<%@ include file="/WEB-INF/Include/modal_admin.jspf"%>
</body>
</html>
