package ttt.prattvaidya.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.listView);
        ArrayList<String> family = new ArrayList<String>();
        family.add("Pratt Vaidya");
        family.add("Deepti Vaidya");
        family.add("Advait Vaidya");
        family.add("Ritesh Vaidya");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, family);
        myListView.setAdapter(arrayAdapter);
    }
}