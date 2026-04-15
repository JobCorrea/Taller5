package Vehiculos;

    public  class Vehiculo {
    String tipo;

    public  Vehiculo(String tipo){
        this.tipo = tipo;
    }
    public void mostrarTipo() {
        System.out.println("Tipo de vehiculo: " + tipo);
    }
}
