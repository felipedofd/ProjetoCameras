package br.com.projetocameras;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Adapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import br.com.projetocameras.databinding.ActivityMainBinding;
import br.com.projetocameras.databinding.DialogAddCamBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private CamAdapter camAdapter = new CamAdapter();



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //novo metodo de chamada de view subistituindo o findViewById.
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.listaCam.setLayoutManager(new LinearLayoutManager(this));
        binding.listaCam.setAdapter(camAdapter);





        binding.buttonAddCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder add_cam = new AlertDialog.Builder((MainActivity.this));
                DialogAddCamBinding dialogAddCamBinding = DialogAddCamBinding.inflate(getLayoutInflater());
                add_cam.setView(dialogAddCamBinding.getRoot());
                add_cam.setTitle("ADCIONAR CAMERAS");
                add_cam.setMessage("Insira o nome da camera, ip, usuario e senha");
                add_cam.setCancelable(false);
                add_cam.setPositiveButton("Adicionar", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String userNameAdd = dialogAddCamBinding.camName.getText().toString();
                        String userIpCam = dialogAddCamBinding.ipCam.getText().toString();
                        String userPort = dialogAddCamBinding.ipPort.getText().toString();
                        String userUser = dialogAddCamBinding.user.getText().toString();
                        String userPassword = dialogAddCamBinding.password.getText().toString();

                        camAdapter.addUrl("http://" + userIpCam + ":" + userPort + "/videostream.cgi?loginuse=" + userUser +"&loginpas=" + userPassword);



                    }
                });
                add_cam.setNegativeButton("Canecelar", null);
                add_cam.create().show();
            }
        });


    }

}



