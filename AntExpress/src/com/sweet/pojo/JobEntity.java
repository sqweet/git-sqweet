package com.sweet.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Job", schema = "dbo", catalog = "AntExpress")
public class JobEntity {
    private int jobId;
    private String jobName;
    private String jobDetails;

    @Id
    @Column(name = "JobId", nullable = false)
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "JobName", nullable = true, length = 16)
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Basic
    @Column(name = "JobDetails", nullable = true, length = 256)
    public String getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(String jobDetails) {
        this.jobDetails = jobDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobEntity jobEntity = (JobEntity) o;
        return jobId == jobEntity.jobId &&
                Objects.equals(jobName, jobEntity.jobName) &&
                Objects.equals(jobDetails, jobEntity.jobDetails);
    }

    @Override
    public int hashCode() {

        return Objects.hash(jobId, jobName, jobDetails);
    }
}
