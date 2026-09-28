import java.io.IOException;
public class Prueba {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder constructor = new ProcessBuilder("sleep","100");

        Process proceso = constructor.start();

        int codigoSalida = proceso.waitFor();

        System.out.println("Código de salida: " + codigoSalida);

        System.out.println("¿Sigue activo? " + proceso.isAlive());

        System.out.println("La aplicación Java continúa.");



    }
}