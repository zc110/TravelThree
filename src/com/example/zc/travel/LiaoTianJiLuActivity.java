package com.example.zc.travel;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travel.R;

public class LiaoTianJiLuActivity extends Activity{
	ImageView jilu_fan,jilu_shan;
	TextView  text_shan1,text_shan2;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liaotian_jilu);
		jilu_fan=(ImageView)findViewById(R.id.jilu_fanhui);
		jilu_fan.setOnClickListener(l);
		
		jilu_shan=(ImageView)findViewById(R.id.jilu_shan);
		jilu_shan.setOnClickListener(l);
	}
	OnClickListener l=new OnClickListener(){
		public void onClick(View v) {
			switch(v.getId()){
				case R.id.jilu_fanhui:
					finish();
					break;
				case R.id.jilu_shan:
					if (alertDialog == null) {
						creatDialog();
					}alertDialog.show();
					break;
				case R.id.shanchu_text1:
					Intent intent=new Intent(LiaoTianJiLuActivity.this,LiaoTianKongActivity.class);
					startActivity(intent);
					break;
				case R.id.shanchu_text2:
					alertDialog.dismiss();
					break;
				default:
					break;			
			}		
		}
	};
	AlertDialog alertDialog;
	public void creatDialog() {
		LayoutInflater inflater = LayoutInflater.from(LiaoTianJiLuActivity.this);
		View v = inflater.inflate(R.layout.activity_shanchujilu, null);
		Builder builder = new AlertDialog.Builder(LiaoTianJiLuActivity.this);
		builder.setView(v);
		alertDialog = builder.create();
		Window window = alertDialog.getWindow();
		WindowManager.LayoutParams layout = window.getAttributes();
		window.setGravity(Gravity.BOTTOM);
		layout.alpha = 1f;
		alertDialog.onWindowAttributesChanged(layout);
		text_shan1=(TextView)v.findViewById(R.id.shanchu_text1);
		text_shan1.setOnClickListener(l);
		text_shan2=(TextView)v.findViewById(R.id.shanchu_text2);
		text_shan2.setOnClickListener(l);
	}
}
