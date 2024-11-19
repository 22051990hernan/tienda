package tiendainformatica;

public class TiendaInformatica {
    public static void main(String[] args) {
        
        
        Computadora comp = new Computadora(1500.0, "HP", 10, "Pavilion", 16, 512, true);
        Impresora imp = new Impresora(500.0, "Epson", 5, 30, "color");
        Accesorio acc = new Accesorio(50.0, "Logitech", 20, "Universal");

        Cajero cajero1 = new Cajero(comp, 2);
        Cajero cajero2 = new Cajero(imp, 1);
        Cajero cajero3 = new Cajero(acc, 5);

        try {
            System.out.println(cajero1);
            System.out.println("Total: $" + cajero1.calcularPrecioTotal() + "\n");

            System.out.println(cajero2);
            System.out.println("Total: $" + cajero2.calcularPrecioTotal() + "\n");

            System.out.println(cajero3);
            System.out.println("Total: $" + cajero3.calcularPrecioTotal() + "\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
