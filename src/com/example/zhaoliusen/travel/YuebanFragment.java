package com.example.zhaoliusen.travel;

import java.util.ArrayList;
import java.util.List;

import adapter.MyDongtaiAdapter;
import adapter.MyYuebanAdapter;
import adapter.MyZhoubianAdapter;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import classify.Run;
import classify.Trend;
import classify.Zhoubian;

import com.example.travel.R;

public class YuebanFragment extends Fragment{
	ListView listview_guan,listview_zui,listview_fujin;
	LinearLayout linear_guanzhu,layout_guanzhu,linear_zuixin,layout_zuixin,linear_fujin,layout_fujin;
	TextView text_guanzhu,text_zuixin,text_fujin;
	View view_guanzhu,view_zuixin,view_fujin;
	@SuppressWarnings("static-access")
	@SuppressLint({ "InflateParams", "CutPasteId" })
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v=inflater.inflate(R.layout.fragment_yueban,null);
		linear_guanzhu=(LinearLayout)v.findViewById(R.id.linearlayout_guanzhu);
		layout_guanzhu=(LinearLayout)v.findViewById(R.id.layout_guanzhu);
		layout_guanzhu.setOnClickListener(clickListener);
		
		linear_zuixin=(LinearLayout)v.findViewById(R.id.linearlayout_zuixin);
		layout_zuixin=(LinearLayout)v.findViewById(R.id.layout_zuixin);
		layout_zuixin.setOnClickListener(clickListener);
		linear_zuixin.setVisibility(linear_zuixin.GONE);
		
		linear_fujin=(LinearLayout)v.findViewById(R.id.linearlayout_fujin);
		layout_fujin=(LinearLayout)v.findViewById(R.id.layout_fujin);
		layout_fujin.setOnClickListener(clickListener);
		linear_fujin.setVisibility(layout_fujin.GONE);
		
