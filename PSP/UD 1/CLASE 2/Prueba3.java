import java.io.IOException;

public class Prueba3 {
    public static void main(String[] args) throws IOException, InterruptedException {

    Process constructor = new ProcessBuilder("programaQueNoExiste.txt").start();

    int codigoSalida = constructor.waitFor();

        System.out.println("Proceso finalizado.");
        
        System.out.println("Código de salida: " + codigoSalida);


    }
}
