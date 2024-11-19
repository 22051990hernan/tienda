
package tiendainformatica;



    abstract class Producto {
    protected double precio;
    protected String marca;
    protected int stock;

    public Producto(double precio, String marca, int stock) {
        this.precio = precio;
        this.marca = marca;
        this.stock = stock;
    }

    public abstract double calcularPrecioU();

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    @Override
    public String toString() {
        return "Producto [Marca: " + marca + ", Precio: $" + precio + ", Stock: " + stock + "]";
    }
}
    

