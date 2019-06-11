package br.com.etechoracio.firebase.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.etechoracio.firebase.R;
import br.com.etechoracio.firebase.holder.LineHolder;
import br.com.etechoracio.firebase.model.Personagem;

public class PersonagemAdapter extends RecyclerView.Adapter<LineHolder>{

    public PersonagemAdapter(List<Personagem> lista) {
        this.lista = lista;
    }

    private List<Personagem> lista;

    @NonNull
    @Override
    public LineHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lista, viewGroup, false);

        return new LineHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LineHolder lineHolder, int i) {
        lineHolder.getViewNome() .setText(lista.get(i).getNome() );




    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}



