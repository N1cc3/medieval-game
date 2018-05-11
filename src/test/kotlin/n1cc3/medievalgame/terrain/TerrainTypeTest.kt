package n1cc3.medievalgame.terrain

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class TerrainTypeTest {

	@Test
	fun getName() {
		val grass = TerrainType("grass", 1)
		assertThat(grass.name)
			.isEqualTo("grass")
	}

	@Test
	fun getMoveCost() {
		val grass = TerrainType("grass", 1)
		assertThat(grass.moveCost)
			.isEqualTo(1)
	}
}