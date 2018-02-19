package com.stationary.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "JOB_DETAILS")
public class JobDetailsDtpTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5149726814082875963L;
	@GenericGenerator(name = "gen", strategy = "increment")
	@Id
	@GeneratedValue(generator = "gen")
	@Column(name = "JOB_SEQUENCE_ID")
	private int jobSequenceId;
	@Column(name = "ENABLED_FLAG")
	private boolean jobEnabled;
	@Column(name = "JOB_TYPE")
	private int jobType;
	@Column(name = "JOB_TYPE_CODE")
	private String jobTypeCode;
	@Column(name = "DAYS")
	private int days;
	@Column(name = "HOURS")
	private int hours;
	@Column(name = "WORK_COMPLETED_FLAG")
	private boolean jobCompleted;
	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;
	@Column(name = "JOB_DESCRIPTION")
	private String jobDescription;
	@Column(name = "EXPECTED_DATE_OF_COMPLETION")
	private Date expectedDateOfCompletion;
	private long delay;

	public int getJobSequenceId() {
		return jobSequenceId;
	}

	public void setJobSequenceId(int jobSequenceId) {
		this.jobSequenceId = jobSequenceId;
	}

	public boolean isJobEnabled() {
		return jobEnabled;
	}

	public void setJobEnabled(boolean jobEnabled) {
		this.jobEnabled = jobEnabled;
	}

	public int getJobType() {
		return jobType;
	}

	public void setJobType(int jobType) {
		this.jobType = jobType;
	}

	public String getJobTypeCode() {
		return jobTypeCode;
	}

	public void setJobTypeCode(String jobTypeCode) {
		this.jobTypeCode = jobTypeCode;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public boolean isJobCompleted() {
		return jobCompleted;
	}

	public void setJobCompleted(boolean jobCompleted) {
		this.jobCompleted = jobCompleted;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Date getExpectedDateOfCompletion() {
		return expectedDateOfCompletion;
	}

	public void setExpectedDateOfCompletion(Date expectedDateOfCompletion) {
		this.expectedDateOfCompletion = expectedDateOfCompletion;
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

}
