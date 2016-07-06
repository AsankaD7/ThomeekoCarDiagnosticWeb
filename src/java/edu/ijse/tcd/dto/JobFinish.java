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
import javax.validation.constraints.Pattern;
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
    @NamedQuery(name = "JobFinish.findAll", query = "SELECT j FROM JobFinish j"),
    @NamedQuery(name = "JobFinish.findByJobFinishid", query = "SELECT j FROM JobFinish j WHERE j.jobFinishid = :jobFinishid"),
    @NamedQuery(name = "JobFinish.findByTestBy", query = "SELECT j FROM JobFinish j WHERE j.testBy = :testBy"),
    @NamedQuery(name = "JobFinish.findByJobDirector", query = "SELECT j FROM JobFinish j WHERE j.jobDirector = :jobDirector"),
    @NamedQuery(name = "JobFinish.findByFinishDate", query = "SELECT j FROM JobFinish j WHERE j.finishDate = :finishDate")})
public class JobFinish implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "jobFinish_id", nullable = false, length = 10)
    private String jobFinishid;
    @Size(min = 3,max = 100)
    @Column(length = 100)
    private String testBy;
    @Size(min =3 ,max = 100)
    @Column(length = 100)
    private String jobDirector;
    @Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")
    @Size(max = 10)
    @Column(length = 10)
    private String finishDate;
    @JoinColumn(name = "jobNumber", referencedColumnName = "jobNumber")
    @ManyToOne(fetch = FetchType.LAZY)
    private JobCard jobNumber;

    public JobFinish() {
    }

    public JobFinish(String jobFinishid) {
        this.jobFinishid = jobFinishid;
    }

    public String getJobFinishid() {
        return jobFinishid;
    }

    public void setJobFinishid(String jobFinishid) {
        this.jobFinishid = jobFinishid;
    }

    public String getTestBy() {
        return testBy;
    }

    public void setTestBy(String testBy) {
        this.testBy = testBy;
    }

    public String getJobDirector() {
        return jobDirector;
    }

    public void setJobDirector(String jobDirector) {
        this.jobDirector = jobDirector;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
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
        hash += (jobFinishid != null ? jobFinishid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JobFinish)) {
            return false;
        }
        JobFinish other = (JobFinish) object;
        if ((this.jobFinishid == null && other.jobFinishid != null) || (this.jobFinishid != null && !this.jobFinishid.equals(other.jobFinishid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ijse.tcd.dto.JobFinish[ jobFinishid=" + jobFinishid + " ]";
    }
    
}
