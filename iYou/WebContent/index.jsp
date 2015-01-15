<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/iu.css">
<title>iYou</title>
</head>
<body>
  <%@include file="include/header.jsp" %>
  <div class="iu-masthead" id="content" role="main" style="min-height: 660px;padding-top: 180px;">
    <div class="container">
      <p class="lead">Schedule your trip in a simple way!</p>
      <span class="iu-booticon iu-booticon-lg iu-booticon-outline">U</span>
      <p class="lead">
        <a href="<%=request.getContextPath() %>/trip/making-schedule.jsp" class="btn btn-outline-inverse btn-lg">Begin Now</a>
      </p>
    </div>
  </div>
  <%@include file="include/footer.jsp" %>
</body>
</html>