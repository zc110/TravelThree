package com.example.zc.travel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travel.R;

public class PingJiaActivity extends Activity{
	ImageView ping_fanhui;
	TextView ping_tijiao;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ping_jia);
		ping_fanhui=(ImageView)findViewById(R.id.pingjia_fanhui);
		ping_fanhui.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
		ping_tijiao=(TextView)findViewById(R.id.pingjia_tijiao);
		ping_tijiao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent(PingJiaActivity.this,PingJiaNanActivity.class);
				startActivity(intent);
			}
		});
	}
}
