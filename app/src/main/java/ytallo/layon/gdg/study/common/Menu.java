package ytallo.layon.gdg.study.common;

import android.app.Activity;
import android.content.ClipData;

import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ytallo.layon.gdg.study.view.JavaActivity;

/**
 * Created by Ytallo on 09/04/2016.
 */
public class Menu {

    public static final ItemMenu C             = new ItemMenu("C", new Activity());
    public static final ItemMenu C_MORE        = new ItemMenu("C++", new Activity());
    public static final ItemMenu C_SHARP       = new ItemMenu("C#", new Activity());
    public static final ItemMenu JAVA          = new ItemMenu("Java", new JavaActivity());
    public static final ItemMenu JAVASCRIPT    = new ItemMenu("Javascript", new Activity());

    private static List<ItemMenu> all = Arrays.asList(C, C_MORE, C_SHARP, JAVA, JAVASCRIPT);

    public static List<ItemMenu> getAll() {
        return all;
    }

    public static ItemMenu getActivity(int position) {
        return all.get(position);
    }

    public static ItemMenu get(int position) {
        return all.get(position);
    }

    public static List<IDrawerItem> getDrawerItems() {
        List<IDrawerItem> drawerItems = new ArrayList<>();
        for (ItemMenu menu: all) {
            drawerItems.add(menu.getMenu());
        }
        return drawerItems;
    }
}
