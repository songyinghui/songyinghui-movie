<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index3.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
</head>
<body>

	<form action="list.do" method="get">
	<input type="hidden" name="pageNum">
	 <input type="button" value="添加" onclick="add()">
	 种类:<select id="s1" name='tid' >
	       <option value=""></option>
	     </select>
	 品牌:<select id="s2" name='bid' >
	       <option value=""></option>
	     </select>
	     <br/><br/>
	     单价范围:<input type="text" name="p1" value="${con.p1 }">到<input type="text" name="p2" value="${con.p2 }">
	  <select name="name" >
	    <option value=""></option>
	    <option value="name">商品名称</option>
	    <option value="englishName">英文名称</option>
	    <option value="inform">标签</option>
	  </select>
	  <input type="text" name="tj">
	  <input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td>图片</td>
			<td>名称</td>
			<td>英文名称</td>
			<td>尺寸</td>
			<td>价格</td>
			<td>数量</td>
			<td>标签</td>
			<td>品牌</td>
			<td>种类</td>
		</tr>
		<c:forEach items="${page.list }" var="list">
			<tr>
				<td><img alt="图片异常" src="src/main/webapp/pic/${list.pic }"></td>
				<td>${list.name}</td>
				<td>${list.englishName}</td>
				<td>${list.size}</td>
				<td>${list.price}</td>
				<td>${list.num}</td>
				<td>${list.inform }</td>
				<td>${list.bname}</td>
				<td>${list.tname}</td>
			</tr>

		</c:forEach>
		<Tr>
			<td colspan="100">
				<button onclick="fenye(1)">1</button>
				<button onclick="fenye(2)">2</button>
				<button onclick="fenye(3)">3</button>
				<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
				
				第${page.pageNum }页/共${page.pages }页 每页${page.pageSize }条数据 共${page.total}条数据
			</td>
		</Tr>
	</table>
</body>
<script type="text/javascript">

 function add(){
	 location = "toadd.do";
 }
  $.ajax({
	  url:"getBList.do",
	  dataType:"json",
	  type:"post",
	  success:function(obj){
		  for ( var i in obj) {
				  $("#s2").append("<option  value='"+obj[i].bid+"'>"+obj[i].bname+"</option>")	  			
		   }
	  }
	  
  })
  $.ajax({
	  url:"getTList.do",
	  dataType:"json",
	  type:"post",
	  success:function(objj){
		  for ( var i in objj) {
			$("#s1").append("<option  value='"+objj[i].tid+"'>"+objj[i].tname+"</option>")
		}
	  }
  })
  function fenye(pageNum){
	  $("[name='pageNum']").val(pageNum);
	  $("form").submit();
  }
</script>
</html>