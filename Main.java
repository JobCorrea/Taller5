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
        System.out.println("==========================================");
        
        Vehiculo v = new Vehiculo("Terrestre"); 
        Moto m = new Moto("Terrestre", "Yamaha"); 
        v.mostrarTipo();
        m.mostrarInfo();
         System.out.println("==========================================");


        //Prueba de Persona
        Persona persona = new Persona("Juan Perez", 30);
        // ===== PROBANDO ACCESO A ATRIBUTO PRIVADO =====
        // System.out.println("Nombre directo: " + persona.nombre); 
        // ERROR: nombre has private access in Persona
        
        // Debemos usar el método getter
        System.out.println("Nombre (usando getter): " + persona.getNombre());
        // Podemos usar el setter
        persona.setNombre("Maria lucia");
        System.out.println("Nombre actualizado: " + persona.getNombre());
        // ===== PROBANDO ACCESO A ATRIBUTO DE PAQUETE (default) =====
        System.out.println("Edad (acceso directo): " + persona.edad);
        //FUNCIONA porque estamos en el mismo paquete
        // Modificar directamente
        persona.edad = 35;
        System.out.println("Edad actualizada: " + persona.edad);
        //FUNCIONA porque estamos en el mismo paquete
        
    }
}
/*
    ===== DIFERENCIAS =====
    1. PRIVATE: Solo accesible dentro de la misma clase
   - Necesitamos getters/setters para acceder desde fuera
   - Máxima encapsulación

    2. DEFAULT (paquete): Accesible desde el mismo paquete
   - Acceso directo desde clases del mismo paquete
   - NO accesible desde otros paquetes
   - Menor encapsulación que private 
*/
