package com.easygene.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conversions")
public class Conversion {
	@Id
	@Column(name = "conversionid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int conversionid;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "conversion_type")
	private String conversionType;
	
	@Column(name = "original_sequence")
	private String originalSequence;
	
	@Column(name = "original_sequence_type")
	private String originalSequenceType;
	
	@Column(name = "result_sequence")
	private String resultSequence;

	public int getConversionid() {
		return conversionid;
	}

	public void setConversionid(int conversionid) {
		this.conversionid = conversionid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getConversionType() {
		return conversionType;
	}

	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}

	public String getOriginalSequence() {
		return originalSequence;
	}

	public void setOriginalSequence(String originalSequence) {
		this.originalSequence = originalSequence;
	}

	public String getOriginalSequenceType() {
		return originalSequenceType;
	}

	public void setOriginalSequenceType(String originalSequenceType) {
		this.originalSequenceType = originalSequenceType;
	}

	public String getResultSequence() {
		return resultSequence;
	}

	public void setResultSequence(String resultSequence) {
		this.resultSequence = resultSequence;
	}

	public Conversion(int conversionid, String username, String conversionType, String originalSequence,
			String originalSequenceType, String resultSequence) {
		super();
		this.conversionid = conversionid;
		this.username = username;
		this.conversionType = conversionType;
		this.originalSequence = originalSequence;
		this.originalSequenceType = originalSequenceType;
		this.resultSequence = resultSequence;
	}

	public Conversion() {
		super();
		this.conversionid = 0;
		this.username = "";
		this.conversionType = "TRANSCRIPTION";
		this.originalSequence = "";
		this.originalSequenceType = "DNA";
		this.resultSequence = "";
	}
}
