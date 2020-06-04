
package sistemadevuelo;

import java.util.Scanner;


public class SistemaDeVuelo {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opc;
        
        DatosAeropuerto daA=new DatosAeropuerto(123, 41410002, 24, "Aerolínea >CHECK<", "Ixtapaluca Centro", "aerolineacheck@gmail.com", 7);
        ModuloDeInformes mod=new ModuloDeInformes("Informes de Viaje", "Jesus Belmont", 1414, 3000, 0, "AEHDFL01", 4);
        daA.mostrarDatos();
        
        System.out.println("¿Qué desea?, *Digite el número de su opción*");
        System.out.println("1)Reserva de Vuelo ");
        System.out.println("2)Informes de Vuelo");
        opc=teclado.nextInt();
        switch(opc){
            case 1: 
            break;
            case 2: mod.mostrarInformes();
            break;
            default:
                
        }
        
        
        
    }
   
}
