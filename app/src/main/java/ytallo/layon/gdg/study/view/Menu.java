package ytallo.layon.gdg.study.view;

import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.Arrays;
import java.util.List;

import ytallo.layon.gdg.study.R;

/**
 * Created by Ytallo on 09/04/2016.
 */
public class Menu {

    public static final IDrawerItem C             = new PrimaryDrawerItem().withName(R.string.c);
    public static final IDrawerItem C_MORE        = new PrimaryDrawerItem().withName(R.string.c_more);
    public static final IDrawerItem C_SHARP       = new PrimaryDrawerItem().withName(R.string.c_sharp);
    public static final IDrawerItem JAVA          = new PrimaryDrawerItem().withName(R.string.java);
    public static final IDrawerItem JAVASCRIPT    = new PrimaryDrawerItem().withName(R.string.javaScript);

    private static List<IDrawerItem> all = Arrays.asList(C, C_MORE, C_SHARP, JAVA, JAVASCRIPT);

    public static List<IDrawerItem> getAll() {
        return all;
    }

    public static IDrawerItem getDrawerItem(int position) {
        return all.get(position);
    }
}
