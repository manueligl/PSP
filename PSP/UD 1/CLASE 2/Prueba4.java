import java.io.File;
import java.io.IOException;

public class Prueba4 {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder constructor = new ProcessBuilder("touch","marca.txt");

        constructor.directory(new File("/home/alumnadotarde/Escritorio"));

        Process proceso = constructor.start();

        proceso.waitFor();
    }
}
