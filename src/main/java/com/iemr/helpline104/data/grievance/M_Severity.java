package com.iemr.helpline104.data.grievance;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="m_severity")
public class M_Severity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SeverityID")
	private int severityID;
	@Column(name="SeverityTypeName")
	private String severityTypeName;
	@Column(name="SeverityDesc")
	private String severityDesc; 
	@Column(name="ProviderServiceMapID")
	private int providerServiceMapID;
	@Column(name="Deleted", insertable=false, updatable=true)
	private Boolean deleted;
	@Column(name="CreatedBy")
	private String createdBy;
	@Column(name="CreatedDate", insertable=false, updatable=false)
	private Date createdDate; 
	@Column(name="ModifiedB")
	private String modifiedBy;
	@Column(name="LastModDate")
	private Date lastModDate;
	
	@OneToOne(mappedBy="mseverity")
	private T_Feedback Feedback;
	
	public M_Severity() {
		// TODO Auto-generated constructor stub
	}

	public int getSeverityID() {
		return severityID;
	}

	public void setSeverityID(int severityID) {
		this.severityID = severityID;
	}

	public String getSeverityTypeName() {
		return severityTypeName;
	}

	public void setSeverityTypeName(String severityTypeName) {
		this.severityTypeName = severityTypeName;
	}

	public String getSeverityDesc() {
		return severityDesc;
	}

	public void setSeverityDesc(String severityDesc) {
		this.severityDesc = severityDesc;
	}

	public int getProviderServiceMapID() {
		return providerServiceMapID;
	}

	public void setProviderServiceMapID(int providerServiceMapID) {
		this.providerServiceMapID = providerServiceMapID;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getLastModDate() {
		return lastModDate;
	}

	public void setLastModDate(Date lastModDate) {
		this.lastModDate = lastModDate;
	}

	public T_Feedback getFeedback() {
		return Feedback;
	}

	public void setFeedback(T_Feedback feedback) {
		Feedback = feedback;
	}

	
	

}