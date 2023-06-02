// clase solo  información

public class Producto {
    //variables que representan atributos del producto
    private String nombre;

    private double precioNormal;
    private double precioMayorista;
    private int cantidadMayorista;

    //constructor
    //recibe los valores para ...

    public Producto(String nombre, double precioNormal, double precioMayorista, int cantidadMayorista) {
        this.nombre = nombre;
        this.precioNormal = precioNormal;
        this.precioMayorista = precioMayorista;
        this.cantidadMayorista = cantidadMayorista;

    }

    // metodos getters (acceso atri.. .)
    public String getNombre() {
        return nombre;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public double getPrecioMayorista() {
        return precioMayorista;
    }

    public int getCantidadMayorista() {
        return cantidadMayorista;
    }


    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    public void setPrecioMayorista(double precioMayorista) {
        this.precioMayorista = precioMayorista;
    }

    public void setCantidadMayorista(int cantidadMayorista) {
        this.cantidadMayorista = cantidadMayorista;
    }


}