package com.sebastian.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Cmascota> mascotas;
    private RecyclerView rvMascotas;
    private ImageButton btnStar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        // Boton star
        btnStar = (ImageButton)findViewById(R.id.btnStar);

        // Se convierte el recyclerview layout a un objeto
        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        // Formato del recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        //GridLayoutManager glm = new GridLayoutManager(this,2);
        rvMascotas.setLayoutManager(llm);

        IniLista();
        IniAdaptador();
        // Accion de boton de Star
        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i3);
            }
        });
    }


    public void IniLista(){
        mascotas = new ArrayList<Cmascota>();
        mascotas.add(new Cmascota("Perla",R.drawable.dogperfil,"2"));
        mascotas.add(new Cmascota("Canela",R.drawable.dogperfil,"2"));
        mascotas.add(new Cmascota("Caramelo",R.drawable.dogperfil,"2"));
        mascotas.add(new Cmascota("Almendra",R.drawable.dogperfil,"2"));
        mascotas.add(new Cmascota("Lola",R.drawable.dogperfil,"2"));
        mascotas.add(new Cmascota("Chiqui",R.drawable.dogperfil,"2"));
        mascotas.add(new Cmascota("Alan",R.drawable.dogperfil,"2"));
        mascotas.add(new Cmascota("Garfield",R.drawable.dogperfil,"2"));
    };

    public void IniAdaptador(){;
        CmascotaAdapter adaptador = new CmascotaAdapter(mascotas,this);
        rvMascotas.setAdapter(adaptador);
    }
}
