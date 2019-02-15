package n1cc3.medievalgame.entities

class Order(
	val type: OrderType,
	val destination: Hex
) {

	enum class OrderType { Move, AttackMove, Gather }
}
