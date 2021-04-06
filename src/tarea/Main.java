package tarea;

public class Main {
    public static void main(String[] args) throws Ejemplo1Exception{
        Ejemplo1 e1 = new Ejemplo1();
        e1.dividir(1,2);
        e1.dividir(1,2);
        e1.dividir(1,0); // comentar esta linea para probar lo demas
        Ejemplo2 e2 = new Ejemplo2();
        e2.noCinco(6);
        e2.noCinco(5);
        Ejemplo3 e3 = new Ejemplo3(4);
        Ejemplo4 e4 = new Ejemplo4();
        Ejemplo5 e5 = new Ejemplo5();
        e5.SetUserPassword("adri", "adri2");
        e5.SetUserPassword("adri", "adri");

    }


}