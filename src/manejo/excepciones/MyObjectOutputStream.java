package manejo.excepciones;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author gabri
 */
public class MyObjectOutputStream extends ObjectOutputStream{

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public MyObjectOutputStream() throws IOException, SecurityException {
        super();
    }

    @Override
    protected void writeStreamHeader() throws IOException {
    }
    
}
