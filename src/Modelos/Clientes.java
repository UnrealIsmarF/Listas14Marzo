
package Modelos;


public class Clientes {

String Apellidos;
String Nombre;

    public Clientes(String Apellidos, String Nombre) {
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    
}
