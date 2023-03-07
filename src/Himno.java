import java.io.File;
import javax.sound.sampled.*;

public class Himno extends Thread {
    private final int id;

    public Himno(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Hilo 3: Himno");

        // Si es el último hilo, reproducir la canción
        if (id == 3) {
            try {
                // Obtener el archivo de la canción
                File file = new File("HimnoCol.wav");

                // Crear un objeto AudioInputStream y reproducirlo
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
               

                // Esperar a que termine la canción
                while (clip.isOpen()) {
                    Thread.sleep(200);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}