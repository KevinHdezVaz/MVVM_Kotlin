package vazk.app.mvvm_kotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import vazk.app.mvvm_kotlin.model.QuoteModel
import vazk.app.mvvm_kotlin.model.QuoteProvider

class QuoateViewModelo: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote(){
        val currentquote= QuoteProvider.random()
        quoteModel.postValue(currentquote)
    }
}