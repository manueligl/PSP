public class ProgramaPrincipal2 {
    public static void main(String[] args) {
        Thread hiloAscendente = new Thread(new CuentaAscendente(), "ascendente");
        Thread hiloDescendente = new Thread(new CuentaDescendente(), "descendente");

        hiloAscendente.start();
        hiloDescendente.start();

        System.out.println("El hilo main continúa.");
    }
}

    class CuentaAscendente implements Runnable {
        @Override 
        public void run() {
            for(int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }

    class CuentaDescendente implements Runnable {
        @Override 
        public void run() {
            for(int i = 5; i >= 1; i--) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }
