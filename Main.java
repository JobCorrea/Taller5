import Vehiculos.Moto;
import Vehiculos.Vehiculo;

public class Main{

    public static void main(String[] args) {
        Producto p1 = new Producto("Shampoo", 15000, 45);

        // Acceder a los miembros (funciona porque estamos en el mismo paquete)
        System.out.println("Accediendo directamente al nombre: " + p1.nombre);
        System.out.println("Accediendo directamente al precio: " + p1.precio);
        System.out.println("Accediendo directamente al stock: " + p1.stock);
        p1.mostrarInfo();

            //Muestra de error
        /*ESTO NO COMPILARÁ - Error de compilación
         Las clases Vehiculo y Moto tienen acceso de paquete (default)
         y no son visibles desde otro paquete, cuando colocamos Public en los metodos y constructores se corrige el error
         */
        
        Vehiculo v = new Vehiculo("Terrestre"); // ERROR: Vehiculo no es visible
        Moto m = new Moto("Terrestre", "Yamaha"); // ERROR: Moto no es visible
        
        v.mostrarTipo();
        m.mostrarInfo();
    }
}
/**
 PruebaVehiculos.java:3: error: Vehiculo is not public in vehiculos; cannot be accessed from outside package
import vehiculos.Vehiculo;
                ^

PruebaVehiculos.java:4: error: Moto is not public in vehiculos; cannot be accessed from outside package
import vehiculos.Moto;
                ^

PruebaVehiculos.java:10: error: cannot find symbol
        Vehiculo v = new Vehiculo("Terrestre");
        ^
  symbol:   class Vehiculo
  location: class PruebaVehiculos
 */