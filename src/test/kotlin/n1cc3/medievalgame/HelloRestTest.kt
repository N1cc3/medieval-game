package n1cc3.medievalgame

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloRestTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun testHelloDto() {
        val result1 = testRestTemplate.getForEntity("/", Hello::class.java)
        assertNotNull(result1)
        assertEquals(result1.statusCode, HttpStatus.OK)
        assertEquals(result1.body, Hello(1,"Hello, World"))

        val result2 = testRestTemplate.getForEntity("/?name=asd", Hello::class.java)
        assertNotNull(result2)
        assertEquals(result2.statusCode, HttpStatus.OK)
        assertEquals(result2.body, Hello(2,"Hello, asd"))
    }

    @Test
    fun testHelloService() {
        val result = testRestTemplate.getForEntity("/service", String::class.java)
        assertNotNull(result)
        assertEquals(result.statusCode, HttpStatus.OK)
        assertEquals(result.body, "HelloService here!")
    }
}
