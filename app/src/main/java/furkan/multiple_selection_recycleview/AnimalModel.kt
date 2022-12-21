package furkan.multiple_selection_recycleview

data class AnimalModel(
    val animal_type : String,
    val animal_name : String,
) {
    var isSelected : Boolean = false
}