<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>길이 변환 결과</h1>
	<% 
		int cm=Integer.parseInt(request.getParameter("length"));
		
		double inch=0.393701 * cm;
		double yard=0.010936 * cm;
		double pt=0.0328084 * cm;
		double m=0.01 * cm;%>
		
		<h2><%= cm+" cm" %></h2><hr><%
		String[] unitArr=request.getParameterValues("unit");
		String result="";
		for(String a:unitArr){
			if(a.equals("inch")){%>
				<h2><%= inch+" in" %></h2><%
				continue;
			}
			if(a.equals("yard")){%>
			<h2><%= yard+" yd" %></h2><%
				continue;
				
			}
			if(a.equals("pit")){%>
			<h2><%= pt+" pt" %></h2><%
				
				continue;
				
			}
			if(a.equals("meter")){%>
			<h2><%= m+" m" %></h2><%
				continue;
			}
			
		}
		%>
		
		
</body>
</html>