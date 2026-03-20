public class SemaforoInteligente extends DispositivoloT implements Mantenible, ControlableRemotamente{

    private String estadoActual;

    public SemaforoInteligente(String estadoActual, String id, String ubicacion){
        this.estadoActual = estadoActual;
        super(id, ubicacion);
    }

    public double calcularCosteMantenimiento() {
        return 150.0;
    }

    public void realizarMantenimiento(){
        System.out.println("Mantenimiento físico realizado a semáforo [ " + getId() + " ]. Coste: 150€");
    };

    public boolean conectarWifi() {
        System.out.println("Semáforo [ " + getId() + " ] conectado a la WiFi.");
        return true;
    }

    public void reiniciarDispositivo() {
        System.out.println("Reiniciando dispositivo [ " + getId() +" ] ...");
    }

    public void procesarDatos(){
        System.out.println("Semáforo [ " + getId() + "] en " + getUbicacion() + " - Estado: " + estadoActual);
    }
}
