package com.bignerdranch.activity.criminalintent;

import android.support.v4.app.Fragment;

/**
 * ����:CrimeListActivity
 * ����:
 * ��˾:�������οƼ��߿Ƽ��ɷ����޹�˾
 * ����:zhangyu
 * ����ʱ��:2016��1��3��
 */
public class CrimeListActivity extends ASingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new CrimeListFragment();
	}

}
