package org.out.naruto.qrcodemedicine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;

public class Activity_Welcome extends Activity {
	// 欢迎界面,有图记改
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_welcome);

		new CountDownTimer(1500, 1500) {

			@Override
			public void onFinish() {

				Intent intent = new Intent(Activity_Welcome.this,
						Activity_Login.class);
				startActivity(intent);
				overridePendingTransition(R.anim.anim_activity_in,
						R.anim.anim_activity_out);
				finish();

			}

			@Override
			public void onTick(long millisUntilFinished) {
				// TODO Auto-generated method stub
			}
		}.start();
	}
}
