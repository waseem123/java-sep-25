import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOperation {
    public static void main(String[] args) {
        try {

            FileInputStream fin = new FileInputStream("D:\\java-sep-25\\java_io\\demo.txt");
            InputStreamReader ir = new InputStreamReader(fin);

            int x = ir.read();
            while (x != -1) {
                System.out.print((char) x);
                x = ir.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}