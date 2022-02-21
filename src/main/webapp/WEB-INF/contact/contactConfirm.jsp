<%--
  Created by IntelliJ IDEA.
  User: cocod
  Date: 08/02/2022
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/contactConfirm.css">
    <script src="https://kit.fontawesome.com/f953e20ddb.js" crossorigin="anonymous"></script>
    <title>NamaZone - Contact</title>
</head>
<body>
    <header>
        <div id="hTitle">
            <h1>NAMAZONE</h1>
        </div>
    </header>
    <div id="confirmContainer">
        <div id="confirmWrapper">
            <div id="confirmTitle">
                <h2>Formulaire de Contact</h2>
            </div>
            <div id="confirmIcon">
                <i class="fa fa-check"></i>
            </div>
            <div id="confirmText">
                <h3>
                    Votre message a bien été envoyé
                    <br>
                    Notre équipe reviendra vers vous dans les plus brefs delais
                </h3>
            </div>
            <div id="confirmButton">
                <a href="./">
                    <button>Retour</button>
                </a>
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
</html>
