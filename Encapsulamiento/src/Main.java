 public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Carlos");
        estudiante.setEdad(20);
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Edad del estudiante: " + estudiante.getEdad());
    }
}