package br.com.etechoracio.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import br.com.etechoracio.firebase.adapter.PersonagemAdapter;
import br.com.etechoracio.firebase.mock.PersonagemMockFactory;
import br.com.etechoracio.firebase.model.Personagem;

public class  ListagemActivity extends AppCompatActivity {



    private List<Personagem> lista;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        lista = PersonagemMockFactory.createMockList();
        recyclerView = findViewById(R.id.ListaPersonagens);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        PersonagemAdapter adapter = new PersonagemAdapter(lista);
        recyclerView.setAdapter(adapter);



    }
}
