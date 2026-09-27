package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final String PERSISTENCE_UNIT = "mysqlconexion";
	private static final EntityManagerFactory fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

	public static EntityManager getEntityManager() {
		return fabrica.createEntityManager();
	}

	public static void close() {
		if (fabrica.isOpen()) {
			fabrica.close();
		}
	}
}
