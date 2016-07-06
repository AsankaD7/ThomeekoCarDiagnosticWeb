/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
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
    @NamedQuery(name = "JobDone.findAll", query = "SELECT j FROM JobDone j"),
    @NamedQuery(name = "JobDone.findByJobDoneid", query = "SELECT j FROM JobDone j WHERE j.jobDoneid = :jobDoneid"),
    @NamedQuery(name = "JobDone.findByNature", query = "SELECT j FROM JobDone j WHERE j.nature = :nature"),
    @NamedQuery(name = "JobDone.findByAmount", query = "SELECT j FROM JobDone j WHERE j.amount = :amount")})
public class JobDone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "jobDone_id", nullable = false, length = 10)
    private String jobDoneid;
    @Size(max = 200)
    @Column(length = 200)
    private String nature;
    private Integer amount;
    @JoinColumn(name = "complaint_id", referencedColumnName = "complaint_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Complaint complaintId;

    public JobDone() {
    }

    public JobDone(String jobDoneid) {
        this.jobDoneid = jobDoneid;
    }

    public String getJobDoneid() {
        return jobDoneid;
    }

    public void setJobDoneid(String jobDoneid) {
        this.jobDoneid = jobDoneid;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Complaint getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Complaint complaintId) {
        this.complaintId = complaintId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobDoneid != null ? jobDoneid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JobDone)) {
            return false;
        }
        JobDone other = (JobDone) object;
        if ((this.jobDoneid == null && other.jobDoneid != null) || (this.jobDoneid != null && !this.jobDoneid.equals(other.jobDoneid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ijse.tcd.dto.JobDone[ jobDoneid=" + jobDoneid + " ]";
    }
    
}
