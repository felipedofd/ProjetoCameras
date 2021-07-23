package br.com.projetocameras;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import br.com.projetocameras.databinding.ActivityMainBinding;
import br.com.projetocameras.databinding.DialogAddCamBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //novo metodo de chamada de view subistituindo o findViewById.
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.buttonAddCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder add_cam = new AlertDialog.Builder((MainActivity.this));
                DialogAddCamBinding dialogAddCamBinding = DialogAddCamBinding.inflate(getLayoutInflater());
                add_cam.setView(dialogAddCamBinding.getRoot());
                add_cam.setTitle("ADCIONAR CAMERAS");
                add_cam.setMessage("Insira o nome da camera, ip, usuario e senha");
                add_cam.setCancelable(false);

                add_cam.setPositiveButton("Adicionar",  new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                add_cam.setNegativeButton("Canecelar", null);
                add_cam.create().show();
            }
        });


    }

}



