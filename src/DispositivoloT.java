import javax.print.DocFlavor;

public abstract class DispositivoloT {
    private String id;
    private String ubicacion;
    private boolean encendido;

    public DispositivoloT(String id, String ubicacion, boolean encendido){
        this.id = id;
        this.ubicacion = ubicacion;
        this.encendido = encendido;
    }

    public String getId(){return id;}
    public String getUbicacion(){return ubicacion;}
    public boolean getEncendido(){return false;}

    public void setId(String id){this.id = id;}
    public void setUbicacion(String ubicacion){this.ubicacion = ubicacion;}
    public void setEncendido(boolean encendido){this.encendido = encendido;}

    public void encender(){encendido = true;}
    public void apagar(){encendido = false;}

    public abstract void procesarDatos();
}
