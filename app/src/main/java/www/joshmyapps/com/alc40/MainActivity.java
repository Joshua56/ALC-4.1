package www.joshmyapps.com.alc40;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button_one);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityB();
            }
        });




    }
    public void AboutUs(View v) {
        Intent intent = new Intent(getApplicationContext(), AboutUs.class);

        switch(v.getId())
        {
            case R.id.button:
                startActivity(intent);
                break;

            case R.id.button_one:
                intent.putExtra("url", "https://andela.com/alc/");

                startActivity(intent);
                break;

            default:
                break;
        }
    }



    public void openActivityB(){
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);
    }


}

