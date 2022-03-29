function now(){
		if(check != 'notification'){
		$.ajax({
			url : '../'+check+'/nowpage',
			method : "GET",
			dataType : "json",
			data : {
		}, success : function(data){
			let page = "";
			let paging = "";
			let type = '';
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
				page += '<td><a href="../detail/'+type+'?no='+data[i].GACH_NO+'">'+data[i].GACH_NAME+'</a></td>';
				page += '<td>'+data[i].END+'</td></tr>';}
			}
		else {
			page +="<tr><td colspan='3' >조회된 결과가 없습니다</td></tr>"
		}
		$("#now").html(page)
		}
		})
		}
	}