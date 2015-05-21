package org.out.naruto.qrcodemedicine;


import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.out.naruto.utils.CheckEmail;

public class Activity_Register extends Activity implements
		View.OnClickListener {
	public static final int REGION_SELECT = 1;
	private TextView tv_medicine_Server, tv_region_modify, tv_top_title;
	private Button btn_title_left, btn_send_code;
	private CheckBox chk_agree;
	private EditText et_username, et_password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		initView();
	}

	private void initView() {
		tv_top_title = (TextView) findViewById(R.id.tv_top_title);
		tv_top_title.setText("注册新账户");

		btn_title_left = (Button) findViewById(R.id.btn_title_left);
		btn_title_left.setOnClickListener(this);

		btn_send_code = (Button) findViewById(R.id.btn_send_code);
		btn_send_code.setOnClickListener(this);

		tv_medicine_Server = (TextView) findViewById(R.id.tv_medicine_serve);
		tv_medicine_Server.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

		tv_region_modify = (TextView) findViewById(R.id.tv_region_modify);
		tv_region_modify.setOnClickListener(this);

		chk_agree = (CheckBox) findViewById(R.id.chk_agree);
		et_username = (EditText) findViewById(R.id.et_username);
		et_password = (EditText) findViewById(R.id.et_password);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_title_left:
			Activity_Register.this.finish();
			break;
		case R.id.btn_send_code:
			String username = et_username.getText().toString();
			if (chk_agree.isChecked() == false)
				Toast.makeText(this, "请确认是否已经阅读《安全用药App条款》", Toast.LENGTH_LONG)
						.show();
			if (CheckEmail.ifemail(username) == false)
				Toast.makeText(this, "请正确填写邮箱名，可帮助您找回密码", Toast.LENGTH_LONG)
						.show();
			if (CheckEmail.ifemail(username) == true
					&& chk_agree.isChecked() == true) {
				Toast.makeText(this, "邮箱名验证正确，checkbox=true，可跳转",
						Toast.LENGTH_LONG).show();
				// Intent intent = new Intent(RegisterActivity.this, null);
				// startActivity(intent);
				// overridePendingTransition(R.anim.anim_right_in,
				// R.anim.anim_left_out);
			}
		}

	}

}
