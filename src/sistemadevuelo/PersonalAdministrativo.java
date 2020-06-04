
package sistemadevuelo;


public abstract class PersonalAdministrativo {
    String NombreArea , Encargado;

    public PersonalAdministrativo(String NombreArea, String Encargado) {
        this.NombreArea = NombreArea;
        this.Encargado = Encargado;
    }
 public abstract void areas();
}
