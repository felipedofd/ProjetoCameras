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

    @NonNull
    @Override
    public CamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCamBinding itemCamBinding = ItemCamBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new CamViewHolder(itemCamBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CamAdapter.CamViewHolder holder, int position) {
        holder.bind(listUrl.get(position));
    }

    @Override
    public int getItemCount() {
        return listUrl.size();
    }


    public static class CamViewHolder extends RecyclerView.ViewHolder {
        private ItemCamBinding binding;

        public CamViewHolder(ItemCamBinding view) {
            super(view.getRoot());
            binding = view;
        }

        public void bind(String url) {
            binding.cam.loadUrl(url);
        }
    }
}


// "http://" + userIpCam + ":" + userPort + "/videostream.cgi?loginuse=" + userUser +"&loginpas=" + userPassword