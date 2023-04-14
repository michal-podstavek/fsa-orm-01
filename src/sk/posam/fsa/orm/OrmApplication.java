package sk.posam.fsa.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import sk.posam.fsa.orm.domain.Actor;
import sk.posam.fsa.orm.domain.Category;

import java.util.List;

public class OrmApplication {
    public static void main(String[] args) {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();
//            session.beginTransaction();
            List result = session.createQuery("from Actor").list();
            for (Actor actor : (List<Actor>) result) {
                System.out.println(actor.toString());
            }

            result = session.createQuery("from Category").list();
            for (Category category : (List<Category>) result) {
                System.out.println(category.toString());
            }

//            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
