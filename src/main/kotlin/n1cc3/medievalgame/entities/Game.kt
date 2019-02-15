package n1cc3.medievalgame.entities

class Game(
	startingUnits: Set<Unit> = setOf()
) {
	val units: Set<Unit> = startingUnits.toMutableSet()
		get() = field.toSet()
}