package bonch.dev.school.ui.activities

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragment
import bonch.dev.school.ui.fragments.PasswordFragment
import bonch.dev.school.ui.fragments.ProfileFragment


class MainAppActivity: FragmentActivity() {

    private var chatFragment = ChatFragment()
    private var manager: FragmentManager = supportFragmentManager
    private var profileFragment = ProfileFragment()
    private var passFragment = PasswordFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_app_activity)

        val trancation = manager.beginTransaction().replace(R.id.fragment, chatFragment).commit()

    }

    fun replace(){
        manager.beginTransaction().replace(R.id.fragment,profileFragment).addToBackStack("fragment_chat").commit()
    }
    fun changePass(){
        passFragment.show(manager, "dialog")
        //manager.beginTransaction().replace(R.id.fragment,passFragment).addToBackStack("fragment_profile").commit()
    }
}