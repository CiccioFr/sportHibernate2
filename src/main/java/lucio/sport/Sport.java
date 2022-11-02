package lucio.sport;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import lucio.sport.model.payLoad.restituisceGiocatore;
import lucio.sport.model.payLoad.restituisceSquadra;

/**
 *
 * @author Francesco
 */
public class Sport {

    public static void main(String[] args) {

        restituisceGiocatore.getGiocatore();
        restituisceSquadra.getSquadra();
    }

}
