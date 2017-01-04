package com.example.nazrin.facebook_chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nazrin on 05.01.2017.
 */

public class User extends BaseAdapter {
    private int image_id [];
    private int phone [];
    private String  name [];
    private String  minute[];
    private Context context;

    public User(int[] image_id, int[] phone, String[] name, String[] minute, Context context) {
        this.image_id = image_id;
        this.phone = phone;
        this.name = name;
        this.minute = minute;
        this.context = context;
    }

    @Override
    public int getCount() {
        return image_id.length;
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
////        View itemView = view;
////        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////
////        if(view==null){
////            itemView = inflater.inflate(R.layout.list_item,null);
////        }
////        ImageView profileView= (ImageView) itemView.findViewById(R.id.profilePicture);
////        TextView nameView = (TextView) itemView.findViewById(R.id.user_name);
////        TextView minView = (TextView) itemView.findViewById(R.id.user_min);
////        ImageView phoneView= (ImageView) itemView.findViewById(R.id.phone);
////
////        profileView.setImageResource(image_id[i]);
////        nameView.setText(name[i]);
////        minView.setText(minute[i]);
////        phoneView.setImageResource(phone[i]);
//
//        return itemView;
        return null;

    }
}

