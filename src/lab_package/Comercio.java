/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_package;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EAJ
 */
public class Comercio extends Actor{
    private String nombreComercio;
    private Long cuit;
    private double costoFijo;
    private double costoPorKm;
    private int diaDescuento;
    private int porcentajeDescuentoDia;
    private int porcentajeDescuentoEfectivo;
    private List<DiaRetiro> lstDiaRetiro;
    private List<Articulo> lstArticulo;
    private List<Carrito>lstCarrito;

    public Comercio(String nombreComercio, Long cuit, double costoFijo, double costoPorKm, int diaDescuento, int porcentajeDescuentoDia, int porcentajeDescuentoEfectivo, int id, Contacto contacto) {
        super(id, contacto);
        this.nombreComercio = nombreComercio;
        this.cuit = cuit;
        this.costoFijo = costoFijo;
        this.costoPorKm = costoPorKm;
        this.diaDescuento = diaDescuento;
        this.porcentajeDescuentoDia = porcentajeDescuentoDia;
        this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
        this.lstDiaRetiro = new ArrayList();
        this.lstArticulo = new ArrayList();
        this.lstCarrito = new ArrayList();
    }

    public String getNombreComercio() {
        return nombreComercio;
    }

    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public double getCostoFijo() {
        return costoFijo;
    }

    public void setCostoFijo(double costoFijo) {
        this.costoFijo = costoFijo;
    }

    public double getCostoPorKm() {
        return costoPorKm;
    }

    public void setCostoPorKm(double costoPorKm) {
        this.costoPorKm = costoPorKm;
    }

    public int getDiaDescuento() {
        return diaDescuento;
    }

    public void setDiaDescuento(int diaDescuento) {
        this.diaDescuento = diaDescuento;
    }

    public int getPorcentajeDescuentoDia() {
        return porcentajeDescuentoDia;
    }

    public void setPorcentajeDescuentoDia(int porcentajeDescuentoDia) {
        this.porcentajeDescuentoDia = porcentajeDescuentoDia;
    }

    public int getPorcentajeDescuentoEfectivo() {
        return porcentajeDescuentoEfectivo;
    }

    public void setPorcentajeDescuentoEfectivo(int porcentajeDescuentoEfectivo) {
        this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
    }

    public List<DiaRetiro> getLstDiaRetiro() {
        return lstDiaRetiro;
    }

    public void setLstDiaRetiro(List<DiaRetiro> lstDiaRetiro) {
        this.lstDiaRetiro = lstDiaRetiro;
    }

    public List<Carrito> getLstCarrito() {
        return lstCarrito;
    }

    public void setLstCarrito(List<Carrito> lstCarrito) {
        this.lstCarrito = lstCarrito;
    }

    public List<Articulo> getLstArticulo() {
        return lstArticulo;
    }

    public void setLstArticulo(List<Articulo> lstArticulo) {
        this.lstArticulo = lstArticulo;
    }
    public void mostrarArticulos(){
        System.out.println("Articulos");
        if(!this.lstArticulo.isEmpty()){
            for(Articulo it:this.lstArticulo){
                System.out.print("Nombre: ");
                System.out.print(it.getNombre());
                System.out.print("-Precio: ");
                System.out.println(it.getPrecio());
            }
        }
    }
    
    
}
