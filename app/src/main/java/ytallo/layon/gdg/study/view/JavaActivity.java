package ytallo.layon.gdg.study.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import ytallo.layon.gdg.study.MainActivity;
import ytallo.layon.gdg.study.R;

/**
 * Created by Ytallo on 16/04/2016.
 */
public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_activity);

        TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();

        TabHost.TabSpec spec = host.newTabSpec("Tipos");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tipos");
        host.addTab(spec);
    }

}
