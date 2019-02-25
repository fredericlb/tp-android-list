package fr.epsi.liste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  public ArrayList<Legume> legumes = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    legumes.add(new Legume("Aubergine", "Violet"));
    legumes.add(new Legume("Petits pois", "Vert"));
    legumes.add(new Legume("Carotte", "Orange"));

    RecyclerView list = (RecyclerView) findViewById(R.id.legumesList);
    list.setLayoutManager(new LinearLayoutManager(this));
    list.setAdapter(new LegumeAdapter(legumes));

  }
}
