
public class Abecedario extends Thread {
    
    
    @Override
    public void run() {
        for(char y='A'; y<='Z'; y++) {
            System.out.println("Hilo de abecedario: " + y);

            try {
                 Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
