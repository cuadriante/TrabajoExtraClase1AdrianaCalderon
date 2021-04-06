package tarea;
// crear checked exception con try/catch y finally
public class Ejemplo2 {

    public void noCincoException(int num) throws Ejemplo2Exception {
        if (num == 5) {
            throw new Ejemplo2Exception("NO CINCO");
        }
    }

    public void noCinco(int num){
        try {
            noCincoException(num);
        } catch(Ejemplo2Exception e){
            System.out.println("Puso un 5.");
        } finally {
            System.out.println("Recuerde no poner 5 :)");
        }
    }
}