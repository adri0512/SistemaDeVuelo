
package sistemadevuelo;

import javax.swing.*;

public class UsuarioNoRegistrado{
     int nPasaporte , Identificacion , Telefono , Edad;
    String Nombre , TipoPasaporte , CorreoElectronico , Nacionalidad ;

    public void formularioRegistro() { //PARSEOS PARA REGISTRARSE EN CASO DE INT
    
    int pasaporte=JOptionPane.showConfirmDialog(null, "¿Cuentas con pasaporte?");
    if(pasaporte==0){
        nPasaporte=Integer.parseInt(JOptionPane.showInputDialog("NUMERO DE PASAPORTE:"));
    }
    else if(pasaporte==1){
        JOptionPane.showMessageDialog(null, "Empezará tu registro","REGISTRO",2);
        String opcion=JOptionPane.showInputDialog(null, "TIPO DE IDENTIFICACION"+
                "\n1. INE"+
                "\n2. CURP"+
                "\n3. CARTILLA MILITAR"+
                "\n4. ACTA DE NACIMIENTO","REGISTRO",2);
       
    }
    else{
        JOptionPane.showMessageDialog(null, "SERVICIO CANCELADO","CANCELADO",0);
    }
    
    
    }
}
