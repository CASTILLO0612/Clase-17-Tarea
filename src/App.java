//ANGEL GABRIEL FLORES CASTILLO, 2024-1357U
import java.util.Scanner;
public class App {

    //Variables Globales
   public static int dimensionarreglo=0;
   public static Scanner leer=new Scanner (System.in);
   public static boolean cont = true;
    public static void main(String[] args) throws Exception {   
            boolean cont=true;

            //Condiciones
            do { 
                try{
                System.out.println("Digite la dimensión de su arreglo en el rango (2-16):");
                dimensionarreglo= leer.nextInt();
                if (dimensionarreglo>=2 && dimensionarreglo<=16 ) {
                System.out.println("Su arreglo es:");
                cont=false;
                } else {
                    System.out.println("Rango no válido");
                }
                } catch (Exception e) {
                    System.out.println(e);   
                    System.out.println("Opcion inválida, no puede colocar letras");
                    leer.nextLine();
                }
            } while (cont); 

            //Llamado de los metodos
            int array []= llenararreglo();
            System.out.println("Mostrar Arreglo:");
            Mostrar(array);
            System.out.println("Arreglo Inverso:");
            inverso(array);
            }

            //Llenando arreglo y atrapando excepciones
            public static int [] llenararreglo(){
            int [] arreglo = new int[dimensionarreglo];
            do {
                    try{
                        for (int i = 0; i < arreglo.length; i++) {
                         arreglo[i]=leer.nextInt();  
                        } 
                        cont=false;
                         }  catch (Exception e){
                        System.out.println(e);
                        System.out.println("Digite su arreglo nuevamente, solo se permiten introducir números");
                        leer.nextLine(); 
                         }
            } while (cont);
            return arreglo;
        }
            //Metodo para mostrar arreglo
            public static void Mostrar (int[]dimensionarreglo){
            for (int i : dimensionarreglo) {
            System.out.println(i);  
             }
        }   
            //Arreglo Inverso
            public static void inverso(int[]arregloinverso){
            for (int i = arregloinverso.length-1; i >=0; i--) {
                System.out.println(arregloinverso[i]);           
            }
        } 
 }      