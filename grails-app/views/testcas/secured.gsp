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
    
    <h1>**SECURED PAGE**  Welcome privileged user.</h1>
	
    Your spring security username is :    
    <p>
    ${fieldValue(bean: principal, field: "username")}
    </p>


 
    </body>
</html>
</g:applyLayout>