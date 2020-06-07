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
        <li><a href="/chapter/basic">Basics</a></li>
        <li><a href="/overview">Overview</a></li>
    </ul>
    <h1>${subjectName}</h1>
    <div class="subjectContent">
        <div class="definition">
            ${definition}
        </div><br>
        <div class="information">
            ${information}
        </div><br>
        <div class="example">
            ${example}
        </div>
    </div>
</body>
</html>