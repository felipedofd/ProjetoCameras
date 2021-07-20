package br.com.projetocameras;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//variavel do tipo webview
    private WebView webView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acativity_main);

        webView = findViewById(R.id.cam01);
        webView.loadUrl("http://10.0.0.197:81/videostream.cgi?loginuse=admin&loginpas=");



    }

}



