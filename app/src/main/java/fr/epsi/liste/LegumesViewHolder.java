package fr.epsi.liste;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class LegumesViewHolder extends RecyclerView.ViewHolder {
  public TextView item;

  public LegumesViewHolder(@NonNull TextView itemView) {
    super(itemView);
    item = itemView;
  }
}
