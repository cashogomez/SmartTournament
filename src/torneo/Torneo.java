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
import static java.lang.Math.log;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


/** @see http://stackoverflow.com/questions/3951383 */
public class Torneo extends JDesktopPane {

    private static final Stroke s = new BasicStroke(4.0f);
    ArrayList<Competidor> lista = new ArrayList<>();
    ArrayList<MyFrame> CompeDibujo = new ArrayList<>();
    ArrayList<MyFrame> Ordenados = new ArrayList<>();
    ArrayList<Integer> distribuir = new ArrayList<>();
    private int distancia = 20; // Posicion inicial respecto al borde superios
    final private int ancho =100; // Ancho de los nombre
    final private int x0=450; // posicion inicial respecto del borde izquierdo
    final private int anchoMyFrame = 220;  // Ancho de los frames del competidor
    final private int altoMyFrame = 70;  // Ancho de los frames del competidor    
    

    public Torneo() {
        this.setPreferredSize(new Dimension(3200, 5200));
        lista.add(new Competidor("Andres", "Perez", "Hernández", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Ana Karen", "Rodriguez", "Ramírez", "Juan Luis Vives", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Diana Karen", "Xolalpa", "Alducin", "Honbu Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Maria José", "Ramos", "Portillo", "Mushin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Emilia", "Huerta", "de la Cruz", "Seishin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Saúl", "Tomé", "Vázquez", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Jaqueline", "Aquino", "Hernández", "Dojo del sur", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Maya Gabriel", "Rodríguez", "Cayetano", "Kasoku Fenix", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Carlos", "Gómez", "Ligonio", "Juan Luis Vives", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Yael Martín", "Enriquez", "López", "Halcones", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Fanny Michelle", "Roldan", "Corona", "Sansei Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Hector Hugo", "Condado", "Serrano", "Mushin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Evelyn", "Rodríguez", "Ramírez", "Seishin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Norma", "Hernández", "Montiel", "Honbu Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Estela", "Xolalpa", "Alducin", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
        lista.add(new Competidor("Sandra", "Franco", "Velazquez", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Marco Antonio", "Rosas", "Crisanto", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Pedro", "Infante", "Crisanto", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Jorge", "Negrete", "Crisanto", "Desho Oro", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Camila", "Sodi", "Hernandez", "Desho Oro", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Adelita", "Sefue", "ConOtro", "Desho Revolucion", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Andrea", "Legarreta", "Perez", "Desho Televisa", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Enrique", "Peña", "Perez", "Desho Gob", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Roberto", "Cantu", "Perez", "Desho UPAEP", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Andrea", "Legarreta", "Perez", "Desho Televisa", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Andrea", "Legarreta", "Perez", "Desho Televisa", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Hector Hugo", "Condado", "Serrano", "Mushin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Evelyn", "Rodríguez", "Ramírez", "Seishin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Norma", "Hernández", "Montiel", "Honbu Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Estela", "Xolalpa", "Alducin", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Sandra", "Franco", "Velazquez", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Marco Antonio", "Rosas", "Crisanto", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Marco Antonio", "Rosas", "Crisanto", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Hector Hugo", "Condado", "Serrano", "Mushin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Evelyn", "Rodríguez", "Ramírez", "Seishin Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Norma", "Hernández", "Montiel", "Honbu Dojo", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Estela", "Xolalpa", "Alducin", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Sandra", "Franco", "Velazquez", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Marco Antonio", "Rosas", "Crisanto", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Marco Antonio", "Rosas", "Crisanto", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//         lista.add(new Competidor("Estela", "Xolalpa", "Alducin", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Sandra", "Franco", "Velazquez", "Densho Juku Shito Kai", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Marco Antonio", "Rosas", "Crisanto", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));
//        lista.add(new Competidor("Marco Antonio", "Rosas", "Crisanto", "ISKA", "9 kyu", "Infantil", "Mixto","Kata", "Individual", 8 ));       
        
        int conta=0;
        for (Iterator<Competidor> it = lista.iterator(); it.hasNext();) {
            Competidor cpt1 = it.next();
            CompeDibujo.add(new MyFrame(cpt1.conseguirDojo(), cpt1.conseguirNombre()+" "+cpt1.conseguirApellidoPaterno()+" "+cpt1.ApellidoMaterno,x0, distancia));
            this.add(CompeDibujo.get(conta));
            //System.out.println(conta);
            distancia = distancia+ancho;
            conta++;
        }
        Ordenados = ordenar(CompeDibujo);
    }
    private Map<String,Integer> cuenta () {
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<CompeDibujo.size();i++){            
            Integer count = map.get(CompeDibujo.get(i).ConseguirNombre());       
            map.put(CompeDibujo.get(i).ConseguirNombre(), count==null?1:count+1);   //auto boxing and count
        }
        return map;
        //System.out.println(map);
    }
    private ArrayList<Integer> MalasBuenas (int tamano, int malas, int buenas ) {
        ArrayList<Integer> temporal =  new ArrayList<>();
        ArrayList<Integer> arr =  new ArrayList<>();
        int limite =0;
        int iteracion=1;
        int k=0;
        if (malas==0 && buenas==0) {
            for (int xx=0; xx<tamano; xx++) {
                temporal.add(1);  // El valor de 1 indica un pasabuenas
            }
        }
        else {
            if (malas == -1) {
                for (int xx=0; xx<buenas; xx++) {
                    temporal.add(1);  // El valor de 1 indica un pasabuenas
                    arr.add(xx);
                }
                limite = temporal.size();
                iteracion=0;
                while (limite < tamano){
                    k=0;
                    for(int i=0;i<limite;i++){
                        if(temporal.get(i)==1){
                            arr.set(k,i);
                            k++;
                        }
                    }
                    //System.out.println(" limite " + limite+ " index "+arr.get(iteracion));
                    if ((tamano+buenas)<22) {
                       temporal.add(arr.get(iteracion), 2); 
                    }
                    else {
                        int a=1;
                        if ((tamano+buenas)%2==1) {
                                    a=1;
                                }
                                else {
                                    a=0;
                                }
                        if (iteracion%2==0) {
                            temporal.add(arr.get(iteracion), 2); 
                        }
                        else {
                            temporal.add(arr.get(buenas-iteracion-a), 2);
                        }
                    }
//                    
                    limite = temporal.size();
                    iteracion++;
                    if (iteracion==buenas) {
                        iteracion=0;
                    }

                }
            }
            else {
                if (buenas==-1) {
                    for (int xx=0; xx<malas; xx++) {
                        temporal.add(2);  // El valor de 1 indica un pasabuenas
                        arr.add(xx);
                    }
                    limite = temporal.size();
                    iteracion=0;
                    while (limite < tamano){
                        k=0;
                        for(int i=0;i<limite;i++){
                            if(temporal.get(i)==2){
                                arr.set(k,i);
                                k++;
                            }
                        }
                        if ((tamano+malas)<22) {
                            temporal.add(arr.get(iteracion), 1);
                        }
                        else {
                                int a=1;
                                if ((tamano+malas)%2==0) {
                                    a=0;
                                }
                                else {
                                    a=1;
                                }
                            if (iteracion%2==0) {
                                temporal.add(arr.get(iteracion), 1);
                            }
                            else {
                                temporal.add(arr.get(malas-iteracion-a), 1);
                            }
                        }
                    //System.out.println(" limite " + limite+ " index "+arr.get(iteracion));

                        limite = temporal.size();
                        iteracion++;
                        if (iteracion==malas) {
                            iteracion=0;
                        }
                    }               
                }
            }
        }
        return temporal;
    }
    private void lineaVertical (MyFrame one, MyFrame two,Graphics g ) {

        // Linea vertical ********************************************
        
        Graphics2D g2d = (Graphics2D) g;
        int x1 = one.getX() + one.getWidth()+ancho;
        int y1 = one.getY() + one.getHeight() / 2;
        int x2 = two.getX() + two.getWidth()+ancho;
        int y2 = two.getY() + two.getHeight() / 2;
        g2d.drawLine(x1, y1, x2, y2);        
    }
    
   private void lineaHorizontal (MyFrame two, Graphics g) { 
    // Linea horizontal abajo
        Graphics2D g2d = (Graphics2D) g;        
        int x1 = two.getX() + two.getWidth();
        int y1 = two.getY() + two.getHeight()/2;
        int x2 = two.getX() + two.getWidth()+ancho;
        int y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
   }
    private MyFrame lineaHorizontalGanador (MyFrame one, MyFrame two, MyFrame Ganador, Graphics g) { 
        
        // Dibuja la linea del competidor Inferior
        Graphics2D g2d = (Graphics2D) g; 
        int x1 = two.getX() + two.getWidth();
        int y1 = two.getY() + two.getHeight()/2;
        int x2 = two.getX() + two.getWidth()+ancho;
        int y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        
        // Dibuja la linea del competidor Inferior

        x1 = one.getX() + one.getWidth();
        y1 = one.getY() + one.getHeight()/2;
        x2 = one.getX() + one.getWidth()+ancho;
        y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        
        // Dibuja linea vertical entre competidor superior e inferior
        x1 = one.getX() + one.getWidth()+ancho;
        y1 = one.getY() + one.getHeight() / 2;
        x2 = two.getX() + two.getWidth()+ancho;
        y2 = two.getY() + two.getHeight() / 2;
        g2d.drawLine(x1, y1, x2, y2);        
        
        
    // Linea horizontal abajo   
        x1 = two.getX() + two.getWidth()+ancho;
        y1 = ((one.getY() + one.getHeight()/2))+((two.getY() + two.getHeight()/2)-(one.getY() + one.getHeight()/2))/2;
        x2 = two.getX() + two.getWidth()+2*ancho;
        y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        if (Ganador.ConseguirEtiqueta().isEmpty()) {
           Ganador = new MyFrame("", "",x2, y1-(altoMyFrame/2)); 
        }
        else {
            Ganador = new MyFrame(Ganador.ConseguirNombre(), Ganador.ConseguirEtiqueta(),x2, y1-(altoMyFrame/2));
        }
        
        return Ganador;
     //  Este bloque es necesario este junto para que los valores retornados sean congruentes   
   }   
    private void conectar(MyFrame one, MyFrame two, Graphics g) {
        lineaHorizontal(one, g);
        lineaHorizontal(two, g);
        lineaVertical(one, two, g);
    }
    public final ArrayList<MyFrame> ordenar (ArrayList<MyFrame> CompeDibujo) {
        int tamano = CompeDibujo.size();
        int malas = (int ) (log(tamano)/log(2));
        int referencia=(int) pow(2.0, malas);
        int buenas =-1;
        int pasoMalas=-1;
        malas = tamano - referencia;
        if (malas ==0) {
            // ***************** En este caso no es necesario mover los competidores no hay bypass
            pasoMalas = 0;
            buenas = 0;
        }
        else {
            // cuando los bypass de malas son menor a la mitad de la referencia y deben distribuirse 
            if (malas<=referencia/2){
                pasoMalas = malas; 
                buenas = -1;
            }
            else {
                // CUando los bypass de malas son mayores a la mitad en ese caso se toman los bypass de buenas y se distribuyen
                buenas = referencia-malas;
                pasoMalas = -1;
            }

        }
        System.out.println("Participantes "+ tamano+ " bypass " +malas +" pasomalas " +pasoMalas+" pasoBuenas "+buenas);   
        // Sorting
        
        // *************************************************
        // ************************************************** ORDENAMIENTO ******************************
        Collections.sort(CompeDibujo, new CustomComparator());
        ArrayList<MyFrame> movidos = new ArrayList<>();
        Map<String,Integer> mapeo = new HashMap<String, Integer>();
        ArrayList<Integer> arr =  new ArrayList<>();
        String dojo="";
        mapeo = cuenta();  // Cuenta cantos dojos repetidos
        int max = Collections.max(mapeo.values()); 
        //System.out.println("maximo repetido"+ max);
        for (Entry<String, Integer> entry : mapeo.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==max) {
                dojo = entry.getKey();
            }
        }
        //System.out.println(dojo);
        int xx=0; 
        int contador=0;
        while (xx<CompeDibujo.size()) {
            //System.out.println("Fuera: indice "+xx+" "+prueba);
            if (CompeDibujo.get(xx).ConseguirNombre().equals(dojo)) {
                //System.out.println("indice "+xx+" "+prueba);
                movidos.add(CompeDibujo.get(xx));  // El valor de 1 indica un pasabuenas 
                arr.add(contador);
                contador++;
                CompeDibujo.remove(xx);
                xx=0;
            }
            else {
                xx++;
            }
        }
        contador=0;
        //System.out.println("Nuevo tamaño "+CompeDibujo.size());
        int Nmax=0;
        String Ndojo="";
        int tempo=0;
        mapeo = cuenta();
        Nmax = Collections.max(mapeo.values());
        for (Entry<String, Integer> entry : mapeo.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==Nmax) {
                    //System.out.println(entry.getKey());     // Print the key with max value
                Ndojo = entry.getKey();
            }
        }
        int Ncontador=0;
        while (movidos.size()<tamano) {
            if (contador>=(max)) {
                contador=0;
            }
            else {
                if (tamano==3 && max==2) {
                    contador=1;
                }
                if (Ncontador>=Nmax)
                {
                    Ncontador=0;
                    mapeo = cuenta();
                    Nmax = Collections.max(mapeo.values()); 
                    for (Entry<String, Integer> entry : mapeo.entrySet()) {  // Itrate through hashmap
                        if (entry.getValue()==Nmax) {
                            //System.out.println(entry.getKey());     // Print the key with max value
                            Ndojo = entry.getKey();
                        }
                    }
                }
                
            }

            //System.out.println("Nuevo Dojo " + Ndojo+ " contador "+contador+ " Nmax "+Nmax); 
            for (xx=0; xx<CompeDibujo.size(); xx++) {
                if (CompeDibujo.get(xx).ConseguirNombre().equals(Ndojo)) {
                    //if (contador%2==0) {
                        movidos.add(arr.get(contador), CompeDibujo.get(xx));
                    //}
                    //else {
                    //    movidos.add(arr.get(max-contador), CompeDibujo.get(xx));    
                    //}
                    
                    contador++;
                    Ncontador++;
                    CompeDibujo.remove(xx);
                    tempo=0;
                    for (int yy=0; yy<movidos.size(); yy++) {
                        if (movidos.get(yy).ConseguirNombre().equals(dojo)) {
                            arr.set(tempo,yy);
                            tempo++;
                        }
                    }
                }
            }
        }
        CompeDibujo=movidos;
//        long seed = System.nanoTime();
//        Collections.shuffle(CompeDibujo, new Random(seed));
//        for (int x=0; x<CompeDibujo.size(); x++){
//            System.out.println(" Dojo "+CompeDibujo.get(x).ConseguirEtiqueta()+" Nombre "+CompeDibujo.get(x).ConseguirNombre()+"\n");
//        }
        // ***************************************************** FIN DEL ORDENAMIENTO *********************************
        
        int conta=0;
        int bypass=0;
        distancia=20; // ************************ Coloca la posición inicial del dibujo
        distribuir = MalasBuenas (referencia, pasoMalas, buenas ); // ****************************** Se distribuyen los pasamalas o pasabuenas ********
        for (conta=0;conta<referencia; conta++) {
            if (distribuir.get(conta)==1) {
                CompeDibujo.get(bypass).ajustarPosicion(x0, distancia);
                distancia = distancia+ancho;
                bypass++;
                
            }
            else {
                if (distribuir.get(conta)==2) {
                    CompeDibujo.get(bypass).ajustarPosicion(x0-anchoMyFrame-2*ancho, distancia);
                    distancia = distancia+ancho;
                    bypass++;
                    CompeDibujo.get(bypass).ajustarPosicion(x0-anchoMyFrame-2*ancho, distancia);
                    distancia = distancia+ancho;
                    bypass++;
                }
            }       
        }
        return CompeDibujo;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.CYAN);                          //  ************* Color del fondo del dibujo *****************************
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.setColor(Color.blue);                          // ************** Color de las lineas de conexiones **********************
        g2d.setStroke(s);
        MyFrame vacio = new MyFrame("", "", 0,0);
        // ***************** Primeras conexiones del nodo 1
        
        int tamano = distribuir.size(); // Calcula el tamaño de la lista que tuilizaremos para dibujar
        int conta=0;
        for (int x=0; x<tamano; x++){
            if (distribuir.get(x)==1) {
                Ordenados.get(conta).display(); //   ************   Dibuja los competidores ordenados  
                conta++;
            }
            else {
                if (distribuir.get(x)==2) {
                    Ordenados.get(conta).display(); //   ************   Dibuja los competidores ordenados  
                    Ordenados.get(conta+1).display(); //   ************   Dibuja los competidores ordenados  
                    vacio= lineaHorizontalGanador (Ordenados.get(conta),Ordenados.get(conta+1), vacio, g);
                    this.add(vacio);
                    vacio.display();
                    conta=conta+2; 
                }
            } 
        }
        

        //for (Iterator<MyFrame> it = CompeDibujo.iterator(); it.hasNext();) {
            
        //}
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
            this.setSize(anchoMyFrame, altoMyFrame);
            this.setLocation(x, y);
            //        CONFIGURACION de tamaño de leta de mensajes
            JLabel Mensaje = new JLabel(Etiqueta);
            Font font = Mensaje.getFont();
            font = font.deriveFont(tamano);
            Mensaje.setFont(font);
            this.add (Mensaje);
            
        }
        public void display() {
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
        public void ajustarPosicion(int x, int y) {
            this.setLocation(x, y);
        }
    }
    public class CustomComparator implements Comparator<MyFrame> {
    @Override
    public int compare(MyFrame o1, MyFrame o2) {
        String c1 = o1.ConseguirNombre().toUpperCase();
        String c2 = o2.ConseguirNombre().toUpperCase();
        return c1.compareTo(c2);
    }
}

    private void display() {
        Torneo ouch = new Torneo();
        JFrame f = new JFrame("Ejemplo de Gráficas");
        JScrollPane scrollPane = new JScrollPane(ouch);
        scrollPane.setPreferredSize(new Dimension(1024, 768));
        f.add(scrollPane);
        f.pack();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new reloj();   //echa a andar el reloj
                new Torneo().display();
            }
            
        });
    }
}