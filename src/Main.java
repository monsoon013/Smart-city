import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int op = 0;
        ArrayList<DispositivoloT> redes = new ArrayList<DispositivoloT>();
        DispositivoloT disp1 = new SemaforoInteligente("Rojo", "SI_223005", "Norte");
        DispositivoloT disp2 = new PanelInformativo("Tráfico denso en la AP-9", "PI_0012", "Sur");
        DispositivoloT disp3 = new SensorContaminacion("SC_33481", "Norte", 15.34);

        while(op < 5){
            System.out.println("###BIENVENIDX A SMART CITY###");
            System.out.println("1.Añadir un nuevo dispositivo" +
                               "\n2.Mostrar estado de la red" +
                               "\n3.Lanzar mantenimiento global" +
                               "\n4.Reinicio remoto de emergencia" +
                               "\n5.Salir");
            System.out.println("Elige una opción: ");
            op = scan.nextInt();
            scan.nextLine(); //limpieza usual del buffer
            switch(op){
                case 1: {
                    System.out.println("Indica el tipo de dispositivo a añadir: ");
                    String newDisp = scan.nextLine();
                    System.out.println("Indica el id: ");
                    String newId = scan.nextLine();
                    System.out.println("Escribe la ubicación: ");
                    String newUb = scan.nextLine();
                    if(newDisp.equals("semaforo")){
                        System.out.println("Introduce el estado actual: ");
                        String newEstado = scan.nextLine();
                        redes.add(new SemaforoInteligente(newEstado, newId, newUb));
                    }else if (newDisp.equals("panel")){
                        System.out.println("Introduce el Texto a mostrar: ");
                        String newTexto = scan.nextLine();
                        redes.add(new PanelInformativo(newTexto, newId, newUb));
                    }else if(newDisp.equals("sensor")){
                        System.out.println("Introduce el nivel de CO2: ");
                        double newCO2 = scan.nextDouble();
                        redes.add(new SensorContaminacion(newId, newUb, newCO2));
                    } else {
                        System.out.println("No existe ese dispositivo");
                        return;
                    }
                    System.out.println("Dispositivo " + newId +" añadido con éxito");
                    break;
                }
                case 2: {
                    System.out.println("\n###ESTADO DE LA RED###");
                    if(redes.isEmpty()) {System.out.println("La red está vacía");}
                    for(DispositivoloT d : redes){
                        d.procesarDatos();
                    }
                    break;
                }
                case 3: {
                    System.out.println("\n###MANTENIMIENTO GLOBAL###");
                    double total = 0;
                    for(DispositivoloT d : redes){
                        if(d instanceof Mantenible){
                            Mantenible m = (Mantenible) d;
                            m.realizarMantenimiento();
                            total += m.calcularCosteMantenimiento();
                        }
                    }
                    System.out.println("Factura total: " + total + "€");
                    break;
                }
                case 4: {
                    System.out.println("\n###REINICIO REMOTO###");
                    for(DispositivoloT d : redes){
                        if(d instanceof ControlableRemotamente){
                            ControlableRemotamente c = (ControlableRemotamente) d;
                            if(c.conectarWifi()){
                                c.reiniciarDispositivo();
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Saliendo del programa ...");
                    break;
                }
                default: {
                    System.out.println("Opción no válida");
            }

        }

    }
    scan.close();
}
}