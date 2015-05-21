package org.out.naruto.qrcodemedicine;


import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Login extends Activity implements OnClickListener {
	private ImageView loginImage;
	private TextView topText;
	private TextPaint tp;
	private EditText username;
	private EditText password;
	private Button btn_register;
	private Drawable mIconPerson;
	private Drawable mIconLock;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		btn_register = (Button) findViewById(R.id.btn_login_regist);
		btn_register.setOnClickListener(Activity_Login.this);
		mIconPerson = getResources().getDrawable(R.drawable.txt_person_icon);
		mIconPerson.setBounds(5, 1, 60, 50);
		mIconLock = getResources().getDrawable(R.drawable.txt_lock_icon);
		mIconLock.setBounds(5, 1, 60, 50);
		username = (EditText) findViewById(R.id.username);
		username.setCompoundDrawables(mIconPerson, null, null, null);
		password = (EditText) findViewById(R.id.password);
		password.setCompoundDrawables(mIconLock, null, null, null);

//		init();

	}

	// 初始化用户个人头像
	// 预留用户名密码的初始化
	@SuppressWarnings("deprecation")
	/*public void init() {
		loginImage = (ImageView) findViewById(R.id.loginImage);
		loginImage.setBackgroundDrawable(new BitmapDrawable(Bitmaputil
				.toRoundBitmap(this, "userhead.jpg")));
		loginImage.getBackground().setAlpha(0);
		loginImage.setImageBitmap(Bitmaputil
				.toRoundBitmap(this, "userhead.jpg"));

	}*/

	// login
	// 預留
	// 再用独立出来
	@Override
	public void onClick(View arg0) {
		Intent intent = new Intent();
		intent.setClass(this, Activity_Register.class);
		startActivity(intent);
		overridePendingTransition(R.anim.anim_right_in, R.anim.anim_left_out);

	}

}
