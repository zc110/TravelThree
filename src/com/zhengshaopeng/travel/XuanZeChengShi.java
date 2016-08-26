package com.zhengshaopeng.travel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.example.travel.R;

public class XuanZeChengShi extends Activity {
	ListView listView;
	Adapter adapter;
	TextView textview;
	TextView textview2;
	TextView textview3;
	TextView textview4;
	TextView textview6;
	TextView textview7;
	TextView textview1;
	TextView textview8;
	TextView textview9;
	TextView textview10;
	TextView textview11;
	TextView textview5;
	ImageView imageview;
public final static String EXTRA_MESSAGE="com.zhengshaopeng.travel.MESSAGE";
	List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
	int[] viewId = { R.id.zimu, R.id.dizhi1, R.id.dizhi2, R.id.dizhi3,
			R.id.dizhi4, };
	String[] keys = { "zimu", "dizhi1", "dizhi2", "dizhi3", "dizhi4", };
	public LocationClient mLocationClient = null;

	public BDLocationListener myListener = new MyLocationListener();

	public void onCreate(Bundle SavedInstanceState) {
		super.onCreate(SavedInstanceState);
		setContentView(R.layout.xuanzechengshi);
		listView = (ListView) findViewById(R.id.site);
		DingWeiGPS();

		getData();
		hotDingWei();
		adapter = new Adapter(this, R.layout.dizhipaixu, lists, viewId, keys);
		listView.setAdapter(adapter);

		imageview = (ImageView) findViewById(R.id.FanHui);
		imageview.setOnClickListener(onClick);

	}

	

	// 定位方法
	public void DingWeiGPS() {
		mLocationClient = new LocationClient(getApplicationContext());
		mLocationClient.registerLocationListener(new MyLocationListener());

		LocationClientOption option = new LocationClientOption();
		option.setOpenGps(true);
		option.setCoorType("bd09ll"); // 设置坐标类型
		option.setIsNeedAddress(true); // 设置是否需要地址信息，默认不需要
		option.setScanSpan(60000); // 多久定位一次
		mLocationClient.setLocOption(option);
		mLocationClient.start();
	}

	public class MyLocationListener implements BDLocationListener {
		@Override
		public void onReceiveLocation(BDLocation location) {
			// 打印出当前的城市名
			String str = location.getCity();
			TextView gps = (TextView) findViewById(R.id.ChongQing);
			gps.setText(str);
			Toast.makeText(XuanZeChengShi.this, "您现在位置：" + location.getCity(),
					Toast.LENGTH_SHORT).show();
			// location.getLongitude(); 获取当前位置经度
			// location.getLatitude(); 获取当前位置纬度
		}
	}

	
	  protected void onDestroy() {
	  mLocationClient.unRegisterLocationListener((BDLocationListener) this);
	  //取消注册的位置监听，以免内存泄露 
	  mLocationClient.stop();// 退出时销毁定位 super.onDestroy();
	  }
	

	// ////

	public void hotDingWei() {// 热门城市地位选择
		textview = (TextView) findViewById(R.id.shanghai);
		textview1 = (TextView) findViewById(R.id.beijing);
		textview2 = (TextView) findViewById(R.id.chengdu);
		textview3 = (TextView) findViewById(R.id.shenzhen);
		textview4 = (TextView) findViewById(R.id.hangzhou);
		textview5 = (TextView) findViewById(R.id.foshan);
		textview6 = (TextView) findViewById(R.id.dongguan);
		textview7 = (TextView) findViewById(R.id.wuxi);
		textview8 = (TextView) findViewById(R.id.tianjing);
		textview9 = (TextView) findViewById(R.id.changsha);
		textview10 = (TextView) findViewById(R.id.xian);
		textview11 = (TextView) findViewById(R.id.nanjing);
		textview1.setOnClickListener(onClick);
		textview2.setOnClickListener(onClick);
		textview3.setOnClickListener(onClick);
		textview4.setOnClickListener(onClick);
		textview5.setOnClickListener(onClick);
		textview.setOnClickListener(onClick);
		textview6.setOnClickListener(onClick);
		textview7.setOnClickListener(onClick);
		textview8.setOnClickListener(onClick);
		textview9.setOnClickListener(onClick);
		textview10.setOnClickListener(onClick);
		textview11.setOnClickListener(onClick);

	}
	TextView WeiZi;
	OnClickListener onClick = new OnClickListener() {
		TextView text;

		@SuppressLint("CutPasteId")
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.shanghai:
				String str = textview.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str);
				break;
			case R.id.beijing:

