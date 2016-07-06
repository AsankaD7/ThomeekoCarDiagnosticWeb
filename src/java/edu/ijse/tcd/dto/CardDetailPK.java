/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author asankad
 */
@Embeddable
public class CardDetailPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String jobNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "part_id", nullable = false, length = 10)
    private String partId;

    public CardDetailPK() {
    }

    public CardDetailPK(String jobNumber, String partId) {
        this.jobNumber = jobNumber;
        this.partId = partId;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobNumber != null ? jobNumber.hashCode() : 0);
        hash += (partId != null ? partId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CardDetailPK)) {
            return false;
        }
        CardDetailPK other = (CardDetailPK) object;
        if ((this.jobNumber == null && other.jobNumber != null) || (this.jobNumber != null && !this.jobNumber.equals(other.jobNumber))) {
            return false;
        }
        if ((this.partId == null && other.partId != null) || (this.partId != null && !this.partId.equals(other.partId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ijse.tcd.dto.CardDetailPK[ jobNumber=" + jobNumber + ", partId=" + partId + " ]";
    }
    
}
