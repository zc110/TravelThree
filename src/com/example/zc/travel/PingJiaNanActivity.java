package com.example.zc.travel;


import java.util.ArrayList;
import java.util.List;

import adapter.PingJiaAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import classify.PingJia;

import com.example.travel.R;

public class PingJiaNanActivity extends Activity {
	ListView listView;
	ImageView image_fanhui;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ping_jia_nan);
		image_fanhui=(ImageView)findViewById(R.id.tijiaopingjia_fanhui);
		image_fanhui.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent(PingJiaNanActivity.this,LvyouShezhiActivity.class);
				startActivity(intent);
			}
		});
		listView = (ListView) findViewById(R.id.list_view_ping_jia);
		getData();
	}

	public void getData() {
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View headView = inflater.inflate(
				R.layout.activity_ping_jia_nan_tou_shi_tu, null);
		listView.addHeaderView(headView);

		List<PingJia> list = new ArrayList<PingJia>();
		PingJia pingjia = new PingJia();
		pingjia.setHeadImage(R.drawable.qingjiaxiaotouxiang);
		pingjia.setDianImage(R.drawable.zan_liang);
		pingjia.setName("Many");
		pingjia.setTime("2016.3.8");
		pingjia.setText("性格沉稳却稳重大方，在困难面前不屈不闹勇于向新的高度挑战。他反反复复的发表... ");
		pingjia.setNumb("57");
		list.add(pingjia);

		PingJia pingjia1 = new PingJia();
		pingjia1.setHeadImage(R.drawable.qingjiaxiaotouxiang);
		pingjia1.setDianImage(R.drawable.zan);
		pingjia1.setName("Cheng");
		pingjia1.setTime("2016.3.3");
		pingjia1.setText("性格沉稳,却稳重大方,用于挑战");
		pingjia1.setNumb("45");
		list.add(pingjia1);

		PingJia pingjia2 = new PingJia();
		pingjia2.setHeadImage(R.drawable.qingjiaxiaotouxiang);
		pingjia2.setDianImage(R.drawable.zan);
		pingjia2.setName("Zheng");
		pingjia2.setTime("2016.3.1");
		pingjia2.setText("性格沉稳,却稳重大方,用于挑战");
		pingjia2.setNumb("42");
		list.add(pingjia2);
		PingJiaAdapter myAdapter = new PingJiaAdapter(
				R.layout.activity_ping_jia_listview, list,
				PingJiaNanActivity.this);
		listView.setAdapter(myAdapter);
	}
}
