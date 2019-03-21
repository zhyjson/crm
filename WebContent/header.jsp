<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>I</title>
</head>
<body>
	<header class="header black-bg">
				<div class="sidebar-toggle-box">
					<div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
				</div>
				<!--logo start-->
				<a href="${pageContext.request.contextPath }/mvc/index" class="logo"><b><span>CRM</span>系统</b></a>
				<!--logo end-->
				<div class="nav notify-row" id="top_menu">
					<!--  notification start -->
					<ul class="nav top-menu">
						<!-- settings start -->
						<li class="dropdown">
							<a data-toggle="dropdown" class="dropdown-toggle" href="javascript:void(0)">
								<i class="fa fa-tasks"></i>
								<span class="badge bg-theme">4</span>
							</a>
							<ul class="dropdown-menu extended tasks-bar">
								<div class="notify-arrow notify-arrow-green"></div>
								<li>
									<p class="green">你有4个待完成的任务</p>
								</li>
								<li>
									<a href="javascript:void(0)">
										<div class="task-info">
											<div class="desc">Dashio 管理面板</div>
											<div class="percent">40%</div>
										</div>
										<div class="progress progress-striped">
											<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
												<span class="sr-only">40% Complete (success)</span>
											</div>
										</div>
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<div class="task-info">
											<div class="desc">数据库更新</div>
											<div class="percent">60%</div>
										</div>
										<div class="progress progress-striped">
											<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
												<span class="sr-only">60% Complete (warning)</span>
											</div>
										</div>
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<div class="task-info">
											<div class="desc">产品开发</div>
											<div class="percent">80%</div>
										</div>
										<div class="progress progress-striped">
											<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
												<span class="sr-only">80% Complete</span>
											</div>
										</div>
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<div class="task-info">
											<div class="desc">支付发送</div>
											<div class="percent">70%</div>
										</div>
										<div class="progress progress-striped">
											<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
												<span class="sr-only">70% Complete (Important)</span>
											</div>
										</div>
									</a>
								</li>
								<li class="external">
									<a href="#">查看所有任务</a>
								</li>
							</ul>
						</li>
						<!-- settings end -->
						<!-- inbox dropdown start-->
						<li id="header_inbox_bar" class="dropdown">
							<a data-toggle="dropdown" class="dropdown-toggle" href="javascript:void(0)">
								<i class="fa fa-envelope-o"></i>
								<span class="badge bg-theme">5</span>
							</a>
							<ul class="dropdown-menu extended inbox">
								<div class="notify-arrow notify-arrow-green"></div>
								<li>
									<p class="green">你有5条新信息</p>
								</li>
								<li>
									<a href="javascript:void(0)">
										<span class="photo"><img alt="avatar" src="image/ui-zac.jpg"></span>
										<span class="subject">
                  							<span class="from">辣稽</span>
										</span>
										<span class="message">欢迎光临我们辣稽辣酱店</span>
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<span class="photo"><img alt="avatar" src="image/ui-divya.jpg"></span>
										<span class="subject">
                  							<span class="from">二郎稽</span>
										</span>
										<span class="message">衬衫的价格是A</span>
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<span class="photo"><img alt="avatar" src="image/ui-danro.jpg"></span>
										<span class="subject">
                  							<span class="from">仰望星空</span>
										</span>
										<span class="message">你完了，我爸是肱二头稽</span>
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<span class="photo"><img alt="avatar" src="image/ui-sherman.jpg"></span>
										<span class="subject">
											<span class="from">局部打稽</span>
										</span>
										<span class="message">请尽快回复，不然我报警了</span>
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">查看所有信息</a>
								</li>
							</ul>
						</li>
						<!-- inbox dropdown end -->
						<!-- notification dropdown start-->
						<li id="header_notification_bar" class="dropdown">
							<a data-toggle="dropdown" class="dropdown-toggle" href="javascript:void(0)">
								<i class="fa fa-bell-o"></i>
								<span class="badge bg-warning">7</span>
							</a>
							<ul class="dropdown-menu extended notification">
								<div class="notify-arrow notify-arrow-yellow" ></div>
								<li>
									<p class="yellow">你有 7 项页面功能未正常启用</p>
								</li>
								<li>
									<a href="javascript:void(0)">
										<span class="label label-danger"><i class="fa fa-bolt"></i></span> 服务器连接检测
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<span class="label label-warning"><i class="fa fa-bell"></i></span> 今日访问量
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<span class="label label-danger"><i class="fa fa-bolt"></i></span> 全局刷新页面
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">
										<span class="label label-success"><i class="fa fa-plus"></i></span> 监管模式
									</a>
								</li>
								<li>
									<a href="javascript:void(0)">查看所有页面工具项</a>
								</li>
							</ul>
						</li>
						<!-- notification dropdown end -->
					</ul>
					<!--  notification end -->
				</div>
				<div class="top-menu">
					<ul class="nav pull-right top-menu">
						<li>
							<a class="logout" href="login.html">注销</a>
						</li>
					</ul>
				</div>
			</header>
</body>
</html>