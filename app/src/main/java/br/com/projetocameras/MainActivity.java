package br.com.projetocameras;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.bytedeco.javacv.FFmpegLogCallback;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameRecorder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import br.com.projetocameras.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
//variavel do tipo webview
    private WebView webView;

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acativity_main);

        webView = findViewById(R.id.cam01);
        webView.loadUrl("http://10.0.0.197:81/videostream.cgi?loginuse=admin&loginpas=");



    }

}



