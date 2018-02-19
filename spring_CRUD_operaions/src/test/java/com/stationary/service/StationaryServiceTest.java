package com.stationary.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.stationary.command.JobProfileCommand;
import com.stationary.entities.JobDetailsDtpTest;
import com.stationary.repository.CrudStationaryDao;

@RunWith(SpringRunner.class)
public class StationaryServiceTest {


	@TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public StationaryService employeeService() {
            return new StationaryService();
        }
    }

	JobProfileCommand command = new JobProfileCommand(true, 2, 3, true, true, 3, 2, false, false, 3, 2, true, "122",
			"2364523", "this is testing one", new Date(), 2);
	
	@Autowired
	StationaryService service;
	
	@MockBean
	CrudStationaryDao dao;
	
	@Before
	public void setup() {
		JobDetailsDtpTest dtpDetails = new JobDetailsDtpTest();
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
		
		Mockito.when(dao.save(dtpDetails)).thenReturn(dtpDetails);
		
		Mockito.when(dao.getJobDetails(1)).thenReturn(dtpDetails);
	}
	
	@Test
	public void test() {

		String res = service.persistJobTransaction(command);

		assertThat(res).isEqualTo(""+123);
	}
	
	@Test
	public void testfindJobDetailsJobId() {
		JobDetailsDtpTest jobDetails = service.getJobDetailsByJobId(1);
		
		assertThat(jobDetails.getContactNumber()).isEqualTo(command.getContactNumber());
	}
}
