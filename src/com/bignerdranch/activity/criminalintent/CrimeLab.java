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


