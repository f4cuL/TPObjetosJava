/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_package;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author EAJ
 */
public class Carrito {
    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean cerrado;
    private double descuento;
    private Cliente cliente;
    private List<ItemCarrito>lstItemCarrito;
    private Entrega entrega;

    public Carrito(int id, LocalDate fecha, LocalTime hora, boolean cerrado, double descuento, Cliente cliente, Entrega entrega) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.cerrado = cerrado;
        this.descuento = descuento;
        this.cliente = cliente;
        this.lstItemCarrito = new ArrayList();
        this.entrega = entrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public double getDescuento() {
        return descuento;
    }

    private void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemCarrito> getLstItemCarrito() {
        return lstItemCarrito;
    }

    public void setLstItemCarrito(List<ItemCarrito> lstItemCarrito) {
        this.lstItemCarrito = lstItemCarrito;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public void mostrarlstItemCarrito(Comercio comercio1){
        System.out.println("Articulos");
        int nArt = 0;
        for (ItemCarrito it : comercio1.getLstCarrito().get(0).getLstItemCarrito()) {
            System.out.print(nArt + 1 + ".");
            System.out.println("Nombre: " + it.getArticulo().getNombre());
            System.out.println("  Cantidad: " + it.getCantidad());
            nArt++;
        }
    }
    public boolean agregar(Articulo articulo,int cantidad){
        Iterator lstIt = this.lstItemCarrito.iterator();
        boolean existeArticulo=false;
        ItemCarrito aux = null;
        int posicionArticulo=0;
        if(!this.lstItemCarrito.isEmpty()){
            while(lstIt.hasNext()){
                aux = (ItemCarrito) (lstIt.next());
                if (aux.getArticulo().equals(articulo)) {
                    existeArticulo=true;
                    break;
                }
                posicionArticulo++;
            }
        }
        if (existeArticulo) {
            for(int i=0;i<this.lstItemCarrito.size();i++){
                if(i==posicionArticulo){
                    lstItemCarrito.get(i).setCantidad(aux.getCantidad() + cantidad);
                }
            }
        }else {
            this.lstItemCarrito.add(new ItemCarrito(articulo, cantidad));
        }
        return true;
    }
    public void eliminarArticulo(Articulo articulo){
        Iterator lstIt = this.lstItemCarrito.iterator();
        boolean existeArticulo=false;
        ItemCarrito aux = null;
        int posicionArticulo=0;
        if(!this.lstItemCarrito.isEmpty()){
            while(lstIt.hasNext()){
                aux = (ItemCarrito) (lstIt.next());
                if (aux.getArticulo().equals(articulo)) {
                    existeArticulo=true;
                    break;
                }
                posicionArticulo++;
            }
        }
        if (existeArticulo) {
            for(int i=0;i<this.lstItemCarrito.size();i++){
                if(i==posicionArticulo){
                    lstItemCarrito.remove(i);
                }
            }
        }else {
            System.out.println("Este articulo no existe");
        }
    }
    
    
    public double calcularDescuentoDia(int diaDescuento, double porcentajeDescuentoDia) {
    	double descuentoTotal=0;
    	if (diaDescuento==3) {
            for(int i=0;i<lstItemCarrito.size();i++) {
    		Articulo aux=lstItemCarrito.get(i).getArticulo();
    		descuentoTotal+=((lstItemCarrito.get(i).getCantidad()/2)*(aux.getPrecio())*(porcentajeDescuentoDia))/100;	
            }
    	}
    	return descuentoTotal;
    }
    public double calcularDescuentoEfectivo(double PorcentajeDescuentoEfectivo) {
    	double descuentoTotal=0;
    	for(int i=0;i<lstItemCarrito.size();i++) {
    		Articulo aux=lstItemCarrito.get(i).getArticulo();
    		descuentoTotal+=((lstItemCarrito.get(i).getCantidad()/2)*(aux.getPrecio())*(PorcentajeDescuentoEfectivo))/100;
    	}
    	return descuentoTotal;
    }
    public void calcularDescuentoCarrito (int diaDescuento, double porcentajeDescuento, double porcentajeDescuentoEfectivo){
double descuentoDia = calcularDescuentoDia(diaDescuento,porcentajeDescuento);
        double descuentoEfectivo = calcularDescuentoEfectivo(porcentajeDescuentoEfectivo);
        if(diaDescuento==3){
            if(descuentoDia>descuentoEfectivo){
                setDescuento(descuentoDia);
            }else{
                setDescuento(descuentoEfectivo);
            }
        }
    }
    public double totalAPagarCarrito(){
        double total =0;
        for(ItemCarrito it:this.lstItemCarrito){
            total+=it.calacularSubTotalItem()-this.descuento;
        }
        return total;
    }
    
}
