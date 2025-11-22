package com.demo.job.dto;

import com.demo.job.entity.Job;
import com.demo.job.external.Company;
import com.demo.job.external.Review;

import java.util.List;

public class JobDTO {

private Job job;
private Company company;
private List<Review> review;
    public JobDTO(Job job, Company company) {
        this.job = job;
        this.company = company;
    }

    public JobDTO(Job job, Company company, List<Review> review) {
        this.job = job;
        this.company = company;
        this.review = review;
    }

    public JobDTO() {

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

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }
}
