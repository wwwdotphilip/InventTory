package com.juan.lazy.inventtory.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.juan.lazy.inventtory.R;
import com.juan.lazy.inventtory.controller.Property;

import java.util.List;


public class GridViewAdapter extends BaseAdapter {
    private Activity activity;
    private List<Property> property;

    public GridViewAdapter(Activity activity, List<Property> property) {
        this.activity = activity;
        this.property = property;
    }

    @Override
    public int getCount() {
        return property.size();
    }

    @Override
    public Object getItem(int i) {
        return property.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = view;

        if (row == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            switch (property.get(i).type){
                case Property.HOME:
                    break;
                case Property.STORE:
                    break;
                case Property.WAREHOUSE:
                    break;
                default:
                    row = inflater.inflate(R.layout.new_property, null, false);
                    TextView label = (TextView) row.findViewById(R.id.tvIconLabel);
                    ImageView icon = (ImageView) row.findViewById(R.id.ivIcon);
                    break;
            }
        }

        return row;
    }
}
