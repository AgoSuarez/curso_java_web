
function validarFormat(forma){
    let usuario = forma.usuario;
    if (usuario.value === "" ){
        alert("Debe introducir un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    let password = forma.password;
    if (password.value === ""  || password.value.length <= 3){
        alert("Debe introducir una password valido (min. 4 caracteres)");
        password.focus();
        password.select();
        return false;
    }
    let tecno = forma.tecnologia;
    let checkSeleccionado = false;
    for (let i=0; i<tecno.length; i++){
        if (tecno[i].checked){
            checkSeleccionado= true;
        }
    }
    if (!checkSeleccionado){
        alert("Debe seleccionar al menos una tecnología");
        return false;        
    }
    let generos = forma.genero;
    let generoSeleccionado = false;
    for (let i=0; i<generos.length; i++){
        if (generos[i].checked){
            generoSeleccionado=true;
        }        
    }
    if (!generoSeleccionado){
        alert("Debe seleccionar un genero");
        return false;
    }
    let ocupacion= forma.ocupacion;
    if (ocupacion.value===""){
        alert("Debe selecionar una ocupación");
        return false;
    }
    alert("Todos los datos validados, enviando los datos al servidor")
    return true;
}

