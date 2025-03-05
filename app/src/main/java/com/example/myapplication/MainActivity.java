package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etAccount;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化控件
        etAccount = findViewById(R.id.et_account);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        // 登录按钮点击事件
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = etAccount.getText().toString();
                String password = etPassword.getText().toString();

                // 模拟登录验证
                if ("admin".equals(account) && "123456".equals(password)) {
                    // 登录成功
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("登录成功")
                            .setMessage("欢迎使用支付宝！")
                            .setPositiveButton("确定", null)
                            .show();
                } else {
                    // 登录失败
                    Toast.makeText(MainActivity.this, "账号或密码错误！", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 忘记密码点击事件
        findViewById(R.id.tv_forgot_password).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "您点击了忘记密码！", Toast.LENGTH_SHORT).show();
            }
        });

        // 短信验证码登录点击事件
        findViewById(R.id.tv_sms_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "您点击了短信验证码登录！", Toast.LENGTH_SHORT).show();
            }
        });

        // 更多点击事件
        findViewById(R.id.tv_more).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "您点击了更多！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}