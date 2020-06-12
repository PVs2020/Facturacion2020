
package proyecto.programacion02.models;

import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import proyecto.programacion02.controllers.Conexion;

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
//        Principal.theme();

//        Login logo = new Login();
//       logo.setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaSkin");
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");

        Principal prin = new Principal();
        prin.setVisible(true);

//          Login logo =  new Login();
//          logo.setVisible(true);
        Conexion.setServidor(1);

        
    }
    
}
