data class ClothingItem(private val _type: String?, val size: String, val price: Double) {
    constructor(size: String, price: Double): this(null, size, price)

    var type: String? = _type
        get() = field ?: "Unknown"
        set(value) {
            field = value
        }
}