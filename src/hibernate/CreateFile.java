package hibernate;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateFile {
    public CreateFile(){}

    /**
     *
     * Recibe un objeto genérico y lo transforma en un archivo con el nombre indicado
     * @param object genérico
     * @param name nombre del archivo
     * @throws IOException
     */
    public void Create(Object object, String name) throws IOException
    {
        name += ".dat";
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.flush();
        objectOutputStream.close();

    }

/*    public void Create(Modulo modulo, String name) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(modulo);
        objectOutputStream.flush();
        objectOutputStream.close();
    }


    public void Create(Profesor profesor, String name) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(profesor);
        objectOutputStream.flush();
        objectOutputStream.close();

    }


    public void Create(Alumno alumno, String name) throws IOException{

        FileOutputStream fileOutputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(alumno);
        objectOutputStream.flush();
        objectOutputStream.close();


    }*/



}
