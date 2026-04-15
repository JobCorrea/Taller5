package Vehiculos;

 public class Moto extends Vehiculo {
      String marca;

    public Moto(String tipo, String marca){
        super(tipo);
        this.marca = marca;
    }

    public void mostrarInfo() {
        System.out.println("Moto - Marca: " + marca);
        // Podemos acceder a 'tipo' porque estamos en el mismo paquete
        System.out.println("Tipo: " + tipo);
    }
}
