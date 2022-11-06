package br.edu.ifrn.sabetodo.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.edu.ifrn.sabetodo.R;
import br.edu.ifrn.sabetodo.dominio.Tarefa;
import br.edu.ifrn.sabetodo.holders.TarefaHolder;

public class TarefasAdapter extends RecyclerView.Adapter<TarefaHolder>{


    private List<Tarefa> listaTarefas;
    private Context context;

    public TarefasAdapter(List<Tarefa> listaTarefas, Context context) {
        this.listaTarefas = listaTarefas;
        this.context = context;
    }

    @NonNull
    @Override
    public TarefaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new TarefaHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tarefas_content, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TarefaHolder holder, int position) {

        Tarefa tarefa = listaTarefas.get(position);

        holder.getTvTitulo().setText(tarefa.getNome());

    }

    @Override
    public int getItemCount() {
        return listaTarefas.size();
    }
}
