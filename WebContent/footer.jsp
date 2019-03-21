<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 核心脚本 -->
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!--所有页面的通用脚本-->
<script type="text/javascript" src="js/common-scripts.js"></script>
<script type="text/javascript" src="js/jquery.gritter.js"></script>
<!-- 外部插件 -->
<script type="text/javascript" src="js/jquery.dcjqaccordion.2.7.js"></script>
<script type="text/javascript" src="js/jquery.scrollTo.min.js" ></script>
<script type="text/javascript" src="js/bootstrap-select.min.js"></script>
<script type="text/javascript" src="js/bootstrap-table.min.js"></script>
<script type="text/javascript" src="js/bootstrap-table-zh-CN.min.js"></script>
<script type="text/javascript" src="js/toastr.min.js"></script>
<script type="text/javascript">
$(function() {
	var unique_id = $.gritter.add({
	// (string | mandatory) the heading of the notification
	title: '欢迎来到WGT进销存管理系统!',
	// (string | mandatory) the text inside the notification
	text: '在这里你可以对你职务相关的事情进行操作',
	// (string | optional) the image to display on the left
	image: '/pic/bboy.jpeg',
	// (bool | optional) if you want it to fade out on its own or just sit there
	sticky: false,
	// (int | optional) the time you want it to be alive for before fading out
	time: 8000,
	// (string | optional) the class name you want to apply to that specific message
	class_name: 'my-sticky-class'
	});
});
</script>
<script type="text/javascript">
	$(function(){
		$("a[location]").click(function(){
			$(".sub>li").removeClass("active");
			$(this.parentNode).addClass("active");
			var loc = $(this).attr("location");
			$.get(loc,function(response){
				if(response.status == 404){
					location.href = response.url;
				}
				$("#main-content").html(response);
			});
		});
	});
</script>