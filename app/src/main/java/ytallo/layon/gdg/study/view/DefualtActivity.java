package ytallo.layon.gdg.study.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import ytallo.layon.gdg.study.R;
import ytallo.layon.gdg.study.common.ItemMenu;
import ytallo.layon.gdg.study.common.Menu;

/**
 * Created by Ytallo on 16/04/2016.
 */
public abstract class DefualtActivity extends AppCompatActivity {

    private Drawer result;

    protected void onDefaultCreate(Bundle savedInstanceState) {
        setContentView(getLayoutResourceId());

        Toolbar toolbar = (Toolbar) findViewById(getToolbarResourceId());
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }

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

    public void setSubititle(int id) {
        getSupportActionBar().setSubtitle(getResources().getString(id));
    }

    public abstract int getToolbarResourceId();

    public abstract int getLayoutResourceId();
}
