/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecna
 */
@Entity
@Table(name = "EMENTAIEFP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ementaiefp.findAll", query = "SELECT e FROM Ementaiefp e")
    , @NamedQuery(name = "Ementaiefp.findByIdementa", query = "SELECT e FROM Ementaiefp e WHERE e.idementa = :idementa")
    , @NamedQuery(name = "Ementaiefp.findByPeixe", query = "SELECT e FROM Ementaiefp e WHERE e.peixe = :peixe")
    , @NamedQuery(name = "Ementaiefp.findByDieta", query = "SELECT e FROM Ementaiefp e WHERE e.dieta = :dieta")
    , @NamedQuery(name = "Ementaiefp.findByOpcao", query = "SELECT e FROM Ementaiefp e WHERE e.opcao = :opcao")
    , @NamedQuery(name = "Ementaiefp.findByAlternativa", query = "SELECT e FROM Ementaiefp e WHERE e.alternativa = :alternativa")
    , @NamedQuery(name = "Ementaiefp.findByCarne", query = "SELECT e FROM Ementaiefp e WHERE e.carne = :carne")
    , @NamedQuery(name = "Ementaiefp.findByDiadasemana", query = "SELECT e FROM Ementaiefp e WHERE e.diadasemana = :diadasemana")})
public class Ementaiefp implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDEMENTA")
    private Short idementa;
    @Basic(optional = false)
    @Column(name = "PEIXE")
    private String peixe;
    @Basic(optional = false)
    @Column(name = "DIETA")
    private String dieta;
    @Basic(optional = false)
    @Column(name = "OPCAO")
    private String opcao;
    @Basic(optional = false)
    @Column(name = "ALTERNATIVA")
    private String alternativa;
    @Column(name = "CARNE")
    private String carne;
    @Column(name = "DIADASEMANA")
    private String diadasemana;

    public Ementaiefp() {
    }

    public Ementaiefp(Short idementa) {
        this.idementa = idementa;
    }

    public Ementaiefp(Short idementa, String peixe, String dieta, String opcao, String alternativa) {
        this.idementa = idementa;
        this.peixe = peixe;
        this.dieta = dieta;
        this.opcao = opcao;
        this.alternativa = alternativa;
    }

    public Short getIdementa() {
        return idementa;
    }

    public void setIdementa(Short idementa) {
        Short oldIdementa = this.idementa;
        this.idementa = idementa;
        changeSupport.firePropertyChange("idementa", oldIdementa, idementa);
    }

    public String getPeixe() {
        return peixe;
    }

    public void setPeixe(String peixe) {
        String oldPeixe = this.peixe;
        this.peixe = peixe;
        changeSupport.firePropertyChange("peixe", oldPeixe, peixe);
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        String oldDieta = this.dieta;
        this.dieta = dieta;
        changeSupport.firePropertyChange("dieta", oldDieta, dieta);
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        String oldOpcao = this.opcao;
        this.opcao = opcao;
        changeSupport.firePropertyChange("opcao", oldOpcao, opcao);
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        String oldAlternativa = this.alternativa;
        this.alternativa = alternativa;
        changeSupport.firePropertyChange("alternativa", oldAlternativa, alternativa);
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        String oldCarne = this.carne;
        this.carne = carne;
        changeSupport.firePropertyChange("carne", oldCarne, carne);
    }

    public String getDiadasemana() {
        return diadasemana;
    }

    public void setDiadasemana(String diadasemana) {
        String oldDiadasemana = this.diadasemana;
        this.diadasemana = diadasemana;
        changeSupport.firePropertyChange("diadasemana", oldDiadasemana, diadasemana);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idementa != null ? idementa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ementaiefp)) {
            return false;
        }
        Ementaiefp other = (Ementaiefp) object;
        if ((this.idementa == null && other.idementa != null) || (this.idementa != null && !this.idementa.equals(other.idementa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pck.Ementaiefp[ idementa=" + idementa + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
