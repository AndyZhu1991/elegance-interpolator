package andy.zhu.android.eleganceinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by Andy.Zhu on 2017/4/24.
 */

public class AccelerateInterpolator implements Interpolator {

    private double mFactor;

    public AccelerateInterpolator() {
        this(Math.E);
    }

    public AccelerateInterpolator(double factor) {
        mFactor = factor;
    }

    @Override
    public float getInterpolation(float input) {
        return (float) Math.pow(input, mFactor);
    }
}
