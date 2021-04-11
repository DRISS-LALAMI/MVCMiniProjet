<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<f:setBundle basename="ma.ensa.resources.messages" var="idir"/>
<title>Insert title here</title>
</head>
<body>
<h2>Inscrivez- vous</h2>
				<form method='post' action='Ajouter'>
					 <label for='txtNom'><f:message key="nom" bundle="${idir}"/> :</label> 
            		 <input id='txtNom' name='txtNom' type='text'  /><br/>
            		 <br/>  
					  <label for='txtPrenom'><f:message key="prenom" bundle="${idir}"/> :</label> 
            		 <input id='txtPrenom' name='txtPrenom' type='text'  /><br/>
					 <br/>    
					   <label for='txtAdresse'><f:message key="adresse" bundle="${idir}"/> :</label> 
            		 <input id='txtAdresse' name='txtAdresse' type='text'  /><br/>
            		 <br/>
            		 <label for='txtCode'><f:message key="code" bundle="${idir}"/> :</label> 
            		 	 <input id='txtCode' name='txtCode' type='text'  />&nbsp;
            		 	 &nbsp;
            		 	 &nbsp;
            		 	 	 <label for='txtVille'><f:message key="ville" bundle="${idir}"/> :</label>
            		 	 	 <input id='txtVille' name='txtVille' type='text'  /><br/>
            		 <br/>
            		  <label for='txtTel'><f:message key="tel" bundle="${idir}"/> :</label> 
            		 <input id='txtTel' name='txtTel' type='text'  /><br/>
            		 <br/>
            		 	   <label for='txtEmail'><f:message key="email" bundle="${idir}"/> :</label> 
            		 <input id='txtEmail' name='txtEmail' type='text'  /><br/>
            		 <br/>
            		 	   <label for='txtEmail'><f:message key="password" bundle="${idir}"/> :</label> 
            		 <input id='txtPassword' name='txtPassword' type='text'  /><br/>
            		 <br/>
					 <input name='btnConnect' type='submit'/> <br/>
				</form>	
</body>
</html>