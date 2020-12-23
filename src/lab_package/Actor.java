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
public class Actor {
    private int id;
    protected Contacto contacto;

    public Actor(int id, Contacto contacto) {
        this.id = id;
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    protected boolean validarIdentificadorUnico(long identificador) {
        return false;
    }
    
}
