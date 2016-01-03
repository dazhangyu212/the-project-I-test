package com.bignerdranch.activity.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;
	
	public Crime() {
		//生成唯一标识符S
		mId = UUID.randomUUID();
	}
	public Date getDate() {
		return mDate;
	}
	public void setDate(Date date) {
		mDate = date;
	}
	public boolean isSolved() { 
		return mSolved;
	}
	public void setSolved(boolean solved) {
		mSolved = solved;
	}
	public String getTitle() {
		return mTitle;
	}
	public void setTitle(String title) {
		mTitle = title;
	}
	public UUID getId() {
		return mId;
	}
	
}
