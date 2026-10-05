<!doctype html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<title>Welcome to Servlet Web Dynamic Project </title>
<!-- including external css  -->
     <link rel="stylesheet" href="<%= application.getContextPath()%>/css/style.css">
</head>
<body>
   <div class="container">
    <%@ include file = "menu.jsp" %>
    <h1>
        Welcome to about pages 
    </h1>
    
    <p> this page is about page  </p>
    
   </div>
   <script src="<%= application.getContextPath() %>/js/script.js "></script>
</body>
</html>