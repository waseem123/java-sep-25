import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputOperation {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\\\java-sep-25\\\\java_io\\\\demo.txt");
            OutputStreamWriter ow = new OutputStreamWriter(fout);

            ow.write("Welcome to File Writing operations");;
            ow.close();
            fout.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
