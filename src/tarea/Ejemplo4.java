package tarea;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
 // checked exception
public class Ejemplo4 {
    public Ejemplo4(){
        File f = new File("inexistente.txt");
        try {
            FileReader fr = new FileReader(f);
        } catch(FileNotFoundException e){
            System.out.println("el archivo no existe");
        }
    }

}
