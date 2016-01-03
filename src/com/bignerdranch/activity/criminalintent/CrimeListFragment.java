package com.bignerdranch.activity.criminalintent;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

/**
 * ����:CrimeListFragment
 * ����:
 * ��˾:�������οƼ��߿Ƽ��ɷ����޹�˾
 * ����:zhangyu
 * ����ʱ��:2016��1��3��
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
