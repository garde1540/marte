	document.addEventListener('DOMContentLoaded', function() {
		var calendarEl = document.getElementById('calendar'); // new FullCalendar.Calendar(대상 DOM객체, {속성:속성값, 속성2:속성값2..}) 
		$(function() {
			if(check != 'notification'){
			var request = $.ajax({
				url : '../'+check+'/calnder',
				method : "GET",
				dataType : "json"

			});
			

			request.done(function(data) {

				var calendarEl = document.getElementById('calendar');

				var calendar = new FullCalendar.Calendar(calendarEl, {
					initialView : 'dayGridMonth',
					dayMaxEvents : true,
					events : data,
					locale : 'ko',
					eventClick: function(info) {
						modals(info.event.extendedProps.GACH_NO)
				}
				});

				calendar.render();
			});

			request.fail(function(jqXHR, textStatus) {
				
				alert("Request failed: " + textStatus+","+jqXHR.status);
			});
			}
		});

	});