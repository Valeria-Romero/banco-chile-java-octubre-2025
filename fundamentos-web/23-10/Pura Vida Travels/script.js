/* Cambiar el texto del boton de la barra de navegación */
function cambiarTexto(elemento){
    if(elemento.innerHTML == "Iniciar sesión"){
        elemento.innerHTML = "Cerrar sesión";
    } else{
        elemento.innerHTML = "Iniciar sesión";
    }
}

/* Alerta para imagen del animal */
function destino(elemento){
    if(elemento.id == "lapa"){
    // if (img.id == "lapa")
    // if ("lapa" == "lapa") 
        alert("El destino favorito de Lapita es Guanacaste");
        console.log("Lapa");
    }
    else if (elemento.id == "rana"){
        alert("El destino favorito de Ranita es Monteverde");
        console.log("Rana");
    } 
    else {
        alert("El destino favorito de Tucancito es Atenas");
        console.log("Tucan");
    }
}

/* Cambiar la imagen del banner principal */
function cambiarImagen(elemento){
    elemento.style.backgroundImage = "url(./imgs/banner2.jpg)";
}

function regresarImagen(elemento){
    elemento.style.backgroundImage = "url(./imgs/banner1.jpg)";
}