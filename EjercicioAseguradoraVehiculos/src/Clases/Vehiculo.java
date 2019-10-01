/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author colo-
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int añoVehiculo;
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(int añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
    }
    
    public void solicitarYCapturarDatosVehiculo() {
        System.out.println("Ingreso de datos del vehiculo");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese marca del vehiculo : ");
        System.out.println("");
        marca=scanner.nextLine();
        
        
        
        System.out.print("Ingrese modelo del vehiculo : ");
        System.out.println("");
        modelo=scanner.nextLine();
        
        
        System.out.print("Ingrese año del vehiculo : ");
        System.out.println("");
        añoVehiculo=scanner.nextInt();
        
        
        
  
        
    }
    
}
