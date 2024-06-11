
package com.casta712.autos.logica;

import com.casta712.autos.persistencia.ControllerPersistencia;

public class Controlador {
    
    ControllerPersistencia controlPersis = new ControllerPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int canPuertas) {

            Automovil auto = new Automovil();
            auto.setModelo(modelo);
            auto.setMarca(marca);
            auto.setMotor(motor);
            auto.setColor(color);
            auto.setPatente(patente);
            auto.setCanPuertas(canPuertas);
            
           controlPersis.agregarAutomovil(auto);
    }


    }
    

