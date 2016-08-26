package adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import classify.PingJia;
import com.example.travel.R;

public class PingJiaAdapter extends BaseAdapter {
	int ItemId;
	LayoutInflater inflater;
	List<PingJia> list;
	Context context;

	public PingJiaAdapter(int ItemId, List<PingJia> list,Context context) {
		this.ItemId = ItemId;
		inflater = LayoutInflater.from(context);
		this.list = list;
		this.context = context;
	}
	public int getCount() {
		return list.size();
	}

	public Object getItem(int position) {
		return list.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(ItemId, null);
		}
		@SuppressWarnings("unused")
		ImageView  headImage=(ImageView)convertView.findViewById(R.id.head);
		TextView  	name=(TextView) convertView.findViewById(R.id.name);
		ImageView dianimage=(ImageView)convertView.findViewById(R.id.dianzan);
		TextView  	numb=(TextView) convertView.findViewById(R.id.numb);
		TextView  	text=(TextView) convertView.findViewById(R.id.pingjiayu);
		TextView  	time=(TextView) convertView.findViewById(R.id.time);
		
		PingJia pingjia = list.get(position);
		time.setText(pingjia.getTime());
		text.setText(pingjia.getText());
		numb.setText(pingjia.getNumb());
		name.setText(pingjia.getName());
		dianimage.setImageDrawable(context.getResources().getDrawable(pingjia.getDianImage()));
		headImage.setImageDrawable(context.getResources().getDrawable(pingjia.getHeadImage()));
		return convertView;
		
		
		
		
	}

}
