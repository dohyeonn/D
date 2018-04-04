var common = {
	
	restUrl: {
		home: '/rest/home/info',
		album: {
			list: '/rest/album/list'
		}
	},	
		
	ajax: function(url, type, data, callback) {
		
		if(!common.isEmpty(data)) {
			data = JSON.stringify(data);
		}
		
		$.ajax({
			beforeSend: function(xhr) {
				xhr.setRequestHeader("Accept", "application/json"); 
				xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
			},
//			complete: function() {
//				
//			}
			
			url: url,
			dataType: 'json',
			type: type,
			data: data,
			success : function(data, textStatus, jqXHR) {
				if(!common.isEmpty(callback)){
					callback(data, textStatus, jqXHR);
				}
			},
			error: function(jqXHR) {
				console.log('jqXHR: '+ JSON.stringify(jqXHR, null, '\t'));
			}
			
		});
	},
	
	isEmpty: function(obj) {
		return obj === undefined || obj === null || obj === '';
	},
	
	navCtr: function(index) {
		$navbar = $('#navbar').find('li');
		$navbar.removeClass('active');
		$navbar.eq(index).addClass('active');
	}
}