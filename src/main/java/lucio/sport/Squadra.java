/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lucio.sport;

import java.io.Serializable;
import java.util.Collection;
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

/**
 *
 * @author WS2
 */
@Entity
@Table(name = "squadre")
@NamedQueries({
    @NamedQuery(name = "Squadra.findAll", query = "SELECT s FROM Squadra s"),
    @NamedQuery(name = "Squadra.findById", query = "SELECT s FROM Squadra s WHERE s.id = :id"),
    @NamedQuery(name = "Squadra.findByNome", query = "SELECT s FROM Squadra s WHERE s.nome = :nome"),
    @NamedQuery(name = "Squadra.findByAttivitaSportiva", query = "SELECT s FROM Squadra s WHERE s.attivitaSportiva = :attivitaSportiva"),
    @NamedQuery(name = "Squadra.findByNumeroGiocatoriSquadra", query = "SELECT s FROM Squadra s WHERE s.numeroGiocatoriSquadra = :numeroGiocatoriSquadra")})
public class Squadra implements Serializable {

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
    @Column(name = "attivita_sportiva")
    private String attivitaSportiva;
    @Basic(optional = false)
    @Column(name = "numero_giocatori_squadra")
    private int numeroGiocatoriSquadra;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSquadra")
    private Collection<Partita> partitaCollection;

    public Squadra() {
    }

    public Squadra(Integer id) {
        this.id = id;
    }

    public Squadra(Integer id, String nome, String attivitaSportiva, int numeroGiocatoriSquadra) {
        this.id = id;
        this.nome = nome;
        this.attivitaSportiva = attivitaSportiva;
        this.numeroGiocatoriSquadra = numeroGiocatoriSquadra;
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

    public String getAttivitaSportiva() {
        return attivitaSportiva;
    }

    public void setAttivitaSportiva(String attivitaSportiva) {
        this.attivitaSportiva = attivitaSportiva;
    }

    public int getNumeroGiocatoriSquadra() {
        return numeroGiocatoriSquadra;
    }

    public void setNumeroGiocatoriSquadra(int numeroGiocatoriSquadra) {
        this.numeroGiocatoriSquadra = numeroGiocatoriSquadra;
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
        if (!(object instanceof Squadra)) {
            return false;
        }
        Squadra other = (Squadra) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lucio.sport.Squadra[ id=" + id + " ]";
    }

}
