package org.artfor.app.web;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GuideDTO {
	private int g_no;
	private String g_title;
	private String g_writer;
	private String g_content;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date g_day; 
	
	public GuideDTO() {		
	}

	public int getG_no() {
		return g_no;
	}

	public void setG_no(int g_no) {
		this.g_no = g_no;
	}

	public String getG_title() {
		return g_title;
	}

	public void setG_title(String g_title) {
		this.g_title = g_title;
	}

	public String getG_writer() {
		return g_writer;
	}

	public void setG_writer(String g_writer) {
		this.g_writer = g_writer;
	}

	public String getG_content() {
		return g_content;
	}

	public void setG_content(String g_content) {
		this.g_content = g_content;
	}

	public Date getG_day() {
		return g_day;
	}

	public void setG_day(Date g_day) {
		this.g_day = g_day;
	}

	@Override
	public String toString() {
		return "GuideDTO [g_no=" + g_no + ", g_title=" + g_title + ", g_writer=" + g_writer + ", g_content=" + g_content
				+ ", g_day=" + g_day + "]";
	}



}
