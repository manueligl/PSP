public class ProgramaPrincipal {
    public static void main(String[] args) {
        Runnable tarea = new TareaPasos();
        Thread hilo = new Thread(tarea, "hilo-procesamiento");

        System.out.println("Antes de iniciar el hilo.");
        hilo.run();
        System.out.println("El hilo main continúa.");

    }
}

class TareaPasos implements Runnable {
    @Override 
    public void run() {
        for(int paso = 1; paso <= 5; paso ++) {
            System.out.println(Thread.currentThread().getName() + " - paso " + paso);
    }
}
}
