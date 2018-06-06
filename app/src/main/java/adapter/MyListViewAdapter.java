package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.VideoView;

import com.bwei.day_02.R;

import java.util.List;

import bean.Bean;

public class MyListViewAdapter extends BaseAdapter {
    private List<Bean> list;
    private Context context;

    public MyListViewAdapter(List<Bean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView=View.inflate(context, R.layout.activity_listview,null);
            viewHolder.age=convertView.findViewById(R.id.tv_age);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.age.setText(list.get(position).getAge()+"");
        return convertView;
    }
    class ViewHolder{
        TextView age;
    }
}
