package com.shashank.JavaDevelopmentLearning.service;

import com.shashank.JavaDevelopmentLearning.model.JobPost;
import com.shashank.JavaDevelopmentLearning.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){
    repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
