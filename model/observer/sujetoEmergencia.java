package model.observer;
import model.Emergencia;

public interface sujetoEmergencia {
    void agregarObserver(ObserverEmergencias observerEmergencias);

    void eliminarObserver(ObserverEmergencias observerEmergencias);

    void notificarEmergencias(Emergencia emergencia);

}
