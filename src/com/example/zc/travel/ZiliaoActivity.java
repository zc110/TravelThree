package com.example.zc.travel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travel.R;

public class ZiliaoActivity extends Activity{
	TextView text_geng;
	ImageView image_fan;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lvyou_haoyouziliao);
		text_geng=(TextView)findViewById(R.id.view_gengduo);
		text_geng.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent=new Intent(ZiliaoActivity.this,GeRenZiLiaoGengDuoActivity.class);
				startActivity(intent);
			}
		});
		image_fan=(ImageView)findViewById(R.id.view_fan);
		image_fan.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				finish();
			}
		});
	}
}
