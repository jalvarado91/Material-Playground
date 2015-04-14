package com.coloredbinary.materialplayground.adapter;

import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.coloredbinary.materialplayground.R;

public class FragmentDrawer extends Fragment {

    private static String TAG = FragmentDrawer.class.getSimpleName();

    private RecyclerView mRecyclerView;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private View containerView;
    private static String[] titles = null;
    private FragmentDrawerListener drawerListener;

    public FragmentDrawer() {

    }

    public void setDrawerListener(FragmentDrawerListener listener) {
        drawerListener = listener;
    }

    public interface FragmentDrawerListener {
        public void onDrawerItemSelected(View view, int position);
    }
}
