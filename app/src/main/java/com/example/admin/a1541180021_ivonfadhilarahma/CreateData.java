package com.example.admin.a1541180021_ivonfadhilarahma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class CreateData extends Activity implements OnClickListener {

    //inisilisasi elemen-elemen pada layout
    private Button buttonSubmit;
    private EditText edNama;
    private EditText edMenu;

    private EditText edHarga;
    //inisialisasi kontroller/Data Source
    private DBDataSource dataSource;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_data);

        buttonSubmit = (Button) findViewById(R.id.buttom_submit);
        buttonSubmit.setOnClickListener(this);
        edNama = (EditText) findViewById(R.id.nama_food);
        edHarga = (EditText) findViewById(R.id.harga_food);
        edMenu = (EditText) findViewById(R.id.menu_food);

// instanstiasi kelas DBDataSource
        dataSource = new DBDataSource(this);

//membuat sambungan baru ke database
        dataSource.open();
    }

    //KETIKA Tombol Submit Diklik
    @Override
    public void onClick(View v) {
// Inisialisasi data food
String nama = null;
String menu = null;
String harga = null;
        @SuppressWarnings("unused")

//inisialisasi food baru (masih kosong)
                Food food = null;
        if(edNama.getText()!=null && edMenu.getText()!=null &&
                edHarga.getText()!=null)
        {
            /* jika field nama, menu, dan harga tidak kosong
             * maka masukkan ke dalam data food*/
            nama = edNama.getText().toString();
            menu = edMenu.getText().toString();
            harga = edHarga.getText().toString();
        }

        switch(v.getId())
        {
            case R.id.buttom_submit:
// insert data food baru
                food = dataSource.createFood(nama, menu, harga);

//konfirmasi kesuksesan
                Toast.makeText(this, "masuk Food\n" + "\nnama" + food.getNama_food() + "\nmenu" + food.getMenu_food() + "\nharga" + food.getHarga_food(), Toast.LENGTH_LONG).show();
                break;
        }

    }

}
