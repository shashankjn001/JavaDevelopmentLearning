package com.shashank.JavaDevelopmentLearning.repo;

import com.shashank.JavaDevelopmentLearning.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in Java1", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
            new JobPost(2, "Java Developer2", "Must have good experience in Java2", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
            new JobPost(3, "Java Developer3", "Must have good experience in Java3", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
            new JobPost(4, "Java Developer4", "Must have good experience in Java4", 6, new ArrayList<>(Arrays.asList("Spring","Java")))

            ));

    public List<JobPost> getAllJobs(){
return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}
