/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuradorcoche;

/**
 *
 * @author Profesor
 */
public abstract class Extra {
    protected String nombre;
    protected int precio;

    public Extra(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/*Saber el precio loco*/
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void imprimir() {
        System.out.println(this.nombre + " (+" + this.precio + "€)");
    }
}

final class PintMetalizada extends Extra {
    public PintMetalizada (String nombre, int precio) {
        super(nombre, precio);
    }
}

final class Navegador extends Extra {
    public Navegador (String nombre, int precio) {
        super(nombre, precio);
    }
}

final class Climatizador extends Extra {
    public Climatizador (String nombre, int precio) {
        super(nombre, precio);
    }
}