public class SensorContaminacion extends DispositivoloT implements Mantenible{

    private double nivelCO2;

    public SensorContaminacion(String id, String ubicacion, double nivelCO2){
        this.nivelCO2 = nivelCO2;
        super(id, ubicacion);
    }

    public double calcularCosteMantenimiento() {
        return 50.0;
    }

    public void procesarDatos() {
        System.out.println("Sensor [ " + getId() + "] en " + getUbicacion() + " - Nivel CO2: " + nivelCO2 + "ppm" );
    }

    public void realizarMantenimiento(){
        System.out.println("Mantenimiento físico realizado a Sensor [ " + getId() + " ]. Coste: 50€");
    };
}
