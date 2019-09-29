package com.example.gykprojedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DerslerimActivity extends AppCompatActivity {
    private ListView listDerslerim;
    private List<String> derslerimArray = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derslerim);
        listDerslerim = findViewById(R.id.listDerslerim);
        derslerimArray.add("Renkler");
        derslerimArray.add("Meyveler");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1
                , derslerimArray);
        listDerslerim.setAdapter(arrayAdapter);

        listDerslerim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String secilenKategori = (String) listDerslerim.getItemAtPosition(position);
                if(position==0)
                {
                    Toast.makeText(DerslerimActivity.this,derslerimArray.get(position),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
