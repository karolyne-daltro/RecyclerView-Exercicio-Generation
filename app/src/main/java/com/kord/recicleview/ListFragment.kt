package com.kord.recicleview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val listTarefas = mutableListOf(
            Tarefa(
                "Limpar a Casa",
                "Iniciar na parte da manhã",
                "Henrique",
                "2022-21-03",
                true,
                "Dia a Dia"
            ),
            Tarefa(
                "Lavar a Louça",
                "Do dia todo :^)",
                "Henrique",
                "2022-22-03",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Ir ao Parque",
                "Me encontrar com o pessoal no metrô",
                "Henrique",
                "2022-26-03",
                false,
                "Lazer"
            )
        )
        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)
        val adapter = TarefaAdapter()
        recyclerTarefa.layoutManager = LinearLayoutManager(context)
        recyclerTarefa.adapter = adapter
        recyclerTarefa.setHasFixedSize(true)
        adapter.setLista(listTarefas)

        return view
    }
}