package com.example.zhaoliusen.travel;

import com.example.travel.R;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WodeFragment extends Fragment{

	@SuppressLint("InflateParams")
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v=inflater.inflate(R.layout.fragment_wode,null);
		return v;
	}
}