		listview_guan=(ListView)v.findViewById(R.id.listview_yueban1);
		getGuanZhu();
		listview_zui=(ListView)v.findViewById(R.id.listview_yueban2);
		gerZuiXin();
		listview_fujin=(ListView)v.findViewById(R.id.listview_yueban3);
		getFuJin();
		text_guanzhu=(TextView)v.findViewById(R.id.textview_guanzhu);
		view_guanzhu=(View)v.findViewById(R.id.view_xian1);
		text_zuixin=(TextView)v.findViewById(R.id.textview_zuixin);
		view_zuixin=(View)v.findViewById(R.id.view_xian2);
		text_fujin=(TextView)v.findViewById(R.id.textview_fujin);
		view_fujin=(View)v.findViewById(R.id.view_xian3);
		return v;
	}
	OnClickListener clickListener=new OnClickListener() {
		@SuppressWarnings("static-access")
		public void onClick(View v) {
			switch(v.getId()){
				case R.id.layout_guanzhu:
					linear_guanzhu.setVisibility(linear_guanzhu.VISIBLE);
					linear_zuixin.setVisibility(linear_zuixin.GONE);
					linear_fujin.setVisibility(linear_fujin.GONE);
					
					text_guanzhu.setTextColor(getResources().getColor(R.color.baolan));
					view_guanzhu.setBackgroundColor(getResources().getColor(R.color.baolan));
					text_zuixin.setTextColor(getResources().getColor(R.color.heise));
					view_zuixin.setBackgroundColor(getResources().getColor(R.color.heise));
					text_fujin.setTextColor(getResources().getColor(R.color.heise));
					view_fujin.setBackgroundColor(getResources().getColor(R.color.heise));
					break;
				case R.id.layout_zuixin:
					linear_guanzhu.setVisibility(linear_guanzhu.GONE);
					linear_zuixin.setVisibility(linear_zuixin.VISIBLE);
					linear_fujin.setVisibility(linear_fujin.GONE);
					
					text_zuixin.setTextColor(getResources().getColor(R.color.baolan));
					view_zuixin.setBackgroundColor(getResources().getColor(R.color.baolan));
					text_guanzhu.setTextColor(getResources().getColor(R.color.heise));
					view_guanzhu.setBackgroundColor(getResources().getColor(R.color.heise));
					text_fujin.setTextColor(getResources().getColor(R.color.heise));
					view_fujin.setBackgroundColor(getResources().getColor(R.color.heise));
					break;
				case R.id.layout_fujin:
					linear_fujin.setVisibility(linear_fujin.VISIBLE);
					linear_guanzhu.setVisibility(linear_guanzhu.GONE);
					linear_zuixin.setVisibility(linear_zuixin.GONE);
					
					text_fujin.setTextColor(getResources().getColor(R.color.baolan));
					view_fujin.setBackgroundColor(getResources().getColor(R.color.baolan));
					text_guanzhu.setTextColor(getResources().getColor(R.color.heise));
					view_guanzhu.setBackgroundColor(getResources().getColor(R.color.heise));	
					text_zuixin.setTextColor(getResources().getColor(R.color.heise));
					view_zuixin.setBackgroundColor(getResources().getColor(R.color.heise));
					break;
			}	
		}
	};
	@SuppressLint("InflateParams")
	private void getGuanZhu() {
		List<Run> list=new ArrayList<Run>();
		Run run=new Run();
		run.setTouxiang(R.drawable.touxiang6);
		run.setName("离殇\n03月04日19:37");
		run.setGuanzhu("关注");
		run.setNeirong("成熟不是人的心变老，是泪在打转还能微笑。走得最急\n的，都是最美的风景，伤得最深的，也总是那些最真的情");
		run.setTu1(R.drawable.yueban1);
		run.setTu2(R.drawable.yueban2);
		run.setTu3(R.drawable.yueban3);
		run.setZan(R.drawable.zan);
		run.setPing(R.drawable.yueban_ping);
		list.add(run);
		
		Run run1=new Run();
		run1.setTouxiang(R.drawable.touxiang5);
		run1.setName("100%低调\n03月04日19:00");
		run1.setGuanzhu("关注");
		run1.setNeirong("一个人，一条路，人在途中，心随景动，从起点\n到尽头，也许快乐，或有时孤独");
		run1.setTu1(R.drawable.yueban5);
		run1.setTu2(R.drawable.yueban6);
		run1.setTu3(R.drawable.yueban4);
		run1.setZan(R.drawable.zan);
		run1.setPing(R.drawable.yueban_ping);
		list.add(run1);
		
		Run run2=new Run();
		run2.setTouxiang(R.drawable.touxiang2);
		run2.setName("王法开\n03月04日19:37");
		run2.setGuanzhu("关注");
		run2.setNeirong("成熟不是人的心变老，是泪在打转还能微笑。走得最急\n的，都是最美的风景，伤得最深的，也总是那些最真的情");
		run2.setTu1(R.drawable.yueban1);
		run2.setTu2(R.drawable.yueban2);
		run2.setTu3(R.drawable.yueban3);
		run2.setZan(R.drawable.zan);
		run2.setPing(R.drawable.yueban_ping);
		list.add(run2);
		MyYuebanAdapter yueban=new   MyYuebanAdapter(
				R.layout.fragment_yueban_neirong, list, getActivity());
		listview_guan.setAdapter(yueban);
	}
	public void gerZuiXin(){
			List<Trend> list = new ArrayList<Trend>();
			Trend tr=new Trend();
			tr.setTouxiang(R.drawable.touxiang_dongtai);
			tr.setName("Dfdfdr");
			tr.setZan(R.drawable.zan);
			tr.setNemu("59");
			tr.setXian(R.drawable.fengexian);
			tr.setTimu("情系滇东北-穿越乌蒙山之旅");
			tr.setTupian(R.drawable.dongtu1);
			tr.setPhoto(R.drawable.dongtu2);
			tr.setRiqi("2016.3.8");
			list.add(tr);
			
			Trend tr1=new Trend();
			tr1.setTouxiang(R.drawable.touxiang2);
			tr1.setName("王法开");
			tr1.setZan(R.drawable.zan);
			tr1.setNemu("95");
			tr1.setXian(R.drawable.fengexian);
			tr1.setTimu("寻找最美的海滩青苔-汕尾摄影之旅");
			tr1.setTupian(R.drawable.dongtu3);
			tr1.setPhoto(R.drawable.dongtu4);
			tr1.setRiqi("2016.3.10");
			list.add(tr1);
			
			Trend tr2=new Trend();
			tr2.setTouxiang(R.drawable.touxiang3);
			tr2.setName("李小果");
			tr2.setZan(R.drawable.zan);
			tr2.setNemu("80");
			tr2.setXian(R.drawable.fengexian);
			tr2.setTimu("希腊爱琴海经典风光摄影之旅");
			tr2.setTupian(R.drawable.dongtu6);
			tr2.setPhoto(R.drawable.dongtu7);
			tr2.setRiqi("2016.3.11");
			list.add(tr2);
			
			Trend tr3=new Trend();
			tr3.setTouxiang(R.drawable.touxiang4);
			tr3.setName("程存存");
			tr3.setZan(R.drawable.zan);
			tr3.setNemu("95");
			tr3.setXian(R.drawable.fengexian);
			tr3.setTimu("寻找最美的海滩青苔-汕尾摄影之旅");
			tr3.setTupian(R.drawable.dongtu4);
			tr3.setPhoto(R.drawable.dongtu5);
			tr3.setRiqi("2016.3.10");
			list.add(tr3);
			MyDongtaiAdapter dongtai=new   MyDongtaiAdapter(
					R.layout.fragment_dongtai_neirong, list, getActivity());
			listview_zui.setAdapter(dongtai);
	}
	private void getFuJin() {
		List<Zhoubian> list =new ArrayList<Zhoubian>();
		Zhoubian zb=new Zhoubian();
		zb.setZhou_photo(R.drawable.jinfoshan);
		zb.setZhou_name("金佛山（南川区）");
		zb.setZhou_tu1(R.drawable.xing_liang);
		zb.setZhou_tu2(R.drawable.xing_liang);
		zb.setZhou_tu3(R.drawable.xing_liang);
		zb.setZhou_tu4(R.drawable.xing_liang);
		zb.setZhou_tu5(R.drawable.xing_liang);
		zb.setZhou_mi("82km");
		list.add(zb);
		
		Zhoubian zb1=new Zhoubian();
		zb1.setZhou_photo(R.drawable.xiannvshan);
		zb1.setZhou_name("仙女山（武隆县）");
		zb1.setZhou_tu1(R.drawable.xing_liang);
		zb1.setZhou_tu2(R.drawable.xing_liang);
		zb1.setZhou_tu3(R.drawable.xing_liang);
		zb1.setZhou_tu4(R.drawable.xing_liang);
		zb1.setZhou_tu5(R.drawable.xing_liang);
		zb1.setZhou_mi("120km");
		list.add(zb1);
		
		Zhoubian zb2=new Zhoubian();
		zb2.setZhou_photo(R.drawable.longgang);
		zb2.setZhou_name("云阳龙缸（云阳县）");
		zb2.setZhou_tu1(R.drawable.xing_liang);
		zb2.setZhou_tu2(R.drawable.xing_liang);
		zb2.setZhou_tu3(R.drawable.xing_liang);
		zb2.setZhou_tu4(R.drawable.xing_liang);
		zb2.setZhou_tu5(R.drawable.xing);
		zb2.setZhou_mi("265km");
		list.add(zb2);
		
		Zhoubian zb3=new Zhoubian();
		zb3.setZhou_photo(R.drawable.simianshan);
		zb3.setZhou_name("四面山（江津区）");
		zb3.setZhou_tu1(R.drawable.xing_liang);
		zb3.setZhou_tu2(R.drawable.xing_liang);
		zb3.setZhou_tu3(R.drawable.xing_liang);
		zb3.setZhou_tu4(R.drawable.xing_liang);
		zb3.setZhou_tu5(R.drawable.xing);
		zb3.setZhou_mi("102km");
		list.add(zb3);
		
		Zhoubian zb4=new Zhoubian();
		zb4.setZhou_photo(R.drawable.nanshan);
		zb4.setZhou_name("南山植物园（南岸区）");
		zb4.setZhou_tu1(R.drawable.xing_liang);
		zb4.setZhou_tu2(R.drawable.xing_liang);
		zb4.setZhou_tu3(R.drawable.xing_liang);
		zb4.setZhou_tu4(R.drawable.xing);
		zb4.setZhou_tu5(R.drawable.xing);
		zb4.setZhou_mi("56km");
		list.add(zb4);
		MyZhoubianAdapter zhouAdapter=new MyZhoubianAdapter(R.layout.activity_zhou_two,list,getActivity());
		listview_fujin.setAdapter(zhouAdapter);
	}	
}
