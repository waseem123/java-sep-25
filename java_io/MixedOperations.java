import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MixedOperations {
    public static void main(String[] args) {
        try {
            String src = "D:\\java-sep-25\\java_io\\demo.txt";
            String dst = "D:\\java-sep-25\\java_io\\output.txt";

            FileInputStream fin = new FileInputStream(src);
            InputStreamReader ir = new InputStreamReader(fin);

            FileOutputStream fout = new FileOutputStream(dst);
            OutputStreamWriter ow = new OutputStreamWriter(fout);

            String data = "";
            int c = ir.read();
            while (c != -1) {
                data = data + (char) c;
                c = ir.read();
            }
            ow.write(data);
            ir.close();
            fin.close();
            ow.close();
            fout.close();
            System.out.println("FILE WRITE OPERATION SUCCESSFUL");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
