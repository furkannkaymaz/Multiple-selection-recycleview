package furkan.multiple_selection_recycleview

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import furkan.multiple_selection_recycleview.databinding.ItemAnimalBinding

class AnimalViewHolder(private var binding: ItemAnimalBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: AnimalModel, onItemClick: ((AnimalModel) -> Unit)?) {
        with(binding) {

            tvAnimalName.text = data.animal_name
            tvAnimalType.text = data.animal_type

            llContainer.setOnClickListener {
                data.isSelected = !data.isSelected
                if (data.isSelected){
                    llContainer.setBackgroundColor(ContextCompat.getColor(llContainer.context,R.color.purple_500))
                }else{
                    llContainer.setBackgroundColor(ContextCompat.getColor(llContainer.context,R.color.white))
                }
                onItemClick?.invoke(data)

            }
        }
    }

}