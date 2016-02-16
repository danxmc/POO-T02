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
public class ProductosRefrigerados extends Productos {
    //Atributos
    protected float tempRecomendada;
    
    /** Methods
     * Constructor
     * @param nombre
     * @param caducidad
     * @param lote
     * @param precio
     * @param tempRecomendada 
     */
    
    public ProductosRefrigerados(String nombre, String caducidad, int lote, float precio, float tempRecomendada) {
        super(nombre, caducidad, lote, precio);
        this.tempRecomendada = tempRecomendada;
    }
    
    /**
     * Este metodo regresa la temperatura recomendada de almacenamiento
     * @return tempRecomendada como float
     */
    public float getTempRecomendada(){
        return this.tempRecomendada;
    }
}
