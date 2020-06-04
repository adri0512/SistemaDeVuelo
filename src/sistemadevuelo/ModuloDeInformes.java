
package sistemadevuelo;


public class ModuloDeInformes extends PersonalAdministrativo {
    int IdInformes , Tarifas , Presupuesto , HojaDeViaje;
    String NumeroFacturas;

    public ModuloDeInformes(String NombreArea, String Encargado, int IdInformes, int Tarifas, int Presupuesto, String NumeroFacturas, int HoraDeViaje) {
        super(NombreArea, Encargado);
        this.IdInformes=IdInformes;
        this.Tarifas=Tarifas;
        this.Presupuesto=Presupuesto;
        this.NumeroFacturas=NumeroFacturas; 
        this.HojaDeViaje=HojaDeViaje;
    }

   
    
    @Override
    public void areas() {
        System.out.println("|| AREA: "+NombreArea+" ||");
        System.out.println("ENCARGADO: "+Encargado);
    }
    
    public void mostrarInformes(){
        System.out.println("Modulo Informes");
    }
        
    }

