<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<<<<<<< HEAD
    <jsp:include page="/WEB-INF/partials/head.jsp">
=======
    <jsp:include page="../partials/head.jsp">
>>>>>>> da847109c420e78e95048e70334ea79ad6f0b5b8
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<<<<<<< HEAD
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
=======
    <jsp:include page="../partials/navbar.jsp" />
>>>>>>> da847109c420e78e95048e70334ea79ad6f0b5b8
    <div class="container">
        <h1>Please Log In</h1>
        <form action="/login" method="POST">
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Log In">
        </form>
    </div>
</body>
</html>
