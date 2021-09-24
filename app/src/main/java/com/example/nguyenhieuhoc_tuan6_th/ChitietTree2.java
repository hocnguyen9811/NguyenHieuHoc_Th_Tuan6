package com.example.nguyenhieuhoc_tuan6_th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

public class ChitietTree2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chitiet_tree2 );
        Fade fade=new Fade();
        View decor=getWindow().getDecorView();

        getWindow().setEnterTransition( fade );
        getWindow().setExitTransition( fade );


        findViewById( R.id.button44 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(ChitietTree2.this,DanhsachTree.class) );


            }
        } );
    }
}