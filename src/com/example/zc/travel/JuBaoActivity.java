package com.example.zc.travel;

import com.example.travel.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class JuBaoActivity extends Activity{
	ImageView image_jubao;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ju_bao);
		image_jubao=(ImageView)findViewById(R.id.liaotian_jubao);
		image_jubao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
	}
}
