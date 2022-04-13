const body = document.querySelector('body');
const modal = document.querySelector('.modal');
const modal_login = document.querySelector('.modal_login');

      function modals(p){
	$(".modal_body").html('');
    	  modal.classList.toggle('show');
    	  let mod = '';
    	  $.ajax({
    			url : '../detail/content',
    			type : "GET",
    			dataType : "json",
    			data : { GACH_NO : p
    		}, 
    		success : function(data){
    			mod += '<div class="modal_body"><table class="table table-bordered table-sm char-detail-table"><tbody>';
    			mod += '<div class="row"><tr><th colspan="2">제목</th></tr>';
    			mod += '<tr><td colspan="2">'+data.GACH_NAME+'</tr></td></div></div>';
    			mod += '<tr><td colspan="2"><img class="char-full" src="'+data.GACH_IMG+'"></td></tr></div></div>';
    			mod += '<div class="row"><tr><th colspan="1">시작일</th><th colspan="1">종료일</th></tr>';
    			mod += '<tr><td colspan="1">'+data.GACH_START+'</td>';
    			mod += '<td colspan="1">'+data.GACH_END+'</td></tr></div>';
    			mod += '<tr><th colspan="2">내용</th></tr>';
    			mod += '<tr><td colspan="2">'+data.GACH_CONTEXT+'</th></tr>'
    			if(data.list!=null){
    			mod += '<tr><th colspan="2">퍽업 및 배포</th></tr>';
    			mod += '<tr><td colspan="2">'
    			for(i=0;i<data.list.length;i++){		
       			mod += '<img class="char-thumb" src="'+data.list[i].IMG+'" title ="'+data.list[i].NAME+'">'}
    			mod += '</th></tr>';}
    			mod += '</tbody></table></div>'
    			$(".modal_body").html(mod)
    			
    		}
    		})
    	  
    	  
    	  if (modal.classList.contains('show')) {
              body.style.overflow = 'hidden';
            }
      }

      modal.addEventListener('click', (event) => {
        if (event.target === modal) {
          modal.classList.toggle('show');

          if (!modal.classList.contains('show')) {
            body.style.overflow = 'auto';
          }
        }
      });
      

	const btnOpenPopup = document.querySelector('.btn-login');
        btnOpenPopup.addEventListener('click', () => {
        modal_login.classList.toggle('show');

        if (modal_login.classList.contains('show')) {
          body.style.overflow = 'hidden';
        }
      });

      modal_login.addEventListener('click', (event) => {
        if (event.target === modal_login) {
          modal_login.classList.toggle('show');

          if (!modal_login.classList.contains('show')) {
            body.style.overflow = 'auto';
          }
        }
      });
    