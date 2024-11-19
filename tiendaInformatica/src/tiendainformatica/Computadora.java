
package tiendainformatica;

class Computadora extends Producto {
    private String modelo;
    private int ram;
    private int almacenamiento;
    private boolean rgb;

    public Computadora(double precio, String marca, int stock, String modelo, int ram, int almacenamiento, boolean rgb) {
        super(precio, marca, stock);
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.rgb = rgb;
    }

    @Override
    public double calcularPrecioU() {
        return rgb ? precio * 1.1 : precio; // Aumenta 10% si tiene RGB
    }

    @Override
    public String toString() {
        return super.toString() + ", Modelo: " + modelo + ", RAM: " + ram + "GB, Almacenamiento: " + almacenamiento + "GB, RGB: " + (rgb ? "Sí" : "No");
    }
}

    

