package com.example.bonjournom;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
TextView text1;
Button btn;
EditText str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        text1=(TextView)  findViewById(R.id.textView10);
        btn=(Button) findViewById(R.id.button);

   str=(EditText) findViewById(R.id.editText);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String msg= getResources().getString(R.string.message);
text1.setText(msg+str.getText());

    }
});

    }



}
