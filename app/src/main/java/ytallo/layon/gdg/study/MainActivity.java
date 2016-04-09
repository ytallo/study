package ytallo.layon.gdg.study;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import ytallo.layon.gdg.study.view.Menu;

public class MainActivity extends AppCompatActivity {

    private Drawer result;

    private ViewFlipper viewFlipper;
    private float lastX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setSubtitle(getResources().getString(R.string.app_subtitle));

        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withDrawerItems(Menu.getAll())
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        result.closeDrawer();

                        return true;
                    }
                })
                .build();

    }

    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {

            case MotionEvent.ACTION_DOWN:
                lastX = touchevent.getX();
                break;
            case MotionEvent.ACTION_UP:
                float currentX = touchevent.getX();

                if (lastX < currentX) {

                    if (viewFlipper.getDisplayedChild() == 0)
                        break;

                    viewFlipper.setInAnimation(this, R.anim.in_left);
                    viewFlipper.setOutAnimation(this, R.anim.out_right);

                    viewFlipper.showNext();
                }

                if (lastX > currentX) {

                    if (viewFlipper.getDisplayedChild() == 1)
                        break;

                    viewFlipper.setInAnimation(this, R.anim.in_right);
                    viewFlipper.setOutAnimation(this, R.anim.out_left);

                    viewFlipper.showPrevious();
                }
                break;
        }
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        super.dispatchTouchEvent(ev);
        return onTouchEvent(ev);
    }

    public void setTitle(String text) {
        getSupportActionBar().setTitle(text);
    }

    public void setSubtitle(String text) {
        getSupportActionBar().setSubtitle(text);
    }
}
