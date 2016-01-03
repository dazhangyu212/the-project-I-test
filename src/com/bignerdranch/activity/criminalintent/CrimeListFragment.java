package com.bignerdranch.activity.criminalintent;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

/**
 * 类名:CrimeListFragment
 * 描述:
 * 公司:北京海鑫科技高科技股份有限公司
 * 作者:zhangyu
 * 创建时间:2016年1月3日
 */
public class CrimeListFragment extends ListFragment {
	
	private ArrayList<Crime> mCrimes;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.crime_title_label);
		mCrimes = CrimeLab.get(getActivity()).getmCrimes();
	}
}
