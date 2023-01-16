package ddwu.mobile.week02.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate is started");

        TextView myText = new TextView(this);
        myText.setText("코드로 문자열 출력");
        myText.setText(R.string.text);
        setContentView(myText);
    }
}