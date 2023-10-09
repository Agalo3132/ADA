package PSP;

import java.io.*;
import java.nio.charset.Charset;

public class s {

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder(new String[]{"ping"});

        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        try {
            Process process = pb.start();

            InputStreamReader ipt = new InputStreamReader(System.in, Charset.defaultCharset());
            BufferedReader bufferedReader = new BufferedReader(ipt);


            OutputStream op = process.getOutputStream();
            OutputStreamWriter ops = new OutputStreamWriter(op);
            BufferedWriter be = new BufferedWriter(ops);


            String l;
            while ((l != bufferedReader.readLine()) != null) {
                be.write(l);
                be.newLine();
                be.flush();



            }

            process.waitFor();


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
