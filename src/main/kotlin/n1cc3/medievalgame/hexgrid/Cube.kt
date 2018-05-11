package n1cc3.medievalgame.hexgrid

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

/**
 * Helper class for calculations with [Hex]es.
 */
data class Cube(val x: Int, val y: Int, val z: Int) {

	fun distanceTo(c: Cube): Int = (abs(x - c.x) + abs(y - c.y) + abs(z - c.z)) / 2

	fun neighborsWithin(range: Int): List<Cube> {
		var results = emptyList<Cube>()
		for (cx in -range..range) {
			for (cy in max(-range, -cx - range)..min(range, -cx + range)) {
				val cz = -cx - cy
				results += this + Cube(cx, cy, cz)
			}
		}
		return results
	}

	fun toHex(): Hex {
		val col = x + (z - (z % 2)) / 2
		val row = z
		return Hex(col, row)
	}

	operator fun plus(that: Cube): Cube = Cube(this.x + that.x, this.y + that.y, this.z + that.z)

	operator fun minus(that: Cube): Cube = Cube(this.x - that.x, this.y - that.y, this.z - that.z)

}
