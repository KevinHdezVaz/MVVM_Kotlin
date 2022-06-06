package vazk.app.mvvm_kotlin.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import vazk.app.mvvm_kotlin.databinding.ActivityMainBinding
import vazk.app.mvvm_kotlin.viewmodel.QuoateViewModelo

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel : QuoateViewModelo by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text  = it.quote
            binding.tvAutor.text = it.author
        })

        binding.viewContainer.setOnClickListener{
            quoteViewModel.randomQuote()
        }
    }
}