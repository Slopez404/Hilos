
public class Numeros extends Thread {
    
@Override
    public void run() {
        for(int i=1; i<=40; i++) {
            System.out.println("Hilo de Números: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
