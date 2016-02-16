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
public class POODMartínezT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Productos AtunLata = new Productos("Atun", "30 de Febrero, 2018", 25, (float) 16.5);
        System.out.println("Esta es la información del " + AtunLata.getNombre() + ":");
        System.out.println("Caducidad: " + AtunLata.getCaducidad());
        System.out.println("Lote: " + AtunLata.getLote());
        System.out.println("Precio: $" + AtunLata.getPrecio());
        AtunLata.cambiaPrecio((float) 15.5);
        System.out.println("Promocion nuevo precio de: " + AtunLata.getPrecio() + "\n");
        
        ProductosFrescos Manzana = new ProductosFrescos("Manzana", "32 de Enero, 2013", 7, (float) 25, (float) 23.2);
        System.out.println("Esta es la información de " + Manzana.getNombre() + ":");
        System.out.println("Caducidad: " + Manzana.getCaducidad());
        System.out.println("Lote: " + Manzana.getLote());
        System.out.println("Precio: $" + Manzana.getPrecio());
        System.out.println("Temperatura recomendada: " + Manzana.getTempRecomendada() + "°C");
        Manzana.cambiaPrecio((float) 17.2);
        System.out.println("Promocion nuevo precio de: " + Manzana.getPrecio() + "\n");
        
        ProductosRefrigerados Leche = new ProductosRefrigerados("Leche", "28 de Enero, 1999", 439, (float) 18, (float) 8.9);
        System.out.println("Esta es la información de " + Leche.getNombre() + ":");
        System.out.println("Caducidad: " + Leche.getCaducidad());
        System.out.println("Lote: " + Leche.getLote());
        System.out.println("Precio: $" + Leche.getPrecio());
        System.out.println("Temperatura recomendada: " + Leche.getTempRecomendada() + "°C");
        Leche.cambiaPrecio((float) 14.5);
        System.out.println("Promocion nuevo precio de: " + Leche.getPrecio() + "\n");
        
        CongeladosPorNitrogeno CarneRoja = new CongeladosPorNitrogeno("CarneRoja", "28 de Enero, 3000", 876, (float) 50, (float) -195.8, "Nitrogeno");
        System.out.println("Esta es la información de " + CarneRoja.getNombre() + ":");
        System.out.println("Caducidad: " + CarneRoja.getCaducidad());
        System.out.println("Lote: " + CarneRoja.getLote());
        System.out.println("Precio: $" + CarneRoja.getPrecio());
        System.out.println("Congelado por: " + CarneRoja.getTipoCongelacion());
        System.out.println("Temperatura recomendada: " + CarneRoja.getTempRecomendada() + "°C");
        CarneRoja.cambiaPrecio((float) 40.5);
        System.out.println("Promocion nuevo precio de: " + CarneRoja.getPrecio() + "\n");
    }
    
}
