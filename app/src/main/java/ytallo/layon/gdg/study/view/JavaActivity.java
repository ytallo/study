package ytallo.layon.gdg.study.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import ytallo.layon.gdg.study.R;

/**
 * Created by Ytallo on 16/04/2016.
 */
public class JavaActivity extends AppCompatActivity {

    private TabHost host;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.java_activity);

        host = (TabHost) findViewById(R.id.tabHost);
        host.setup();
        addTab(R.id.tab1, "Tipos");
        addTab(R.id.tab2, "E/S");
        addTab(R.id.tab3, "Arrays");
        addTab(R.id.tab4, "Estrut. Decisão");
        addTab(R.id.tab5, "Loops");
    }

    private void addTab(int layout, String name) {

        TabHost.TabSpec spec = host.newTabSpec(name);
        spec.setContent(layout);
        spec.setIndicator(name);
        host.addTab(spec);
    }


//    @Override
//    public int getToolbarResourceId() {
//        return R.id.toolbar;
//    }
//
//    @Override
//    public int getLayoutResourceId() {
//        return R.layout.java_activity;
//    }

}
