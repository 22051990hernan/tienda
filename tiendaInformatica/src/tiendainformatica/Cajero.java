
package tiendainformatica;


class Cajero {
    private Producto producto;
    private int cantidad;

    public Cajero(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularPrecioTotal() {
        if (cantidad > producto.getStock()) {
            throw new IllegalArgumentException("No hay suficiente stock del producto.");
        }
        producto.reducirStock(cantidad);
        return producto.calcularPrecioU() * cantidad;
    }

    @Override
    public String toString() {
        return "Venta de: " + cantidad + " unidades del producto\n" + producto.toString();
    }
}
    

