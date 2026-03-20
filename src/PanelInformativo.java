public class PanelInformativo extends DispositivoloT implements ControlableRemotamente {

    private String textoMostrado;

    public PanelInformativo(String textoMostrado, String id, String ubicacion){
        this.textoMostrado = textoMostrado;
        super(id, ubicacion);
    }

    public void reiniciarDispositivo() {
        System.out.println("Reiniciando dispositivo [ " + getId() +" ] ...");
    }

    public boolean conectarWifi() {
        System.out.println("Panel [ " + getId() + " ] conectado a la WiFi.");
        return true;
    }

    public void procesarDatos(){
        System.out.println("Panel [ " + getId() + " ] en " + getUbicacion() + "\nMostrando:  " + textoMostrado);
    }

}
