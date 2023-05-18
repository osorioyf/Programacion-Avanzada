import java.util.ArrayList;

abstract class ProductoElectronico {
    protected double precio;
    protected String marca;
    protected String descripcion;

    public ProductoElectronico(double precio, String marca, String descripcion) {
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    public abstract double calcularDescuento();
}

class Televisor extends ProductoElectronico {
    public Televisor(double precio, String marca, String descripcion) {
        super(precio, marca, descripcion);
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.1;
    }
}

class Smartphone extends ProductoElectronico {
    public Smartphone(double precio, String marca, String descripcion) {
        super(precio, marca, descripcion);
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.05;
    }
}

class Computadora extends ProductoElectronico {
    public Computadora(double precio, String marca, String descripcion) {
        super(precio, marca, descripcion);
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.15;
    }
}

class TiendaElectronica {
    private ArrayList<ProductoElectronico> productos;

    public TiendaElectronica() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectronico producto) {
        productos.add(producto);
    }

    public void mostrarInformacionProductos() {
        for (ProductoElectronico producto : productos) {
            System.out.println("Producto: " + producto.descripcion);
            System.out.println("Marca: " + producto.marca);
            System.out.println("Precio: " + producto.precio);
            System.out.println("Descuento: " + producto.calcularDescuento());
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        Televisor televisor = new Televisor(1000, "Samsung", "Televisor LED 50 pulgadas");
        Smartphone smartphone = new Smartphone(500, "Apple", "iPhone 12");
        Computadora computadora = new Computadora(1500, "Dell", "Laptop XPS 15");

        tienda.agregarProducto(televisor);
        tienda.agregarProducto(smartphone);
        tienda.agregarProducto(computadora);

        tienda.mostrarInformacionProductos();
    }
}