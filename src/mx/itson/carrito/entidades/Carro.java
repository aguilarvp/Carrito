/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.TipoDeCarroceria;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author alumnog
 */
public class Carro {

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the propietario
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the tipoDeCarroceria
     */
    public TipoDeCarroceria getTipoDeCarroceria() {
        return tipoDeCarroceria;
    }

    /**
     * @param tipoDeCarroceria the tipoDeCarroceria to set
     */
    public void setTipoDeCarroceria(TipoDeCarroceria tipoDeCarroceria) {
        this.tipoDeCarroceria = tipoDeCarroceria;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    private String color;
    private int year;
    private String marca;
    private double kilometraje;
    private TipoMotor tipoMotor;
    private TipoDeCarroceria tipoDeCarroceria;
    private Propietario propietario;
    private Vendedor vendedor;
    
 /***
  * calcula el tiempo que tarda el carro en recorrer una distancia.
  * @param distancia Distancia que recorrerá el carro 
     * @param velocidad Velocidad a la que va el carro
  * @return Tiempo en el que llegará el carro
  */
    public double calcularTiempo (double distancia, double velocidad){
        this.kilometraje += distancia;
     double tiempo = distancia / velocidad;
     return tiempo;
    }
}
