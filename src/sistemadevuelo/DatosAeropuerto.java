
package sistemadevuelo;


public class DatosAeropuerto {
    int IdAeropuerto , Telefono , HorarioVuelo,nPuerta;
    String Nombre , Direccion , CorreoElectronico;

    public DatosAeropuerto(int IdAeropuerto, int Telefono, int HorarioVuelo, String Nombre, String Direccion, String CorreoElectronico, int nPuerta) {
        this.IdAeropuerto = IdAeropuerto;
        this.Telefono = Telefono;
        this.HorarioVuelo = HorarioVuelo;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.CorreoElectronico = CorreoElectronico;
        this.nPuerta = nPuerta;
    }

   public void mostrarDatos(){
       System.out.println("// ID:"+IdAeropuerto);
       System.out.println("// BIENVENIDO A: "+Nombre+" //");
       System.out.println("ESTAMOS EN: "+Direccion);
       System.out.println("e-Mail: "+CorreoElectronico);
       System.out.println("> CONTACTANOS: "+Telefono);
       System.out.println("CONTAMOS CON: "+nPuerta+" PUERTAS");
       System.out.println("DISPONIBLE LAS"+HorarioVuelo+" horas :D");
       
       
   }
    
    
}
