package useOFThreads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class ThreadsGame {
    public static void main(String[] args) {
        JFrame marco = new MarcoRebote();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
class Ball {
    public void mueve_pelota(Rectangle2D limites){
        x+=dx;
        y+=dy;
        if(x<limites.getMinX()){
            x=limites.getMinX();
            dx=-dx;
        }
        if(x+ TAMX>=limites.getMaxX()){
            x=limites.getMaxX()-TAMX;
            dx=-dx;
        }
        if (y<limites.getMinX()){
            y=limites.getMinX();
            dy=-dy;
        }
        if(y + TAMY>=limites.getMaxY()){
            y= limites.getMaxY()-TAMY;
            dy=-dy;
        }
    }
    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x,y,TAMX,TAMY);
    }
    private static final int TAMX=15;
    private static final int TAMY=15;
    private double x=0;
    private double y=0;
    private double dx=1;
    private double dy=1;
}
class LaminaPelota extends JPanel{
    public void add(Ball b){
        balls.add(b);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        for(Ball b: balls){
            g2.fill(b.getShape());
        }
    }
    private ArrayList<Ball> balls= new ArrayList<Ball>();
}
class MarcoRebote extends JFrame{
    public MarcoRebote(){
        setBounds(600,300,400,350);
        setTitle("rebounds");
        lamina= new LaminaPelota();
        add(lamina,BorderLayout.CENTER);
        JPanel laminaButton= new JPanel();
        //putButton(laminaButton,"lets go!",new ActionListener(){
        putButton(laminaButton,"lets go!", event -> the_game_started());

       putButton(laminaButton,"go out", event -> System.exit(0));
        add(laminaButton,BorderLayout.SOUTH);
    }
    public void putButton(Container c,String title,ActionListener oyente){
        JButton button= new JButton(title);
        c.add(button);
        button.addActionListener(oyente);
    }
    public void the_game_started(){
        Ball ball= new Ball();
        lamina.add(ball);
        for(int i=1; i<=3000;i++){
            ball.mueve_pelota(lamina.getBounds());
            lamina.paint(lamina.getGraphics());
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private LaminaPelota lamina;
}

