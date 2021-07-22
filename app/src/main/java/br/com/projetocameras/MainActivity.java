package br.com.projetocameras;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.bytedeco.javacv.FFmpegLogCallback;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameRecorder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import br.com.projetocameras.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //novo metodo de chamada de view subistituindo o findViewById.
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        binding.cam01.loadUrl("http://www.google.com.br");


        binding.buttonAddCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder add_cam = new AlertDialog.Builder((MainActivity.this));
                add_cam.setView(R.layout.dialog_add_cam);
                add_cam.setTitle("ADCIONAR CAMERAS");
                add_cam.setMessage("Insira o nome da camera, ip, usuario e senha");
                add_cam.setCancelable(false);

                add_cam.setPositiveButton("Adicionar",  new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }

    }

}



