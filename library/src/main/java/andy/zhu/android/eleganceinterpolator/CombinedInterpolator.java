package andy.zhu.android.eleganceinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by Andy.Zhu on 2017/4/24.
 */

public class CombinedInterpolator implements Interpolator {

    private Interpolator[] mInterpolators;

    public CombinedInterpolator(Interpolator... interpolators) {
        mInterpolators = interpolators;
    }

    @Override
    public float getInterpolation(float input) {
        if (input == 1) return 1;

        int index = (int) (input / (1f / mInterpolators.length));
        float pieceSize = 1f / mInterpolators.length;
        float subInput = (input - pieceSize * index) * mInterpolators.length;
        return pieceSize * index + pieceSize * mInterpolators[index].getInterpolation(subInput);
    }
}
