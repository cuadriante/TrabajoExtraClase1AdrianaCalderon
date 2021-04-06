package tarea;

import java.util.Objects;

// crear unchecked exception con throw
public class Ejemplo5 {

    public void SetUserPassword(String user, String password) throws Ejemplo5Exception {
        if (Objects.equals(password, user)) {
            throw new Ejemplo5Exception("Contrasena no puede ser igual al usuario");
        }
    }

}
