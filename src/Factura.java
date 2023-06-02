import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Factura {
    private List<Producto> productos;
    private String nombreComprador;
    private double subtotal;
    private String cedulaComprador;


    public Factura() {
        productos = new ArrayList<>();

    }
    // metodos
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getSubtotal() {

        return subtotal;
    }

    public double getDescuento() {
        double subtotal = getSubtotal();
        double descuento = 0;
        if (subtotal > 1000) {
            descuento = subtotal * 0.1;
        } else if (subtotal > 500) {
            descuento = subtotal * 0.07;
        } else if (subtotal > 100) {
            descuento = subtotal * 0.05;
        }
        return descuento;
    }

    public double getTotal() {

        double subtotal = getSubtotal();
        double descuento = getDescuento();
        return subtotal - descuento;
    }

    // recibe el objeto .....
    public void agregarProducto(Producto producto, int cantidadUnidades) {
        productos.add(producto);
        subtotal += calcularSubtotalProducto(producto, cantidadUnidades);
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getCedulaComprador() {
        return cedulaComprador;
    }

    public void setCedulaComprador(String cedulaComprador) {
        this.cedulaComprador = cedulaComprador;
    }

    private double calcularSubtotalProducto(Producto producto, int cantidadUnidades) {
        if (cantidadUnidades >= producto.getCantidadMayorista()) {
            return producto.getPrecioMayorista() * cantidadUnidades;
        } else {
            return producto.getPrecioNormal() * cantidadUnidades;
        }
    }



    public void imprimirFactura(List<Integer>cantidades) {
        System.out.println("         Factura:");
        System.out.println("------------------------");
        System.out.println("Comprador:" + nombreComprador);
        System.out.println("Cédula: " + cedulaComprador);
        System.out.println("Valor de Productos:");
        System.out.println("------------------");

        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int numeroProducto = i + 1;


            System.out.println(" --Nombre del producto: " + producto.getNombre());
            System.out.println(" --Precio unitario: $" + producto.getPrecioNormal());
            System.out.println(" --Precio al por mayor : $" + producto.getPrecioMayorista());
            System.out.println(" --Cantidad aplicada al mayorista: "+ producto.getCantidadMayorista() + " unidades");
            System.out.println(" --Cantidad de productos: "+ cantidades.get(i)+ " unidades");
            System.out.println("\n");


        }

        System.out.println("------------------------");

        System.out.println("Subtotal: $" + getSubtotal());
        System.out.println("Descuento: $" + getDescuento());
        System.out.println("Total: $" + getTotal());
    }


}
