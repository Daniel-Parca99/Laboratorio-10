
package interfaces;

import Pantallas.ListaDeNavegadores;

/**
 * @author Daniel
 */
public class InterfacesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaDeNavegadores lista = new ListaDeNavegadores();
        lista.setLocationRelativeTo(null);
        lista.setVisible(true);
    }
    
}
