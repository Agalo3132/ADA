package ADA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    public static void main(String[] args) {
        String cadena = "Curso 2023-2024";

        //System.out.println(cadena.replaceAll("[\\d]", "1"));

        System.out.println(cadena.matches("^(?i)[a-z]{5}[ ]20\\d{2}[-]\\d{4}$"));


        String telefono = "(+34) 658-748-958";
        String regex = "^[\\(][\\+]\\d{1,3}[\\)][ ]\\d{3}[-]\\d{3}[-]\\d{3}[-]$";
        System.out.println(telefono.matches(regex));



        StringBuilder html = new StringBuilder("<header>meta...</header>");
        html.append("<h1>tittle </h1>");
        html.append("<h2>Etiqueta h2 </h2>");
        html.append("<p>esto es un párrafo </p>");
        html.append("<h2>Resumen </h2>");
        html.append("<footer>Footer </footer>");

        Pattern p = Pattern.compile("(<h2>)(.*?)(</h2>)");
        Matcher m = p.matcher(html);
        //System.out.println(m.matches());

        while (m.find()) {
            //System.out.println(m.start() + " " + m.end());
            System.out.println(m.group(2));
        }
        //System.out.println(m.find());


    }
}
