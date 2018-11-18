package andersonsv.com.br.showjokelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        String gce_result = getIntent().getStringExtra("gce_result");
        TextView gce_result_show = findViewById(R.id.textViewResult);
        gce_result_show.setText(gce_result);
    }
}
