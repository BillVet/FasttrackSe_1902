<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-UTF-8">
<title>Insert title here</title>
<link
	href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="/Style/Css/Style.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid"> 
 <div class="row-fluid"> 
  <div class="col-md-offset-4 col-md-4" id="box"> 
   <h2>Đăng Nhập</h2> 
   <hr> 
   <form class="form-horizontal" action="/Ngay19.02.2020.BaiTap/dangnhap" method="post" id="login_form"> 
    <fieldset> 
     <div class="form-group"> 
      <div class="col-md-12"> 
       <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> <input name="username" placeholder="Username" class="form-control" type="text"> 
       </div> 
      </div> 
     </div> 
     <div class="form-group"> 
      <div class="col-md-12"> 
       <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> <input name="password" placeholder="Password" class="form-control" type="text"> 
       </div> 
      </div> 
     </div> 
     <div class="form-group"> 
      <div class="col-md-12"> 
       <button type="submit" class="btn btn-md btn-danger pull-right">Đăng nhập </button> 
      </div> 
     </div> 
    </fieldset> 
   </form> 
  </div> 
 </div>
</div>
  </h2> ${NOTE} </h2>
  </h2> ${NOTE1} </h2>
<div> <h5>Bạn chưa có tài khoản?</h5>
	<a href="/Ngay19.02.2020.BaiTap/dangky.jsp"> Đăng Ký</a>
</div>
	<script src="js/jquery-1.11.1.min.js"></script>
</body>
</html>