<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>장비 픽업 일정</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
</script>
<%@ include file="/WEB-INF/Include/navbar.jspf"%>
<script src="../js/calendar.js">
</script>
<script src="../js/now.js">
</script>
<script src="../js/content.js">
</script>
<script type="text/javascript">
$(function(){
	page(1);
	now();
})
</script>
<div class="container">
<div class="row adsense-topbar">
<div class="col">
<table class="table table-sm " id="top-table">
<thead>
<tr><th class="text-center">번호</th>
<th class="text-center">이름</th>
<th class="text-center">종료일</th>
</tr>
</thead>
<tbody id="now"></tbody>
</table>
</div>
</div>
<div class="row">
<div class="col">
<div id="calendar"></div>
<table class="table table-sm " id="bottom-table">
<thead>
<tr><th class="text-center">번호</th>
<th class="text-center">남은일수</th>
<th class="text-center">이름</th>
<th class="text-center">시작일</th>
<th class="text-center">종료일</th>
</tr>
</thead>
<tbody id="page">

</tbody>
</table>
</div>
</div>
</div>
</body>
</html>