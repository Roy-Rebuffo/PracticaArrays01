package ejercicioarrays01repetido;
import java.util.Scanner;
import java.util.Arrays;

public class EjercicioArrays01Repetido {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int tb[] = new int[10];
        cargarArray(tb);
        visualizarTabla("La visualizacion de la tabla es: ", tb);
        maximo("El maximo de todos es: ", tb);
        minimo(tb);
        media(tb);
        sustituir(tb, dato);
        ordenar(tb);
        ordenarDesc(tb);
        ordenarDesc2(tb);
    }
    
    public static void ordenarDesc2(int[] tb){
        int cambio = -1;
        while(cambio!=0){
            cambio = 0;
            for (int i = 0; i < tb.length - 1; i++) {
                if (tb[i] < tb[i + 1]) {
                    int temp = tb[i];
                    tb[i] = tb[i + 1];
                    tb[i + 1] = temp;
                    cambio++;
                }
            }
        }
        visualizarTabla("Visualizar tabla descendente", tb);
    }
    
    public static void ordenarDesc(int[] tb){
        Arrays.sort(tb);
        System.out.println("La tabla ordenada descendentemente es: \n");
        for (int i = tb.length - 1; i > 0; i--) {
            System.out.print(" " + tb[i]);
        }
        System.out.println("");
    }
    
    public static void ordenar(int[] tb){
        Arrays.sort(tb);
        System.out.println("La tabla ordenada ascendentemete es: " 
                + Arrays.toString(tb));
        System.out.println("");
    }
    
    public static void sustituir(int[] tb, Scanner dato){
        System.out.print("Introduzca el elemento que quieras sustituir");
        int pos = dato.nextInt();
        while (pos < 0 || pos > tb.length - 1) {
            System.out.print("\n\t\tIntroduzca nuevo elemento a sustituir: ");
            pos = dato.nextInt();
        }
        System.out.print("Indique con que otro numero lo quieres sustituir: ");
        int elem = dato.nextInt();
        tb[pos] = elem;
       
        visualizarTabla("Visualizar tabla sustituida",tb);
        System.out.println("");
    }
    
    public static void media(int[] tb){
        int cCont=0;
        double tAcum=0;
        double media=0;
        
        for (int i = 0; i < tb.length; i++) {
            cCont++;
            tAcum += tb[i];
            media = tAcum / cCont;
        }
        System.out.println("La media de todos los elementos es: " + media);
        System.out.println("");
    }
    
    public static void minimo(int[] tb){
        int min = 99;
        int pos = -1;
        for (int i = 0; i < tb.length; i++) {
            if (tb[i] <= min) {
                min = tb[i];
                pos = i + 1;
            }
        }
        System.out.println("El valor maximo es: " + min
                + " y su ultima posicion es: " + pos);
        System.out.println("");
    }
    
    public static void maximo(String mensaje, int[] tb) {
        int max = 0;
        int pos = -1;
        for (int i = 0; i < tb.length; i++) {
            if (tb[i] > max) {
                max = tb[i];
                pos = i + 1;
            }
        }
        System.out.println("El valor maximo es: " + max
                + " y su primera posicion es: " + pos);
        System.out.println("");
    }

    public static void visualizarTabla(String mensaje, int[] tb) {
        System.out.println("\t" + mensaje);
        System.out.println("");
        for (int i = 0; i < tb.length; i++) {
            System.out.print("\t" + tb[i]);
        }
        System.out.println("\n");
    }

    public static void cargarArray(int[] tb) {
        for (int i = 0; i < tb.length; i++) {
            tb[i] = alea(0, 3);
        }
        System.out.println("");
    }

    public static int alea(int li, int ls) {//función (método)
        return (int) ((Math.round(Math.random() * (ls - li)) + li));
    }
}
