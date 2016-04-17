package ytallo.layon.gdg.study.common;

import android.app.Activity;

import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

/**
 * Created by Ytallo on 15/04/2016.
 */
public class ItemMenu {

    private String name;
    private Activity activity;
    private IDrawerItem menu;

    public ItemMenu() {
    }

    public ItemMenu(String name, Activity activity) {
        this.name = name;
        this.activity = activity;
        this.menu = new PrimaryDrawerItem().withName(name);;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public IDrawerItem getMenu() {
        return menu;
    }

    public void setMenu(IDrawerItem menu) {
        this.menu = menu;
    }
}
