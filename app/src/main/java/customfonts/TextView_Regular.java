package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class TextView_Regular extends android.support.v7.widget.AppCompatTextView {
    public TextView_Regular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextView_Regular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextView_Regular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "myfonts/Roboto-Regular.ttf");
            setTypeface(tf);
        }
    }

}