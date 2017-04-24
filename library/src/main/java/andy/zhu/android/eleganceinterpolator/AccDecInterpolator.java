package andy.zhu.android.eleganceinterpolator;

/**
 * Created by Andy.Zhu on 2017/4/25.
 */

public class AccDecInterpolator extends CombinedInterpolator {

    public AccDecInterpolator() {
        super(new AccelerateInterpolator(), new DecelerateInterpolator());
    }

    public AccDecInterpolator(double factor) {
        super(new AccelerateInterpolator(factor), new DecelerateInterpolator(factor));
    }
}
