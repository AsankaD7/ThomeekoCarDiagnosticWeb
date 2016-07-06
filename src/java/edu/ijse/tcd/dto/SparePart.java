/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author asankad
 */
@Entity
@Table(catalog = "jobcard", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SparePart.findAll", query = "SELECT s FROM SparePart s"),
    @NamedQuery(name = "SparePart.findByPartId", query = "SELECT s FROM SparePart s WHERE s.partId = :partId"),
    @NamedQuery(name = "SparePart.findByDescription", query = "SELECT s FROM SparePart s WHERE s.description = :description")})
public class SparePart implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "part_id", nullable = false, length = 10)
    private String partId;
    @Size(min = 3,max = 200)
    @Column(length = 200)
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sparePart", fetch = FetchType.LAZY)
    private List<CardDetail> cardDetailList;

    public SparePart() {
    }

    public SparePart(String partId) {
        this.partId = partId;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<CardDetail> getCardDetailList() {
        return cardDetailList;
    }

    public void setCardDetailList(List<CardDetail> cardDetailList) {
        this.cardDetailList = cardDetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partId != null ? partId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SparePart)) {
            return false;
        }
        SparePart other = (SparePart) object;
        if ((this.partId == null && other.partId != null) || (this.partId != null && !this.partId.equals(other.partId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ijse.tcd.dto.SparePart[ partId=" + partId + " ]";
    }
    
}
