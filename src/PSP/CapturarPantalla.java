package PSP;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Los prOcesos tienen 3 pipelines
 * - salida del proceso ( lo que devuelve el proceso) si ha ido bien: getInputStream()
 *          (leer BufferedReader)
 * - entrada al proceso (ordenes que envio al proeso): getOutpuStream()
 *          (Escribo BufferedWriter)
 * - salida del proceso cuando tiene errores: getErrorStream()
 *          (Leer BufferedReader)
 */




public class CapturarPantalla {


    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder(new String[]{"ping"});
        //pb.directory(new File("C:\\Angela"));

        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);


        try {
            Process p = pb.start();

            try(InputStreamReader istt = new InputStreamReader(System.in, StandardCharsets.UTF_8);
                BufferedReader brInputUser = new BufferedReader(istt);


                OutputStream os = p.getOutputStream();
                OutputStreamWriter osr = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osr);) {


                String linea;
                while ((linea = brInputUser.readLine()) != null) {
                    bw.write(linea);
                    bw.newLine();
                    //para que guarde en el momento y no cuando cierre
                    bw.flush();
                }
            }

            p.waitFor();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
