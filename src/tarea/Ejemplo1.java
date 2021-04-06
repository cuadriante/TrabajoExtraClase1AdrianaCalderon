package tarea;
// unchecked exception try/catch y percola a otra excepcion
public class Ejemplo1 {
    public void dividir(int num1, int num2) throws Ejemplo1Exception {
        try{
            System.out.println(num1/num2);
        } catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
            throw new Ejemplo1Exception("Error al dividir entre 0");
        }
    }

}
