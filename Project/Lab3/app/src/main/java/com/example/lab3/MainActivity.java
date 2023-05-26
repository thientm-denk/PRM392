package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView dataView;
    ArrayList<String> data = new ArrayList<>();
    ArrayAdapter arrayAdapter;
    EditText inputText;
    TextView displayText;
    int SelectedIndex;
    Button add;
    Button delete;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataView = (ListView)findViewById(R.id.dataView);
        inputText = (EditText) findViewById(R.id.inputText);
        displayText = (TextView) findViewById(R.id.currentDisplay);
        add = (Button) findViewById(R.id.addBtn);
        delete = (Button) findViewById(R.id.deleteBtn);
        update = (Button) findViewById(R.id.updateBtn);
        data.add("Zalo");
        data.add("Facebook");
        data.add("Youtube");

        // Load data
        arrayAdapter = new ArrayAdapter(
                MainActivity.this, android.R.layout.simple_list_item_1,
                data
        );

        dataView.setAdapter(arrayAdapter);

        dataView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, data.get(position), Toast.LENGTH_SHORT).show();

                SelectedIndex = position;
                displayText.setText(data.get(position));
                inputText.setText(data.get(position));
            }
        });

        // Button Event
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HandleAdd();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HandleDelete();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HandleUpdate();
            }
        });
    }

    private void Delete(int id, ArrayAdapter arrayAdapter){
        data.remove(id);
        arrayAdapter.notifyDataSetChanged();
    }

    private void HandleDelete(){
        if (SelectedIndex == -1){
            return;
        }
        data.remove(SelectedIndex);
        arrayAdapter.notifyDataSetChanged();

        SelectedIndex = -1;
        displayText.setText("None");
    }
    private void HandleAdd(){
        SelectedIndex = -1;
        displayText.setText("None");

        data.add(inputText.getText().toString());
        arrayAdapter.notifyDataSetChanged();
    }
    private void HandleUpdate(){
        if (SelectedIndex == -1){
            return;
        }
        data.set(SelectedIndex, inputText.getText().toString());
        arrayAdapter.notifyDataSetChanged();

        SelectedIndex = -1;
        displayText.setText("None");
    }
}