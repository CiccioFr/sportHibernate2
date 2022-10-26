package lucio.sport;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lucio.sport.Partita;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-26T17:55:24", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Squadra.class)
public class Squadra_ { 

    public static volatile SingularAttribute<Squadra, Integer> numeroGiocatoriSquadra;
    public static volatile CollectionAttribute<Squadra, Partita> partitaCollection;
    public static volatile SingularAttribute<Squadra, String> nome;
    public static volatile SingularAttribute<Squadra, Integer> id;
    public static volatile SingularAttribute<Squadra, String> attivitaSportiva;

}