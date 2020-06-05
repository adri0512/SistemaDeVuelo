
package sistemadevuelo;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class SistemaDeVuelo {

    public static void main(String[] args) {
       
        DatosAeropuerto daA=new DatosAeropuerto(14253, 41410002, 24, "Aerolínea >CHECK<", "Ixtapaluca Centro", "aerolineacheck@gmail.com", 7);
        UsuarioRegistrado uRegis=new UsuarioRegistrado(); //OBJETO REGISTRADO
        UsuarioNoRegistrado uRegisNo=new UsuarioNoRegistrado(); //NO REGISTRADO
        PersonalAdministrativo personal=new ServicioDeOperaciones("Servicio de Operaciones", "CESAR"); //POLIMORFISMO HACIA SERVICIO DE OPERACIONES
          
        
        daA.mostrarDatos();
        int opcion=JOptionPane.showConfirmDialog(null, "¿Ya estas registrado?"); //CONFIRMACION DE REGISTRO
        if(opcion==0){
            uRegis.muestreInformacion();   
            personal.areas();
        }
        else if(opcion==1){
            uRegisNo.formularioRegistro();    
            personal.areas();
        }
        else{
            JOptionPane.showMessageDialog(null, "SERVICIO CANCELADO","CANCELADO",0);
        }

    }
}
