package org.out.naruto.qrcodemedicine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import org.out.naruto.fragment.LeftFragment;
import org.out.naruto.fragment.MainFragment;


public class Activity_Main extends SlidingFragmentActivity implements
        OnClickListener {

    private ImageView topButton;
    private Fragment mContent;
    private TextView topTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topButton = (ImageView) findViewById(R.id.topButton);
        topButton.setOnClickListener(this);
        topTextView = (TextView) findViewById(R.id.topTv);

        initSlidingMenu(savedInstanceState);
    }

    private void initSlidingMenu(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mContent = getSupportFragmentManager().getFragment(
                    savedInstanceState, "mContent");
        }

        if (mContent == null) {
            mContent = new MainFragment();
        }


        setBehindContentView(R.layout.menu_frame_left);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.menu_frame, new LeftFragment()).commit();

        switchConent(mContent,getString(R.string.string_main));


        SlidingMenu sm = getSlidingMenu();

        sm.setMode(SlidingMenu.LEFT);

        sm.setShadowWidthRes(R.dimen.shadow_width);

        sm.setShadowDrawable(null);

        sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);

        sm.setFadeDegree(0.35f);
        sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        sm.setBehindScrollScale(0.0f);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getSupportFragmentManager().putFragment(outState, "mContent", mContent);
    }


    public void switchConent(Fragment fragment, String title) {
        mContent = fragment;
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragment).commit();
        getSlidingMenu().showContent();
        topTextView.setText(title);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.topButton:
                toggle();
                break;
            default:
                break;
        }
    }
}
