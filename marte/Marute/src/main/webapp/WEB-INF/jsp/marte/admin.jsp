<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript"></script>
<%@ include file="/WEB-INF/Include/navbar_admin.jspf"%>

<head>
<meta charset="UTF-8">
<title>관리자페이지</title>
</head>
<body>
	<div class="container"style="padding-top: 121px">
		<div class="row" style="border: 1px solid #999 ;border-radius:10px;">
			<div class="col">

					<div style="margin-top: 30px">
						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text font-weight-bold">제목</span>
							</div>
							<input id="title" type="text" class="form-control" name="NOT_TITLE" requried="">
						</div>
					</div>
					<textarea name="NOT_CONTEXT" id="mytextarea"></textarea>
					<button class="not_write btn btn-sm btn-info">작성하기</button>
			</div>
		</div>
	</div>
	<script type="text/javascript">
const btnOpenPopup = document.querySelector('.not_write');
btnOpenPopup.addEventListener('click', () => {
		var f = document.getElementById("title").value;
		
		var s = $('#mytextarea_ifr').contents().find('#tinymce').html();
		event.preventDefault()
		alert(s)
		$.ajax({
			url : "/notification/write",
			method : "GET",
			data : { 
				NOT_TITLE : f,
				NOT_CONTEXT : s
			},success : function(){
				document.getElementById("title").value = '';
				 $('#mytextarea_ifr').contents().find('#tinymce').empty();
				alert('작성완료');
			},  error:function(request,status,error){
		        alert('빈곳없이 전부 작성해 주십시오');
		       }

		})
		
})
</script>
</body>
</html>