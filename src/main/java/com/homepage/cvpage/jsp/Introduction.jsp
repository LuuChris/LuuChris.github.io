<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>View Pages</title>
        <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>ISBN</th>
                    <th>Name</th>
                    <th>Author</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${pages}" var="page">
                    <tr>
                        <td>${page.header}</td>
                        <td>${page.content}</td>
                        <td>${page.footer}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>