package com.helloworld.forallabouttest.logandviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //setTheme(R.style.Theme_big);
        setContentView(R.layout.activity_main);


        SetStr();
        LogMessages();
    }
    void SetStr(){
        String str="";
        for(int i=1;i<7;i++){
            int resID = getResources().getIdentifier("str"+i,"string","com.helloworld.forallabouttest.logandviewexample");
            str+=getString(resID);
        }
        ((TextView)findViewById(R.id.text)).setText(str);
    }
    void GetID(){
        for(int i=1;i<4;i++){
        int resID = getResources().getIdentifier("textview"+i,"id","com.helloworld.forallabouttest.logandviewexample");
            ((TextView) findViewById(resID)).setText("textview"+i);
        }
    }
    void SetView(){
        //자바 코드로 뷰를 구성하는 방법
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
        EditText edit = new EditText(this);
        edit.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        Button button = new Button(this);
        button.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        button.setText("Button!");
        layout.addView(edit);
        layout.addView(button);
        setContentView(layout);
    }
    void LogMessages(){
        Log.e("tag","error message");
        Log.w("tag","warning message");
        Log.i("tag","information message");
        Log.d("tag","debugging message");
        Log.v("tag","verbose message");
    }
}
