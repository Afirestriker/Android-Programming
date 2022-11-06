package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;               /* each widget */
import android.view.ViewGroup;          /*Collection of view (widget) */
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String countryList[];
    int flags[];

    LayoutInflater inflater;

    /* Class Constructor Method */
    public CustomAdapter(Context applicationContext, String countryList[], int flags[])
    {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        inflater = (LayoutInflater.from(applicationContext));
    }
    /*Close: Constructor Method */

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_list_view1, null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView countryName = (TextView) view.findViewById(R.id.textView);

        icon.setImageResource(flags[i]);
        countryName.setText(countryList[i]);

        return view;
    }

} /* Close Custom adapter class */
