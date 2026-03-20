import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int op = 0;
        ArrayList<DispositivoloT> redes = new ArrayList<DispositivoloT>();
        DispositivoloT disp1 = new SemaforoInteligente("Rojo", "SI_223005", "Norte", true);
        DispositivoloT disp2 = new PanelInformativo("")

        while(op < 6){
            System.out.println("###BIENVENIDX A SMART CITY###");
            System.out.println("1.Añadir un nuevo dispositivo" +
                               "\n2.Mostrar estado de la red" +
                               "\n3.Lanzar mantenimiento global" +
                               "\n4.Usando el operador instanceof" +
                               "\n5.Reinicio remoto de emergencia" +
                               "\n6.Salir");
            System.out.println("Elige una opción: ");
            op = scan.nextInt();
            scan.nextLine(); //limpieza diaria del buffer
            switch(op){
                case 1: {
                    System.out.println("Indica el tipo de dispositivo a añadir: ");
                    String newDisp = scan.nextLine();

                }
            }

        }
    }
}