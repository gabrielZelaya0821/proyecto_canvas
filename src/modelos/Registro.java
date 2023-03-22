package modelos;

/**
 *
 * @author gabri
 */
public class Registro extends Usuario{
    
    public Registro() {
        super();
    }

    public Registro(String user, String password, String role) {
        super(user, password, role);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
