/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.enums.TipoDeCarroceria;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la distancia recorrida: ");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingresa la velociadad a la que viaja: ");
        double velocidad = sc.nextDouble();
        
        //Generamos una instancia de la clase carro 
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("rojo");
        bmw.setYear(2022);
        bmw.setKilometraje(10000);
        bmw.setTipoMotor(TipoMotor.HÍBRIDO);
        bmw.setTipoDeCarroceria(TipoDeCarroceria.FAMILIAR);
        
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
        System.out.println("El tiempo que le tomara al carro " + bmw.getMarca() +
            " de color " + bmw.getColor()+
            " y cuyo modelo es del "+ bmw.getYear() +
            " sera " + tiempo + 
            " y ahora su kilometraje es de " + bmw.getKilometraje());
        
   
    }
}
