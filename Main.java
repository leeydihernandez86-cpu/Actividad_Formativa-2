
// Clase Estudiante
// Aquí definimos los atributos (características) de cada estudiante
class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
    }
}

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        Estudiante alumno1 = new Estudiante("Laura Hernández", 20, "Ingeniería en Sistemas");
        alumno1.mostrarInfo();
    }
}
