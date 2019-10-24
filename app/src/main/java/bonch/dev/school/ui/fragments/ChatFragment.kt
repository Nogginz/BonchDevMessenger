package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import bonch.dev.school.ui.activities.MainAppActivity
import kotlinx.android.synthetic.*

class ChatFragment:Fragment() {
    private lateinit var sendMessageBtn: ImageButton
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        sendMessageBtn = view.findViewById(R.id.button)
        sendMessageBtn.setOnClickListener( View.OnClickListener(){
            (activity as MainAppActivity).replace()
        })
        return view
    }
}