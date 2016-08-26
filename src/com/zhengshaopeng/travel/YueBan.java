package com.zhengshaopeng.travel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.travel.R;

public class YueBan extends Activity{
	ListView listview;
	Adapter adapter; 
	List<Map<String,Object>> lists=new ArrayList<Map<String,Object>>();
	int[] viewId={R.id.head,R.id.NiCheng,R.id.time,R.id.shuoshuo,
			R.id.fengjing1,R.id.fengjing2,R.id.women,R.id.CQ,R.id.age,R.id.zuobiao};
	String[] keys={"touxiang","NiCheng","shijian","shuoshuo","tupian1","tupian2",
			"biaoqian1","biaoqian2","biaoqian3","zuobiao"};
	TextView text;
	public void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.yueban);
		listview=(ListView)findViewById(R.id.yueban_listview);
		getData();
		
		adapter=new Adapter(this,R.layout.yueban_listview,lists,viewId,keys);
	
	
		listview.setAdapter(adapter);
		text=(TextView)findViewById(R.id.age);
		text.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				new popupWindow(YueBan.this, text);
				
			}
		
		});
	
	}

	
	
	
	
	
	public class popupWindow extends PopupWindow{
		public  popupWindow(Context context,View parent){
		
	View view=View.inflate(context,R.layout.nianling_dialog,null);
	view.startAnimation(AnimationUtils.loadAnimation(context,
			R.anim.fade_ins));
	LinearLayout age=(LinearLayout)view.findViewById
			(R.id.linearlayout_age);
	
	age.startAnimation(AnimationUtils.loadAnimation(context,
			R.anim.push_bottom_in_2));

	setWidth(LayoutParams.MATCH_PARENT);
	setHeight(LayoutParams.MATCH_PARENT);
	setBackgroundDrawable(new BitmapDrawable());
	setFocusable(true);
	setOutsideTouchable(true);
	setContentView(view);
	showAtLocation(parent,Gravity.CENTER,0,0);
	update();
	final TextView text1=(TextView)view.findViewById(R.id.buxian);
	final TextView text2=(TextView)view.findViewById(R.id.eighteen);
	final TextView text3=(TextView)view.findViewById(R.id.tweentytwo);
	final TextView text4=(TextView)view.findViewById(R.id.tweentysix);
	final TextView text5=(TextView)view.findViewById(R.id.thirtyfive);
	final TextView text6=(TextView)view.findViewById(R.id.more);
	text1.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			String str1=text1.getText().toString();
			text.setText(str1);
			dismiss();
		}
	});
		
	text2.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			String str2=text2.getText().toString();
			text.setText(str2);
			dismiss();
		}
	});
	
	text3.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			String str3=text3.getText().toString();
			text.setText(str3);
			dismiss();
		}
	});
	
	text4.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			String str4=text4.getText().toString();
			text.setText(str4);
			dismiss();
		}
	});
	
	text5.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			String str5=text5.getText().toString();
			text.setText(str5);
			dismiss();
		}
	});
	
	text6.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			String str6=text6.getText().toString();
			text.setText(str6);
			dismiss();
		}
	});
	
		}
	
	
	
}
	
	
	
	public void getData(){
		Map<String,Object> map=new HashMap<String,Object>();
		
		map.put("touxiang",R.drawable.head);
		map.put("NiCheng","不念，—TM不忘");
		map.put("shijian","2013年3月10日");
		map.put("shuoshuo","2013年我向往的爱情，不是浅薄的被表面相互吸引,因为喜欢才对对方好；我向往的爱情，是明白对方的好，才相对对方好。我向往的爱情,是相知才知真爱");
		map.put("tupian1",R.drawable.fengjing1);
		map.put("tupian2",R.drawable.fengjing2);
		map.put("biaoqian1","女" );
		map.put("biaoqian2","重庆" );
		map.put("biaoqian3","18岁" );
		map.put("zuobiao","海口市琼台师范高等专科学校" );
		lists.add(map);
		
		Map<String,Object> map1=new HashMap<String,Object>();
		map1.put("touxiang",R.drawable.head);
		map1.put("NiCheng","不念，—TM不忘");
		map1.put("shijian","2013年3月10日");
		map1.put("shuoshuo","2013年我向往的爱情，不是浅薄的被表面相互吸引，因为喜\n欢才对对方好；我向往的爱情，是明白对方的好，才\n相对对方好。我向往的爱情，是相知才是相爱月10日");
		map1.put("tupian1",R.drawable.fengjing1);
		map1.put("tupian2",R.drawable.fengjing2);
		map1.put("biaoqian1","女" );
		map1.put("biaoqian2","重庆" );
		map1.put("biaoqian3","18岁" );
		map1.put("zuobiao","海口市琼台师范高等专科学校" );
		lists.add(map1);
	}
}
