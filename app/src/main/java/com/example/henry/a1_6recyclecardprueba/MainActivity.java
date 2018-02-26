package com.example.henry.a1_6recyclecardprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView contenedor = findViewById(R.id.recyclerView);

        ArrayList<Fuente> lista = new ArrayList<Fuente>();
        lista.add(new Fuente("Benedict Cumberbatch","Actor",R.drawable.dr));
        lista.add(new Fuente("Emma Watson", "Actriz",R.drawable.ew));
        lista.add(new Fuente("Anne Hathaway","Actriz",R.drawable.ga));
        lista.add(new Fuente("Jennifer Aniston", "Actriz",R.drawable.ja));
        lista.add(new Fuente("Leonardo DiCaprio","Actor",R.drawable.ld));
        lista.add(new Fuente("Natalie Portman", "Actriz",R.drawable.np));
        lista.add(new Fuente("Scarlett Johansson","Actriz",R.drawable.sj));
        lista.add(new Fuente("Dwayne Johnson", "Actor",R.drawable.tr));
        lista.add(new Fuente("Leonardo DiCaprio","Actor",R.drawable.ld));
        lista.add(new Fuente("Natalie Portman", "Actriz",R.drawable.np));
        lista.add(new Fuente("Scarlett Johansson","Actriz",R.drawable.sj));
        lista.add(new Fuente("Dwayne Johnson", "Actor",R.drawable.tr));




        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new Adaptador(lista));
        contenedor.setLayoutManager(layout);



    }
}
