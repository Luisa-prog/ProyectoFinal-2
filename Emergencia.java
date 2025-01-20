public class Emergencia {

    private String tipo;
    private String ubicacion;
    private int nivelGravedad;
    private int tiempoRespuesta;
    private boolean atendido;
    private long tiempoInicialatencion;
    private long tiempoFinalatencion;

    public Emergencia (String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta ){
        
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;

    
}

public String getTipo() {
    return tipo;
}

public String getUbicacion() {
    return ubicacion;
}

public int getNivelGravedad() {
    return nivelGravedad;
}

public int getTiempoRespuesta() {
    return tiempoRespuesta;
}

@Override
public String toString() {
    return "Emergencia [tipo=" + tipo + ", ubicacion=" + ubicacion + ", nivelGravedad=" + nivelGravedad
            + ", tiempoRespuesta=" + tiempoRespuesta + "]";
}

}

