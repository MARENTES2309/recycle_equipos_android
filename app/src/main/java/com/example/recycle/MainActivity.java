package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewEquipo;
    private RecycleViewAdaptador adaptadorEquipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewEquipo=(RecyclerView)findViewById(R.id.recycleequipo);
        recyclerViewEquipo.setLayoutManager(new LinearLayoutManager(this));

        adaptadorEquipo= new RecycleViewAdaptador(obtenerequipos());
        recyclerViewEquipo.setAdapter(adaptadorEquipo);
    }

    public ArrayList<equipo> obtenerequipos(){
        ArrayList<equipo> equipo=new ArrayList<>();
        equipo.add(new equipo("Santos Laguna","Torreón",R.drawable.santos_lag));
        equipo.add(new equipo("Queretaro","Queretaro",R.drawable.queretaro));
        equipo.add(new equipo("Tigres","San Nicolas",R.drawable.tigres));
        equipo.add(new equipo("Real Madrid","España",R.drawable.real_madrid));
        equipo.add(new equipo("Barcelona","España",R.drawable.barcelona));
        equipo.add(new equipo("Borussia","Alemania",R.drawable.borussia));
        return  equipo;
    }
}
