/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_package;

import java.time.LocalDate;

/**
 *
 * @author EAJ
 */
public class Entrega {
    protected int id;
    protected LocalDate fecha;
    protected boolean efectivo;

    public Entrega(int id, LocalDate fecha, boolean efectivo) {
        this.id = id;
        this.fecha = fecha;
        this.efectivo = efectivo;
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

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }
    
}
