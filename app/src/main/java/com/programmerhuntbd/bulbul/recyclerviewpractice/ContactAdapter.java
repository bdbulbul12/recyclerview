package com.programmerhuntbd.bulbul.recyclerviewpractice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bulbul on 8/29/2018.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    //2.
    ArrayList<Contact> adapter_list = new ArrayList<>();
    MainActivity mainActivity;
    Context ctx;

    //3.
    public ContactAdapter (ArrayList<Contact> adapter_list, Context ctx){
        this.adapter_list=adapter_list;
        this.ctx=ctx;
        mainActivity= (MainActivity) ctx;
    }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //4.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view,mainActivity);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        holder.img.setImageResource(adapter_list.get(position).getImg_id());
        holder.Name.setText(adapter_list.get(position).getName());
        holder.Email.setText(adapter_list.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return adapter_list.size();
    }

    //1.my method

    public static class ContactViewHolder extends RecyclerView.ViewHolder{


        ImageView img;
        TextView Name,Email;
        CheckBox checkBox;
        MainActivity mainActivity;

        public ContactViewHolder(View itemView,MainActivity mainActivity) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.imgViewId);
            Name = (TextView) itemView.findViewById(R.id.name);
            Email= (TextView) itemView.findViewById(R.id.email);
            checkBox= (CheckBox) itemView.findViewById(R.id.checkbox);
            this.mainActivity=mainActivity;
        }
    }
}
