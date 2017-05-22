package nlp.universitypreference;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    String[] uni_name;
    String[] compound;

    List<RowItem> rowItems1;
    List<RowItem> rowItems;
    ListView lw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rowItems = new ArrayList<>();

        rowItems.add(new RowItem("Anadolu Üniversitesi", "3.0720666666666676",null));
        rowItems.add(new RowItem("Abdullah Gül Üniversitesi", "2.4036",null));
        rowItems.add(new RowItem("Ankara Üniversitesi", "2.205142857142857",null));
        rowItems.add(new RowItem("Ege Üniversitesi", "1.93225",null));
        rowItems.add(new RowItem("Dokuz Eylül Üniversitesi", "1.8325333333333336",null));
        rowItems.add(new RowItem("Adıyaman Üniversitesi", "1.6558",null));
        rowItems.add(new RowItem("Boğaziçi Üniversitesi", "1.4797333333333336",null));
        rowItems.add(new RowItem("Abant İzzet Baysal Üniversitesi", "1.18376",null));
        rowItems.add(new RowItem("Marmara Üniversitesi", "1.1581777777777778",null));
        rowItems.add(new RowItem("Atatürk Üniversitesi", "1.1214399999999998",null));
        rowItems.add(new RowItem("Erciyes Üniversitesi", "1.0130000000000003",null));
        rowItems.add(new RowItem("İstanbul Üniversitesi", "0.856",null));
        rowItems.add(new RowItem("Çukurova Üniversitesi", "0.7767428571428575",null));
        rowItems.add(new RowItem("Adana Bilim ve Teknoloji Üniversitesi", "0.14040000000000014",null));
        rowItems.add(new RowItem("Gazi Üniversitesi", "-0.27453333333333313",null));
        rowItems.add(new RowItem("Muğla Sıtkı Koçman Üniversitesi", "-0.9430571428571425",null));
        rowItems.add(new RowItem("Adnan Menderes Üniversitesi", "-1.0388000000000002",null));

        /**
        uni_name = getResources().getStringArray(R.array.Uni_name);
        compound = getResources().getStringArray(R.array.compound_values);


        for (int i = 0;i < uni_name.length; i++){
            RowItem item = new RowItem(uni_name[i],compound[i]);
            rowItems.add(item);
        }
         */
        lw = (ListView) findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this,rowItems);
        lw.setAdapter(adapter);

        lw.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //String uni_name = rowItems.get(i).getUni_name();
        //Toast.makeText(getApplicationContext(),"" + uni_name,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.putExtra("Üniversite Adı", rowItems.get(i).getUni_name());
        intent.putExtra("Compound Value", rowItems.get(i).getCompound());
        intent.putExtra("Bölüm", rowItems.get(i).getBolum());

        intent.setClass(MainActivity.this,Main2Activity.class);
        startActivity(intent);

    }

}
