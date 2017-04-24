package andy.zhu.android.eleganceinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by zhujinchang on 2017/4/13.
 */

public class LinearInterpolator implements Interpolator {
    @Override
    public float getInterpolation(float input) {
        return input;
    }
}
