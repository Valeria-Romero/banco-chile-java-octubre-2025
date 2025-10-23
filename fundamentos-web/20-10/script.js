console.log("Conectado");

function login(elemento){
    console.log(elemento);

    // var boton = document.getElementById("login")

    if(elemento.innerHTML == "Cerrar sesión"){
        alert("Cerrar sesión");
        elemento.innerHTML = "Iniciar sesión"
    } else{
        alert("Iniciar sesión");
        elemento.innerHTML = "Cerrar sesión"
    }
}


function rechazarConexion(elemento){
    console.log(elemento);
    const conexion = elemento.closest(".solicitud-conexion");
    console.log(conexion);
    conexion.remove();
    // elemento.closest(".solicitud-conexion").remove();
}

function aceptarConexion(elemento){
    const conexion = elemento.closest(".solicitud-conexion");
    
    var conexiones = document.getElementById("conexiones");
    conexiones.appendChild(conexion.querySelector(".conexion"));
    
    conexion.remove();
    sumarConexion();
}

function sumarConexion(){
    var cantidadConexiones = document.getElementById("numero-conexiones");
    console.log(cantidadConexiones);
    var numeroConexiones = parseInt(cantidadConexiones.innerHTML);
    console.log(numeroConexiones);
    // numeroConexiones = numeroConexiones + 1, hace lo mismo que la linea de abajo
    numeroConexiones++;
    console.log(numeroConexiones);
    cantidadConexiones.innerHTML = numeroConexiones;
}


