package lucio.sport;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Francesco
 */
public class Sport {

    public static void main(String[] args) {
        EntityManager db = db();
        try {
            TypedQuery<Partita> selectPartite
                    = db.createNamedQuery("Partita.findAll", Partita.class);
            List<Partita> listPartite = selectPartite.getResultList();
            for (Partita p : listPartite) {
                System.out.println("Giocatore: "+ p.getIdGiocatore().getNome()  );
            }
        } finally {
            db.close();
        }
    }

    public static EntityManager db() {
        return Persistence.createEntityManagerFactory("partita")
                .createEntityManager(); // createEntityManager è la connessione al DB
    }
    
}
