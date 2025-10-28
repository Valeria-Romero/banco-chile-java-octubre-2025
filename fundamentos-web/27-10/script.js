console.log("Conectado");

// Hace lo mismo pero con mas pasos
// function likes(elemento){
//     var num_likes = elemento.closest(".likes-count");
    // console.log(num_likes);
//     num_likes.querySelector(".like");
//     console.log(num_likes.querySelector(".like").innerHTML);
//     var add_likes = parseInt(num_likes.querySelector(".like").innerHTML);
//     add_likes++;
//     console.log(add_likes)
//     var new_num_likes = num_likes.querySelector(".like");
//     new_num_likes.innerHTML = add_likes;
// }

function likes(elemento){
    let num_likes = parseInt(elemento.closest(".likes-count").querySelector(".like").innerHTML);
    num_likes++;
    elemento.closest(".likes-count").querySelector(".like").innerHTML = num_likes;
}