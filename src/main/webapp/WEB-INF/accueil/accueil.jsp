<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/f953e20ddb.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css" />
    <title>NamaZone</title>
</head>
<body>
<header>
    <div id="menuButtonContainer">
        <button id="buttonMenu"><i class="fas fa-bars"></i></button>
    </div>
    <div id="hTitle">
        <h1>NAMAZON</h1>
    </div>
</header>
<div id="gContainer">
    <div id="mainContent">
        <div id="contentWrapper">
            <c:forEach items="${ articleList }" var="article" varStatus="status">
                <div class="articleContainer">
                    <div class="articleImage"><img src="${ article.imgUrl }"></div>
                    <div class="articleText"><h3>${ article.title }</h3><h4>${ article.price } €</h4></div>
                </div>
            </c:forEach>
        </div>
    </div>
    <div id="sideBar">
        <div id="sideWrapper">
            <div class="barAction">
                <a href="./contact">
                    <div class="actionIcon"><i class="fas fa-home"></i></div>
                    <div class="actionText"><h5>Accueil</h5></div>
                </a>
            </div>
            <br>
            <div class="barAction">
                <a href="./contact">
                    <div class="actionIcon"><i class="fas fa-search"></i></div>
                    <div class="actionText"><h5>Recherche</h5></div>
                </a>
            </div>
            <br>
            <div class="barAction">
                <a href="./contact">
                    <div class="actionIcon"><i class="far fa-bookmark"></i></div>
                    <div class="actionText"><h5>Favoris</h5></div>
                </a>
            </div>
            <br>
            <div class="barAction">
                <a href="./contact">
                    <div class="actionIcon"><i class="fas fa-shopping-cart"></i></div>
                    <div class="actionText"><h5>Pannier</h5></div>
                </a>
            </div>
            <br>
            <div class="barAction">
                <a href="./contact">
                    <div class="actionIcon"><i class="fas fa-question-circle"></i></div>
                    <div class="actionText"><h5>Contact</h5></div>
                </a>
            </div>
            <div class="barAction">
                <a href="./contact">
                    <div class="actionIcon"><i class="fas fa-sign-out-alt"></i></div>
                    <div class="actionText"><h5>Déconnexion</h5></div>
                </a>
            </div>
        </div>
    </div>
</div>
<footer>
    <div id="gMapContainer">
        <iframe id="gMap" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2646.769535630384!2d1.5164692511205002!3d48.44176283780292!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47e40d330b9f8a55%3A0x495998ada34128b7!2sAFPA!5e0!3m2!1sfr!2sfr!4v1644334673602!5m2!1sfr!2sfr" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
    </div>
    <div id="copyrightContainer">
        <h6><i class="fa fa-copyright"></i> Co.corp All Right Reserved</h6>
    </div>
</footer>
</body>
<script src="${pageContext.request.contextPath}/script/navScript.js"></script>
</html>