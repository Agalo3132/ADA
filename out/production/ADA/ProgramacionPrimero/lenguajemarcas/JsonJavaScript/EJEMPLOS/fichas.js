let ficha = {
    "fichas": {
        "ficha": [
            {
                "numero": "1",
                "nombre": "Eva",
                "edad": "25",
                "ciudad": "París",
                "pais": "Francia"
            },
            {
                "numero": "2",
                "nombre": "Giovanni",
                "edad": "26",
                "ciudad": "Florencia",
                "pais": "Italia"
            }
        ]
    }
}

console.log(ficha.fichas.ficha[0].nombre + " " + ficha.fichas.ficha[0].edad + " " + ficha.fichas.ficha[0].ciudad + " " + ficha.fichas.ficha[0].pais);
console.log(ficha.fichas.ficha[1].nombre + " " + ficha.fichas.ficha[1].edad + " " + ficha.fichas.ficha[1].ciudad + " " + ficha.fichas.ficha[1].pais);
