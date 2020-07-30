<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
<style type="text/css">
 #inp { 
        margin: 0px; 
        padding: 0px; 
        width: 100%; 
        outline: none; 
        height: 30px; 
        border-radius: 5px; 
    } 
  #submit{
  
		  display: block;
		  font-family: "Open Sans", Helvetica, Arial, sans-serif;
		  font-weight: 600;
		  text-transform: uppercase;
		  font-size: 0.75em;
		  letter-spacing: 1px;
		  height: 38px;
		  width: 120px;
		  line-height: 38px;
		  overflow: hidden;
		  background: #4dbecf;
		  border-radius: 3px;
		  box-shadow: 0 15px 30px rgba(black, 0.1);
		  border: 0;
		  cursor: pointer;
		  transition: all 0.3s ease;

  		
  		}
  		h1{
  		font-style: italic;
  		color: blue;
  		
  		
  		}
  		body
  		{
  		margin-top : 10%;
  		background-color:lightgrey;}
  		
  		label{
  		color : grey;
  		}  
  
  
    </style>
</head>
<body>


	<center><h1>Admin Login </h1>
	<form action="adminServlet" method="post" >
		<table>
			<tr>
			<td><label><strong>Nom Admin :</strong></label></td>
			<td><input id="inp" type="text" name="adminName" value="${adminName}" ></td>
			</tr>
			<br>
			<tr>
			<td><label><strong>Mot De Passe :</strong></label></td>
			<td><input id="inp" type="password" name="adminMDP" value="${adminMDP}" ></td>
			</tr>
		
		</table>
		<br><br>
	<input type="submit" id="submit" value="submit">
	
	</form>
	</center>
</body>
</html>