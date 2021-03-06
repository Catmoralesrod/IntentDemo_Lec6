package com.example.catalinamorales.intentdemo_lec6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import static com.example.catalinamorales.intentdemo_lec6.Utils.Utils.AGE_MSG_KEY;
import static com.example.catalinamorales.intentdemo_lec6.Utils.Utils.NAME_MSG_KEY;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText editText1, editText2;
    private ListView lsView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsView=(ListView)findViewById(R.id.ls_view_ma1);

        final String[] myItems= getResources().getStringArray(R.array.my_itm_lst);

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myItems);
        lsView.setAdapter(adapter);

        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                view.setSelected(true);
                Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                intent.putExtra(AGE_MSG_KEY, "Item is : " +myItems[i]);
                startActivity(intent);
            }
        });

        editText1=(EditText) findViewById(R.id.edittxt_ma1);
        editText2=(EditText) findViewById(R.id.edittxt_ma2);
        btn1 =(Button)findViewById(R.id.btn1_ma1);
        btn1.setOnClickListener(new MyLstnr());


            }


class MyLstnr implements View.OnClickListener{

    @Override
    public void onClick(View view) {
        Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
        intent2.putExtra(AGE_MSG_KEY, "Your age is " + Integer.parseInt(editText1.getText().toString()));
        intent2.putExtra(NAME_MSG_KEY, "Your name is " + editText2.getText().toString());
        startActivity(intent2);




    }
}


}
