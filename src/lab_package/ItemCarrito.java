/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_package;

/**
 *
 * @author EAJ
 */
public class ItemCarrito {
    private Articulo articulo;
    private int cantidad;

    public ItemCarrito(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double calacularSubTotalItem(){
        return this.articulo.getPrecio()*this.cantidad;
    }
    
}
