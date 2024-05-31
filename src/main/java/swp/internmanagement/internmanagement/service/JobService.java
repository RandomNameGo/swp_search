package swp.internmanagement.internmanagement.service;

import swp.internmanagement.internmanagement.entity.Job;

import java.util.List;

public interface JobService {

    List<Job> findByJobName(String jobName);


    List<Job> findJobByCompanyName (String companyName);


    List<Job> findAll();
}
