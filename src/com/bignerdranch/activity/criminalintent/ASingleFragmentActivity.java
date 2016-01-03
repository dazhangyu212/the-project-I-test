package com.bignerdranch.activity.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * ����:SingleFragmentActivity
 * ����:A superclass 
 * ��˾:�������οƼ��߿Ƽ��ɷ����޹�˾
 * ����:zhangyu
 * ����ʱ��:2016��1��3��
 */
public abstract class ASingleFragmentActivity extends FragmentActivity {
	protected abstract Fragment createFragment();
	
	@Override
	public void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);
		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
		if (fragment == null) {
			fragment = createFragment();
			fm.beginTransaction()
			.add(R.id.fragmentContainer, fragment)
			.commit();
		}
		
	};
}
