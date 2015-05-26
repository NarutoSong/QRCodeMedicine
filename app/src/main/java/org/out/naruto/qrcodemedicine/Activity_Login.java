package org.out.naruto.qrcodemedicine;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.out.naruto.network.NetWork;

import java.util.ArrayList;
import java.util.List;

public class Activity_Login extends Activity implements OnClickListener {
    private ImageView loginImage;
    private TextView topText;
    private TextPaint tp;
    private EditText unEditText;
    private EditText pwdEditText;
    private Button btn_register;
    private Button loginButton;
    private NetWork netWork;
    private LoginTask loginTask;
    private List<NameValuePair> nameValuePairList;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        init();
    }

    private void initView() {
        btn_register = (Button) findViewById(R.id.btn_login_regist);
        btn_register.setOnClickListener(this);

        loginButton = (Button) findViewById(R.id.btn_login);
        loginButton.setOnClickListener(this);

        unEditText = (EditText) findViewById(R.id.username);
        pwdEditText = (EditText) findViewById(R.id.password);
    }

    private void init() {
        netWork = new NetWork();
        loginTask = new LoginTask();
    }

    // login
    // 預留
    // 再用独立出来
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login_regist:
                Intent intent = new Intent();
                intent.setClass(this, Activity_Register.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_right_in, R.anim.anim_left_out);
                break;
            case R.id.btn_login:
                String un = unEditText.getText().toString().trim();
                String pwd = pwdEditText.getText().toString().trim();
                loginTask.execute(new String[] {un,pwd});
                break;
        }
    }

    class LoginTask extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ShowProgressDialog();
        }

        @Override
        protected void onPostExecute(String string) {
            super.onPostExecute(string);
            CloseProgressDialog();
            if (string.equals("")) {//

            } else {
                try {
                    JSONArray jsonArray = new JSONArray(string);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }

        @Override
        protected String doInBackground(String... params) {
            nameValuePairList = new ArrayList<NameValuePair>();
            nameValuePairList.add(new BasicNameValuePair("un", params[0]));//key值要改
            nameValuePairList.add(new BasicNameValuePair("pwd", params[1]));
            String resulte = netWork.netWork(nameValuePairList, netWork.Type_Login);
            return resulte;
        }
    }

    private void ShowProgressDialog() {
        progressDialog = ProgressDialog.show(Activity_Login.this, null, "登陆中.......");
    }

    private void CloseProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    private void ShowToast(String message) {
        Toast.makeText(Activity_Login.this, message, Toast.LENGTH_SHORT).show();
    }
}
