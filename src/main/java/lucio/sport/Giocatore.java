package lucio.sport;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Francesco
 */
@Entity
@Table(name = "giocatori")
@NamedQueries({
    @NamedQuery(name = "Giocatore.findAll", query = "SELECT g FROM Giocatore g"),
    @NamedQuery(name = "Giocatore.findById", query = "SELECT g FROM Giocatore g WHERE g.id = :id"),
    @NamedQuery(name = "Giocatore.findByNome", query = "SELECT g FROM Giocatore g WHERE g.nome = :nome"),
    @NamedQuery(name = "Giocatore.findBySportPraticato", query = "SELECT g FROM Giocatore g WHERE g.sportPraticato = :sportPraticato"),
    @NamedQuery(name = "Giocatore.findByNumeroMaglia", query = "SELECT g FROM Giocatore g WHERE g.numeroMaglia = :numeroMaglia"),
    @NamedQuery(name = "Giocatore.findByDataNascita", query = "SELECT g FROM Giocatore g WHERE g.dataNascita = :dataNascita"),
    @NamedQuery(name = "Giocatore.findBySesso", query = "SELECT g FROM Giocatore g WHERE g.sesso = :sesso")})
public class Giocatore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "sport_praticato")
    private String sportPraticato;
    @Basic(optional = false)
    @Column(name = "numero_maglia")
    private int numeroMaglia;
    @Column(name = "data_nascita")
    @Temporal(TemporalType.DATE)
    private Date dataNascita;
    @Column(name = "sesso")
    private Character sesso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGiocatore")
    private Collection<Partita> partitaCollection;

    public Giocatore() {
    }

    public Giocatore(Integer id) {
        this.id = id;
    }

    public Giocatore(Integer id, String nome, String sportPraticato, int numeroMaglia) {
        this.id = id;
        this.nome = nome;
        this.sportPraticato = sportPraticato;
        this.numeroMaglia = numeroMaglia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSportPraticato() {
        return sportPraticato;
    }

    public void setSportPraticato(String sportPraticato) {
        this.sportPraticato = sportPraticato;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Character getSesso() {
        return sesso;
    }

    public void setSesso(Character sesso) {
        this.sesso = sesso;
    }

    public Collection<Partita> getPartitaCollection() {
        return partitaCollection;
    }

    public void setPartitaCollection(Collection<Partita> partitaCollection) {
        this.partitaCollection = partitaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giocatore)) {
            return false;
        }
        Giocatore other = (Giocatore) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lucio.sport.Giocatore[ id=" + id + " ]";
    }
    
}
