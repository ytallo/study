package ytallo.layon.gdg.study;

import android.os.Bundle;

import ytallo.layon.gdg.study.view.DefualtActivity;

public class MainActivity extends DefualtActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onDefaultCreate(savedInstanceState);
        setSubtitle(getResources().getString(R.string.app_subtitle));
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
