package com.example.zc.travel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.example.travel.R;

public class LiaoTianActivity extends Activity{
	ImageView image_liao,image_shezhi;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liao_tian);
		image_liao=(ImageView)findViewById(R.id.imageview_liaotian_fanhui);
		image_liao.setOnClickListener(clickListener);
		
		image_shezhi=(ImageView)findViewById(R.id.liaotian_shezhi);
		image_shezhi.setOnClickListener(clickListener);
	}
	OnClickListener clickListener=new OnClickListener(){
		public void onClick(View v) {
			switch (v.getId()){
				case R.id.imageview_liaotian_fanhui:
					finish();
					break;
				case R.id.liaotian_shezhi:
					Intent intent=new Intent(LiaoTianActivity.this,LvyouShezhiActivity.class);
					startActivity(intent);
					break;
				default:
					break;
			}
			
		}
	};
}
