package com.senac.br.mercado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.senac.br.mercado.dao.ProdutoDAO;
import com.senac.br.mercado.model.produto;

public class CasdastroProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casdastro_produto);
    }

    //public void onClick(View view){
    // Toast.makeText(getApplicationContext(),"cadastro do produto", Toast.LENGTH_LONG).show();
    //Intent cad = new Intent(this, MainActivity.class);
    //startActivity(cad);

    public void voltarPrimeira( View view) {

         EditText nome = findViewById(R.id.nomeEditText);
         EditText preco = findViewById(R.id.precoEditText);
         EditText quantidade = findViewById(R.id.quantidadeEditText);


        if (quantidade == null || quantidade.getText() == null || quantidade.getText().toString().equals("null") || quantidade.getText().toString().equals ("")) {
            Toast.makeText(getApplicationContext(), "Por favor informe a quantidade", Toast.LENGTH_LONG).show();
        } else {
            produto produto = new produto(nome.getText().toString(), Integer.parseInt(quantidade.getText().toString()), preco.getText().toString());

            ProdutoDAO dao = new ProdutoDAO(this);
            dao.salvar(produto);

            Intent voltar = new Intent(this, MainActivity.class);
            startActivity(voltar);
        }
    }


}

