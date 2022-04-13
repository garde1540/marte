const body = document.querySelector('body');
const modal = document.querySelector('.modal');
const modal_login = document.querySelector('.modal_login');
const btnch = document.querySelector('.btn-ch');
const btnwe = document.querySelector('.btn-we');
const searbtn = document.querySelector('.search');
let che='';
var url = window.location.pathname;
searbtn.addEventListener('click', () => {
	modals(che)
	});

      function modals(p){
		 let star ='';
		 let name ='';
		 let so ='';
    	  let mod = '';
    	  let url_text = '';
    	  let h = '';
    	  if(p==0){
	url_text = '/characters/obj';
}else if(p == 1){
	url_text = '/weapon/obj';
}
star = $('#star').find('.active').attr('data-original-title');
name = $('#NAME').val();
so =  $('#so').find('.active').attr('data-original-title');
 h = $('#H').find('.active').attr('data-original-title');
    	  $.ajax({
    			url : url_text,
    			type : "POST",
    			dataType : "json",
    			data : {
	C_STAR : star,
	C_NAME : name,
	C_SO : so,
	C_H_CHACK : h,
	
},
 
    		success : function(data){

	for(i=0;i<data.length;i++){
    			let no =  data[i].NO;
    			let ps = p;
 
    			mod += '<tr onclick="addObj('+ps+','+no+');">';
    			mod += '<td class="text-center"><img class="char-thumb" src="'+data[i].IMG+'"></td>';
    			mod += '<td class="text-center">'+data[i].SO+'</td>';
    			mod += '<td class="text-center">'+data[i].STAR+'</td>';
    			mod += '<td class="text-left">'+data[i].NAME+'</td>';
    			mod += '</tr>';
    			}
    			$("#table_body").html(mod)
    			
    		},  error:function(request,status,error){
		        alert('빈곳 없이 전부 작성해 주십시오');
		       }
    		})
  
      }

      if(url.includes('cal_characters')||url.includes('cal_event')){
        btnch.addEventListener('click', () => {
				che = 0;
	   					modals(che);
        modal.classList.toggle('show');

        if (modal.classList.contains('show')) {
          body.style.overflow = 'hidden';
        }
      });
      }
      
      if(url.includes('cal_weapon')||url.includes('cal_event')){
        btnwe.addEventListener('click', () => {
				che = 1;
						modals(che);
        modal.classList.toggle('show');

        if (modal.classList.contains('show')) {
          body.style.overflow = 'hidden';
        }
      });
      }
       
      
function addObj(p,no){
		let mod = '';
	 let url_text = '';
    	  if(p==1){
	url_text = '/weapon/addobj';
	$.ajax({
    			url : url_text,
    			type : "POST",
    			dataType : "json",
    			data : {
	WE_NO : no
},
 
    		success : function(data){
	for(i=0;i<data.length;i++){
	mod += '<td  class="text-center"><img onclick="deletewe('+data[i].NO+')" class="char-thumb" src="'+data[i].IMG+'" style="cursor:pointer;"></td>';
	}
	$("#weapon").html(mod)
}
    		})
    		
}else if(p==0){
	url_text = '/characters/addobj';
	$.ajax({
    			url : url_text,
    			type : "POST",
    			dataType : "json",
    			data : {
	CH_NO : no
},
 
    		success : function(data){
	for(i=0;i<data.length;i++){
	mod += '<td  class="text-center"><img onclick="deletech('+data[i].NO+')" class="char-thumb" src="'+data[i].IMG+'" style="cursor:pointer;"></td>';
	}
	$("#characters").html(mod)
}
    		})
}

          modal.classList.toggle('show');
            body.style.overflow = 'auto';
}

      modal.addEventListener('click', (event) => {

        if (event.target === modal) {
          modal.classList.toggle('show');

          if (!modal.classList.contains('show')) {
            body.style.overflow = 'auto';
          }
        }
      });
      
      function deletech(no){
	let mod='';
		$.ajax({
    			url : '/characters/delobj',
    			type : "POST",
    			dataType : "json",
    			data : {
	CH_NO : no
},
 
    		success : function(data){
	for(i=0;i<data.length;i++){
	mod += '<td  class="text-center"><img onclick="deletech('+data[i].NO+')" class="char-thumb" src="'+data[i].IMG+'" style="cursor:pointer;"></td>';
	}
	$("#characters").html(mod)
}
    		})
	
}
 function deletewe(no){
	let mod ='';
		$.ajax({
    			url : '/weapon/delobj',
    			type : "POST",
    			dataType : "json",
    			data : {
	WE_NO : no
},
 
    		success : function(data){
	for(i=0;i<data.length;i++){
	mod += '<td  class="text-center"><img onclick="deletewe('+data[i].NO+')" class="char-thumb" src="'+data[i].IMG+'" style="cursor:pointer;"></td>';
	}
	$("#weapon").html(mod)
}
    		})
	
}
    