

function page(){
	$.ajax({
		url : '../'+check+'/page',
		method : "GET",
		dataType : "json",
		data : {
	}, success : function(data){
		let page = "";
		let paging = "";
		let type = '';
		if(check != 'notification'){
	if(data.length>0){
		for(i=0;i<data.length;i++){
			
			switch(data[i].GACH_COLOR){
			case 'RED':
				type = 'characters'
				break;
			case 'BLUE' :
				type = 'event'
				break;
			}
			page += '<tr><td>'+(i+1)+'</td>';
			page += '<td>D-'+data[i].DDAY+'</td>';
			page += '<td><a href="../detail/'+type+'?no='+data[i].GACH_NO+'">'+data[i].GACH_NAME+'</a></td>';
			page += '<td>'+data[i].GACH_START+'</td>';
			page += '<td>'+data[i].END+'</td></tr>';
		}
	}else {
		page +="<tr><td colspan='5' >조회된 결과가 없습니다</td></tr>"
	}}else{
		if(data.length>0){
			for(i=0;i<data.length;i++){
				switch(data[i].GACH_COLOR){
			case 'RED':
				type = 'characters'
				break;
			case 'BLUE' :
				type = 'event'
				break;
			}
				page += '<tr><td>'+(i+1)+'</td>';
				page += '<td><a href="../detail/'+type+'?no='+data[i].NOT_NO+'">'+data[i].NOT_TITLE+'</a></td>';
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