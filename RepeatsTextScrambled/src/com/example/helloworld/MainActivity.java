package com.example.helloworld;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.RepeatsText.R;

public class MainActivity extends Activity implements OnClickListener {
TextView tv;
EditText edt;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView1);
        edt=(EditText)findViewById(R.id.editText1);
        btn=(Button)findViewById(R.id.button1);
       
        btn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String str;
		str=edt.getText().toString();
		tv.setText(scramble(str));
	}
	public String scramble(String start_word){

	     char[] word = start_word.toCharArray();

	     char[] dummy = start_word.toCharArray();

	     Random rn = new Random();

	     int r = rn.nextInt(word.length-1);
	     int i = 0;

	     int j = r+1;

	     while(i <= r){

	            dummy[word.length -i-1] = word[i];

	            i++;
	        }


	      while (j <= word.length -1){

	            dummy[j-r-1] = word[j];

	            j++;

	        }

	      String newword = String.valueOf(dummy);



	      return newword;
    
}
}