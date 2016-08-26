package com.example.zc.travel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.travel.R;

public class LvyouShezhiActivity extends Activity{
	ImageView image_shezhifanhui,image_pingbi;
	TextView text_shan,text_ziliao;
	RelativeLayout layout_jilu,layout_beijing,layout_qingkong,layout_jubao;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lvyou_shezhi);
		layout_jilu=(RelativeLayout)findViewById(R.id.layout_liaotianjilu);
		layout_jilu.setOnClickListener(clickListener);
		layout_beijing=(RelativeLayout)findViewById(R.id.layout_liaotianbeijing);
		layout_beijing.setOnClickListener(clickListener);
		layout_qingkong=(RelativeLayout)findViewById(R.id.layout_qingkongliaotian);
		layout_qingkong.setOnClickListener(clickListener);
		layout_jubao=(RelativeLayout)findViewById(R.id.layout_jubao);
		layout_jubao.setOnClickListener(clickListener);
		
		image_pingbi=(ImageView)findViewById(R.id.shezhi_pingbi);
		image_pingbi.setOnClickListener(l);
		image_shezhifanhui=(ImageView)findViewById(R.id.shezhi_fanhui);
		image_shezhifanhui.setOnClickListener(l);
		text_shan=(TextView)findViewById(R.id.shan_you);
		text_shan.setOnClickListener(l);
		text_ziliao=(TextView)findViewById(R.id.text_gerenziliao);
		text_ziliao.setOnClickListener(l);
	}
	OnClickListener clickListener=new OnClickListener() {
		public void onClick(View v) {
			Intent intent;
			switch(v.getId()){
				case R.id.layout_liaotianjilu:
					intent=new Intent(LvyouShezhiActivity.this,LiaoTianJiLuActivity.class);
					startActivity(intent);
					break;
				case R.id.layout_liaotianbeijing:
					intent=new Intent(LvyouShezhiActivity.this,LiaoTianBeiJingActivity.class);
					startActivity(intent);
					break;
				case R.id.layout_qingkongliaotian:
					intent=new Intent(LvyouShezhiActivity.this,PingJiaActivity.class);
					startActivity(intent);
					break;
				case R.id.layout_jubao:
					intent=new Intent(LvyouShezhiActivity.this,JuBaoActivity.class);
					startActivity(intent);
					break;
				
				default:
					break;
			}
			
		}
	};
	OnClickListener l=new OnClickListener() {
		public void onClick(View v) {
			switch(v.getId()){
			case R.id.shezhi_fanhui:
				finish();
				break;
			case R.id.shan_you:
				Intent intent=new Intent(LvyouShezhiActivity.this,LvYouYanZhengActivity.class);
				startActivity(intent);
				
				break;
			case R.id.shezhi_pingbi:
				if(image_pingbi.isClickable()==true){
					image_pingbi.setImageResource(R.drawable.openclose);
				}else{
					image_pingbi.setImageResource(R.drawable.openclose_open);
				}			
				break;
			case R.id.text_gerenziliao:
				intent=new Intent(LvyouShezhiActivity.this,ZiliaoActivity.class);
				startActivity(intent);
				break;
			default:
				break;
			}
		}
	};
}
