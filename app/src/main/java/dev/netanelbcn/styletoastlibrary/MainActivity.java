package dev.netanelbcn.styletoastlibrary;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import dev.netanelbcn.styledtoastlib.ToastStyler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupToastButtons();
    }

    private void setupToastButtons() {
        // Bottom Toasts
        setupToastButton(R.id.btnDangerToast, "This is Danger Toast", ToastStyler.ToastStyle.DANGER, ToastStyler.POSITION_BOTTOM);
        setupToastButton(R.id.btnPrimaryToast, "This is Primary Toast", ToastStyler.ToastStyle.PRIMARY, ToastStyler.POSITION_BOTTOM);
        setupToastButton(R.id.btnSuccessToast, "This is Success Toast", ToastStyler.ToastStyle.SUCCESS, ToastStyler.POSITION_BOTTOM);
        setupToastButton(R.id.btnVioletToast, "This is Violet Toast", ToastStyler.ToastStyle.VIOLET, ToastStyler.POSITION_BOTTOM);
        setupToastButton(R.id.btnWarningToast, "This is Warning Toast", ToastStyler.ToastStyle.WARNING, ToastStyler.POSITION_BOTTOM);

        // Top Toasts
        setupToastButton(R.id.btnTopDangerToast, "This is Top Danger Toast", ToastStyler.ToastStyle.DANGER, ToastStyler.POSITION_TOP);
        setupToastButton(R.id.btnTopPrimaryToast, "This is Top Primary Toast", ToastStyler.ToastStyle.PRIMARY, ToastStyler.POSITION_TOP);
        setupToastButton(R.id.btnTopSuccessToast, "This is Top Success Toast", ToastStyler.ToastStyle.SUCCESS, ToastStyler.POSITION_TOP);
        setupToastButton(R.id.btnTopVioletToast, "This is Top Violet Toast", ToastStyler.ToastStyle.VIOLET, ToastStyler.POSITION_TOP);
        setupToastButton(R.id.btnTopWarningToast, "This is Top Warning Toast", ToastStyler.ToastStyle.WARNING, ToastStyler.POSITION_TOP);
    }

    private void setupToastButton(int buttonId, String message, ToastStyler.ToastStyle style, int position) {
        findViewById(buttonId).setOnClickListener(v ->
                ToastStyler.showToast(this, message, style, position));
    }
}