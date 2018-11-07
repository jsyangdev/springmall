package com.example.springmall.sample.vo;

public class Sample {
	private int sampleNo;
	private String sampleId;
	private String samplePw;
	// 디폴트 생성자
	public Sample() {
		super();
	}
	// 매개변수를 가진 생성자 메서드 선언
	public Sample(int sampleNo, String sampleId, String samplePw) {
		super();
		this.sampleNo = sampleNo;
		this.sampleId = sampleId;
		this.samplePw = samplePw;
	}
	public int getSampleNo() {
		return sampleNo;
	}
	public void setSampleNo(int sampleNo) {
		this.sampleNo = sampleNo;
	}
	public String getSampleId() {
		return sampleId;
	}
	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}
	public String getSamplePw() {
		return samplePw;
	}
	public void setSamplePw(String samplePw) {
		this.samplePw = samplePw;
	}
	
	@Override
	public String toString() {
		return "Sample [sampleNo=" + sampleNo + ", sampleId=" + sampleId + ", samplePw=" + samplePw + "]";
	}
	
}