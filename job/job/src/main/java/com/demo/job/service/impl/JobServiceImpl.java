package com.demo.job.service.impl;


import com.demo.job.dto.JobwithCompanyDTO;
import com.demo.job.entity.Job;
import com.demo.job.external.Company;
import com.demo.job.repository.JobRepository;
import com.demo.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<JobwithCompanyDTO> findAll() {
        List<Job> jobs = jobRepository.findAll();
        List<JobwithCompanyDTO> jobwithCompanyDTOList = new ArrayList<>();
        RestTemplate resttemplate = new RestTemplate();
        for (Job job : jobs) {
            JobwithCompanyDTO jobwithCompanyDTO = new JobwithCompanyDTO();
            jobwithCompanyDTO.setJob(job);
            Company company = resttemplate.getForObject("http://localhost:8082/companies/" + job.getCompanyId(), Company.class);
            jobwithCompanyDTO.setCompany(company);
            jobwithCompanyDTOList.add(jobwithCompanyDTO);
        }
        return jobwithCompanyDTOList;
    }

    @Override
    public void createJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {
        try {
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> jobOptional = jobRepository.findById(id);
        if (jobOptional.isPresent()) {
            Job job = jobOptional.get();
            job.setTitle(updatedJob.getTitle());
            job.setDescription(updatedJob.getDescription());
            job.setMinSalary(updatedJob.getMinSalary());
            job.setMaxSalary(updatedJob.getMaxSalary());
            job.setLocation(updatedJob.getLocation());
            jobRepository.save(job);
            return true;
        }
        return false;
    }
}