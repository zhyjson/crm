$(function () {

    //获取对应的字典对象
    var custSourceMap = getBaseDictMap($("#selectFilter select[name='custSource']"));
	var custIndustryMap = getBaseDictMap($("#selectFilter select[name='custIndustry']"));
	var custLevelMap = getBaseDictMap($("#selectFilter select[name='custLevel']"));
	
    //1.初始化Table
    var oTable = new TableInit(custSourceMap, custIndustryMap, custLevelMap);
    oTable.Init();

    //2.初始化Button的点击事件
    var oButtonInit = new ButtonInit();
    oButtonInit.Init();
	$("#selectFilter select[name='custSource']").selectpicker("refersh");
	$("#selectFilter select[name='custIndustry']").selectpicker("refersh");
	$("#selectFilter select[name='custLevel']").selectpicker("refersh");
	
});

var TableInit = function (custSourceMap, custIndustryMap, custLevelMap) {
    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#custTable').bootstrapTable({
            url: 'customer',         //请求后台的URL（*）
            method: 'get',                      //请求方式（*）
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 10,                       //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            columns: [{					//	align 	对齐方式（left、right、center）
                field: 'custId',
                title: 'ID',
                halign: 'center'
            }, {
                field: 'custName',
                title: '客户名称',
                halign: 'center'
            }, {
                title: '客户来源',
                halign: 'center',
                formatter(value, row, index) {
                	return custSourceMap.get(row.custSource);
                }
            }, {
                title: '客户所属行业',
                halign: 'center',
                formatter(value, row, index) {
                	return custIndustryMap.get(row.custIndustry);
                }
            }, {
                title: '客户级别',
                halign: 'center',
                formatter(value, row, index) {
                	return custLevelMap.get(row.custLevel);
                }
            }, {
                field: 'custPhone',
                title: '固定电话',
                halign: 'center'
            }, {
                field: 'custMobile',
                title: '手机',
                halign: 'center'
            }, { 
            	title: '操作', 
            	halign: 'center', 
            	formatter(value, row, index) {
                    return [ 
                    	'<div class="btn-toolbar">',
                    	'<div class="btn-group"><button class="btn btn-info btn-xs" onclick = custUpdate('+index+')>修改</button></div>',
                        '<div class="btn-group"><button class="btn btn-danger btn-xs" onclick = custDelete('
                        	+row.custId+','+'"'+row.custName+'"'+')>删除</button></div>',
                    	'</div>'].join('')
                },
            }]
        });
    };

    //得到查询的参数
    oTableInit.queryParams = function (params) {
        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            limit: params.limit,   //页面大小
            offset: params.offset,  //页码
            custName: $("#selectFilter input[name='custName']").val(),
			custSource: $("#selectFilter select[name='custSource']").val(),
			custIndustry: $("#selectFilter select[name='custIndustry']").val(),
			custLevel: $("#selectFilter select[name='custLevel']").val()
        };
        return temp;
    };
    return oTableInit;
};


var ButtonInit = function () {
    var oInit = new Object();

    oInit.Init = function () {
    	// 查询按钮
    	$("#selectCustomByFilter").click(function(){
    		$('#custTable').bootstrapTable('refresh');
    	});
		// 修改验证提交
        $("#custUpdateSubmit").click(function(){
            var $custName = $("#custUpdateForm input[name='custName']");
            // 验证客户名称是否为空
			if($custName.val().trim() == ""){
    			toastr.error("客户名称不得为空");
    			$custName.focus();
    			return;
    		}
			$.ajax({
				type:"PUT",
				data: $("#custUpdateForm").serialize(),
				url:"customer",
				success(data){
					if(data.status==0){
				       	$('#custUpdateModal').modal('hide');
				       	$('#custTable').bootstrapTable('refresh');
						toastr.success(data.message);
					}else{
						toastr.error(data.message);
					}
				},
				error(){
					toastr.error("修改超时，请稍后重试");
				},dataType:"json"
			});
		});
		// 删除提交
		$("#custDeleteSubmit").click(function(){
			var custId = $("#custDeleteModal input[name='custId']").val();
			$.ajax({
				type:"DELETE",
				url:"customer/"+custId,
				success(data){
					if(data.status==0){
						toastr.success(data.message);
				       	$('#custTable').bootstrapTable('refresh');
					}else{
						toastr.error(data.message);
					}
				},
				error(){
					toastr.error("删除超时，请稍后重试");
				},dataType:"json"
			});
		});
    };
    return oInit;
};
// 数据修改按钮
function custUpdate(row) {
	var data = $("#custTable").bootstrapTable('getData')[row];
	// 赋值到模态框内
	$("#custUpdateForm input[name='custId']").val(data.custId);
	$("#custUpdateForm input[name='custName']").val(data.custName);
	$("#custUpdateForm select[name='custSource']").selectpicker('val', data.custSource);
	$("#custUpdateForm select[name='custIndustry']").selectpicker('val', data.custIndustry);
	$("#custUpdateForm select[name='custLevel']").selectpicker('val', data.custLevel);
	$("#custUpdateForm input[name='custLinkman']").val(data.custLinkman);
	$("#custUpdateForm input[name='custPhone']").val(data.custPhone);
	$("#custUpdateForm input[name='custMobile']").val(data.custMobile);
	$("#custUpdateForm input[name='custZipcode']").val(data.custZipcode);
	$("#custUpdateForm input[name='custAddress']").val(data.custAddress);
	// 打开模态框
	$("#custUpdateModal").modal();
}
//删除模态框按钮
function custDelete(custId, custName) {
    $("#custDeleteModal .modal-body p").html("确定要删除客户ID为<font class='lead'>"+custId
    	+"</font>,客户名称为<font class='lead'>"+custName+"</font>的客户吗？");
    $("#custDeleteModal input[name='custId']").val(custId);
    $("#custDeleteModal").modal("show");	
};
// 获取对应数据字典对象Map
function getBaseDictMap($baseDict) {
	 var baseDictMap = new Map();
	 $.each($baseDict.selectpicker('Mustard')[0], function(i, n){
	    if(i == 0){
	    	return;
	    }
	    baseDictMap.set(parseInt(n.value),n.innerText);
	 });
	 return baseDictMap;
};