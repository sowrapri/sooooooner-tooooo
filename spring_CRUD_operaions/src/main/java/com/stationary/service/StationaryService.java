package com.stationary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stationary.command.JobProfileCommand;
import com.stationary.entities.JobDetailsDtpTest;
import com.stationary.repository.CrudStationaryDao;

@Service
public class StationaryService {

	@Autowired
	CrudStationaryDao crudDao;

	public String persistJobTransaction(JobProfileCommand command) {
		JobDetailsDtpTest dtpDetails = null;

		dtpDetails = new JobDetailsDtpTest();
		dtpDetails.setJobType(1);
		dtpDetails.setJobTypeCode("DTP");
		dtpDetails.setContactNumber(command.getContactNumber());
		dtpDetails.setDelay(command.getDelay());
		dtpDetails.setJobDescription(command.getDescription());
		dtpDetails.setHours(command.getDtpHours());
		dtpDetails.setDays(command.getDtpDays());
		dtpDetails.setExpectedDateOfCompletion(command.getEdc());
		dtpDetails.setJobEnabled(command.isDtp());
		dtpDetails.setJobCompleted(command.isDtpCompletedFlag());

		// String responseJobId = dao.persistDtpData(dtpDetails);
		JobDetailsDtpTest responseJob = crudDao.save(dtpDetails);

		Integer responsejobId = responseJob.getJobSequenceId();

		return "" + responsejobId;
	}
	
	
	public JobDetailsDtpTest getJobDetailsByJobId(Integer jobId) {
		return crudDao.getJobDetails(jobId);
		
	}
}
