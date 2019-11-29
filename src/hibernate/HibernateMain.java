package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateMain {

    public static void main(String[] args){
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        //Alumno a = new Alumno("", "argentino",35, "varon");
        GeneradorCasosPAC gcpac = new GeneradorCasosPAC();
        Alumno alumno = new Alumno(gcpac.getName(), gcpac.getNation(), gcpac.getAge(), gcpac.getGendre());
        Profesor profesor = new Profesor(gcpac.getName(), gcpac.getGendre());
        Modulo modulo = new Modulo(gcpac.getModuleName(),gcpac.getCodigo());

        session.save(alumno);
        session.save(profesor);
        session.save(modulo);


        tx.commit();
        session.close();
        sessionFactory.close();
    }

}