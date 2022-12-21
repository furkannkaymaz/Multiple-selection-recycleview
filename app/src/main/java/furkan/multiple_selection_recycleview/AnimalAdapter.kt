package furkan.multiple_selection_recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import furkan.multiple_selection_recycleview.databinding.ItemAnimalBinding

class AnimalAdapter(private var items: ArrayList<AnimalModel>, var onClick: (AnimalModel) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var itemAnimalBinding: ItemAnimalBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        itemAnimalBinding = ItemAnimalBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return AnimalViewHolder(itemAnimalBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as AnimalViewHolder).bind(items[position]) {
            onClick.invoke(it)
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }


}