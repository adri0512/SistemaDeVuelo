
package sistemadevuelo;

import javax.swing.*;


public class DatosAeropuerto {
    int IdAeropuerto , Telefono , HorarioAeropuerto,nPuerta;
    String Nombre , Direccion , CorreoElectronico;

    public DatosAeropuerto(int IdAeropuerto, int Telefono, int HorarioAeropuerto, String Nombre, String Direccion, String CorreoElectronico, int nPuerta) {
        this.IdAeropuerto = IdAeropuerto;
        this.Telefono = Telefono;
        this.HorarioAeropuerto = HorarioAeropuerto;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.CorreoElectronico = CorreoElectronico;
        this.nPuerta = nPuerta;
    }
    public void mostrarDatos(){ //INFORMACIÓN DE NUESTRO AEROPUERTO
          JOptionPane.showMessageDialog(null,"BIENVENIDOS A "+Nombre
                  +"\nID: "+IdAeropuerto
                  +"\nCONTACTANOS: "+Telefono
                  +"\nNOS UBICAMOS: "+Direccion
                  +"\nE-MAIL: "+CorreoElectronico
                  +"\nDISPONIBLES LAS "+HorarioAeropuerto+" HORAS"
                  +"\nNUMERO DE PUERTAS DE VIAJE:"+nPuerta,"BIENVENIDOS",2);
         
    }
    
    

}
