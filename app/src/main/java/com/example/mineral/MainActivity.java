package com.example.mineral;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvmineral;
    private ArrayList<Mineral> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvmineral = findViewById(R.id.rv_mineral);
        rvmineral.setHasFixedSize(true);

        list.addAll(DataMineral.getListdata());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvmineral.setLayoutManager(new LinearLayoutManager(this));
        ListMineralAdapter listMineralAdapter = new ListMineralAdapter(list);
        rvmineral.setAdapter(listMineralAdapter);
    }
}