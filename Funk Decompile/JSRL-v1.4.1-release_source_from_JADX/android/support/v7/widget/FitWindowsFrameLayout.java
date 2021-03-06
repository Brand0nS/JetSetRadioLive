package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.C0758w.C0902a;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout implements C0758w {
    private C0902a f1689a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C0902a c0902a) {
        this.f1689a = c0902a;
    }

    protected boolean fitSystemWindows(Rect rect) {
        if (this.f1689a != null) {
            this.f1689a.m4592a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
