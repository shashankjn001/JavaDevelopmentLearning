package com.shashank.JavaDevelopmentLearning.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.shashank.JavaDevelopmentLearning.model.JobPost;;

@EnableJpaRepositories
@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
   
}

// List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//     new JobPost(1, "Java Developer", "Must have good experience in Java1", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
//     new JobPost(2, "Java Developer2", "Must have good experience in Java2", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
//     new JobPost(3, "Java Developer3", "Must have good experience in Java3", 6, new ArrayList<>(Arrays.asList("Spring","Java"))),
//     new JobPost(4, "Java Developer4", "Must have good experience in Java4", 6, new ArrayList<>(Arrays.asList("Spring","Java")))

//     ));

// public List<JobPost> getAllJobs(){
// return jobs;
// }

// public void addJob(JobPost job){
// jobs.add(job);
// System.out.println(jobs);
// }

// public JobPost getJob(int postId) {

// for(JobPost job : jobs){
//     if(job.getPostId()==postId){
//         return job;
//     }
// }

// return null;
// }

// public void updateJob(JobPost jobPost) {
// for (JobPost job :jobs){
//     if(job.getPostId() == jobPost.getPostId()){
//         job.setPostProfile(jobPost.getPostProfile());
//         job.setPostDesc(jobPost.getPostDesc());
//         job.setReqExperience(jobPost.getReqExperience());
//         job.setPostTechStack(jobPost.getPostTechStack());
//     }
// }

// }

// public void deleteJob(int postId) {
// for(JobPost job : jobs){
//     if(job.getPostId()==postId) jobs.remove(job);
// }
// }