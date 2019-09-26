package com.example.examen_josefconcepcion;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.content.ContextCompat;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    View color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        color = findViewById(R.id.Cuadro);
        final ClaseAdapter adapter = new ClaseAdapter(ListDataHelper.provideItems());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        adapter.getItem(position).getTitle(),
                        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), adapter.getItem(i).getColorId())
            }
    }}
}

}