import java.io.IOException;

public class Prueba2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder constructor = new ProcessBuilder("mkdir","carpetaPrueba");

        Process proceso = constructor.start();

        int codigoSalida = proceso.waitFor();

        System.out.println("Proceso finalizado.");
        
        System.out.println("Código de salida: " + codigoSalida);

    }
}
