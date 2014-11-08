<%-- 
    Document   : index
    Created on : 9 Oct, 2014, 12:35:50 PM
    Author     : ritika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <script>
            function callservlet() 
            {
        document.location.href="Minor";
        return false;
    }
        </script>
        <meta charset="utf-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="background">
  <div id="page">
    <div class="header">
      <div class="footer">
        <div class="body">
          <div id="sidebar"> <a href="#"><img id="logo" src="images/logo.jpg" with="250" height="100" alt=""></a>
              <form name="getdata" action="NewServlet" method="post">
<input type="button" name="fetchdata" value="generate description" onclick="return callservlet();">
              </form>
            <div class="footenote"> <span>&copy; Copyright &copy; 2014.</span> <span><a href="#">Domain Name</a> all rights reserved
 | TO know more: <a href="http://www.csstemplatesfree.org">CONTACT ritika jalan</a></span></div>
          </div>
          <div id="content" > <img src="images/cotton-flower.jpg" width="726" height="546" alt="">
            <div class="featured">
              <div class="header">
                <ul>
                  <li class="first"><img src="images/hi.jpg" width="80" height="72" alt=""></li>
                  <li class="last">
                    <p> Documentation Genera tor - An HTML overview of your code </p>
                  </li>
                </ul>
              </div>
              <div class="body">
                <p> This is the documentation prepared for the code you provided. </p>
                <p> you are free to do anyting and everything whatever you want. i am going to sleep DND lol </p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="shadow">&nbsp;</div>
    </div>
  </div>
</div>
            </div>
    </body>
</html>
