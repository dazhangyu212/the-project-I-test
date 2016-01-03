package com.bignerdranch.activity.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends  ASingleFragmentActivity{
    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//       
//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
//        
//        if (fragment == null) {
//			fragment = new CrimeFragment();
//			fm.beginTransaction()
//			.add(R.id.fragmentContainer, fragment)
//			.commit();
//		}
//    }

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new CrimeFragment();
	}
}