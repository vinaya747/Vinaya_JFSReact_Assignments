<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <div align="center">
  <h1>User Login Form</h1>
  <form action="btnLoginClick" method="post">
   <table style="with: 80%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="text" name="password" /></td>
    </tr>
    
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>
