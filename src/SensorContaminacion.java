public class SensorContaminacion extends DispositivoloT implements Mantenible{

    private double nivelCO2;

    public SensorContaminacion(String id, String ubicacion, boolean encendido, double nivelCO2){
        this.nivelCO2 = nivelCO2;
        super(id, ubicacion, encendido);
    }

    public double calcularCosteMantenimiento() {
        return 0;
    }

    public void procesarDatos() {

    }

    public void realizarMantenimiento() {

    }
}
