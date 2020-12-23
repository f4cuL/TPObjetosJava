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
public class Contacto {
    private String email;
    private String celular;
    private Ubicacion ubicacion;

    public Contacto(String email, String celular, Ubicacion ubicacion) {
        this.email = email;
        this.celular = celular;
        this.ubicacion = ubicacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
