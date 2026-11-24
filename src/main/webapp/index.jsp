<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
<head>
<meta charset="UTF-8">
<!-- Настройка viewport -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Собственные стили -->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- jQuery -->
<script defer src="js/jquery-3.6.4.js"></script>
<!-- Bootstrap JS + Popper JS -->
<script defer src="js/bootstrap.bundle.min.js"></script>

<title>Каталог музыкантов</title>
</head>
<body>

    <jsp:include page="/views/header.jsp" />

    <main class="container">
        <br><br><br>
        <div class="list-group text-center py-3 px-3">
            <h2>Функции системы</h2>
            <ul class="list-group list-group-flush">
                <li class="list-group-item list-group-item-primary"><a href="#">Музыканты</a></li>
                <li class="list-group-item list-group-item-info"><a href="#">Альбомы</a></li>
            </ul>
        </div>
        <br><br>
    </main>

    <jsp:include page="/views/footer.jsp" />

</body>
</html>
