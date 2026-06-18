const platillos = [
    "img/1.jpg",
    "img/2.jpg",
    "img/3.avif",
    "img/4.jpg",
    "img/5.jpg",
    "img/6.webp",
    "img/7.jpg",
    "img/8.jpg",
    "img/9.jpg",
    "img/10.jpg",
];

//Funcion del boton
//recuerda debes crear elementos img y ponerles sus atributos src
document.getElementById("btn").addEventListener("click", () => {
    let img = platillos.shift();
    let div = document.createElement("div");
    div.setAttribute("class", "col-4");
    div.innerHTML = `
        <img src="${img}" width="200" alt="X"/>
    `;
    document.getElementById("platillos").appendChild(div);
});