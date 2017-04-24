package andy.zhu.android.eleganceinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by Andy.Zhu on 2017/4/25.
 */

public class OppositeInterpolator implements Interpolator {

    private Interpolator mOriginInterpolator;

    public OppositeInterpolator(Interpolator originInterpolator) {
        mOriginInterpolator = originInterpolator;
    }

    @Override
    public float getInterpolation(float input) {
        return 1 - (mOriginInterpolator.getInterpolation(1 - input));
    }
}
