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
public class CongeladosPorAire extends ProductosCongelados {
    //Atributos
    protected String tipoCongelacion;
    
    /**
     * 
     * @param nombre
     * @param caducidad
     * @param lote
     * @param precio
     * @param tempRecomendada
     * @param tipoCongelacion
     */
    public CongeladosPorAire(String nombre, String caducidad, int lote, float precio, float tempRecomendada, String tipoCongelacion) {
        super(nombre, caducidad, lote, precio, tempRecomendada);
        this.tipoCongelacion = tipoCongelacion;
    }
    
    /**
     * 
     * @return el tipo de congelacion del producto
     */
    public String getTipoCongelacion() {
        return this.tipoCongelacion;
    }
}
