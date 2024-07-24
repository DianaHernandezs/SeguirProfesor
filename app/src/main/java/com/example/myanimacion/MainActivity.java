package com.example.myanimacion;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Instanciar la variable, visual con logica
        TextView tituloL = findViewById(R.id.titulo);

        //Crear la animacion
        Animation anim_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

        //Ejecutar la animacion
        tituloL.startAnimation(anim_out);


    }
}