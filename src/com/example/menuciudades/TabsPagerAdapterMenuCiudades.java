package com.example.menuciudades;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapterMenuCiudades extends FragmentPagerAdapter{
	public TabsPagerAdapterMenuCiudades(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Fragment getItem(int index) {
		switch (index) {
		case 0:
			return new FragmentGuiasDisponibles();
		case 1:
			return new FragmentGuiasDescargadas();
		}
		return null;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}
}
