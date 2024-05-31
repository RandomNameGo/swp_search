package swp.internmanagement.internmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swp.internmanagement.internmanagement.entity.Job;
import swp.internmanagement.internmanagement.repository.JobRepository;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<Job> findByJobName(String jobName) {
        return jobRepository.findByJobName(jobName);
    }

    @Override
    public List<Job> findJobByCompanyName(String companyName) {
        return jobRepository.findJobByCompanyName(companyName);
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }
}
