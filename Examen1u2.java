/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1u2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Examen1u2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Precio de venta de instumentos 
       
         Scanner Lectura = new Scanner(System.in);

         // Pedir al usuario que ingrese el intrumento 
         
        // Pedir al usuario que ingrese los precios de compra
        System.out.println("Ingresa el nombre del instrumento ");
        String instrumento1= Lectura.nextLine();
        System.out.println("Ingresa el nombre del instrumento ");
        String instrumento2= Lectura.nextLine();
        System.out.println("Ingresa el nombre del instrumento ");
        String instrumento3=    Lectura.nextLine();
        
        System.out.println("Ingrese el precio de compra para el instrumento1: ");
        double precioCompra1 = Lectura.nextDouble();
        
      
        System.out.println("Ingrese el precio de compra para el instrumento2: ");
        double precioCompra2 = Lectura.nextDouble();
  
        
        System.out.println("Ingrese el precio de compra para el instrumento3: ");
        double precioCompra3 = Lectura.nextDouble();

        // Precios de venta
        double precioVenta1 = 1250.45;
        double precioVenta2 = 3743.00;
        double precioVenta3 = 2683.78;

        // Calcular el porcentaje de ganancia para cada instrumento
        double ganancia1 = (precioVenta1 - precioCompra1) / precioCompra1 * 100;
        double ganancia2 = (precioVenta2 - precioCompra2) / precioCompra2 * 100;
        double ganancia3 = (precioVenta3 - precioCompra3) / precioCompra3 * 100;

        // Mostrar los resultados
        System.out.println("instrumento1 - Porcentaje de Ganancia: " + ganancia1 + "%");
        System.out.println("instrumento2 - Porcentaje de Ganancia: " + ganancia2 + "%");
        System.out.println("instrumento3 - Porcentaje de Ganancia: " + ganancia3 + "%");

        // Cerrar el scanner
        Lectura.close();
        
        
         
        
    }
    
}
