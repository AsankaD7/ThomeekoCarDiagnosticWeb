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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
    @NamedQuery(name = "JobCard.findAll", query = "SELECT j FROM JobCard j"),
    @NamedQuery(name = "JobCard.findByJobNumber", query = "SELECT j FROM JobCard j WHERE j.jobNumber = :jobNumber"),
    @NamedQuery(name = "JobCard.findByVehicleNumber", query = "SELECT j FROM JobCard j WHERE j.vehicleNumber = :vehicleNumber"),
    @NamedQuery(name = "JobCard.findByDate", query = "SELECT j FROM JobCard j WHERE j.date = :date"),
    @NamedQuery(name = "JobCard.findByModel", query = "SELECT j FROM JobCard j WHERE j.model = :model"),
    @NamedQuery(name = "JobCard.findByGroupLeader", query = "SELECT j FROM JobCard j WHERE j.groupLeader = :groupLeader")})
public class JobCard implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String jobNumber;
    @Size(min = 3,max = 10)
    @Column(length = 10)
    private String vehicleNumber;
    @Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")
    @Column(length = 10)
    private String date;
    @Size(min = 3,max = 100)
    @Column(length = 100)
    private String model;
    @Size(min = 3,max = 100)
    @Column(length = 100)
    private String groupLeader;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customerId;
    @JoinColumn(name = "grade_id", referencedColumnName = "grade_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grade gradeId;
    @OneToMany(mappedBy = "jobNumber", fetch = FetchType.LAZY)
    private List<Complaint> complaintList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobCard", fetch = FetchType.LAZY)
    private List<CardDetail> cardDetailList;
    @OneToMany(mappedBy = "jobNumber", fetch = FetchType.LAZY)
    private List<JobFinish> jobFinishList;

    public JobCard() {
    }

    public JobCard(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(String groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Grade getGradeId() {
        return gradeId;
    }

    public void setGradeId(Grade gradeId) {
        this.gradeId = gradeId;
    }

    @XmlTransient
    public List<Complaint> getComplaintList() {
        return complaintList;
    }

    public void setComplaintList(List<Complaint> complaintList) {
        this.complaintList = complaintList;
    }

    @XmlTransient
    public List<CardDetail> getCardDetailList() {
        return cardDetailList;
    }

    public void setCardDetailList(List<CardDetail> cardDetailList) {
        this.cardDetailList = cardDetailList;
    }

    @XmlTransient
    public List<JobFinish> getJobFinishList() {
        return jobFinishList;
    }

    public void setJobFinishList(List<JobFinish> jobFinishList) {
        this.jobFinishList = jobFinishList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobNumber != null ? jobNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JobCard)) {
            return false;
        }
        JobCard other = (JobCard) object;
        if ((this.jobNumber == null && other.jobNumber != null) || (this.jobNumber != null && !this.jobNumber.equals(other.jobNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ijse.tcd.dto.JobCard[ jobNumber=" + jobNumber + " ]";
    }
    
}
