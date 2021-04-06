package tarea;
// checked exception
public class Ejemplo3 {
    public Ejemplo3(Object obj1) {
        try {
            String obj2 = (String)obj1;
        } catch (ClassCastException e) {
            System.out.println("Tipo de objeto no es el mismo");
        }
    }
}