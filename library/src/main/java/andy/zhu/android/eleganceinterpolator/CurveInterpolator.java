package andy.zhu.android.eleganceinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by zhujinchang on 2017/4/13.
 */

public class CurveInterpolator implements Interpolator {

    private float mCpx;
    private float mCpy;

    /**
     * @param cpx X of the control point
     * @param cpy Y of the control point
     */
    public CurveInterpolator(float cpx, float cpy) {
        this.mCpx = cpx;
        this.mCpy = cpy;
    }

    @Override
    public float getInterpolation(float x) {
        float ax, bx;
        float ay, by;

//        bx = 2f * (cp[1].x - cp[0].x);
//        ax = cp[2].x - cp[0].x - bx;
        bx = 2f * mCpx;
        ax = 1 - bx;

        by = 2f * mCpy;
        ay = 1 - by;

//        float t;
//        tSquared = t * t;
//        x == (ax * tSquared) + (bx * t) + cp[0].x;
//        (ax * tSquared) + (bx * t) + cp[0].x - x == 0
        float delta = bx * bx - 4 * ax * (-x); // bx * bx - 4 * ax * (cp[0].x - x);
        float t1 = (-bx + (float) Math.sqrt(delta)) / (2 * ax);
        float t2 = (-bx - (float) Math.sqrt(delta)) / (2 * ax);
        float t = t1 >= 0 && t1 < 1 ? t1 : t2;

//        return  (ay * t * t) + (by * t) + cp[0].y;
        return  (ay * t * t) + (by * t);
    }
}
