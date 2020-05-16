
package proyecto.programacion02.models;

import proyecto.programacion02.controllers.Conexion;

import proyecto.programacion02.views.Login;
import proyecto.programacion02.views.Principal;

/**
 *
 * @author Reymond
 */
public class ProyectoFinalProgramacion02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal.theme();
        
//        Login logo = new Login();
//        logo.setVisible(true);
        
        Principal prin = new Principal();
        prin.setVisible(true);

//          Login logo =  new Login();
//          logo.setVisible(true);
        Conexion.setServidor(1);

        
    }
    
}
