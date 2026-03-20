public class PanelInformativo extends DispositivoloT implements ControlableRemotamente {

    private String textoMostrado;

    public PanelInformativo(String textoMostrado, String id, String ubicacion, boolean encendido){
        this.textoMostrado = textoMostrado;
        super(id, ubicacion, encendido);
    }

    public void reiniciarDispositivo() {

    }

    public boolean conectarWifi() {
        return false;
    }

    public void procesarDatos(){}

}
