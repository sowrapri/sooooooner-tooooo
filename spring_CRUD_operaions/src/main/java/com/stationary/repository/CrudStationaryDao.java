package com.stationary.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stationary.entities.JobDetailsDtpTest;

@Repository
public interface CrudStationaryDao extends CrudRepository<JobDetailsDtpTest, Integer> {

	@Query("select job from JobDetailsDtpTest as job where job.jobSequenceId=:jobId")
	public JobDetailsDtpTest getJobDetails(@Param("jobId") Integer jobId);

}
