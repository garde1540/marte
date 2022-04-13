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
<div >
	<div class="container" style="padding-top: 121px">
		<div class="row" style="border: 1px solid #999 ;border-radius:10px;">
			<div class="col">
				<div style="margin-top: 30px">
					<div class="input-group input-group-sm mt-2 mb-3">
						<div class="input-group-prepend">
							<span class="input-group-text font-weight-bold">이름</span>
						</div>
						<input id="NAME" type="text" class="form-control" name="CH_NAME"
							requried="" value="">
					</div>
						<div id="so" class="btn-group btn-group-sm btn-group-toggle mr-2 mt-2"
							data-toggle="buttons">
							<label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="화">
								<input type="radio" autocomplete="off" data-filter="element"
								data-target="화"><img src="/img/element_fire.png">
							</label> <label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="수">
								<input type="radio" autocomplete="off" data-filter="element"
								data-target="수"><img src="/img/element_water.png">
							</label> <label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="풍">
								<input type="radio" autocomplete="off" data-filter="element"
								data-target="풍"><img src="/img/element_wind.png">
							</label> <label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="뇌">
								<input type="radio" autocomplete="off" data-filter="element"
								data-target="뇌"><img
								src="/img/element_thunder.png">
							</label> <label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="광">
								<input type="radio" autocomplete="off" data-filter="element"
								data-target="광"><img src="/img/element_light.png">
							</label> <label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="암">
								<input type="radio" autocomplete="off" data-filter="element"
								data-target="암"><img src="/img/element_dark.png">
							</label>
						</div>
						<div id="H" class="btn-group btn-group-sm btn-group-toggle mr-2 mt-2"
							data-toggle="buttons">
							<label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="Y">
								<input type="checkbox" autocomplete="off" data-filter="rarity"
								data-target="5">한정
							</label>
						</div>
						</br>
						<div id="star" class="btn-group btn-group-sm btn-group-toggle mr-2 mt-2"
							data-toggle="buttons">
							<label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="5성">
								<input type="radio" autocomplete="off" data-filter="rarity"
								data-target="5성"><img src="/img/star5.png">
							</label> <label class="btn btn-filter char-filter"
								data-toggle="tooltip" data-placement="bottom" title=""
								data-original-title="4성"> <input type="radio"
								autocomplete="off" data-filter="rarity" data-target="4성"><img
								src="/img/star4.png">
							</label> <label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="3성">
								<input type="radio" autocomplete="off" data-filter="rarity"
								data-target="3성"><img src="/img/star3.png">
							</label> <label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="2성">
								<input type="radio" autocomplete="off" data-filter="rarity"
								data-target="2성"><img src="/img/star2.png">
							</label> <label class="btn btn-filter char-filter" data-toggle="tooltip"
								data-placement="bottom" title="" data-original-title="1성">
								<input type="radio" autocomplete="off" data-filter="rarity"
								data-target="1성"><img src="/img/star1.png">
							</label>
						</div>
						<form id="fileupload" method="post" enctype="multipart/form-data" action="">
					<div class="input-group input-group-sm mt-2 mb-3">
						<div class="input-group-prepend">
							<span class="input-group-text font-weight-bold">이미지</span>
						</div>
						<input id="IMG" type="file"
							accept=".jpg,.png" name="CH_IMG" requried="">
					</div>
					</form>

				</div>
				<button class="btn btn-sm btn-info not_write">작성하기</button>
			</div>
		</div>
	</div>
	</div>

<script type="text/javascript">
const btnOpenPopup = document.querySelector('.not_write');
btnOpenPopup.addEventListener('click', () => {
		var datas = new FormData();
		var h = $('#H').find('.active').attr('data-original-title');
		if(h == undefined){
			h = 'N';
		}
		if(check=="characters"){
			datas.append("CH_NAME",$('#NAME').val());
		datas.append("CH_SO",$('#so').find('.active').attr('data-original-title'));
		datas.append("CH_H_CHACK",h);
		datas.append("CH_STAR",$('#star').find('.active').attr('data-original-title'));
		datas.append("CH_IMG",document.getElementById("IMG").files[0]);}
		else if(check=="weapon"){
			datas.append("WE_NAME",$('#NAME').val());
			datas.append("WE_SO",$('#so').find('.active').attr('data-original-title'));
			datas.append("WE_H_CHACK",h);
			datas.append("WE_STAR",$('#star').find('.active').attr('data-original-title'));
			datas.append("WE_IMG",document.getElementById("IMG").files[0]);}
			
		
		
		
		event.preventDefault()
		 $.ajax({
			url : "/"+check+"/insert",
			method : "POST",
			processData: false,
		    contentType: false,
		    cache: false,
			data : datas
			,success : function(){
				window.location.reload();
				alert('작성완료');
			},  error:function(request,status,error){
		        alert('이름,속성,등급,한정여부,이미지 전부 직성해 주십시오');

		       }

		}) 
		
})
</script>
</body>
</html>