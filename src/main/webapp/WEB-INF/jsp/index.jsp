<%--
  Created by IntelliJ IDEA.
  User: natal
  Date: 09-Jul-17
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>

    <script src="<c:url value="/js/jquery-1.11.3.min.js" />"></script>
    <script src="<c:url value="/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/js/bootstrap.file-input.js" />"></script>

</head>
<body>

<div class="container">
    <form class="form-search" action="${pageContext.request.contextPath}/articles" method="get">
        <div class="input-append">
            <div class="form-group">
                <label for="dynamicInput" class="control-label">Types:</label>
                <div id="dynamicInput" class="form-group"></div>
            </div>
            <button type="submit" class="btn btn-default btn-sm">
                <span class="glyphicon glyphicon-search"></span> Поиск
            </button>
        </div>
    </form>

    <table class="table table-striped">
        <c:if test="${articles!=null}">
            <thead>
            <tr>
                <td>Article_Name</td>
                <td>Count_Official_Text</td>
                <td>Count_English_Text</td>
            </tr>
            </thead>
            <c:forEach var="article" items="${articles}">
                <tr>
                    <td>${article.name}</td><td>${article.count1}</td><td>${article.count2}</td>
                </tr>
            </c:forEach>
        </c:if>
    </table>

</div>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="<c:url value="/js/my/articles.js" />"></script>

<script type="text/javascript">
    var typeList = '<c:url value="/typeList"/>';
</script>

</body>

</html>
