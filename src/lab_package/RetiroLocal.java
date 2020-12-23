/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_package;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author EAJ
 */
public class RetiroLocal extends Entrega{
    private LocalTime horaEntrega;

    public RetiroLocal(LocalTime horaEntrega, int id, LocalDate fecha, boolean efectivo) {
        super(id, fecha, efectivo);
        this.horaEntrega = horaEntrega;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    
}
