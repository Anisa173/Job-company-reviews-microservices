package com.demo.job.dto;

import com.demo.job.entity.Job;
import com.demo.job.external.Company;

public class JobwithCompanyDTO {

private Job job;
private Company company;

    public JobwithCompanyDTO(Job job, Company company) {
        this.job = job;
        this.company = company;
    }

    public JobwithCompanyDTO() {

    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
