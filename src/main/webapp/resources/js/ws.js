$(function(){

	$("#login").on("click", function(){
		$("#indexForm").attr("action", "list/welcome");
		$("#indexForm").submit();
	});

	$("#audio").on("click", function(){
		$("#indexForm").attr("action", "list/audio");
		$("#indexForm").submit();
	});

	$("#video").on("click", function(){
		$("#indexForm").attr("action", "list/video");
		$("#indexForm").submit();
	});

	$("#imageup").on("click", function(){
		$("#indexForm").attr("action", "list/imageup");
		$("#indexForm").submit();
	});

	$("#imagedown").on("click", function(){
		$("#indexForm").attr("action", "list/imagedown");
		$("#indexForm").submit();
	});

	$("#fileup").on("click", function(){
		$("#indexForm").attr("action", "list/fileup");
		$("#indexForm").submit();
	});

	$("#filedown").on("click", function(){
		$("#indexForm").attr("action", "list/filedown");
		$("#indexForm").submit();
	});
})