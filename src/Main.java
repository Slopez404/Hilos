public class Main {
    public static void main(String[] args) {
        Abecedario hilo1 = new Abecedario();
        Numeros hilo2 = new Numeros();
        Himno hilo3 = new Himno(3);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
    }
}