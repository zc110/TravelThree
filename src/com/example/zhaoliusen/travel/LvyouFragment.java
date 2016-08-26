package com.example.zhaoliusen.travel;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.travel.R;
import com.example.zc.travel.LiaoTianActivity;
import com.example.zc.travel.TiaoJiaHaoYouActivity;
import com.example.zc.travel.XinDeLvYouActivity;

public class LvyouFragment extends Fragment {
	ImageView image_menu;
	RelativeLayout layout_lvyou,layout_ly1,layout_ly2,layout_ly3,layout_ly4;
	AlertDialog alertDialog;
	TextView text_jia;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_lvyou, container, false);
		image_menu = (ImageView) v.findViewById(R.id.imageview_menu);
		image_menu.setOnClickListener(clickListener);
		
		layout_lvyou = (RelativeLayout) v.findViewById(R.id.lvyou_relativelayout);
		layout_lvyou.setOnClickListener(l);
		layout_ly1 = (RelativeLayout) v.findViewById(R.id.relativelayout_lvyou1);
		layout_ly1.setOnClickListener(l);
		layout_ly2 = (RelativeLayout) v.findViewById(R.id.relativelayout_lvyou2);
		layout_ly2.setOnClickListener(l);
		layout_ly3 = (RelativeLayout) v.findViewById(R.id.relativelayout_lvyou3);
		layout_ly3.setOnClickListener(l);
		layout_ly4 = (RelativeLayout) v.findViewById(R.id.relativelayout_lvyou4);
		layout_ly4.setOnClickListener(l);
		return v;
	}
	OnClickListener l=new OnClickListener() {
		public void onClick(View v) {
			Intent intent;
			switch (v.getId()) {
			case R.id.lvyou_relativelayout:
				intent=new Intent(getActivity(),XinDeLvYouActivity.class);
				startActivity(intent);
				break;
			case R.id.relativelayout_lvyou1:
				intent=new Intent(getActivity(),LiaoTianActivity.class);
				startActivity(intent);
				break;
			case R.id.relativelayout_lvyou2:
				intent=new Intent(getActivity(),LiaoTianActivity.class);
				startActivity(intent);
				break;
			case R.id.relativelayout_lvyou3:
				intent=new Intent(getActivity(),LiaoTianActivity.class);
				startActivity(intent);
				break;
			case R.id.relativelayout_lvyou4:
				intent=new Intent(getActivity(),LiaoTianActivity.class);
				startActivity(intent);
				break;
			default:
				break;
			}	
		}
	};
	OnClickListener clickListener = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.imageview_menu:
				if (alertDialog == null) {
					creatDialog();
				}alertDialog.show();
				break;
			case R.id.lvyou1:
				Intent intent=new Intent(getActivity(),TiaoJiaHaoYouActivity.class);
				startActivity(intent);		
				text_jia.setBackgroundColor(getResources().getColor(R.color.baolan));
				break;
			default:
				break;
			}

		}
	};
	public void creatDialog() {
		LayoutInflater inflater = LayoutInflater.from(getActivity());
		View v = inflater.inflate(R.layout.activity_lvyou_tianjia, null);
		Builder builder = new AlertDialog.Builder(getActivity());
		builder.setView(v);
		alertDialog = builder.create();
		Window window = alertDialog.getWindow();
		WindowManager.LayoutParams layout = window.getAttributes();
		window.setGravity(Gravity.TOP);
		layout.x = 200;
		layout.y = 100;
		layout.alpha = 1f;
		alertDialog.onWindowAttributesChanged(layout);
		text_jia = (TextView) v.findViewById(R.id.lvyou1);
		text_jia.setOnClickListener(clickListener);
	}
}