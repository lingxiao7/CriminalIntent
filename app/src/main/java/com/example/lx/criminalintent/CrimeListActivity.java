package com.example.lx.criminalintent;
import android.support.v4.app.Fragment;

/**
 * Created by lx on 2016/9/18.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
