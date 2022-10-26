package lucio.sport;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lucio.sport.Giocatore;
import lucio.sport.Squadra;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-26T17:55:24", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Partita.class)
public class Partita_ { 

    public static volatile SingularAttribute<Partita, Squadra> idSquadra;
    public static volatile SingularAttribute<Partita, Date> dataPartita;
    public static volatile SingularAttribute<Partita, Giocatore> idGiocatore;
    public static volatile SingularAttribute<Partita, Integer> id;

}