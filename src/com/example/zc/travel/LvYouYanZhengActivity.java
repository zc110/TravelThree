package com.example.zc.travel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.travel.R;

public class LvYouYanZhengActivity extends Activity{
	TextView text_wancheng;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_deng_dai_yan_zheng);
		text_wancheng=(TextView)findViewById(R.id.text_wancheng);
		text_wancheng.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent(LvYouYanZhengActivity.this,TiaoJiaHaoYouActivity.class);
				startActivity(intent);
			}
		});
	}
	
}
