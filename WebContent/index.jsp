<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="cn">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>CRM管理</title>
		
		<link href="image/B.png" rel="icon">
		<link href="image/A.png" rel="apple-touch-icon">
		<!-- Bootstrap css 样式 -->
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/bootstrap-select.min.css" rel="stylesheet">
		<!-- 外部 css-->
		<link href="css/font-awesome.min.css" rel="stylesheet" />
		<link href="css/jquery.gritter.css" rel="stylesheet" />
		<!-- 此模板自定义样式 -->
		<link href="css/style.css" rel="stylesheet">
		<link href="css/style-responsive.css" rel="stylesheet">
		
		<link href="css/bootstrap-table.min.css" rel="stylesheet" />
    	<link href="css/toastr.min.css" rel="stylesheet" />
	</head>

	<body>
		<section id="container">
			<jsp:include page="header.jsp"></jsp:include>
			<!-- 旁白部分 -->
			<aside>
				<div id="sidebar" class="nav-collapse ">
					<!-- 数据头列表-->
					<ul class="sidebar-menu" id="nav-accordion">
						<p class="centered">
							<a href="javascript:void(0)" location="PersonPage.jsp"><img src="/pic/aboy.jpeg" class="img-circle" width="80" height="80px" id="indexFaceImg"></a>
						</p>
						<h5 class="centered" id="empNickName">${emp.empNickName }</h5>
						<!-- 首页 -->
						<li class="mt">
							<a class="active" href="index.jsp">
								<i class="fa fa-dashboard"></i>
								<span>控制台</span>
							</a>
						</li>
						<li class="sub-menu">
							<a href="javascript:void(0);">
								<i class="fa fa-address-book"></i>
								<span>客户系统</span>
							</a>
							<ul class="sub">
								<li>
									<a href="javascript:void(0);" location="${pageContext.request.contextPath }/CustomerManagerment">客户管理</a>
								</li>
							</ul>
						</li>
						<%-- <c:forEach items="${moduleFs }" var="moduleF"> 
							<li class="sub-menu">
								<a href="javascript:void(0);">
									<i class="${moduleF.moduleUrl }"></i>
										<span>${moduleF.moduleName }</span>
								</a>
								<ul class="sub">
									<c:forEach items="${moduleSs }" var="moduleS">
										<c:if test="${moduleS.superMenu == moduleF.moduleId }">
											<li>
												<a href="javascript:void(0);" location="${moduleS.moduleUrl }">${moduleS.moduleName }</a>
											</li>
										</c:if>
									</c:forEach>
								</ul>
							</li>
						</c:forEach> --%>
					</ul>
				</div>
			</aside>
			<!-- 主体部分 -->
			<section id="main-content">
				<section class="wrapper">
					<jsp:include page="content.jsp"></jsp:include>
				</section>
			</section>
		</section>
		<!--footer start-->
		<footer class="site-footer">
			<div class="text-center">
				<p>&copy; WGT <strong>进销存管理系统</strong></p>
				<div class="credits">
					WGT享有所有版权 
				</div>
				 <a href="javascript:void(0);" class="go-top">
					<i class="fa fa-angle-up"></i>
				</a> 
			</div>
		</footer>
	</section>
	<!-- 所有script脚本在此子页面 -->
	<%@ include file="footer.jsp" %>
	</body>
</html>