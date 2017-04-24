package andy.zhu.android.eleganceinterpolator;

/**
 * Created by Andy.Zhu on 2017/4/24.
 */

public class DecelerateInterpolator extends OppositeInterpolator {

    public DecelerateInterpolator() {
        super(new AccelerateInterpolator());
    }

    public DecelerateInterpolator(double factor) {
        super(new AccelerateInterpolator(factor));
    }
}
