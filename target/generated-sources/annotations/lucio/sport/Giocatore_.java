package lucio.sport;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lucio.sport.Partita;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-26T17:55:24", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Giocatore.class)
public class Giocatore_ { 

    public static volatile SingularAttribute<Giocatore, Date> dataNascita;
    public static volatile CollectionAttribute<Giocatore, Partita> partitaCollection;
    public static volatile SingularAttribute<Giocatore, Integer> numeroMaglia;
    public static volatile SingularAttribute<Giocatore, Character> sesso;
    public static volatile SingularAttribute<Giocatore, String> nome;
    public static volatile SingularAttribute<Giocatore, Integer> id;
    public static volatile SingularAttribute<Giocatore, String> sportPraticato;

}