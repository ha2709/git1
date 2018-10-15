package nguyenphan.aprotrain.com.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import nguyenphan.aprotrain.com.myapplication.database.DBHelper;
import nguyenphan.aprotrain.com.myapplication.database.model.Note;
import nguyenphan.aprotrain.com.myapplication.database.model.NoteModify;
import nguyenphan.aprotrain.com.myapplication.view.customAdapter;

public class MainActivity extends AppCompatActivity {



    private DBHelper db;
    private NoteModify noteModify;
    private List<Note> notesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );



        db = new DBHelper(this);
        noteModify = new NoteModify( this );
       // noteModify.insertNote( "Di thi Android" ); //khoi tao note dau tien
        notesList.addAll(db.getAllNotes());
        final ListView lisView1 = (ListView)findViewById(R.id.listview1);

        Cursor c = db.SelectData();
        customAdapter customAdapter = new customAdapter( this,c );


        lisView1.setAdapter(customAdapter);
    }
}
