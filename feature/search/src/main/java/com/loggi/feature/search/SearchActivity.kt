package com.loggi.feature.search

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.loggi.feature.search.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_search)
        binding.lifecycleOwner = this

        function1()
        function2()
        function3WithGlide()
    }

    private fun function1() = Log.d(TAG, "function1()")
    private fun function2() = Log.d(TAG, "function2()")
    private fun function3WithGlide() = Log.d(TAG, "function3ForGlide()")

    companion object {
        private const val TAG = "SearchActivity"
    }
}