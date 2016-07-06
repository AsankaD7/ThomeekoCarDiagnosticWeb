/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asankad
 */
@Entity
@Table(catalog = "jobcard", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CardDetail.findAll", query = "SELECT c FROM CardDetail c"),
    @NamedQuery(name = "CardDetail.findByJobNumber", query = "SELECT c FROM CardDetail c WHERE c.cardDetailPK.jobNumber = :jobNumber"),
    @NamedQuery(name = "CardDetail.findByPartId", query = "SELECT c FROM CardDetail c WHERE c.cardDetailPK.partId = :partId"),
    @NamedQuery(name = "CardDetail.findByQty", query = "SELECT c FROM CardDetail c WHERE c.qty = :qty"),
    @NamedQuery(name = "CardDetail.findByAmount", query = "SELECT c FROM CardDetail c WHERE c.amount = :amount")})
public class CardDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CardDetailPK cardDetailPK;
    private Integer qty;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 10, scale = 2)
    private BigDecimal amount;
    @JoinColumn(name = "jobNumber", referencedColumnName = "jobNumber", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private JobCard jobCard;
    @JoinColumn(name = "part_id", referencedColumnName = "part_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SparePart sparePart;

    public CardDetail() {
    }

    public CardDetail(CardDetailPK cardDetailPK) {
        this.cardDetailPK = cardDetailPK;
    }

    public CardDetail(String jobNumber, String partId) {
        this.cardDetailPK = new CardDetailPK(jobNumber, partId);
    }

    public CardDetailPK getCardDetailPK() {
        return cardDetailPK;
    }

    public void setCardDetailPK(CardDetailPK cardDetailPK) {
        this.cardDetailPK = cardDetailPK;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public JobCard getJobCard() {
        return jobCard;
    }

    public void setJobCard(JobCard jobCard) {
        this.jobCard = jobCard;
    }

    public SparePart getSparePart() {
        return sparePart;
    }

    public void setSparePart(SparePart sparePart) {
        this.sparePart = sparePart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardDetailPK != null ? cardDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CardDetail)) {
            return false;
        }
        CardDetail other = (CardDetail) object;
        if ((this.cardDetailPK == null && other.cardDetailPK != null) || (this.cardDetailPK != null && !this.cardDetailPK.equals(other.cardDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ijse.tcd.dto.CardDetail[ cardDetailPK=" + cardDetailPK + " ]";
    }
    
}
