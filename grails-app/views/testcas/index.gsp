<%@ page import="org.springframework.security.core.*" %>
<g:applyLayout name="main"> 
<html>
    <head>
       <title>My Index page</title>       
    </head>

    <body>
    
    <g:if test="${flash.message}">
         <div class="message">${flash.message}</div>
    </g:if>
    
    <h1>THIS IS NOT A SECURED PAGE. ALL ARE WELCOME.</h1>
    <p>
    <h3>Click <a href="secured">here</a> to visit a secured page.</h3>
    </p>
    
	<br/>
    Your spring security username is :    
    <p>
    ${fieldValue(bean: principal, field: "username")}
    </p>


 
    </body>
</html>
</g:applyLayout>