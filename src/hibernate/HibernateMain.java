package hibernate;

import com.mysql.cj.jdbc.Blob;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class HibernateMain {

    public static void main(String[] args) throws IOException {
        Configuration cfg = new Configuration().configure();
        //Inicializamos sessionfactory
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        //iniciamos session através del objeto session factory
        Session session = sessionFactory.openSession();
        //iniciamos transacción
        Transaction tx = session.beginTransaction();

        //creamos objeto para generación aleatoria
        GeneradorCasosPAC gcpac = new GeneradorCasosPAC();
        //creamos un alumno
        Alumno alumno = new Alumno(gcpac.getName(), gcpac.getNation(), gcpac.getAge(), gcpac.getGendre());
        //creamos un profesor
        Profesor profesor = new Profesor(gcpac.getName(), gcpac.getGendre());
        //creamos un modulo
        Modulo modulo = new Modulo(gcpac.getModuleName(),gcpac.getCodigo());

        CreateFile createFile = new CreateFile();


        createFile.Create(alumno, "alumno");
        createFile.Create(modulo, "modulo");
        createFile.Create(profesor, "profesor");


        //grabamos el alumno en la BD
        session.save(alumno);
        //grabamos el profesor en la BD
        session.save(profesor);
        //grabamos el módulo
        session.save(modulo);


        tx.commit();
        //cerramos la sesion
        session.close();
        //cerramos session factory
        sessionFactory.close();
    }

}