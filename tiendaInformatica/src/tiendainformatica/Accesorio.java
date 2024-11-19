
package tiendainformatica;


class Accesorio extends Producto {
    private String compatibilidad;

    public Accesorio(double precio, String marca, int stock, String compatibilidad) {
        super(precio, marca, stock);
        this.compatibilidad = compatibilidad;
    }

    @Override
    public double calcularPrecioU() {
        return precio * 1.05; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Compatibilidad: " + compatibilidad;
    }
    
}
