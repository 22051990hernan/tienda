
package tiendainformatica;


class Impresora extends Producto {
    private int velocidad;
    private String color;  

    public Impresora(double precio, String marca, int stock, int velocidad, String color) {
        super(precio, marca, stock);
        this.velocidad = velocidad;
        this.color = color;
    }

    @Override
    public double calcularPrecioU() {
        return "color".equalsIgnoreCase(color) ? precio * 1.2 : precio; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Velocidad: " + velocidad + " ppm, Color: " + color;
    }
}
    

