package lucio.sport.model.payLoad;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import lucio.provahibernate.db.Persona;

/**
 *
 * @author WS2
 */
public class InserireNelDB {

    /* transazioni sul database 
        è un raggruppamento di operazioni sul db 
        una transazione rende atomiche una serie di operazioni
        o vengono fatte tutte o vengono annullati
     */
    public static void creaPersona(Persona p) {
        EntityManager db = db();
        EntityTransaction tx = db.getTransaction();

        try {
            tx.begin();     // inizia la transazione
            db.persist(p);// persist(); solo per le operazioni di INSERT
            tx.commit();    // consolida le operazioni
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            db.close();
        }

        // tx.isActive() // return bool - se la transazione è ancora attiva (è avvenuta una eccezzione e non è stato eseguito il commit(), fai la rollback()
        // 
    }

    public static EntityManager db() {
        return Persistence.createEntityManagerFactory("partita")
                .createEntityManager(); // createEntityManager è la connessione al DB
        /* "partita" è <persistence-unit name="partita" transaction-type="RESOURCE_LOCAL"> 
        * di "Other Source\scr\main\resources\META-INF\persistence.xml */
    }
}
