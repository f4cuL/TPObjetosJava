/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_package;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author EAJ
 */
public abstract class Turno {
    private LocalDate dia;
    private LocalDateTime hora;
    private boolean ocupado;

    public Turno(LocalDate dia, LocalDateTime hora, boolean ocupado) {
        this.dia = dia;
        this.hora = hora;
        this.ocupado = ocupado;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
