package br.com.projetocameras;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.projetocameras.databinding.ItemCamBinding;

public class CamAdapter extends RecyclerView.Adapter<CamAdapter.CamViewHolder> {


    private ArrayList<String> listUrl = new ArrayList<>();

    public void addUrl(String url){
        listUrl.add(url);
        notifyDataSetChanged();
    }
