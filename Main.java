public class Main{

    public static void main(String[] args) {
        Producto p1 = new Producto("Shampoo", 15000, 45);
        
        // Acceder a los miembros (funciona porque estamos en el mismo paquete)
        System.out.println("Accediendo directamente al nombre: " + p1.nombre);
        System.out.println("Accediendo directamente al precio: " + p1.precio);
        System.out.println("Accediendo directamente al stock: " + p1.stock);
        p1.mostrarInfo();
    }
}