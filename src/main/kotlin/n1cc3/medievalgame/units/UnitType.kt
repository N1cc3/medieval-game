package n1cc3.medievalgame.units

data class UnitType (
	val id: String,
	val name: String,
	val hp: Int,
	val attack: Int,
	val defence: Int,
	val armor: Int,
	val range: Int,
	val speed: Int,
	val cost: Int
)