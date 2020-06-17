<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Chapter ${chapterName}</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div class="logo">
    <img src="https://upload.wikimedia.org/wikipedia/ru/thumb/3/39/Java_logo.svg/1200px-Java_logo.svg.png">
</div>
<h2>Course</h2>
<ul class="menuBar">
    <li><a href="/chapter/advanced">Advanced</a></li>
    <li><a href="/chapter/intermediate">Intermediate</a></li>
    <li><a href="/chapter/basics">Basics</a></li>
    <li><a href="/overview">Overview</a></li>
</ul>
<h1>${chapterName}</h1>

<ul class="subjectsList">
    <c:forEach items="${subjects}" var="subject">
        <div class="listElement">
            <li><a href="/chapter/${chapterName}/subject/${subject}"> ${subject}</a></li>
        </div>
    </c:forEach>
</ul>
</body>
</html>