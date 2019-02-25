package fr.epsi.liste;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class LegumeAdapter extends RecyclerView.Adapter<LegumesViewHolder> {

  public ArrayList<Legume> legumes;

  public LegumeAdapter(ArrayList<Legume> legumes) {
    this.legumes = legumes;
  }

  @NonNull
  @Override
  public LegumesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    TextView v = (TextView) LayoutInflater.from(viewGroup.getContext())
      .inflate(R.layout.legumeitem, viewGroup, false);

    return new LegumesViewHolder(v);

  }

  @Override
  public void onBindViewHolder(@NonNull LegumesViewHolder legumesViewHolder, int i) {
    legumesViewHolder.item.setText(legumes.get(i).nom);
  }

  @Override
  public int getItemCount() {
    return legumes.size();
  }
}
