<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<f:setBundle basename="ma.ensa.resources.messages" var="idi"/>
<title>Insert title here</title>
</head>
<body>
<h2><f:message key="identification" bundle="${idi}"/>:</h2>
<form action="Enregistrer" method='post'>
  <label for='txtEmail'><f:message key="email" bundle="${idi}"/> :</label> 
  <input id='txtEmail' name='txtEmail' type='text'  /><br/><br/>
  <label for='txtPassword'><f:message key="password" bundle="${idi}"/> :</label> 
  <input id='txtPassword' name='txtPassword' type='text'  /><br/>
   <input name='btnConnect' type='submit'/> <br/>
  <br/>
  </form>
</body>
</html>