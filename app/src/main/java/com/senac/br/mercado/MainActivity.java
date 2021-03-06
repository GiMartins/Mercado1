package com.senac.br.mercado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Object Toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Café");
        produtos.add("Iogurte");
        produtos.add("Uva Passa");
        ListView listView = findViewById(R.id.listViweProdutos);
        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,produtos);

        listView.setAdapter(listAdapter);
    }

    public void  cadastrarProduto(View view) {
        Intent cad = new Intent(this, CasdastroProdutoActivity.class);
        startActivity(cad);
    }


}

