let xml1=`{
    "fichas": [
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
}`;


let xml2=`{
    "marcadores" : [
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
}`;

xml1 = JSON.parse(xml1);
xml2 = JSON.parse(xml2);

Recorrer(xml1);

Recorrer(xml2);



function Recorrer(a) {
    if(typeof(a) == 'object'){
        console.log(a);
        for (const k in a) {
            if (typeof(a[k]) == 'object') {
                Recorrer(a[k]);
            }
        }
    } else {
        console.log(a);
    }
}

