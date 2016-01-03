package com.bignerdranch.activity.criminalintent;

import android.support.v4.app.Fragment;

/**
 * 类名:CrimeListActivity
 * 描述:
 * 公司:北京海鑫科技高科技股份有限公司
 * 作者:zhangyu
 * 创建时间:2016年1月3日
 */
public class CrimeListActivity extends ASingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new CrimeListFragment();
	}

}
