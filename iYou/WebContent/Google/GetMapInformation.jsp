<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>iYou</title>
</head>
<body>
We collect information via Google Map API
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBXEQ7gLn0ty5qA_ECfFhmVtdTYbAW_bhs&sensor=true"
  type="text/javascript"></script>
<script type="text/javascript">
debugger;
  try{
	  debugger;
	  xmlDoc = new ActiveXObject("Microsoft.XMLDOM");//IE
  }catch(e){
	  try{
		  debugger;
		  xmlDoc = document.implementation.createDocument("","",null);//Firefox, Mozilla, Operat, etc.
	  }catch(e){
		  alert(e.message);
	  }
  }
  
  /*---------Load file-----------*/
  try{
	  debugger;
	  var path="http://maps.googleapis.com/maps/api/distancematrix/xml?";
	  path+="origins=Vancouver+BC&destinations=San+Francisco";
	  path+="&mode=driving&language=en&units=imperial&sensor=false";
	  xmlDoc.async=false;
	  debugger;
	  xmlDoc.load(path);
	  var x=xmlDoc.getElementsByTagName("element")[0];
	  var y=x.childNodes[0];
	  alert(y);
  }catch(e){
	  alert(e.message);
  }
</script>
</body>
</html>