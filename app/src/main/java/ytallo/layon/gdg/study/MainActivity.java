package ytallo.layon.gdg.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ViewFlipper;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import ytallo.layon.gdg.study.common.ItemMenu;
import ytallo.layon.gdg.study.common.Menu;

public class MainActivity extends AppCompatActivity {

    private Drawer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setSubtitle(getResources().getString(R.string.app_subtitle));

        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withDrawerItems(Menu.getDrawerItems())
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        result.closeDrawer();
                        showScreen(position);

                        return true;
                    }
                })
                .build();

    }

    private void showScreen(int position) {
        ItemMenu item = Menu.get(position);
        Activity activity = item.getActivity();
        Intent screen = new Intent(this, activity.getClass());
        setSubtitle(item.getName());
        startActivity(screen);
        finish();
    }

    public void setTitle(String text) {
        getSupportActionBar().setTitle(text);
    }

    public void setSubtitle(String text) {
        getSupportActionBar().setSubtitle(text);
    }
}
