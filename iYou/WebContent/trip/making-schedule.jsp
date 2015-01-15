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
  <%@include file="../include/header.jsp" %>
  <div class="iu-container row" style="padding-top: 50px;">
    <div class="col-md-6 iu-box iu-box-left">
      <div class="iu-box-stating">
        <div class="container form-horizontal" role="form">
          <div class="form-group">
            <label class="col-sm-2 control-label">From</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" placeholder="City">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label">Time</label>
            <div class="col-sm-10">
              <div class="input-group">
                <input type="text" class="form-control" placeholder="Time Period">
                <span class="input-group-addon">Days</span>
              </div>
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label">To</label>
            <div  class="col-sm-10">
              <div class="input-group">
                <input type="text" class="form-control" placeholder="City">
                <span class="input-group-btn">
                  <button class="btn btn-primary" type="button">
                    <span class="glyphicon glyphicon-plus" style="min-height: 20px;"></span>
                  </button>
                </span>
              </div>
              <span class="help-block">You could add any destination you want</span>
            </div>
          </div>
          <div class="form-group">
            <div class="col-sm-2"></div>
            <div class="col-sm-10" style="min-height: 60px;">
              <div class="list-group">
                <a href="#" class="list-group-item active">
                  <span class="badge">2</span>
                  Cincinnati, OH
                </a>
                <a href="#" class="list-group-item">
                  <span class="badge">3</span>
                  Los Angeles, CA
                </a>
              </div>
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label">Transport</label>
            <div class="col-sm-10">
              <select multiple class="form-control">
                <option>DRIVING</option>
                <option>FLIGHT</option>
                <option>SHIP</option>
                <option>TRAIN</option>
              </select>
            </div>
          </div>
          <div class="form-group">
            <div style="float: right; padding-right: 15px;">
              <a href="<%=request.getContextPath()%>/trip/schedule.jsp" class="btn btn-primary">Build Trip</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="col-md-6 iu-box" style="background-color: #eee;">
      <div class="iu-box-attraction">
        <div class="container form-horizontal" role="form">
          <div class="list-group">
            <div class="list-group-item media active" style="margin: -1px;">
              <a class="media-left" href="#">
                <img src="<%=request.getContextPath()%>/image/dfmz.jpg" alt="">
              </a>
              <div class="media-body">
                <h4 class="media-heading">Oriental Pearl Tower</h4>
                <p>The Oriental Pearl Radio & TV Tower is a TV tower in Shanghai, China.</p>
              </div>
              <div class="media-right" href="#" style="min-width: 64px;border-left: solid 1px #ddd;">
                <div style="padding-top: 20px;padding-left: 8px;">
                  <a href="#" class="btn btn-link" style="color: #fff;">
                    <span class="glyphicon glyphicon-minus"></span>
                  </a>
                </div>
              </div>
           </div>
           <div class="list-group-item media" style="margin: -1px;">
              <a class="media-left" href="#">
                <img src="<%=request.getContextPath()%>/image/dfmz.jpg" alt="">
              </a>
              <div class="media-body">
                <h4 class="media-heading">Oriental Pearl Tower</h4>
                <p>The Oriental Pearl Radio & TV Tower is a TV tower in Shanghai, China.</p>
              </div>
              <div class="media-right" href="#" style="min-width: 64px;border-left: solid 1px #ddd;">
                <div style="padding-top: 20px;padding-left: 8px;">
                  <a href="#" class="btn btn-link">
                    <span class="glyphicon glyphicon-plus"></span>
                  </a>
                </div>
              </div>
           </div>
           <div class="list-group-item media" style="margin: -1px;">
              <a class="media-left" href="#">
                <img src="<%=request.getContextPath()%>/image/dfmz.jpg" alt="">
              </a>
              <div class="media-body">
                <h4 class="media-heading">Oriental Pearl Tower</h4>
                <p>The Oriental Pearl Radio & TV Tower is a TV tower in Shanghai, China.</p>
              </div>
              <div class="media-right" href="#" style="min-width: 64px;border-left: solid 1px #ddd;">
                <div style="padding-top: 20px;padding-left: 8px;">
                  <a href="#" class="btn btn-link">
                    <span class="glyphicon glyphicon-plus"></span>
                  </a>
                </div>
              </div>
           </div>
         </div>
        </div>
      </div>
    </div>
  </div>
  <%@include file="../include/footer.jsp" %>
</body>
</html>