package persistencia.datos;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import manejo.excepciones.FileDoesNotExist;
import manejo.excepciones.MyObjectOutputStream;

/**
 *
 * @author gabri
 * @param <T>
 */
public class ManejoBinarios<T> {

    private File archivo;
    private ArrayList<T> datos;

    public ManejoBinarios(String nombre) throws FileDoesNotExist {
        this.archivo = new File("./data/" + nombre);
        this.datos = new ArrayList<>();
    }

    public ManejoBinarios(File archivo) throws FileDoesNotExist {
        this.archivo = archivo;
        this.datos = new ArrayList<>();
        obtenerDatos();
    }

    public void escribirBinario(T data) {
        try {
            if (binarioVacio()) {
                FileOutputStream fos = new FileOutputStream(archivo, true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(data);
                oos.flush();

                oos.close();
                fos.close();
            } else {
                FileOutputStream fos = new FileOutputStream(archivo, true);
                MyObjectOutputStream oos = new MyObjectOutputStream(fos);
                oos.writeObject(data);
                oos.flush();

                oos.close();
                fos.close();
            }
        } catch (IOException e) {
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private boolean binarioVacio() {
        try ( FileInputStream inputStream = new FileInputStream(archivo);  BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            byte[] buffer = new byte[10];
            int bytesRead;
            return (bytesRead = inputStream.read(buffer)) == -1;
        } catch (IOException e) {
        }
        return true;
    }

    public void obtenerDatos() throws FileDoesNotExist {
        if (archivo.exists()) {
            T elemento;
            try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo)) ) {
                while (true) {  
                    elemento = (T)ois.readObject();
                    datos.add(elemento);
                    System.out.println(elemento);
                }
            } catch (FileNotFoundException ex) {
                System.err.println(ex.getMessage());
            } catch (EOFException ex) {
            } catch (IOException | ClassNotFoundException ex) {
                System.err.println(ex.getMessage());
            }catch(Exception ex){
                System.err.println(ex.getMessage());
            }
        } else {
            throw new FileDoesNotExist("No existe el archivo");
        }
    }

    public void eliminarDato(T dato) throws FileDoesNotExist {
        if (datos.remove(dato)) {
            ArrayList<T> copia = datos;
            eliminarArchivo();
            for (T t : copia) {
                escribirBinario(t);
            }
        }
    }

    public void eliminarArchivo() throws FileDoesNotExist {
        if (archivo.exists()) {
            archivo.delete();
        } else {
            throw new FileDoesNotExist("No existe el archivo");
        }
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<T> getDatos() throws FileDoesNotExist {
        obtenerDatos();
        for (int i = 0; i < datos.size() - 1; i++) {
            for (int j = i + 1; j < datos.size(); j++) {
                if(datos.get(i).equals(datos.get(j))){
                    datos.remove(j);
                    j--;
                }
            }
        }
        return datos;
    }

    public void setDatos(ArrayList<T> datos) {
        this.datos = datos;
    }

}
