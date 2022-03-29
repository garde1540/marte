
function getParameter(name) {
    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
        results = regex.exec(location.search);
    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
}

function page(){
	$.ajax({
		url : '../'+check+'/content',
		type : "GET",
		dataType : "json",
		data : { GACH_NO : getParameter("no")
	}, 
	success : function(data){
		let title = "";
		let img = "";
		let names = "";
		let contents="";
		let paging = "";
		if(check != 'notification'){
		
			title += '<div class="input-group input-group-sm"><div class="input-group-prepend"><span class="input-group-text">제목</span></div>';
			title += '<input type="text" class="form-control" value="'+data.GACH_NAME+'" style="background:white" readonly=""></div>';
			title += '<div class="input-group input-group-sm"><div class="input-group-prepend"><span class="input-group-text">시작일</span></div>';
			title += '<input type="text" class="form-control" value="'+data.GACH_START+'" style="background:white" readonly="">';
			title += '<div class="input-group-prepend"><span class="input-group-text">종료일</span></div>';
			title += '<input type="text" class="form-control" value="'+data.GACH_END+'" style="background:white" readonly=""></div>'
			img += '<img src="'+data.GACH_IMG+'">'
			contents += '<div class="row"><div class="col-12 ml-1 ball1-info"><span class="label">내용</span><br>'+data.GACH_CONTEXT+'<hr></div></div>' ;
			if(data.CH_NAMES !=null || data.WE_NAMES!=null){
				names += '<div class="formation-info">';
			if(data.CH_NAMES !=null){
			 names +='<div class="row"><div class="col-12 ml-1 ball1-info"><span class="label">캐릭</span><br>'+data.CH_NAMES+'<hr></div></div>';
			}if(data.WE_NAMES!=null){
				names += '<div class="row"><div class="col-12 ml-1 ball1-info"><span class="label">무기</span><br>'+data.WE_NAMES+'<hr></div></div>'; 
			}
			names += '</div>';
			}
	}
	$("#title").html(title)
	$("#img").html(img)
	$("#contents").html(contents)
	$("#names").html(names)
	}
	})
	
}