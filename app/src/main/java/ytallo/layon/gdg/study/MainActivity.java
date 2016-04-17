package ytallo.layon.gdg.study;

import android.os.Bundle;

import ytallo.layon.gdg.study.view.DefualtActivity;

public class MainActivity extends DefualtActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onDefaultCreate(savedInstanceState);
    }

    @Override
    public int getToolbarResourceId() {
        return R.id.toolbar;
    }

    @Override
    public int getLayoutResourceId() {
        return R.layout.activity_main;
    }
}
