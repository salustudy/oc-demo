package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "REF_TB_APPLICATION_PARAM_DTL")
public class RefTbApplicationParamDtl {
	
	@Id
	@SequenceGenerator(name = "REF_TB_APPLICATION_PARAM_D_SEQ", sequenceName = "REF_TB_APPLICATION_PARAM_D_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REF_TB_APPLICATION_PARAM_D_SEQ")
	@Column(name="RUN_ID")
	private Long runId;
	
	@Column(name="PARAM_ID")
	private Long paramId;

	@Column(name="PARAM_VALUE")
	private String paramValue;
	
	@Column(name="EST_CODE")
	private Long estCode;

	public RefTbApplicationParamDtl() {

	}

	public RefTbApplicationParamDtl(Long runId, Long paramId, String paramValue, Long estCode) {

		this.runId = runId;
		this.paramId = paramId;
		this.paramValue = paramValue;
		this.estCode = estCode;
	}

	public Long getRunId() {
		return runId;
	}

	public void setRunId(Long runId) {
		this.runId = runId;
	}

	public Long getParamId() {
		return paramId;
	}

	public void setParamId(Long paramId) {
		this.paramId = paramId;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public Long getEstCode() {
		return estCode;
	}

	public void setEstCode(Long estCode) {
		this.estCode = estCode;
	}
	
	

}