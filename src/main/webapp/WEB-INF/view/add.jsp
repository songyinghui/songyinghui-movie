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
   <form method="post" action="add.do" enctype="multipart/form-data">
      <table>
       <tr>
         <td>商品编号</td>
         <td><input type="text" name="id"></td>
       </tr>
         <tr>
         <td>商品名称</td>
         <td><input type="text" name="name"></td>
       </tr>
         <tr>
         <td>英文名称</td>
         <td><input type="text" name="englishName"></td>
       </tr>
         <tr>
         <td>商品品牌</td>
         <td>
         <select id="s2" name='bid' >
	       <option value=""></option>
	     </select>
         </td>
       </tr>
       <tr>
          <td>商品种类</td>
          <td>
          <select id="s1" name='tid' >
	       <option value=""></option>
	     </select>
          
          </td>
       </tr>
        <tr>
         <td>尺寸</td>
         <td><input type="text" name="size"></td>
       </tr>
        <tr>
         <td>单价(元)</td>
         <td><input type="text" name="price"></td>
       </tr>
         <tr>
         <td>数量</td>
         <td><input type="text" name="num"></td>
       </tr>
         <tr>
         <td>标签</td>
         <td><input type="text" name="inform"></td>
       </tr>
       <tr>
        <td>商品图片上传</td>
        <td><input type="file" name="myFile"></td>
       </tr>
       <tr>
       <td colspan="222"><input type="submit" value="提交"></td>
       </tr>
      </table>
   </form>
</body>
<script type="text/javascript">
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

</script>
</html>