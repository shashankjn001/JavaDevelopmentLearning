package com.shashank.JavaDevelopmentLearning.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashank.JavaDevelopmentLearning.model.JobPost;
import com.shashank.JavaDevelopmentLearning.repo.JobRepo;

@Service
public class JobService {

   
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
    repo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void loadData() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in Java1", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
            new JobPost(2, "Java Developer2", "Must have good experience in Java2", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
            new JobPost(3, "Java Developer3", "Must have good experience in Java3", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
            new JobPost(4, "Java Developer4", "Must have good experience in Java4", 6, new ArrayList<>(Arrays.asList("Spring","Java")))

            ));

       repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
       return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }


}
