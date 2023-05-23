import java.util.ArrayList;
import java.util.Scanner;

// Clase abstracta para representar un producto electrónico
abstract class ProductoElectronico {
    private String nombre;
    private double precio;
    private int garantia;

    // Constructor de la clase ProductoElectronico
    public ProductoElectronico(String nombre, double precio, int garantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    // Getter para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Getter para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Getter para obtener la garantía del producto
    public int getGarantia() {
        return garantia;
    }

    // Método abstracto para cargar el producto
    public abstract void cargar(double cargaInicial);
}

// Clase Celular que hereda de ProductoElectronico
class Celular extends ProductoElectronico {
    private String modelo;

    // Constructor de la clase Celular
    public Celular(String nombre, double precio, int garantia, String modelo) {
        super(nombre, precio, garantia);
        this.modelo = modelo;
    }

    // Getter para obtener el modelo del celular
    public String getModelo() {
        return modelo;
    }

    // Implementación del método cargar para el celular
    @Override
    public void cargar(double cargaInicial) {
        System.out.println("Cargando el celular " + getNombre() + " (" + getModelo() + ")");
        System.out.println("Tiempo estimado de carga: " + (cargaInicial / 2) + " horas");
    }
}

// Clase Computadora que hereda de ProductoElectronico
class Computadora extends ProductoElectronico {
    private String marca;

    // Constructor de la clase Computadora
    public Computadora(String nombre, double precio, int garantia, String marca) {
        super(nombre, precio, garantia);
        this.marca = marca;
    }

    // Getter para obtener la marca de la computadora
    public String getMarca() {
        return marca;
    }

    // Implementación del método cargar para la computadora
    @Override
    public void cargar(double cargaInicial) {
        System.out.println("Cargando la computadora " + getNombre() + " (" + getMarca() + ")");
        System.out.println("Tiempo estimado de carga: " + (cargaInicial / 4) + " horas");
    }
}

// Clase principal TiendaElectronica
public class TiendaElectronica {
    public static void main(String[] args) {
        ArrayList<ProductoElectronico> productos = new ArrayList<>(); // ArrayList para almacenar productos
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        int opcion = 0; // Variable para almacenar la opción seleccionada por el usuario

        while (opcion != 3) { // Bucle principal del menú
            System.out.println("----- Menú -----");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt(); // Leer la opción seleccionada por el usuario

            switch (opcion) {
                case 1:
                    crearProducto(productos, scanner); // Llamar al método crearProducto
                    break;
                case 2:
                    mostrarProductos(productos); // Llamar al método mostrarProductos
                    break;
                case 3:
                    System.out.println("¡Hasta luego!"); // Mostrar mensaje de despedida
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente."); // Mostrar mensaje de opción inválida
                    break;
            }

            System.out.println(); // Imprimir una línea en blanco
        }
    }

    // Método para crear un producto y agregarlo a la lista de productos
    private static void crearProducto(ArrayList<ProductoElectronico> productos, Scanner scanner) {
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Celular");
        System.out.println("2. Computadora");
        System.out.print("Ingrese una opción: ");
        int tipo = scanner.nextInt(); // Leer el tipo de producto seleccionado por el usuario
        scanner.nextLine(); // Consumir el salto de línea después de leer un entero

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine(); // Leer el nombre del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble(); // Leer el precio del producto
        System.out.print("Ingrese la garantía del producto: ");
        int garantia = scanner.nextInt(); // Leer la garantía del producto

        if (tipo == 1) { // Si el tipo de producto es un celular
            System.out.print("Ingrese el modelo del celular: ");
            String modelo = scanner.next(); // Leer el modelo del celular
            Celular celular = new Celular(nombre, precio, garantia, modelo); // Crear un objeto Celular
            productos.add(celular); // Agregar el celular a la lista de productos
            System.out.println("Celular creado correctamente."); // Mostrar mensaje de éxito
        } else if (tipo == 2) { // Si el tipo de producto es una computadora
            System.out.print("Ingrese la marca de la computadora: ");
            String marca = scanner.next(); // Leer la marca de la computadora
            Computadora computadora = new Computadora(nombre, precio, garantia, marca); // Crear un objeto Computadora
            productos.add(computadora); // Agregar la computadora a la lista de productos
            System.out.println("Computadora creada correctamente."); // Mostrar mensaje de éxito
        } else {
            System.out.println("Opción inválida. No se pudo crear el producto."); // Mostrar mensaje de opción inválida
        }
    }

    // Método para mostrar la lista de productos
    private static void mostrarProductos(ArrayList<ProductoElectronico> productos) {
        System.out.println("Lista de productos:");

        for (ProductoElectronico producto : productos) { // Iterar sobre la lista de productos
            System.out.println("--------------------");
            System.out.println("Nombre: " + producto.getNombre()); // Mostrar el nombre del producto
            System.out.println("Precio: $" + producto.getPrecio()); // Mostrar el precio del producto
            System.out.println("Garantía: " + producto.getGarantia() + " meses"); // Mostrar la garantía del producto
            producto.cargar(100); // Llamar al método cargar del producto (carga inicial ficticia de 100)
            System.out.println("--------------------");
        }

        System.out.println("Fin de la lista"); // Mostrar mensaje de fin de la lista
    }
}
