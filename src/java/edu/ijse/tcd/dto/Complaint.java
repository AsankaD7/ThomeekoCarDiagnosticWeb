/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Complaint.findAll", query = "SELECT c FROM Complaint c"),
    @NamedQuery(name = "Complaint.findByComplaintId", query = "SELECT c FROM Complaint c WHERE c.complaintId = :complaintId"),
    @NamedQuery(name = "Complaint.findByNature", query = "SELECT c FROM Complaint c WHERE c.nature = :nature"),
    @NamedQuery(name = "Complaint.findByInstruction", query = "SELECT c FROM Complaint c WHERE c.instruction = :instruction")})
public class Complaint implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "complaint_id", nullable = false, length = 10)
    private String complaintId;
    @Size(min = 3,max = 200)
    @Column(length = 200)
    private String nature;
    @Size(min = 3,max = 200)
    @Column(length = 200)
    private String instruction;
    @OneToMany(mappedBy = "complaintId", fetch = FetchType.LAZY)
    private List<JobDone> jobDoneList;
    @JoinColumn(name = "jobNumber", referencedColumnName = "jobNumber")
    @ManyToOne(fetch = FetchType.LAZY)
    private JobCard jobNumber;

    public Complaint() {
    }

    public Complaint(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @XmlTransient
    public List<JobDone> getJobDoneList() {
        return jobDoneList;
    }

    public void setJobDoneList(List<JobDone> jobDoneList) {
        this.jobDoneList = jobDoneList;
    }

    public JobCard getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(JobCard jobNumber) {
        this.jobNumber = jobNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complaintId != null ? complaintId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Complaint)) {
            return false;
        }
        Complaint other = (Complaint) object;
        if ((this.complaintId == null && other.complaintId != null) || (this.complaintId != null && !this.complaintId.equals(other.complaintId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ijse.tcd.dto.Complaint[ complaintId=" + complaintId + " ]";
    }
    
}
