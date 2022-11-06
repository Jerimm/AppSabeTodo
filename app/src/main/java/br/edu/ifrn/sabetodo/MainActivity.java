package br.edu.ifrn.sabetodo;

import static br.edu.ifrn.sabetodo.R.id.recyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

import br.edu.ifrn.sabetodo.adaptadores.TarefasAdapter;
import br.edu.ifrn.sabetodo.dominio.Tarefa;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TarefasAdapter tarefasAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        configurarRecyclerView();
        carregarTarefas();
    }

    public void configurarRecyclerView() {

        // Configurando o gerenciador de layout para ser uma grade.
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
    }

    public void carregarTarefas() {

        List<Tarefa> listaTarefas = Arrays.asList
                (new Tarefa(1, "Pedir Informacion Personal", 0, 1),
                        new Tarefa(2, "Presentear su Familia", 0, 2),
                        new Tarefa(3, "Viajar", 0, 3),
                        new Tarefa(4, "Compras", 3, 0)
                );
        tarefasAdapter = new TarefasAdapter(listaTarefas, MainActivity.this );
        recyclerView.setAdapter(tarefasAdapter);

    }
}