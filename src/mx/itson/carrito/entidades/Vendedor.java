/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.TipoDeRefaccion;
import mx.itson.carrito.enums.TipoDeServicio;

/**
 *
 * @author alumnog
 */
public class Vendedor {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @return the tipoDeServicio
     */
    public TipoDeServicio getTipoDeServicio() {
        return tipoDeServicio;
    }

    /**
     * @param tipoDeServicio the tipoDeServicio to set
     */
    public void setTipoDeServicio(TipoDeServicio tipoDeServicio) {
        this.tipoDeServicio = tipoDeServicio;
    }

    /**
     * @return the tipoDeRefraccion
     */
    public TipoDeRefaccion getTipoDeRefraccion() {
        return tipoDeRefraccion;
    }

    /**
     * @param tipoDeRefraccion the tipoDeRefraccion to set
     */
    public void setTipoDeRefraccion(TipoDeRefaccion tipoDeRefraccion) {
        this.tipoDeRefraccion = tipoDeRefraccion;
    }
    
    private String nombre;
    private int costo;
    private TipoDeServicio tipoDeServicio;
    private TipoDeRefaccion tipoDeRefraccion;
    
    
    
}
