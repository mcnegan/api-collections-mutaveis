package code.painel.collections.mutaveis

class Repository <T> {
    private val map = mutableMapOf<String, T>()

    fun create(id:String, value: T){
        map[id] = value

    }

    fun findById(id: String) = map[id]

    fun findAll() = map.values


}
