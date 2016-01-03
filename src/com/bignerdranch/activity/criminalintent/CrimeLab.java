package com.bignerdranch.activity.criminalintent;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

public class CrimeLab {
	private ArrayList<Crime> mCrimes;
	
	private static CrimeLab sCrimeLab;
	private Context mAppContext;
	
	private CrimeLab(Context context) {
		mAppContext = context;
		mCrimes = new ArrayList<Crime>();
		for (int i = 0; i < 100	; i++) {
			Crime c = new Crime();
			c.setTitle("Crime #"+1);
			c.setSolved(i%2 ==0);//Every  other one
			mCrimes.add(c);
		}
	}
	
	public static CrimeLab get(Context c){
		if (sCrimeLab == null) {
			sCrimeLab = new CrimeLab(c.getApplicationContext());
		}
		return sCrimeLab;
	}

	public ArrayList<Crime> getmCrimes() {
		return mCrimes;
	}
	
	public Crime getCrime(UUID id){
		for (Crime crime : mCrimes) {
			if (crime.getId().equals(id)) {
				return crime;
			}
		}
		return null;
	}

}


