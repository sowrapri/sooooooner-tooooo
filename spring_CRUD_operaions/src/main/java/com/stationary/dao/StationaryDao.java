package com.stationary.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.stationary.entities.JobDetailsDtpTest;

import utility.HibernateUtil;

//@Repository
public class StationaryDao {

	public String persistDtpData(JobDetailsDtpTest dtpDetails) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		String jobId;
		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.getTransaction();
		boolean flag = false;
		try {
			session = sessionFactory.getCurrentSession();

			transaction = session.beginTransaction();

			jobId = (String) session.save(dtpDetails);
			// System.out.println("save operation is done");
			flag = true;

		} finally {
			if (session != null) {
				if (flag == true) {

					// to commit the transactions
					transaction.commit();
					System.out.println("data committed in DB");
				} else {

					// to rollback the transactions if any exception
					transaction.rollback();
					System.out.println("BOSS ! Something went wrong , DATA ROLLBACKED");

				}
				//session.close();
				System.out.println("data saving session completed");
			}
		}
		return jobId;
	}

}
