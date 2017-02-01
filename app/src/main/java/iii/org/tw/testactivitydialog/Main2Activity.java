package iii.org.tw.testactivitydialog;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class Main2Activity extends Activity {

    @Override
    public void finish() {
        Intent intent = getIntent();
        intent.putExtra("value",((EditText)findViewById(R.id.edtitText)).getText().toString());
        setResult(0,intent);
        super.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);



    }
}
