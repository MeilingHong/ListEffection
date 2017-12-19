package com.list.effection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/12/18.
 */

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private List<DeviceInfo> mData;

    public ListViewAdapter(Context context, List<DeviceInfo> mDate) {
        this.context = context;
        this.mData = mDate;
    }

    @Override
    public int getCount() {
        if (mData != null) {
            return mData.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_device_container_new, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        DeviceInfo info = mData.get(position);
        if(info.getOnline()==1){
            //TODO 在线
            viewHolder.nameUnonline.setVisibility(View.GONE);
            //TODO 去除在线状态可见
            viewHolder.nameOnlie.setVisibility(View.VISIBLE);
            viewHolder.nameOnlineBg.setVisibility(View.VISIBLE);
            if (info.getName().contains("%")){
                try {
                    viewHolder.nameOnlie.setText(URLDecoder.decode(info.getName(),"utf-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }else{
                viewHolder.nameOnlie.setText(info.getName());
            }
            viewHolder.clickView.setBackgroundResource(R.drawable.selector_map_watchlist_online_click_effect);
        }else{
            //TODO 不在线
            viewHolder.nameUnonline.setVisibility(View.VISIBLE);
            //TODO 去除在线状态可见
            viewHolder.nameOnlie.setVisibility(View.GONE);
            viewHolder.nameOnlineBg.setVisibility(View.GONE);
            if (info.getName().contains("%")){
                try {
                    viewHolder.nameUnonline.setText(URLDecoder.decode(info.getName(),"utf-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }else{
                viewHolder.nameUnonline.setText(info.getName());
            }
            viewHolder.clickView.setBackgroundResource(R.drawable.selector_map_watchlist_not_online_click_effect);
        }
//        viewHolder.deviceInfo.setVisibility(View.GONE);//TODO 暂时屏蔽后方的显示
        Picasso.with(context).load(info.getImage()).transform(new RoundTransformDesign(10)).into(viewHolder.deviceIcon);

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.deviceIcon)
        ImageView deviceIcon;
        @BindView(R.id.nameUnonline)
        TextView nameUnonline;
        @BindView(R.id.nameOnlineBg)
        ImageView nameOnlineBg;
        @BindView(R.id.nameOnlie)
        TextView nameOnlie;
        @BindView(R.id.deviceInfo)
        RelativeLayout deviceInfo;
        @BindView(R.id.deviceVoiceHint)
        ImageView deviceVoiceHint;
        @BindView(R.id.clickView)
        View clickView;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
