package com.demo.job.service;

import com.demo.job.dto.JobwithCompanyDTO;
import com.demo.job.entity.Job;

import java.util.List;

public interface JobService {
    List<JobwithCompanyDTO> findAll();
    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
