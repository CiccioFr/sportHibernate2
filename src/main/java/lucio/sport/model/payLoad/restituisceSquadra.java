package lucio.sport.model.payLoad;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import lucio.sport.Partita;
import lucio.sport.Squadra;

/**
 *
 * @author Francesco
 */
public class restituisceSquadra {

    public static void getSquadra() {
        EntityManager db = db();
        try {
            TypedQuery<Partita> selectPartite
                    = db.createNamedQuery("Partita.findAll", Partita.class);
            List<Partita> listPartite = selectPartite.getResultList();
            for (Partita p : listPartite) {
                System.out.println("Squadra: " + p.getIdSquadra().getNome());
            }
        }catch (Exception e) {
        }finally {
            db.close();
        }
        }

    

    public static EntityManager db() {
        return Persistence.createEntityManagerFactory("partita")
                .createEntityManager(); // createEntityManager è la connessione al DB
        /* "partita" è <persistence-unit name="partita" transaction-type="RESOURCE_LOCAL"> 
        * di "Other Source\scr\main\resources\META-INF\persistence.xml */
    }
}
