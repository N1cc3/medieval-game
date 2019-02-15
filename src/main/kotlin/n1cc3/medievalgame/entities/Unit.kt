package n1cc3.medievalgame.entities

import java.util.UUID.randomUUID

class Unit(
	val unitType: UnitType,
	var position: Hex
) {
	val id = randomUUID()
	var hp = unitType.hp
	var order: Order? = null
	var carrying: Resource? = null
}