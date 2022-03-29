let check = 'not';
$(document).ready(function(){
	var url = window.location.pathname;
	if(url.includes('main')){
		$('#navbar').children().eq(0).attr('class','nav-item active mt-2 mt-md-0');
		check = 'main';
	}else if(url.includes('notification')){
		$('#navbar').children().eq(1).attr('class','nav-item active mt-2 mt-md-0');
		check = 'notification';
	}else if(url.includes('characters')){
		$('#navbar').children().eq(2).attr('class','nav-item active mt-2 mt-md-0');
		check = 'characters';
	}else if(url.includes('weapon')){
		$('#navbar').children().eq(3).attr('class','nav-item active mt-2 mt-md-0');
		check = 'weapon';
	}else if(url.includes('event')){
		$('#navbar').children().eq(4).attr('class','nav-item active mt-2 mt-md-0');
		check = 'event';
	}

	});