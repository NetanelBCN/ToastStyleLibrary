package dev.netanelbcn.styledtoastlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.widget.TextViewCompat;

public class ToastStyler {

    public static final int POSITION_BOTTOM = 0;
    public static final int POSITION_TOP = 1;

    public enum ToastStyle {
        DANGER(R.style.DangerToast),
        PRIMARY(R.style.PrimaryToast),
        SUCCESS(R.style.SuccessToast),
        VIOLET(R.style.VioletToast),
        WARNING(R.style.WarningToast);

        private final int styleResId;

        ToastStyle(int styleResId) {
            this.styleResId = styleResId;
        }

        public int getStyleResId() {
            return styleResId;
        }
    }

    public static void showToast(Context context, String message, int styleRes, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View toastLayout = inflater.inflate(R.layout.custom_toast_layout, null);

        TextView toastTextView = toastLayout.findViewById(R.id.toastText);
        toastTextView.setText(message);

        Context themedContext = new ContextThemeWrapper(context, styleRes);

        TypedArray a = themedContext.obtainStyledAttributes(new int[]{android.R.attr.background});
        Drawable background = a.getDrawable(0);
        if (background != null) {
            toastLayout.setBackground(background);
        }
        a.recycle();

        TextViewCompat.setTextAppearance(toastTextView, styleRes);

        a = themedContext.obtainStyledAttributes(new int[]{android.R.attr.padding});
        int padding = a.getDimensionPixelSize(0, 0);
        if (padding != 0) {
            toastLayout.setPadding(padding, padding, padding, padding);
        }
        a.recycle();

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(toastLayout);

        if (position == POSITION_TOP) {
            toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 100);
        } else {
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 100);
        }

        toast.show();
    }

    public static void showToast(Context context, String message, ToastStyle style, int position) {
        showToast(context, message, style.getStyleResId(), position);
    }

    public static void showToast(Context context, String message, int styleRes) {
        showToast(context, message, styleRes, POSITION_BOTTOM);
    }

    public static void showToast(Context context, String message, ToastStyle style) {
        showToast(context, message, style.getStyleResId(), POSITION_BOTTOM);
    }
}