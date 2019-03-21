<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">
	<div class="panel-body"  style="padding-top:50px;">
		<div class="row">
			<div class="col-sm-12">
				<h1 class="page-header">客户管理</h1>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-body">
				<!-- filter -->
				<form class="form-inline" id="selectFilter">
	  				<div class="form-group">
	  					<label>客戶名称</label>
	  					<input class="form-control" name="custName" type="text">
					</div>
					<div class="form-group">
	    				<label>客户来源</label>
	    				<select class="selectpicker" name="custSource">
	    					<option value="" >--请选择--</option>
	    					<c:forEach items="${custSourceBaseDictList }" var="baseDict">
	    						<option value="${baseDict.dictId }" >${baseDict.dictItemName }</option>
	    					</c:forEach>
	    				</select>
	    			</div>
	    			<div class="form-group">
	    				<label>所属行业</label>
	    				<select class="selectpicker" name="custIndustry">
	    					<option value="" >--请选择--</option>
	    					<c:forEach items="${custIndustryBaseDictList }" var="baseDict">
	    						<option value="${baseDict.dictId }" >${baseDict.dictItemName }</option>
	    					</c:forEach>
	    				</select>
	    			</div>
	    			<div class="form-group">
	    				<label>客户级别</label>
	    				<select class="selectpicker" name="custLevel">
	    					<option value="" >--请选择--</option>
	    					<c:forEach items="${custLevelBaseDictList }" var="baseDict">
	    						<option value="${baseDict.dictId }" >${baseDict.dictItemName }</option>
	    					</c:forEach>
	    				</select>
	    			</div>
	    			<button type="button" id="selectCustomByFilter" class="btn btn-primary">查询</button>
				</form>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">客户信息列表</div>
			<table id="custTable"></table>
		</div>
	</div>
</div>
<!-- 修改客户模态框 -->
<div class="modal fade" id="custUpdateModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">修改客户信息</h4>
			</div>
			<form class="form-horizontal" id="custUpdateForm">
				<div class="modal-body">
					<input type="hidden" name="custId" />
					<div class="form-group">
						<label class="col-sm-2 control-label">客户名称</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="custName" placeholder="客户名称" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">客户来源</label> 
						<div class="col-sm-10">
							<select	class="selectpicker form-control" name="custSource" title="--请选择--">
	    						<c:forEach items="${custSourceBaseDictList }" var="baseDict">
	    							<option value="${baseDict.dictId }" >${baseDict.dictItemName }</option>
	    						</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">所属行业</label>
						<div class="col-sm-10"> 
							<select	class="selectpicker form-control" name="custIndustry" title="--请选择--">
	    						<c:forEach items="${custIndustryBaseDictList }" var="baseDict">
	    							<option value="${baseDict.dictId }" >${baseDict.dictItemName }</option>
	    						</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">客户级别</label>
						<div class="col-sm-10">
							<select	class="selectpicker form-control" name="custLevel" title="--请选择--">
	    						<c:forEach items="${custLevelBaseDictList }" var="baseDict">
	    							<option value="${baseDict.dictId }" >${baseDict.dictItemName }</option>
	    						</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">联系人</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="custLinkman" placeholder="联系人" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">固定电话</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="custPhone" placeholder="固定电话" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">移动电话</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="custMobile" placeholder="移动电话" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">邮政编码</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="custZipcode" placeholder="邮政编码" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">联系地址</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="custAddress" placeholder="联系地址" />
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="custUpdateSubmit">保存修改</button>
				</div>
			</form>
		</div>
	</div>
</div>
<!-- 删除客户模态框 -->
<div class="modal fade" id="custDeleteModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h3 class="modal-title">删除客户信息</h3>
      		</div>
      		<div class="modal-body">
				<p></p>
				<input type="hidden" name="custId" />
      		</div>
			<div class="modal-footer">
        		<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        		<button type="button" class="btn btn-primary" data-dismiss="modal" id="custDeleteSubmit">确定</button>
      		</div>
    	</div>
  	</div>
</div>
<script src="pagejs/customerManagerment.js"></script>