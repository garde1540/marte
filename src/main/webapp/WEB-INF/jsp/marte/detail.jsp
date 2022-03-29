<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<%@ include file="/WEB-INF/Include/navbar.jspf"%>
<script src="../js/detail_content.js">
</script>
<script type="text/javascript">
$(function(){
	page(1);
})
</script>
<title>마르테</title>
</head>
<body>
</br>
</br></br></br></br>
<div class="row justify-content-between mt-4">
<div class="col-auto">
<a class="btn btn-sm btn-info" href=""><i class="xi-list"></i> 목록</a>
</div>
</div>
<div class="content formation-edit hidden" style="display: block;">
<div style="margin-top: 10px" id="title">

</div>
<div class="formation row">
<div class="col" id="img">

</div>
</div>
<div class="formation-info" id="contents">

</div>
<div id="names">

</div>
<div style="margin-top: 30px;">
</div>

</div>
</body>
</html>