package bonch.dev.school.ui.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragment
import bonch.dev.school.ui.fragments.PasswordFragment
import bonch.dev.school.ui.fragments.ProfileFragment
import com.google.android.material.navigation.NavigationView


class MainAppActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.getItemId()){
            R.id.nav_message -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, ChatFragment()).commit()
            }

            R.id.nav_profile -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, ProfileFragment()).commit()
            }
            R.id.nav_exit -> {
                //finish()
                finishAffinity()
            }
        }

        drawer.closeDrawer(GravityCompat.START)

        return true
    }

    private var chatFragment = ChatFragment()
    private var manager: FragmentManager = supportFragmentManager
    private var profileFragment = ProfileFragment()
    private var passFragment = PasswordFragment()

    private lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_app_activity)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
//        val trancation = manager.beginTransaction().replace(R.id.fragment, chatFragment).commit()

        drawer = findViewById(R.id.drawer_layout)

        var navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        var toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()


        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, ChatFragment()).commit()
            navigationView.setCheckedItem(R.id.nav_message)
        }

    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    fun changePass(){
        passFragment.show(manager, "dialog")
        //manager.beginTransaction().replace(R.id.fragment,passFragment).addToBackStack("fragment_profile").commit()
    }
}

//    fun replace(){
//        manager.beginTransaction().replace(R.id.fragment,profileFragment).addToBackStack("fragment_chat").commit()
//    }

