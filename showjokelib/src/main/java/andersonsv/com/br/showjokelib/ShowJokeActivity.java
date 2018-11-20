package andersonsv.com.br.showjokelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static andersonsv.com.br.showjokelib.util.ExtraUtil.EXTRA_GCE_RESULT;

public class ShowJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        String gce_result = getIntent().getStringExtra(EXTRA_GCE_RESULT);
        TextView gce_result_show = findViewById(R.id.textViewResult);
        gce_result_show.setText(gce_result);
    }
}
