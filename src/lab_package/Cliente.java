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
public class Cliente extends Actor{
    private String apellido;
    private String nombres;
    private long dni;
    private char sexo;

    public Cliente(String apellido, String nombres, long dni, char sexo, int id, Contacto contacto) {
        super(id, contacto);
        this.apellido = apellido;
        this.nombres = nombres;
        this.sexo = sexo;
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) throws Exception {
        if(!validarIdentificadorUnico(dni)){
            throw new Exception("Dni no valido");   
        }
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    final protected boolean validarIdentificadorUnico(long identificador){
        long auxDNI=identificador;
        int cont = 0;
        while(auxDNI>0){
            cont++;
            auxDNI/=10;
        }
        return cont==8 || cont==7;
    }
    
}
