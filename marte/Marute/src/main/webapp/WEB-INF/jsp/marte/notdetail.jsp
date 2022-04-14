<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
</script>
<link rel="stylesheet" href="/css/modal.css">
<%@ include file="/WEB-INF/Include/navbar.jspf"%>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<body>
<div class="container" style="padding-top: 121px">

		<div class="row" style="border: 1px solid #999 ;border-radius:10px;">
			<div class="col" style="display: block;">
				<button onclick="history.back()" class="btn btn-sm btn-info">목록으로</button>
				<div style="margin-top: 10px">
				<div class="input-group input-group-sm">
					<div class="input-group-prepend">
						<span class="input-group-text">제목</span>
					</div>	
					<input type="text" class="form-control" value="${NOT_TITLE}" style="background:white" readonly="">
				</div>
				</div>
				<div style="margin-top: 10px">
				<div class="input-group input-group-sm">
				<div class="input-group-prepend">
					<span class="input-group-text">작성일</span>
				</div>
				<input type="text" class="form-control" value="${NOT_DATE}" style="background:white" readonly="">
				</div></div>
				<div style="margin-top: 30px;">
					<h6>글 내용 <span class="text-muted font-italic text-sm"></span></h6>
						<div class="article" style="background:white; border-radius:10px; border: 1px solid #999; background:white; padding:20px 10px;">
						${NOT_CONTEXT}
						</div>
				<div class="formation-tags mt-3"><span class="badge badge-pill badge-secondary tag"></span></div>
				</div>
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