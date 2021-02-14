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
public abstract class Vehiculo {
    protected String nombre;
    protected int precio;
    protected String color;
    protected Extra extra1;
    protected Extra extra2;
    protected Extra extra3;

    public Vehiculo(String nombre, int precio, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.extra1 = this.extra2 = this.extra3 = null; 
    }
/* NOmbre*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }
/*color*/
    public void setColor(String color) {
        this.color = color;
    }

    public Extra getExtra1() {
        return extra1;
    }

    public void setExtra1(Extra extra1) {
        this.extra1 = extra1;
    }

    public Extra getExtra2() {
        return extra2;
    }

    public void setExtra2(Extra extra2) {
        this.extra2 = extra2;
    }

    public Extra getExtra3() {
        return extra3;
    }

    public void setExtra3(Extra extra3) {
        this.extra3 = extra3;
    }

    /*Tas loco añadir extras*/
    public void añadirExtra (Extra e) {
        if (extra1 == null) {
            this.extra1 = e;
        } else {
            if (extra2 == null) {
                this.extra2 = e;
            } else {
                if (extra3 == null) {
                    this.extra3 = e;
                }
            }
        }
    }
    
    public int calcularPrecio () {
        int precioTotal = this.precio;
        if (this.extra1 != null) {
            precioTotal += this.extra1.getPrecio();
        }
        if (this.extra2 != null) {
            precioTotal += this.extra2.getPrecio();
        }
        if (this.extra3 != null) {
            precioTotal += this.extra3.getPrecio();
        }
        return precioTotal;
    }
    
    public void imprimir () {
        String nombreClase = this.getClass().getName();
        String[] datos = nombreClase.split("\\.");
        String categoria = datos[1];
        
        System.out.println("Categoría: " + categoria);
        System.out.println("Modelo: " + this.nombre);
        System.out.println("Color: " + this.color);
        System.out.println("Extras:");
        if (this.extra1 != null) {
            System.out.print("\t");
            this.extra1.imprimir();
        }
        if (this.extra2 != null) {
            System.out.print("\t");
            this.extra2.imprimir();
        }
        if (this.extra3 != null) {
            System.out.print("\t");
            this.extra3.imprimir();
        }
        
        System.out.println("Precio final: " + this.calcularPrecio() + "€");
    }
}


final class Turismo extends Vehiculo {
    public Turismo(String nombre, int precio, String color) {
        super(nombre, precio, color);
    }
}

final class Todoterreno extends Vehiculo {
    public Todoterreno(String nombre, int precio, String color) {
        super(nombre, precio, color);
    }
}

final class Deportivo extends Vehiculo {
    public Deportivo(String nombre, int precio, String color) {
        super(nombre, precio, color);
    }
}