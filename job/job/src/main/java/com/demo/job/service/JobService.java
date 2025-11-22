package com.demo.job.service;

import com.demo.job.dto.JobDTO;
import com.demo.job.entity.Job;

import java.util.List;

public interface JobService {
    List<JobDTO> findAll();
    void createJob(Job job);

    JobDTO getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
