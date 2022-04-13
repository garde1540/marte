

function page(){
	$.ajax({
		url : '../'+check+'/page',
		method : "GET",
		dataType : "json",
		data : {
	}, success : function(data){
		let page = "";
		if(check != 'notification'){
	if(data.length>0){
		for(i=0;i<data.length;i++){
			
			page += '<tr style="cursor:pointer;" onclick="modals('+data[i].GACH_NO+')" ><td>'+(i+1)+'</td>';
			page += '<td>D-'+data[i].DDAY+'</td>';
			page += '<td>'+data[i].GACH_NAME+'</td>';
			page += '<td>'+data[i].GACH_START+'</td>';
			page += '<td>'+data[i].END+'</td></tr>';
		}
	}else {
		page +="<tr><td colspan='5' >조회된 결과가 없습니다</td></tr>"
	}}else{
		if(data.length>0){
			for(i=0;i<data.length;i++){
				page += '<tr ><td>'+(i+1)+'</td>';
				page += '<td><a href="/detail/notification?NOT_NO='+data[i].NOT_NO+'">'+data[i].NOT_TITLE+'</a></td>';
				page += '<td>'+data[i].NOT_DATE+'</td></tr>';
				
			}
		}else {
			page +="<tr><td colspan='3' >조회된 결과가 없습니다</td></tr>"
		}
	}
	$("#page").html(page)
	}
	})
	
}