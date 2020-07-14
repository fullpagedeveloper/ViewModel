package fullpagedeveloper.com.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var count = 0
    fun addNumber() {
        count++
    }
}