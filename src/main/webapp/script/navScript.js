navBar = document.getElementById("sideBar");
articles = document.querySelectorAll(".actionText");

button = document.getElementById("buttonMenu");

button.addEventListener("click", buttonEvent);

function buttonEvent() {
    if (navBar.style.left == "") {
        navBar.style.left = "0";
    } else {
        if (navBar.style.left == "" + -150 * navBar.style.scaleX + "px") {
                navBar.style.left = "0px"
        } else {
            navBar.style.left = "" + -150 * navBar.style.scaleX + "px";
        }
    }
}

if(window.innerWidth > 1000){
    navBar.addEventListener("mouseover", navEvent);
    navBar.addEventListener("mouseout", navOut);
} else {
    navBar.removeEventListener("mouseover", navEvent);
    navBar.removeEventListener("mouseout", navOut)
}

window.addEventListener('resize', function(){
    console.log(window.innerWidth);
    if (window.innerWidth > 1000){
        navBar.addEventListener("mouseover", navEvent);
        navBar.addEventListener("mouseout", navOut);
        navBar.style.left = null;
        navBar.style.scaleX = "1";
        navBar.style.width = null;
        articles.forEach(element => {
            element.style.display = "none";
        });
    } else {
            navBar.style.fontsize = "40px";
            navBar.removeEventListener("mouseover", navEvent);
            navBar.removeEventListener("mouseout", navOut)
            navBar.style.scaleX = "2";
            navBar.style.width = null;
            articles.forEach(element => {
                element.style.display = "flex";
            });
    }
});

function navEvent() {
    navBar.style.width = "150px";
    articles.forEach(element => {
        element.style.display = "flex";
    })
}

function navOut() {
    navBar.style.width = "50px";
    articles.forEach(element => {
        element.style.display = "none";
    })
}