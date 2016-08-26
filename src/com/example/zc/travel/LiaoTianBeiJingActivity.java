package com.example.zc.travel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import com.example.travel.R;

public class LiaoTianBeiJingActivity extends Activity {
	GridView gridView;
	ImageView image_beijing;
	private int res[] = new int[] { R.drawable.chat_settings_background01,
			R.drawable.chat_settings_background02,
			R.drawable.chat_settings_background03,
			R.drawable.chat_settings_background04,
			R.drawable.chat_settings_background05,
			R.drawable.chat_settings_background06,
			R.drawable.chat_settings_background07,
			R.drawable.chat_settings_background08,
			R.drawable.chat_settings_background09 };

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liao_tian_bei_jing);
		image_beijing=(ImageView)findViewById(R.id.liaotian_beijing);
		image_beijing.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
		
		gridView = (GridView) findViewById(R.id.gridview_beijing);
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
			for (int i = 0; i < res.length; i++) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("imageView", res[i]);
				data.add(map);
			}
		SimpleAdapter simpleAdapter = new SimpleAdapter(this, data,
				R.layout.activity_xuan_liao_tian_bei_jing,
				new String[] { "imageView" }, new int[] { R.id.imageView1 });
		gridView.setAdapter(simpleAdapter);

	}

}
