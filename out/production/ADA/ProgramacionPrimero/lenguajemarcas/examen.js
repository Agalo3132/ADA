let examen = {
    "notas": {
        "alumno": [
            {
                "nie": "10004040",
                "nombre": "Eva",
                "modulos": {
                    "modulo": [
                        {
                            "titulo": "BD",
                            "nota": 8   
                        },
                        {
                            "titulo": "PROG",
                            "nota": 9
                        },
                        {
                            "titulo": "LMSGI",
                            "nota": 10
                        }
                    ] 
                }
            },
            {
                "nie": "10004567",
                "nombre": "Luis",
                "modulos": {
                    "modulo": [
                        {
                            "titulo": "BD",
                            "nota": 6   
                        },
                        {
                            "titulo": "PROG",
                            "nota": 10
                        },
                        {
                            "titulo": "LMSGI",
                            "nota": 5
                        }
                    ]
                }

            }
        ]
    }

}

const notas = examen.notas;
for (const alumno of notas.alumno) {
  console.log(alumno.nombre);

  for (const modulo of alumno.modulos.modulo) {
    console.log(modulo.titulo);
    console.log(modulo.nota);
  }
}
