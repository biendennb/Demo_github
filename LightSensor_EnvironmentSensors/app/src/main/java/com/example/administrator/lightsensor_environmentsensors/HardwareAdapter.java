package com.example.administrator.lightsensor_environmentsensors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 9/20/2017.
 */

public class HardwareAdapter extends BaseAdapter{
    private LayoutInflater layoutInflater;
    private List<HardwareObject> listStorage;

   public HardwareAdapter (Context context, List<HardwareObject> customizeListView){
       layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
       listStorage=customizeListView;
   }

    @Override
    public int getCount() {
        return listStorage.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    static class ViewHolder{
        TextView hardware;
        TextView hardwareMeaning;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView=layoutInflater.inflate(R.layout.hardware_cardview,parent,false);
            //anh xa
            viewHolder.hardware= (TextView) convertView.findViewById(R.id.header);
            viewHolder.hardwareMeaning=(TextView) convertView.findViewById(R.id.header_value);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.hardware.setText(listStorage.get(position).getHardware());
        viewHolder.hardwareMeaning.setText(listStorage.get(position).getHardwareMeaning());
        return convertView;
    }
}
