<body>
 <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0;">
    <div class="container-fluid header">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="<%=request.getContextPath()%>">iYou</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="iu-navbar-collapse-1">
        <form class="navbar-form navbar-right" role="search">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="User name" />
            <input type="password" class="form-control" placeholder="Password" />
          </div>
          <a href="<%=request.getContextPath() %>/trip/making-schedule.jsp" class="btn btn-primary">Sign in</a>
          <a href="<%=request.getContextPath() %>/trip/making-schedule.jsp" class="btn btn-info">Sign up</a>
        </form>
      </div>
    </div>
  </nav>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.js"></script>
</body>