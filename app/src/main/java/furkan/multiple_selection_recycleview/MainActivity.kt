package furkan.multiple_selection_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import furkan.multiple_selection_recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: AnimalAdapter
    var datas = ArrayList<AnimalModel>()
    val selectDatas = ArrayList<AnimalModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initData()

        binding.rvAnimal.layoutManager = LinearLayoutManager(this)
        adapter = AnimalAdapter(initData()) {
            if (it.isSelected) {
                selectDatas.add(it)
            } else {
                selectDatas.remove(it)
            }
            Log.d("datasize",selectDatas.size.toString())
            Toast.makeText(this," Total Chosen Count ${selectDatas.size}",Toast.LENGTH_SHORT).show()
        }
        adapter.setHasStableIds(true)
        binding.rvAnimal.adapter = adapter

    }

    private fun initData() : ArrayList<AnimalModel> {

        datas.add(AnimalModel("Cat","Caddy"))
        datas.add(AnimalModel("Dog","DoggSam"))
        datas.add(AnimalModel("Snake","Snakey"))
        datas.add(AnimalModel("Snake","Snakey2"))
        datas.add(AnimalModel("Cat","Caddy2"))
        datas.add(AnimalModel("Dog","DoggSam2"))
        datas.add(AnimalModel("Cat","Caddy"))
        datas.add(AnimalModel("Dog","DoggSam"))
        datas.add(AnimalModel("Snake","Snakey"))
        datas.add(AnimalModel("Snake","Snakey2"))
        datas.add(AnimalModel("Cat","Caddy2"))
        datas.add(AnimalModel("Dog","DoggSam2"))
        datas.add(AnimalModel("Cat","Caddy"))
        datas.add(AnimalModel("Dog","DoggSam"))
        datas.add(AnimalModel("Snake","Snakey"))
        datas.add(AnimalModel("Snake","Snakey2"))
        datas.add(AnimalModel("Cat","Caddy2"))
        datas.add(AnimalModel("Dog","DoggSam2"))

        return datas

    }
}