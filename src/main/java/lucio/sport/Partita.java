/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucio.sport;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author WS2
 */
@Entity
@Table(name = "partite")
@NamedQueries({
    @NamedQuery(name = "Partita.findAll", query = "SELECT p FROM Partita p"),
    @NamedQuery(name = "Partita.findById", query = "SELECT p FROM Partita p WHERE p.id = :id"),
    @NamedQuery(name = "Partita.findByDataPartita", query = "SELECT p FROM Partita p WHERE p.dataPartita = :dataPartita")})
public class Partita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_partita")
    @Temporal(TemporalType.DATE)
    private Date dataPartita;
    @JoinColumn(name = "id_giocatore", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Giocatore idGiocatore;
    @JoinColumn(name = "id_squadra", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Squadra idSquadra;

    public Partita() {
    }

    public Partita(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataPartita() {
        return dataPartita;
    }

    public void setDataPartita(Date dataPartita) {
        this.dataPartita = dataPartita;
    }

    public Giocatore getIdGiocatore() {
        return idGiocatore;
    }

    public void setIdGiocatore(Giocatore idGiocatore) {
        this.idGiocatore = idGiocatore;
    }

    public Squadra getIdSquadra() {
        return idSquadra;
    }

    public void setIdSquadra(Squadra idSquadra) {
        this.idSquadra = idSquadra;
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
        if (!(object instanceof Partita)) {
            return false;
        }
        Partita other = (Partita) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lucio.sport.Partita[ id=" + id + " ]";
    }
    
}
