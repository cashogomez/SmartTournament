/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

/**
 *
 * @author casho
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;


/** @see http://stackoverflow.com/questions/3951383 */
public class Torneo extends JDesktopPane {

    private static final Stroke s = new BasicStroke(4.0f);
    ArrayList<Competidor> lista = new ArrayList<>();
    ArrayList<MyFrame> CompeDibujo = new ArrayList<>();
    private int distancia = 20;
    
    

    public Torneo() {
        this.setPreferredSize(new Dimension(1024, 768));
        lista.add(new Competidor("Andres", "Perez", "Hernández", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Ana Karen", "Rodriguez", "Ramírez", "Juan Luis Vives", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Diana Karen", "Xolalpa", "Alducin", "Honbu Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Maria José", "Ramos", "Portillo", "Mushin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Emilia", "Huerta", "de la Cruz", "Soshin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Saúl", "Tomé", "Vázquez", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Jaqueline", "Aquino", "Hernández", "Dojo del sur", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Maya Gabriel", "Rodríguez", "Cayetano", "Kasoku Fenix", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Carlos", "Gómez", "Ligonio", "Juan Luis Vives", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Yael Martín", "Enriquez", "López", "Halcones", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Fanny Michelle", "Roldan", "Corona", "Sansei Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Hector Hugo", "Condado", "Serrano", "Mushin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Evelyn", "Rodríguez", "Ramírez", "Seishin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Norma", "Hernández", "Montiel", "Honbu Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Estela", "Xolalpa", "Alducin", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Sandra", "Franco", "Velazquez", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Marco Antonio", "Rosas", "Crisanto", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        int conta=0;
        for (Iterator<Competidor> it = lista.iterator(); it.hasNext();) {
            Competidor cpt1 = it.next();
            CompeDibujo.add(new MyFrame(cpt1.conseguirDojo(), cpt1.conseguirNombre()+" "+cpt1.conseguirApellidoPaterno()+" "+cpt1.ApellidoMaterno,100, distancia));
            this.add(CompeDibujo.get(conta));
            System.out.println(conta);
            distancia = distancia+100;
            conta++;
        }
    }
    private void lineaVertical (MyFrame one, MyFrame two,Graphics g ) {

        // Linea vertical ********************************************
        
        Graphics2D g2d = (Graphics2D) g;
        int x1 = one.getX() + one.getWidth()+100;
        int y1 = one.getY() + one.getHeight() / 2;
        int x2 = two.getX() + two.getWidth()+100;
        int y2 = two.getY() + two.getHeight() / 2;
        g2d.drawLine(x1, y1, x2, y2);        
    }
    
   private void lineaHorizontal (MyFrame two, Graphics g) { 
    // Linea horizontal abajo
        Graphics2D g2d = (Graphics2D) g;        
        int x1 = two.getX() + two.getWidth();
        int y1 = two.getY() + two.getHeight()/2;
        int x2 = two.getX() + two.getWidth()+100;
        int y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
   }
    private MyFrame lineaHorizontalGanador (MyFrame one, MyFrame two, MyFrame Ganador, Graphics g) { 
        
        // Dibuja la linea del competidor Inferior
        Graphics2D g2d = (Graphics2D) g; 
        int x1 = two.getX() + two.getWidth();
        int y1 = two.getY() + two.getHeight()/2;
        int x2 = two.getX() + two.getWidth()+100;
        int y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        
        // Dibuja la linea del competidor Inferior

        x1 = one.getX() + one.getWidth();
        y1 = one.getY() + one.getHeight()/2;
        x2 = one.getX() + one.getWidth()+100;
        y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        
        // Dibuja linea vertical entre competidor superior e inferior
        x1 = one.getX() + one.getWidth()+100;
        y1 = one.getY() + one.getHeight() / 2;
        x2 = two.getX() + two.getWidth()+100;
        y2 = two.getY() + two.getHeight() / 2;
        g2d.drawLine(x1, y1, x2, y2);        
        
        
    // Linea horizontal abajo   
        x1 = two.getX() + two.getWidth()+100;
        y1 = ((one.getY() + one.getHeight()/2))+((two.getY() + two.getHeight()/2)-(one.getY() + one.getHeight()/2))/2;
        x2 = two.getX() + two.getWidth()+200;
        y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        Ganador = new MyFrame(Ganador.ConseguirNombre(), Ganador.ConseguirEtiqueta(),x2, y1-(70/2));
        return Ganador;
     //  Este bloque es necesario este junto para que los valores retornados sean congruentes   
   }   
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.lightGray);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.setColor(Color.blue);
        g2d.setStroke(s);
        
        // ***************** Primeras conexiones del nodo 1
       lineaHorizontal(CompeDibujo.get(0), g);
       lineaHorizontal (CompeDibujo.get(1), g);
       lineaVertical (CompeDibujo.get(0), CompeDibujo.get(1),g );
        
        // ***************** Segundo conexiones del nodo 2
        //lineaHorizontal(one1, g);
        //lineaHorizontal(two2, g);
        //lineaVertical (one1, two2,g );
        
        // ***************Linea Ganador ***************
        //MyFrame Ganador =lineaHorizontalGanador (one, two, two, g);
        //this.add(Ganador);
          //  MyFrame Ganador2 =lineaHorizontalGanador (one1, two2, one1, g);
           // this.add(Ganador2);
        
        
        //MyFrame Ganador3 =lineaHorizontalGanador (Ganador, Ganador2, Ganador, g);
        //this.add(Ganador3);
        
    }

    private final class MyFrame extends JInternalFrame {
        public String Nombre;
        public String Etiqueta;
        public char Ganado =0;
        
        MyFrame(String name, String Etiqueta, int x, int y) {
            super(name);
            this.Nombre = name;
            this.Etiqueta = Etiqueta;

            // Tamaño de letra
            float tamano = 15;
            // ***************************
            this.setSize(220, 70);
            this.setLocation(x, y);
            //        CONFIGURACION de tamaño de leta de mensajes
            JLabel Mensaje = new JLabel(Etiqueta);
            Font font = Mensaje.getFont();
            font = font.deriveFont(tamano);
            Mensaje.setFont(font);
            this.add (Mensaje);
            // **********************************************************
            this.setVisible(true);
            this.addComponentListener(new ComponentAdapter() {

            
            @Override
            public void componentMoved(ComponentEvent e) {
                  Torneo.this.repaint();
               }
            });
        }
        String ConseguirNombre() {
            return Nombre;
        }
        String ConseguirEtiqueta(){
            return Etiqueta;
        }
    }

    private void display() {
        JFrame f = new JFrame("Ejemplo de Gráficas");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        f.add(this);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Torneo().display();
            }
            
        });
    }
}