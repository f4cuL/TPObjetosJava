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
public class Articulo {
    private int id;
    private String nombre;
    private String codBarras;
    private double precio;

    public Articulo(int id, String nombre, String codBarras, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.codBarras = codBarras;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean validarCodBarras(String codBarras){
        //separacion
        boolean correcto = false;
        if(codBarras.length()==13){
            double par = 0 ;
            double impar = 0; 
            //obtenemos numero de verificacion
            char nV = (codBarras.charAt(12));
            int Nverificador = Integer.parseInt(""+nV);
            for(int i = 0; i < 12; i++ ){
                if((i%2)==0){
                    char c = (codBarras.charAt(i));
                    double n = Double.parseDouble(""+c); 
                    par = par + n;
                }else{
                    char c = (codBarras.charAt(i));
                    double n = Double.parseDouble(""+c);
                    impar = impar + n;
                }
            } 
            double suma = (impar * 3)+ par;
            int sumaint = (int)(suma);
            int redondeo = sumaint;
            if (redondeo%10 <= 5){ 
                while (redondeo%10!=0){ 
                 redondeo++; 
                } 
            }
            //obtenemos numero de control que es lo mismo a numero de verificacion
            int nControl = redondeo - sumaint;
            //y verificamos que el numero de verificacion y de control sean el mismo
            if(nControl == Nverificador){
                System.out.println("su codigo de barras es correcto ");
                 correcto = true;
            }
        }
        return correcto;
    }
    @Override
    public boolean equals(Object o){
        return ((Articulo)o).id==this.id;
    }
}
