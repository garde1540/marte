<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>공지사항</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
</script>
<%@ include file="/WEB-INF/Include/navbar.jspf"%>
<script src="../js/content.js">
</script>
<link rel="stylesheet" href="/css/modal.css">
<script type="text/javascript">

$(function(){
	page(1);
})
</script>
<div class="container">
<div class="row">
<div class="col">
<table class="table table-sm " id="bottom-table">
<thead>
<tr><th  class="text-center">번호</th>
<th class="text-center">제목</th>
<th class="text-center">작성일</th>
</tr>
</thead>
<tbody id="page">

</tbody>
</table>
</div>
</div>
</div>
<div class="modal">
     <div class="modal_body">
</div>
</div>

<script src="../js/modal.js">
</script>
</body>
</html>