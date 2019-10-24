package bonch.dev.school.ui.activities


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import bonch.dev.school.R

private lateinit var signUpBtn: Button
private lateinit var signInBtn: Button

class SignInActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_activity)

        signInBtn = findViewById(R.id.sign_in_button)
        signInBtn.setOnClickListener(View.OnClickListener{
            val intent2= Intent(this@SignInActivity, MainAppActivity::class.java)
            startActivity(intent2)
        })

        signUpBtn = findViewById(R.id.sign_up_button)
        signUpBtn.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(intent)
        })
    }

}