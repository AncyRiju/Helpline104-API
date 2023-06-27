package com.iemr.helpline104.data.diseaseScreening;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.Gson;

@Entity
@Table(name="m_questiontype")
public class M_QuestionType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer questionTypeID;
	private String questionType;
	private String questionTypeDesc;
	private Boolean deleted;
	private String createdBy;
	@Column(name = "CreatedDate", insertable=false, updatable=false)
	private Date createdDate;
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	@Column(name = "LastModDate", insertable=false, updatable=false)
	private Date lastModDate;
	
	public M_QuestionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public M_QuestionType(Integer questionTypeID, String questionType, String questionTypeDesc, Boolean deleted,
			String createdBy, Date createdDate, String modifiedBy, Date lastModDate) {
		super();
		this.questionTypeID = questionTypeID;
		this.questionType = questionType;
		this.questionTypeDesc = questionTypeDesc;
		this.deleted = deleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModDate = lastModDate;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getQuestionTypeDesc() {
		return questionTypeDesc;
	}

	public void setQuestionTypeDesc(String questionTypeDesc) {
		this.questionTypeDesc = questionTypeDesc;
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

	public Integer getQuestionTypeID() {
		return questionTypeID;
	}
	
	public String toString() {
		return new Gson().toJson(this);
	}
	
}