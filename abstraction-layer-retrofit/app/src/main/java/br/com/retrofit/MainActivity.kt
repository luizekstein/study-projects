package br.com.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.retrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // CHAMADA
        val service = RetrofitClient.createService(PostService::class.java)
        val call: Call<List<PostEntity>> = service.list()
        call.enqueue(object : Callback<List<PostEntity>> {
            override fun onResponse(call: Call<List<PostEntity>>, r: Response<List<PostEntity>>) {
                val list = r.body()
            }

            override fun onFailure(call: Call<List<PostEntity>>, t: Throwable) {
                val s = ""
            }
        })

        val s = ""
        val abc = 125

    }
}
