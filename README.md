# ViewModel

1. create new class for extend viewModel()

        class MainActivityViewModel: ViewModel() {

            var count = 0
            fun addNumber() {
                count++
            }
        }
        
2. initialisasi object ViewModel in onCreate()

        /**
         * inisialisasi object ViewModel
         */
        val viewModelMain = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        
        
3. finally get onject viewModel

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
