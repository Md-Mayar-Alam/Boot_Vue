<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<body>
		<h3>FOR TOKENS EXAMPLE</h3>
		
		<%-- <c:forEach items="${inputMap}" var="inputMap">
			<p>${inputMap.key }</p>
			<p>${inputMap.value }</p>	
		</c:forEach> --%>

		<c:forEach items="${inputMap}" var="inputMap">
			<%-- <c:forTokens items="${inputMap.value }" delims=":" var="valueToken">
				<c:out value="${valueToken}"></c:out><br/>
			</c:forTokens> --%>
			
			<c:set var="valueToken" value="${fn:split(inputMap.value, ':')}" />
			
			<c:out value="${valueToken[0]}"></c:out><br/>
			<c:out value="${valueToken[1]}"></c:out><br/>
		</c:forEach>
	</body>
</html>