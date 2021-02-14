/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuradorcoche;

/**
 *
 * @author Profesor DEBERIAN DAR COSAS UTILES EN CLASES
 */
public class ConfiguradorCoche {

    private static void imprimirMenu() {
        System.out.println("------------------");
        System.out.println("\t 1) Configurar vehículo");
        System.out.println("\t 2) Imprimir configuración");
        System.out.println("\t 3) Salir");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        Vehiculo vehiculo = null;
        do {
            imprimirMenu();
            int opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Indique la categoría:");
                    System.out.println("\t 1) Turismo");
                    System.out.println("\t 2) Todoterreno");
                    System.out.println("\t 3) Deportivo");
                    int iCategoria = teclado.nextInt();
                    String sCategoria = "";
                    switch (iCategoria) {
                        case 1: 
                            sCategoria = "Turismo";
                            break;
                        case 2: 
                            sCategoria = "Todoterreno";
                            break;
                        case 3: 
                            sCategoria = "Deportivo";
                            break;
                        default:
                            sCategoria = "Turismo";
                            
                    }
                    
                    String sNombre = "";
                    int precio = 0;
                    switch (sCategoria) {
                        case "Turismo":
                            System.out.println("Seleccione el modelo de turismo");
                            System.out.println("\t 1)   Toyota (18000)");
                            System.out.println("\t 2)   Opel (16000)");
                            int iNombre = teclado.nextInt();
                            
                            if (iNombre == 1) {
                                sNombre = "Toyota";
                                precio = 18000;
                            } else {
                                if (iNombre == 2) {
                                    sNombre = "Opel";
                                    precio = 16000;
                                } else {
                                    sNombre = "Toyota";
                                    precio = 18000;
                                }
                            }
                            break;
                        case "Todoterreno":
                            System.out.println("Seleccione el modelo de todoterreno");
                            System.out.println("\t 1)   Ford (22000)");
                            System.out.println("\t 2)   Honda (27000)");
                            iNombre = teclado.nextInt();
                            
                            if (iNombre == 1) {
                                sNombre = "Ford";
                                precio = 22000;
                            } else {
                                if (iNombre == 2) {
                                    sNombre = "Honda";
                                    precio = 27000;
                                } else {
                                    sNombre = "Ford";
                                    precio = 22000;    
                                }
                            }
                            break;
                        case "Deportivo":
                            System.out.println("Seleccione el modelo de deportivo");
                            System.out.println("\t 1)   Mercedes (38000)");
                            System.out.println("\t 2)   Nissan (41000)");
                            iNombre = teclado.nextInt();
                            
                            if (iNombre == 1) {
                                sNombre = "Mercedes";
                                precio = 38000;
                            } else {
                                if (iNombre == 2) {
                                    sNombre = "Nissan";
                                    precio = 41000;
                                } else {
                                    sNombre = "Mercedes";
                                    precio = 38000;
                                }
                            }
                            break;
                        default:
                            System.out.println("Seleccione el modelo de turismo");
                            System.out.println("\t 1)   Toyota (18000)");
                            System.out.println("\t 2)   Opel (16000)");
                            iNombre = teclado.nextInt();
                            
                            if (iNombre == 1) {
                                sNombre = "Toyota";
                                precio = 18000;
                            } else {
                                if (iNombre == 2) {
                                    sNombre = "Opel";
                                    precio = 16000;
                                } else {
                                    sNombre = "Toyota";
                                    precio = 18000;
                                }
                            }
                    }
                    
                    System.out.println("Indique el color:");
                    System.out.println("\t 1) Rojo");
                    System.out.println("\t 2) Verde");
                    System.out.println("\t 3) Azul");
                    int iColor = teclado.nextInt();
                    String color = "";
                    switch (iColor) {
                        case 1: 
                            color = "rojo";
                            break;
                        case 2: 
                            color = "verde";
                            break;
                        case 3: 
                            color = "azul";
                            break;
                        default:
                            color = "rojo";
                    }
                    
                    if (sCategoria.equals("Turismo")) {
                        vehiculo = new Turismo(sNombre, precio, color);
                    }
                    if (sCategoria.equals("Todoterreno")) {
                        vehiculo = new Todoterreno(sNombre, precio, color);
                    }
                    if (sCategoria.equals("Deportivo")) {
                        vehiculo = new Deportivo(sNombre, precio, color);
                    }
                    
                    String respuesta = "";
                    System.out.println("¿Desea añadir Pintura Metalizada? (+400 €):");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        PintMetalizada extra1 = new PintMetalizada("Pintura metalizada", 400);
                        vehiculo.añadirExtra(extra1);
                    }
                    System.out.println("¿Desea añadir Navegador? (+300 €):");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        Navegador extra2 = new Navegador("Navegador", 300);
                        vehiculo.añadirExtra(extra2);
                    }
                    System.out.println("¿Desea añadir Climatizador? (+200 €):");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        Climatizador extra3 = new Climatizador("Climatizador", 200);
                        vehiculo.añadirExtra(extra3);
                    }
                    
                    break;
                case 2:
                    if (vehiculo != null) {
                        vehiculo.imprimir();
                    }
                    break;
                case 3:
                    System.exit(0);
            }
            
            
            
        } while (true);
           
        
        
        
        
        
        
        
        
        
        
    }
    
}
