package com.stationary;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stationary.entities.JobDetailsDtpTest;
import com.stationary.repository.CrudStationaryDao;
import com.stationary.service.StationaryServiceTest;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = { CrudStationaryDao.class, CrudRepositoryDaoTest.class, StationaryServiceTest.class })
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.HSQL)
public class CrudRepositoryDaoTest {

	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	private CrudStationaryDao dao;

	// @Test
	public void contextLoads() {
	}

	@Test
	public void emptyDb() {
		Iterable<JobDetailsDtpTest> list = dao.findAll();

		assertThat(list).isEmpty();
	}

	@Test
	public void saveEntity() {
		JobDetailsDtpTest dtpDetails = new JobDetailsDtpTest();
		dtpDetails = new JobDetailsDtpTest();
		dtpDetails.setJobType(1);
		dtpDetails.setJobTypeCode("DTP");
		dtpDetails.setContactNumber("9090909090");
		dtpDetails.setDelay(2);
		dtpDetails.setJobDescription("this is test");
		dtpDetails.setHours(3);
		dtpDetails.setDays(4);
		dtpDetails.setExpectedDateOfCompletion(new Date());
		dtpDetails.setJobEnabled(true);
		dtpDetails.setJobCompleted(true);

		testEntityManager.persist(dtpDetails);
		testEntityManager.flush();

		Iterable<JobDetailsDtpTest> details = dao.findAll();
		List<JobDetailsDtpTest> list = new ArrayList<>();
		details.forEach(dtp -> list.add(dtp));

		assertThat(list.size()).isEqualTo(1);

	}

	@After
	public void clean() {
		dao.deleteAll();
	}
}
