package com.stationary.command;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class JobProfileCommand {

	// private String jobSequence;
	/*
	 * private boolean dtpEnabled; private String dtpDays; private String dtpHours;
	 * private boolean dtpWorkCompleted; private String contactNumber; private
	 * String description; private Date expectedDateOfCompletion; private long
	 * delay;
	 */

	private boolean dtp;

	public JobProfileCommand(boolean dtp, int dtpDays, int dtpHours, boolean dtpCompletedFlag, boolean nomination,
			int nominationDays, int nominationHours, boolean nominationCompletedFlag, boolean printing,
			int printingDays, int printingHours, boolean printingCompletedFlag, String jobNo, String contactNumber,
			String description, Date edc, int delay) {
		super();
		this.dtp = dtp;
		this.dtpDays = dtpDays;
		this.dtpHours = dtpHours;
		this.dtpCompletedFlag = dtpCompletedFlag;
		this.nomination = nomination;
		this.nominationDays = nominationDays;
		this.nominationHours = nominationHours;
		this.nominationCompletedFlag = nominationCompletedFlag;
		this.printing = printing;
		this.printingDays = printingDays;
		this.printingHours = printingHours;
		this.printingCompletedFlag = printingCompletedFlag;
		this.jobNo = jobNo;
		this.contactNumber = contactNumber;
		this.description = description;
		this.edc = edc;
		this.delay = delay;
	}

	public JobProfileCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int dtpDays;
	private int dtpHours;
	private boolean dtpCompletedFlag;
	private boolean nomination;
	private int nominationDays;
	private int nominationHours;
	private boolean nominationCompletedFlag;
	private boolean printing;
	private int printingDays;
	private int printingHours;
	private boolean printingCompletedFlag;
	private String jobNo;
	private String contactNumber;
	private String description;
	@DateTimeFormat(iso = ISO.DATE)
	private Date edc;
	private int delay;

	public boolean isDtp() {
		return dtp;
	}

	public void setDtp(boolean dtp) {
		this.dtp = dtp;
	}

	public int getDtpDays() {
		return dtpDays;
	}

	public void setDtpDays(int dtpDays) {
		this.dtpDays = dtpDays;
	}

	public int getDtpHours() {
		return dtpHours;
	}

	public void setDtpHours(int dtpHours) {
		this.dtpHours = dtpHours;
	}

	public boolean isDtpCompletedFlag() {
		return dtpCompletedFlag;
	}

	public void setDtpCompletedFlag(boolean dtpCompletedFlag) {
		this.dtpCompletedFlag = dtpCompletedFlag;
	}

	public boolean isNomination() {
		return nomination;
	}

	public void setNomination(boolean nomination) {
		this.nomination = nomination;
	}

	public int getNominationDays() {
		return nominationDays;
	}

	public void setNominationDays(int nominationDays) {
		this.nominationDays = nominationDays;
	}

	public int getNominationHours() {
		return nominationHours;
	}

	public void setNominationHours(int nominationHours) {
		this.nominationHours = nominationHours;
	}

	public boolean isNominationCompletedFlag() {
		return nominationCompletedFlag;
	}

	public void setNominationCompletedFlag(boolean nominationCompletedFlag) {
		this.nominationCompletedFlag = nominationCompletedFlag;
	}

	public boolean isPrinting() {
		return printing;
	}

	public void setPrinting(boolean printing) {
		this.printing = printing;
	}

	public int getPrintingDays() {
		return printingDays;
	}

	public void setPrintingDays(int printingDays) {
		this.printingDays = printingDays;
	}

	public int getPrintingHours() {
		return printingHours;
	}

	public void setPrintingHours(int printingHours) {
		this.printingHours = printingHours;
	}

	public boolean isPrintingCompletedFlag() {
		return printingCompletedFlag;
	}

	public void setPrintingCompletedFlag(boolean printingCompletedFlag) {
		this.printingCompletedFlag = printingCompletedFlag;
	}

	public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEdc() {
		return edc;
	}

	public void setEdc(Date edc) {
		this.edc = edc;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	@Override
	public String toString() {
		return "JobProfileCommand [dtp=" + dtp + ", dtpDays=" + dtpDays + ", dtpHours=" + dtpHours
				+ ", dtpCompletedFlag=" + dtpCompletedFlag + ", nomination=" + nomination + ", nominationDays="
				+ nominationDays + ", nominationHours=" + nominationHours + ", nominationCompletedFlag="
				+ nominationCompletedFlag + ", printing=" + printing + ", printingDays=" + printingDays
				+ ", printingHours=" + printingHours + ", printingCompletedFlag=" + printingCompletedFlag + ", jobNo="
				+ jobNo + ", contactNumber=" + contactNumber + ", description=" + description + ", edc=" + edc
				+ ", delay=" + delay + "]";
	}

}
