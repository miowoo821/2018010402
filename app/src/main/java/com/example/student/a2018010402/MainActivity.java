package com.example.student.a2018010402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str[]={"AAA","BBB","CCC"};//先訂個陣列(或是外面抓的，總之是陣列資料

        //Adapter adapter=(Adapter)findViewById(R.id.listview);//創一個Adapter出來
       // adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,str);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, str);
        ListView lv;
        lv=(ListView)findViewById(R.id.listview);

        lv.setAdapter(adapter);

    }
}
