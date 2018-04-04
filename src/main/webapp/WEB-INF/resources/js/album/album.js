var EVENT = {
	imageObj: {
		'total': 0,
		'result': []
	},	
	imageList: [],	
		
	init: function() {
		EVENT.getAlbumList();
		EVENT.setEvent();
	},
	
	setEvent: function() {
		var $jumbotron = $('.jumbotron');
		
		$jumbotron.find('li').off('click').on('click', function(e) {
			
			var $container = $('#container');
			
			$container.empty();
			$container.waterfall({
			    itemCls: 'item',
			    colWidth: 222, 
			    gutterWidth: 15,
			    gutterHeight: 15,
			    checkImagesLoaded: false,
			    path: function(page) {
//			        return '/resources/data/data1.json?page=' + page;
//			    	return '/rest/album/list';
			    }
			});

		});
	},
	
	getAlbumList: function() {
		common.ajax(common.restUrl.album.list, 'GET', null, callback);
		function callback(data, textStatus, jqXHR) {
			var $jumbotron = $('.jumbotron'),
				dataLength = data.length, html = '';
			
			for(var i = 0; i < dataLength; i++) {
				
				var startTag = '<li>', endTag = '</li>';
				
				if(data[i].isDirectory) {
					startTag = '<li><a>', endTag = '</li></a>';
					html += startTag
					+ '[' + data[i].fileName + '] '
					+ data[i].lastModified + ', '
					+ data[i].totalSpace + ', '
					+ data[i].usableSpace + ', '
					+ data[i].isDirectory + ', '
					+ data[i].filePath
					+ endTag; 
				}else {
					if(data[i].isImageFile) {
						EVENT.imageList.push({
							'image': data[i].filePath
//							'': '',
//							'': ''
						});
					}
				}
				
			}
			
			$jumbotron.find('ul').html(html);
			
			EVENT.imageObj.total = EVENT.imageList.length;
			EVENT.imageObj.result = EVENT.imageList;
			EVENT.setEvent();
			
		}
	}
	
}

$(document).ready(function() {
	common.navCtr(1);
	EVENT.init();
});