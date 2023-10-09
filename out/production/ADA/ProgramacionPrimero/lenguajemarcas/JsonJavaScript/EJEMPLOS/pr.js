'use strict'
console.log("Hola, caracola 23");
console.log("yeyeyeye");

let a;
console.log(a);
a=23;
console.log(a);
let b="22";
console.log(b);
console.log(a-b);
console.log(a+b);

if (a > b) {
    let c="hola";
    console.log(c);
} else {
    let c="adios";
    console.log(c);
}

if(a===b) {
    console.log("a y b son iguales");
}

let edad = 25;
switch(true) {
case edad < 18:
    console.log("Eres muy joven para entrar");
break;
case edad < 65:
    console.log("Puedes entrar");
break;
default:
    console.log("Eres muy mayor para entrar");
}

/*
let respuesta=prompt("DEME UN DATO");
console.log(respuesta);

let limit = 5;
for (let i = 1, j = limit; i <= limit && j > 0; i++, j--) {
console.log(i + " - " + j);
}

let limitante = 10;
for (let i = 0, j = limitante; i <= limitante; i++) {
    console.log(i);
}
*/


let pregunta=prompt("Elige el limite");


for (let i = 0; i <= pregunta; i++){
    console.log(i);
}

b=["paco","pepe","luis"];

for (let i in b) {
    console.log(i+":"+b[i]);
}

for (let i of b){
    console.log(i);
}


let myJs = {
    "id": 1
}

myJs.id


let myJSON = {
        "departamento":8,
        "nombredepto":"Ventas",
        "director": "Juan Rodríguez",
        "empleados":[
            {
            "nombre":"Pedro",
            "apellido":"Fernández"
        },{
            "nombre":"Jacinto",
            "apellido":"Benavente"
        }
    ]
}

console.log("director");

myJSON.director

console.log(myJSON.empleados[1].nombre + " " + myJSON.empleados[1].apellido);

