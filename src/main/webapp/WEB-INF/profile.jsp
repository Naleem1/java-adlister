<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<<<<<<< HEAD
    <jsp:include page="/WEB-INF/partials/head.jsp">
=======
    <jsp:include page="../partials/head.jsp">
>>>>>>> da847109c420e78e95048e70334ea79ad6f0b5b8
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<<<<<<< HEAD
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, ${sessionScope.user}!</h1>
=======
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
        <p>Welcome ${username}</p>
>>>>>>> da847109c420e78e95048e70334ea79ad6f0b5b8
    </div>

</body>
</html>
