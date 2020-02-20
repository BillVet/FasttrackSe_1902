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
   <h2>Đăng Ký Thành Viên</h2> 
   <hr> 
   <form class="form-horizontal" action="/Ngay19.02.2020.BaiTap/dangky" method="post" id="login_form"> 
    <fieldset> 
     <div class="form-group"> 
      <div class="col-md-12"> 
       <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> <input name="username" placeholder="username" class="form-control" type="text"> 
       </div> 
      </div> 
     </div> 
     <div class="form-group"> 
      <div class="col-md-12"> 
       <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> <input name="password" placeholder="password" class="form-control" type="text"> 
       </div> 
      </div> 
     </div>
      <div class="form-group"> 
      <div class="col-md-12"> 
       <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-list-alt"></i></span> <input name="fullname" placeholder="Full Name" class="form-control" type="text"> 
       </div> 
      </div> 
     </div>
      <div class="form-group"> 
      <div class="col-md-12"> 
       <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span> <input name="email" placeholder="Email" class="form-control" type="text"> 
       </div> 
      </div> 
     </div>
      <div class="form-group"> 
      <div class="col-md-12"> 

       <button type="submit" class="btn btn-md btn-danger pull-right">Đăng ký </button> 
      </div> 
     </div> 
    </fieldset> 
   </form> 
  </div> 
 </div>
</div>

<div> <h5>Bạn đã có tài khoản?</h5>
	<a href="/Ngay19.02.2020.BaiTap/DangNhap.jsp">Đăng Nhập</a>
</div>
	
	<script src="js/jquery-1.11.1.min.js"></script>
</body>
</html>