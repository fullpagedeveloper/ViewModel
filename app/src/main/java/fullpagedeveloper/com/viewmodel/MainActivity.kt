package fullpagedeveloper.com.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), LifecycleOwner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * inisialisasi object ViewModel
         */
        val viewModelMain = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        /**
         * agar bila dirotet tidak bermasalah maka
         * textView_Number.text = viewModelMain.count.toString()
         * dilektakan kembali di onCreate
         */
        textView_Number.text = viewModelMain.count.toString()

        button_Count_It.setOnClickListener {
            viewModelMain.addNumber()
            textView_Number.text = viewModelMain.count.toString()
        }
    }
}