package br.edu.ifrn.sabetodo.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.edu.ifrn.sabetodo.R;

public class TarefaHolder extends RecyclerView.ViewHolder {

    private TextView tvTitulo;


    public TarefaHolder(@NonNull View itemView) {
        super(itemView);

        tvTitulo = itemView.findViewById(R.id.tvTitulo);
    }

    public TextView getTvTitulo() {
        return tvTitulo;
    }
}
