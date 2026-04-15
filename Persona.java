public class Persona {
    private String nombre;
    int edad;

    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //get
    public String getNombre(){return nombre;}
    //set 
    public void setNombre(String nombre){this.nombre = nombre;}
}
