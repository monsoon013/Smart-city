public class SemaforoInteligente extends DispositivoloT implements Mantenible, ControlableRemotamente{

    private String estadoActual;

    public SemaforoInteligente(String estadoActual, String id, String ubicacion, boolean encendido){
        this.estadoActual = estadoActual;
        super(id, ubicacion, encendido);
    }

    public double calcularCosteMantenimiento() {
        return 0;
    }

    public void realizarMantenimiento(){

    };

    public boolean conectarWifi() {
        return false;
    }


    public void reiniciarDispositivo() {

    }

    public void procesarDatos(){}
}
