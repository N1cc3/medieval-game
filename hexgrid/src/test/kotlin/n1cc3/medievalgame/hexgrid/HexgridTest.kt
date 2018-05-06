package n1cc3.medievalgame.hexgrid

import junit.framework.TestCase.assertEquals
import org.junit.Test

class HexgridTest {

	@Test
	fun testDistance() {
		assertEquals(Hex(0, 0).distanceTo(Hex(0, 0)), 0)
		assertEquals(Hex(0, 0).distanceTo(Hex(1, 0)), 1)
		assertEquals(Hex(0, 0).distanceTo(Hex(1, 1)), 2)
		assertEquals(Hex(0, 0).distanceTo(Hex(1, 2)), 2)
	}

}
