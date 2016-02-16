/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.dmartínez.t02;

/**
 *
 * @author DanielAlexandro
 */
public class Productos {
    //Atributos
    private String caducidad, nombre;
    private int lote;
    private float precio;
    
    /** Methods
     * Constructor
     * @param nombre
     * @param caducidad
     * @param lote
     * @param precio
     */
    public Productos(String nombre, String caducidad, int lote, float precio){
        this.nombre = nombre;
        this.caducidad = caducidad;
        this.lote = lote;
        this.precio = precio;
    }
    
    /**
     * Metodo que retorna la caducidad
     * @return caducidad como String
     */
    public String getCaducidad(){
        return this.caducidad;
    }
    
    /**
     * Metodo que retorna el numero de lote
     * @return lote como int
     */
    public int getLote(){
        return this.lote;
    }
    
    /**
     * Metodo que retorna el precio del producto
     * @return precio como float
     */
    public float getPrecio(){
        return this.precio;
    }
    
    /**
     * Metodo que retorna el nombre del producto
     * @return Nombre como String
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Este metodo cambia el precio del producto
     * @param newPrecio sera el nuevo precio como float
     */
    public void cambiaPrecio(float newPrecio){
        this.precio = newPrecio;
    }
}
