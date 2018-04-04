<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>myApp</title>
	<!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<script src="/resources/js/common/common.js"></script>
	<script src="/resources/js/common/handlebars.js"></script>
	<script src="/resources/js/common/waterfall.js"></script>
	<style type="text/css">
	/* Sticky footer styles
		-------------------------------------------------- */
		html {
			position: relative;
			min-height: 100%;
		}
		
		body {
			/* Margin bottom by footer height */
			margin-bottom: 60px;
		}
		
		.footer {
			position: absolute;
			bottom: 0;
			width: 100%;
			/* Set the fixed height of the footer here */
			height: 60px;
			background-color: #f5f5f5;
		}
		
		/* Custom page CSS
			-------------------------------------------------- */
		/* Not required for template or sticky footer method. */
		.container {
			width: auto;
			max-width: 100%;
			padding: 0 15px;
		}
		
		.container .text-muted {
			margin: 20px 0;
		}
	</style>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<!--  
	<tiles:insertAttribute name="menu" />
	 --> 
	<tiles:insertAttribute name="content" /> 
	<tiles:insertAttribute name="footer" /> 
</body>
</html>