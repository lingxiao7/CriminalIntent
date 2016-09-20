package com.example.lx.criminalintent;
import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by lx on 2016/9/18.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    private static final String TAG = "CrimeListActivity";

    @Override
    protected Fragment createFragment() {

        Log.d(TAG, "CrimeListActivity called");
        return new CrimeListFragment();
    }
}
