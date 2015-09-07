package com.punjit.mvc.view;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.punjit.mvc.R;

/**
 * Created by vipulkanade on 5/12/15.
 */
public class SliderMenuListAdapter extends BaseAdapter {
    private Context mContext;
    public static final int iSliderMenuItems[] = {R.string.search_job, R.string.post_job, R.string.settings};
    private static final int iSliderMenuIcons[] = {};
    private static SliderMenuListAdapter mInstance;
    private static final Object obj = new Object();

    private SliderMenuListAdapter(Context context) {
        this.mContext = context;
    }

    public static SliderMenuListAdapter getInstance(Context context) {
        synchronized (obj) {
            if(mInstance == null) {
                mInstance = new SliderMenuListAdapter(context);
            }
        }
        return mInstance;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.slider_menu_list_item, null);
        }
        TextView oSliderMenuText = (TextView) convertView.findViewById(R.id.slider_menu_text);
        oSliderMenuText.setText(mContext.getString(iSliderMenuItems[position]));


        oSliderMenuText.setTextColor(ContextCompat.getColor(mContext, R.color.fbutton_color_green_sea));
        ImageView oSliderMenuIcon = (ImageView) convertView.findViewById(R.id.slider_menu_icon);
        oSliderMenuIcon.setBackgroundResource(iSliderMenuIcons[position]);
        oSliderMenuIcon.setVisibility(View.VISIBLE);


        return convertView;
    }


    @Override
    public int getCount() {
        return iSliderMenuItems.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
