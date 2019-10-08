<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- devlist.jsp -->
<c:set var="path" value="${pageContext.request.contextPath}"/>
<jsp:include page="/WEB-INF/views/common/header.jsp">
	<jsp:param name="pageTitle" value="dev검색결과"/>
</jsp:include>
<section id="content">
	<table class="table">
		<tr>
			<th scope="col">번호</th>
			<th scope="col">이름</th>
			<th scope="col">나이</th>
			<th scope="col">이메일</th>
			<th scope="col">성별</th>
			<th scope="col">개발가능언어</th>
		</tr>
		<c:if test="#{list }!=null">
			<c:forEach var="dev" items="${list }">
				<tr>
					<td>#{dev.devNo }</td>
					<td>#{dev.devName }</td>
					<td>#{dev.devAge }</td>
					<td>#{dev.devEmail }</td>
					<td>#{dev.devGender }</td>
					<td>
					<c:forEach items="${dev.devLang }" var="lang" varStatus="v">
					${v.index != 0?",":"" }${lang }
					</c:forEach>
					</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</section>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
