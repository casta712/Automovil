
package com.casta712.autos.persistencia;

import com.casta712.autos.logica.Automovil;

public class ControllerPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
            autoJpa.create(auto);
   
    }
    
}
