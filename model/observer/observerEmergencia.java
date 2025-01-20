package model.observer;

import model.Emergencia;

public interface ObserverEmergencia {
    void onNuevasEmergencias(Emergencia emergencia);
}
