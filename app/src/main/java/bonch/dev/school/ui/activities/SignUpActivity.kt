package bonch.dev.school.ui.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import bonch.dev.school.R


class SignUpActivity: AppCompatActivity() {

    private lateinit var completeSignUpBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_activity)

        completeSignUpBtn = findViewById(R.id.complete_sign_up_button)
        completeSignUpBtn.setOnClickListener(View.OnClickListener {
            val intent3= Intent(this@SignUpActivity, MainAppActivity::class.java)
            startActivity(intent3)
        })
    }
}