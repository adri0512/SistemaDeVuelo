
package sistemadevuelo;

import javax.swing.*;
public class ServicioDeOperaciones extends PersonalAdministrativo {

    public ServicioDeOperaciones(String NombreArea, String Encargado) {
        super(NombreArea, Encargado);
    }

    
    public void InformacionViaje(){
        
    }
    public void Viaje (){
        
    }
    public void FormularioRegistro (){
        
    }
    public void TipoViaje(){
        
    }

    @Override
    public void areas() {
        JOptionPane.showMessageDialog(null,"SE MOSTRARÁ LA INFORMACIÓN DE TU VUELO","VUELO",2);
    }
}
