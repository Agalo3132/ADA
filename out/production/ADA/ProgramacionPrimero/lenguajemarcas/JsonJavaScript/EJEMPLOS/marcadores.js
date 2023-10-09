let marcador = {
    "marcadores" : {
        "pagina" : [
            {
                "nombre" : "Abrirllave",
                "descripcion" : "Tutoriales de informática.",
                "url" : "http://www.abrirllave.com"
            },
            {
                "nombre" : "Wikipedia",
                "descripcion" : "La enciclopedia libre.",
                "url" : "http://www.wikipedia.org"
            },
            {
                "nombre" : "W3C",
                "descripcion" : "World Wide Web Consortium.",
                "url" : "http://www.w3.org/"
            }
        ]
    }
}

console.log(marcador.marcadores.pagina[0].nombre + " " + marcador.marcadores.pagina[0].descripcion + " " + marcador.marcadores.pagina[0].url)
console.log(marcador.marcadores.pagina[1].nombre + " " + marcador.marcadores.pagina[1].descripcion + " " + marcador.marcadores.pagina[1].url)
console.log(marcador.marcadores.pagina[2].nombre + " " + marcador.marcadores.pagina[2].descripcion + " " + marcador.marcadores.pagina[2].url)

