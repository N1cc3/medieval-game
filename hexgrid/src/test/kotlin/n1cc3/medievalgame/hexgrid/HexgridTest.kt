package n1cc3.medievalgame.hexgrid

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject
import org.springframework.test.context.junit4.SpringRunner

@Ignore // Not working yet
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HexgridTest {

    @Autowired
    lateinit var api: TestRestTemplate

    @Test
    fun testDistance() {
        val result1 = api.getForObject<Int>("/hexgrid/distance/0/0/0/0")
        assertNotNull(result1)
        assertEquals(result1, 0)

	    val result2 = api.getForObject<Int>("/hexgrid/distance/0/0/10/10")
	    assertNotNull(result2)
	    assertEquals(result2, 30)

	    val result3 = api.getForObject<Int>("/hexgrid/distance/0/0/-10/-10")
	    assertNotNull(result3)
	    assertEquals(result3, 30)
    }

}
