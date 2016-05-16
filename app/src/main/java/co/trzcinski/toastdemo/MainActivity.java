package co.trzcinski.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    public void display(View view){
        Toast toast = Toast.makeText(
                getApplicationContext(),
                textView.getText().toString(),
                Toast.LENGTH_SHORT);
              toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,0);
        toast.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }
}
