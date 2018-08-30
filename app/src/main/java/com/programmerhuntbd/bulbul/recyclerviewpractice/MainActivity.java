package com.programmerhuntbd.bulbul.recyclerviewpractice;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    int[] img_id={R.drawable.ic_action_search};

    ArrayList<Contact> Contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Second Step

        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        String [] Name,Email;

        Name=getResources().getStringArray(R.array.name);
        Email=getResources().getStringArray(R.array.email);

        int i=0;

        for(String NAME:Name){

           // Contact contact = new Contact(img_id[i],NAME,Email[i]);
            Contact contact2 = new Contact(NAME,Email[i]);
           // Contacts.add(contact);
            Contacts.add(contact2);
            i++;


        }

        adapter = new ContactAdapter(Contacts,MainActivity.this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_activity_main,menu);
        return true;
    }
}
