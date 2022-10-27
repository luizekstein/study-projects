package br.com.sortition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.sortition.databinding.ActivitySortitionBinding
import java.lang.Math.random
import kotlin.random.Random

class SortitionActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySortitionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySortitionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initClicks()
    }

    private fun initClicks() {
        with(binding) {
            btnSortition.setOnClickListener {
                txtResult.text = "Número: ${(0..10).random()}"
            }
        }
    }

}