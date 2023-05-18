/******************************************************************************
Fecha: 18/05/2023
Autor: Daniel Osorio
Taller 02
*******************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

abstract class ProductoElectronico {
    private String nombre;
    private double precio;
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int garantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getGarantia() {
        return garantia;
    }

    public abstract void cargar(double cargaInicial);
}

class Celular extends ProductoElectronico {
    private String modelo;

    public Celular(String nombre, double precio, int garantia, String modelo) {
        super(nombre, precio, garantia);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void cargar(double cargaInicial) {
        System.out.println("Cargando el celular " + getNombre() + " (" + getModelo() + ")");
        System.out.println("Tiempo estimado de carga: " + (cargaInicial / 2) + " horas");
    }
}

class Computadora extends ProductoElectronico {
    private String marca;

    public Computadora(String nombre, double precio, int garantia, String marca) {
        super(nombre, precio, garantia);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public void cargar(double cargaInicial) {
        System.out.println("Cargando la computadora " + getNombre() + " (" + getMarca() + ")");
        System.out.println("Tiempo estimado de carga: " + (cargaInicial / 4) + " horas");
    }
}

public class TiendaElectronica {
    public static void main(String[] args) {
        ArrayList<ProductoElectronico> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("----- Menú -----");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearProducto(productos, scanner);
                    break;
                case 2:
                    mostrarProductos(productos);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }
    }

    private static void crearProducto(ArrayList<ProductoElectronico> productos, Scanner scanner) {
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Celular");
        System.out.println("2. Computadora");
        System.out.print("Ingrese una opción: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer un entero

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la garantía del producto: ");
        int garantia = scanner.nextInt();

        if (tipo == 1) {
            System.out.print("Ingrese el modelo del celular: ");
            String modelo = scanner.next();
            Celular celular = new Celular(nombre, precio, garantia, modelo);
            productos.add(celular);
            System.out.println("Celular creado correctamente.");
        } else if (tipo == 2) {
            System.out.print("Ingrese la marca de la computadora: ");
            String marca = scanner.next();
            Computadora computadora = new Computadora(nombre, precio, garantia, marca);
            productos.add(computadora);
            System.out.println("Computadora creada correctamente.");
        } else {
            System.out.println("Opción inválida. No se pudo crear el producto.");
        }
    }

    private static void mostrarProductos(ArrayList<ProductoElectronico> productos) {
        System.out.println("Lista de productos:");

        for (ProductoElectronico producto : productos) {
            System.out.println("--------------------");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Garantía: " + producto.getGarantia() + " meses");
            producto.cargar(100); // Carga inicial ficticia de 100
            System.out.println("--------------------");
        }

        System.out.println("Fin de la lista");
    }
}
