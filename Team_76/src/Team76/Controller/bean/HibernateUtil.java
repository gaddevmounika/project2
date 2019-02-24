package bean;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
public class HibernateUtil {
    
    //XML based configuration
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
         try {
                Configuration configuration = new Configuration();
                Properties props = new Properties();
                props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                props.put(Environment.URL, "jdbc:mysql://localhost:3306/ser516p2");
                props.put(Environment.USER, "root");
                props.put(Environment.PASS, "pass123");
                props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                props.put(Environment.SHOW_SQL, "true");
                props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                props.put(Environment.HBM2DDL_AUTO, "create-drop");
                configuration.setProperties(props);
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Quiz.class);
                configuration.addAnnotatedClass(Answer.class);
                configuration.addAnnotatedClass(Question.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) sessionFactory = buildSessionFactory();
        return sessionFactory;
    }

}