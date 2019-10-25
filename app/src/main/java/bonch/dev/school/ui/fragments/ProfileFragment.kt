package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import bonch.dev.school.R
import bonch.dev.school.ui.activities.MainAppActivity

class ProfileFragment: Fragment() {

    private var dialog = PasswordFragment()

    private lateinit var changePassBtn: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        changePassBtn = view.findViewById(R.id.change_password_button)
        changePassBtn.setOnClickListener(View.OnClickListener {
            (activity as MainAppActivity).changePass()
        })


        return view

    }


}