				String str1 = textview1.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str1);
				break;
			case R.id.chengdu:
				String str2 = textview2.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str2);
				break;
			case R.id.shenzhen:
				String str3 = textview3.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str3);
				break;
			case R.id.hangzhou:
				String str4 = textview4.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str4);
				break;
			case R.id.foshan:
				String str5 = textview5.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str5);
				break;
			case R.id.dongguan:
				String str6 = textview6.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str6);
				break;
			case R.id.wuxi:
				String str7 = textview7.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str7);
				break;
			case R.id.tianjing:
				String str8 = textview8.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str8);
				break;
			case R.id.changsha:
				String str9 = textview9.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str9);
				break;
			case R.id.xian:
				String str10 = textview10.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str10);
				break;

			case R.id.nanjing:
				String str11 = textview11.getText().toString();
				text = (TextView) findViewById(R.id.ChongQing);
				text.setText(str11);
				break;

			case R.id.FanHui:
				Intent intent = new Intent(XuanZeChengShi.this, FaYueBan.class);
				
				WeiZi=(TextView)findViewById(R.id.ChongQing);
				String message=WeiZi.getText().toString();
				intent.putExtra(EXTRA_MESSAGE,message);
					startActivity(intent);
				break;

			}
		}
	};

	
	public void getData() {
		Map<String, Object> A = new HashMap<String, Object>();
		A.put("zimu", "A");
		A.put("dizhi1", "鞍山");
		A.put("dizhi2", "安庆");
		A.put("dizhi3", "阿坝");
		A.put("dizhi4", "安阳");
		lists.add(A);
		Map<String, Object> B = new HashMap<String, Object>();
		B.put("zimu", "B");
		B.put("dizhi1", "宝鸡");
		B.put("dizhi2", "包头");
		B.put("dizhi3", "保定");
		B.put("dizhi4", "北京");
		lists.add(B);
		Map<String, Object> C = new HashMap<String, Object>();
		C.put("zimu", "C");
		C.put("dizhi1", "成都");
		C.put("dizhi2", "长春");
		C.put("dizhi3", "重庆");
		C.put("dizhi4", "长沙");
		lists.add(C);
		Map<String, Object> D = new HashMap<String, Object>();
		D.put("zimu", "D");
		D.put("dizhi1", "东莞");
		D.put("dizhi2", "大连");
		D.put("dizhi3", "东营");
		D.put("dizhi4", "大同");
		lists.add(D);
		Map<String, Object> E = new HashMap<String, Object>();
		E.put("zimu", "E");
		E.put("dizhi1", "鄂州");
		E.put("dizhi2", "安顺");
		E.put("dizhi3", "峨眉山");
		E.put("dizhi4", "额尔古纳");
		lists.add(E);
		Map<String, Object> F = new HashMap<String, Object>();
		F.put("zimu", "F");
		F.put("dizhi1", "福州");
		F.put("dizhi2", "佛山");
		F.put("dizhi3", "桂林");
		F.put("dizhi4", "抚顺");
		lists.add(F);
		Map<String, Object> G = new HashMap<String, Object>();
		G.put("zimu", "G");
		G.put("dizhi1", "广州");
		G.put("dizhi2", "贵阳");
		G.put("dizhi3", "广安");
		G.put("dizhi4", "赣州");
		lists.add(G);
		Map<String, Object> L = new HashMap<String, Object>();
		L.put("zimu", "L");
		L.put("dizhi1", "拉萨");
		L.put("dizhi2", "兰州");
		L.put("dizhi3", "连云港");
		L.put("dizhi4", "柳州");
		lists.add(L);
		Map<String, Object> M = new HashMap<String, Object>();
		M.put("zimu", "M");
		M.put("dizhi1", "马鞍山");
		M.put("dizhi2", "绵阳");
		M.put("dizhi3", "牡丹江");
		M.put("dizhi4", "茂名");
		lists.add(M);
		Map<String, Object> N = new HashMap<String, Object>();
		N.put("zimu", "N");
		N.put("dizhi1", "南京");
		N.put("dizhi2", "宁波");
		N.put("dizhi3", "南宁");
		N.put("dizhi4", "宁德");
		lists.add(N);
		Map<String, Object> P = new HashMap<String, Object>();
		P.put("zimu", "P");
		P.put("dizhi1", "平顶山");
		P.put("dizhi2", "莆田");
		P.put("dizhi3", "攀枝花");
		P.put("dizhi4", "普洱");
		lists.add(P);
		Map<String, Object> Q = new HashMap<String, Object>();
		Q.put("zimu", "Q");
		Q.put("dizhi1", "青岛");
		Q.put("dizhi2", "泉州");
		Q.put("dizhi3", "秦皇岛");
		Q.put("dizhi4", "齐齐哈尔");
		lists.add(Q);
		Map<String, Object> R = new HashMap<String, Object>();
		R.put("zimu", "R");
		R.put("dizhi1", "日照");
		R.put("dizhi2", "瑞安");
		R.put("dizhi3", "仁怀");
		R.put("dizhi4", "汝州");
		lists.add(R);
		Map<String, Object> S = new HashMap<String, Object>();
		S.put("zimu", "S");
		S.put("dizhi1", "上海");
		S.put("dizhi2", "深圳");
		S.put("dizhi3", "苏州");
		S.put("dizhi4", "韶关");
		lists.add(S);
		Map<String, Object> T = new HashMap<String, Object>();
		T.put("zimu", "T");
		T.put("dizhi1", "天津");
		T.put("dizhi2", "太原");
		T.put("dizhi3", "台州");
		T.put("dizhi4", "唐山");
		lists.add(T);
		Map<String, Object> W = new HashMap<String, Object>();
		W.put("zimu", "W");
		W.put("dizhi1", "武汉");
		W.put("dizhi2", "无锡");
		W.put("dizhi3", "温州");
		W.put("dizhi4", "乌鲁木齐");
		lists.add(W);

		Map<String, Object> X = new HashMap<String, Object>();
		X.put("zimu", "X");
		X.put("dizhi1", "西安");
		X.put("dizhi2", "厦门");
		X.put("dizhi3", "徐州");
		X.put("dizhi4", "邢台");
		lists.add(X);
		Map<String, Object> Y = new HashMap<String, Object>();
		Y.put("zimu", "Y");
		Y.put("dizhi1", "扬州");
		Y.put("dizhi2", "烟台");
		Y.put("dizhi3", "义乌");
		Y.put("dizhi4", "岳阳");
		lists.add(Y);

		Map<String, Object> Z = new HashMap<String, Object>();
		Z.put("zimu", "Z");
		Z.put("dizhi1", "郑州");
		Z.put("dizhi2", "镇江");
		Z.put("dizhi3", "淄博");
		Z.put("dizhi4", "株洲");
		lists.add(Z);

	}

}
