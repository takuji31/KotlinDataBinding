package jp.takuji31.kotlindatabinding;

import android.databinding.BindingConversion;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/**
 * Created by takuji on 2016/03/30.
 */
public class Converters {
    private Converters() {
    }

    @BindingConversion
    public static ColorDrawable convertColorStringToColor(String colorString) {
        return new ColorDrawable(Color.parseColor(colorString));
    }
}
