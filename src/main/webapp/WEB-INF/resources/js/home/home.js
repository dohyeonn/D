var EVENT = {
	
	init: function() {
		EVENT.setEvent();
	},
	
	getData: function() {
		common.ajax(common.restUrl.home, 'GET', null, callback);
		function callback(data, textStatus, jqXHR) {
			console.log('callback: '+ JSON.stringify(data, null, '\t'));
			console.log('textStatus: '+textStatus);
			console.log('jqXHR: '+ JSON.stringify(jqXHR, null, '\t'));
			resultData = data;
			
			var $jumbotron = $('.jumbotron');
			$jumbotron.find('p').text(resultData.firstName+', '+resultData.lastName);
		}
	}, 

	postData: function() {
		var data = {
			firstName: 'post',
			lastName: 'post'
		}
		common.ajax(common.restUrl.home, 'POST', data);
	},
	
	putData: function() {
		var data = {
			firstName: 'put',
			lastName: 'put'
		}
		common.ajax(common.restUrl.home+'/1', 'PUT', data);
	},
	
	deleteData: function() {
		common.ajax(common.restUrl.home+'/2', 'DELETE');
	},
	
	setEvent: function() {
		var $btnGet = $('#home-get-info'),
			$btnPost = $('#home-post-info'),
			$btnPut = $('#home-put-info'),
			$btnDelete = $('#home-delete-info');
		
		$btnGet.on('click', function() {
			EVENT.getData();
		});
		
		$btnPost.on('click', function() {
			EVENT.postData();
		});
		
		$btnPut.on('click', function() {
			EVENT.putData();
		});
		
		$btnDelete.on('click', function() {
			EVENT.deleteData();
		});
	}
}

$(document).ready(function(){
	common.navCtr(0);
	EVENT.init();
});