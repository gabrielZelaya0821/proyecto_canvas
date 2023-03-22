package Thread;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author gabri
 */
public class ImgHilo extends Thread{
    private JLabel label;

    public ImgHilo(JLabel label) {
        super();
        this.label = label;
    }

    @Override
    public void run() {
        int contador = 1;
        ImageIcon img1 = new ImageIcon("./imagenes/img_bienvenidos.jpg");
        ImageIcon img2 = new ImageIcon("./imagenes/img_2023.jpg");
        ImageIcon img3 = new ImageIcon("./imagenes/img_examenes.jpg");
        while(true){
            if(contador == 3)
                contador = 1;
            switch(contador){
                case 1 ->{
                    label.setIcon(img1);
                }
                case 2 ->{
                    label.setIcon(img2);
                }
                case 3->{
                    label.setIcon(img3);
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }
            contador++;
        }
    }
}
