package n1cc3.medievalgame.terrain

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TerrainTest {

	@Test
	fun getAndSet() {
		val grass = TerrainType("grass", 1)
		val dirt = TerrainType("dirt", 2)
		val terrain = Terrain(2, 3, grass)
		assertEquals(terrain.sizeX, 2)
		assertEquals(terrain.sizeY, 3)
		assertEquals(terrain[0, 0], grass)
		terrain[0, 0] = dirt
		assertEquals(terrain[0, 0], dirt)
		assertEquals(terrain[1, 0], grass)
	}

	@Test(expected = IndexOutOfBoundsException::class)
	fun testOutOfBounds() {
		val grass = TerrainType("grass", 1)
		val terrain = Terrain(2, 3, grass)
		terrain[2, 0]
	}

}
