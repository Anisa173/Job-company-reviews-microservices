package com.demo.job.dto;

import com.demo.job.entity.Job;
import com.demo.job.external.Company;
import com.demo.job.external.Review;

import java.util.List;

public class JobMapper {

    public static JobDTO mapToDto(Job job, Company company, List<Review> review) {
        JobDTO jobwithCompanyDTO = new JobDTO();
        jobwithCompanyDTO.setJob(job);
        jobwithCompanyDTO.setCompany(company);
        jobwithCompanyDTO.setReview(review);
        return jobwithCompanyDTO;
    }


}
