<link rel="stylesheet" href="/resources/css/waterfall.css">
<div class="container theme-showcase" role="main">
	<div class="page-header">
		<h1></h1>
	</div>
	<div class="jumbotron">
    	<ul>
    	</ul>
	</div>
	<div id="container"></div>
</div>
<script type="text/x-handlebars-template" id="waterfall-tpl">
{{#result}}
    <div class="item">
        <img src="{{image}}" width="{{width}}" height="{{height}}" />
    </div>
{{/result}}
</script>

<script src="/resources/js/album/album.js"></script>