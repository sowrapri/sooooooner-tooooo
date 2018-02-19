package utility;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory sessionFactory = null;

	static {
		try {

			Configuration configuration = new Configuration().configure();

			sessionFactory = configuration.buildSessionFactory(
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
