package br.com.opet.tds.aula090817;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textInfo = (TextView) findViewById(R.id.textInfo);
        textInfo.setText("Aula de Android");
    }

    public void exibirTexto(View view){
        EditText editNome = (EditText) findViewById(R.id.editNome);
        String nome = editNome.getText().toString();

        RatingBar rating = (RatingBar) findViewById(R.id.ratingBar);
        float nota = rating.getRating();

        Toast.makeText(this, "Bem-vindo, " + nome + "\nAvaliação: " + nota, Toast.LENGTH_SHORT).show();
    }
}
