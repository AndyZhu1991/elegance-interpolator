package andy.zhu.android.eleganceinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by zhujinchang on 2017/4/13.
 */

public class ReversedInterpolator implements Interpolator {

    private Interpolator mOriginInterpolator;

    public ReversedInterpolator() {
        this(new LinearInterpolator());
    }

    public ReversedInterpolator(Interpolator originInterpolator) {
        mOriginInterpolator = originInterpolator;
    }

    @Override
    public float getInterpolation(float input) {
        return mOriginInterpolator.getInterpolation(1 - input);
    }
}
