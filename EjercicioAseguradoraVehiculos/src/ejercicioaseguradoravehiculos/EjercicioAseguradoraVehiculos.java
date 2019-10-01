/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaseguradoravehiculos;

import Clases.Calculo;
import Clases.Vehiculo;

/**
 *
 * @author colo-
 */
public class EjercicioAseguradoraVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculo calculo=new Calculo();
        Vehiculo vehiculo=new Vehiculo();
        
        
        calculo.solicitarValorUfDia();
        calculo.capturarValorUfDia();
        
        
        vehiculo.solicitarYCapturarDatosVehiculo();
        
        calculo.verificarAsegurableONo(vehiculo);
        
        calculo.MostrarValorPagoAsegurado(vehiculo);
        
        
        
        
    }
    

    
    
}
