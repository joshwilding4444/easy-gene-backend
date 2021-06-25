package com.easygene.dto;

import com.easygene.entity.Conversion;

public class ConversionDTO {
	private int conversionid;
	private String username;
	private String conversionType;
	private String originalSequence;
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
	public String getResultSequence() {
		return resultSequence;
	}
	public void setResultSequence(String resultSequence) {
		this.resultSequence = resultSequence;
	}
	public ConversionDTO(int conversionid, String username, String conversionType, String originalSequence,
			String resultSequence) {
		super();
		this.conversionid = conversionid;
		this.username = username;
		this.conversionType = conversionType;
		this.originalSequence = originalSequence;
		this.resultSequence = resultSequence;
	}
	public ConversionDTO() {
		super();
		this.conversionid = 0;
		this.username = "";
		this.conversionType = "TRANSCRIPTION";
		this.originalSequence = "";
		this.resultSequence = "";
	}
	
	public Conversion getEntity() {
		return new Conversion(this.conversionid, this.username, this.conversionType, this.originalSequence, this.resultSequence);
	}
	
	public static ConversionDTO prepareDTO(Conversion input) {
		return new ConversionDTO(input.getConversionid(), input.getUsername(), input.getConversionType(), 
				input.getOriginalSequence(), input.getResultSequence());
	}
	
}
