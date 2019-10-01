/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;
import Clases.Vehiculo;





/**
 *
 * @author colo-
 */
public class Calculo {
    private int anio= 2019;
    private int resta;
    private int pagoAsegurado;
    private int añoAntiguedad;
    public int valorUfDia;
    
   
       Vehiculo vehiculo =new Vehiculo();
    public int getValorUfDia() {
        return valorUfDia;
    }

    public void setValorUfDia(int valorUfDia) {
        this.valorUfDia = valorUfDia;
    }
    
    
    
    
    public int getAñoAntiguedad() {
        return añoAntiguedad;
    }

    public void setAñoAntiguedad(int añoAntiguedad) {
        this.añoAntiguedad = añoAntiguedad;
    }

    public int getPagoAsegurado() {
        return pagoAsegurado;
    }

    public void setPagoAsegurado(int pagoAsegurado) {
        this.pagoAsegurado = pagoAsegurado;
    }
    
    public static void solicitarValorUfDia() {
        System.out.print("Ingrese el valor de la UF de hoy: ");
        System.out.println("");
    }

    public  void capturarValorUfDia() {
        Scanner scanner=new Scanner(System.in);
         valorUfDia=scanner.nextInt();   
    } 
    public void verificarAsegurableONo(Vehiculo vehiculo) {
        int añoVehiculo=vehiculo.getAñoVehiculo();
        resta=anio-añoVehiculo;
        if(resta==0){
            pagoAsegurado=(int)(valorUfDia*0.1);
            
        }else if(resta<=10){
            
            this.pagoAsegurado=(int) (valorUfDia*(0.1*resta));
            
        }else{
            System.out.println("el auto no esta asegurado");
            System.out.println("");
        }
        
    }
    
    public void MostrarValorPagoAsegurado(Vehiculo vehiculo) {
        System.out.println("el valor a pagar por concepto de seguro del vehiculo marca "+vehiculo.getMarca()+" modelo "+vehiculo.getModelo()+" del año "+vehiculo.getAñoVehiculo()+" es : "+pagoAsegurado+"$");

    }

    

    
    

   

   
    

    
}
