package n1cc3.medievalgame

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class RestServices {

	val counter = AtomicLong()

	@GetMapping("/")
	fun hello(@RequestParam(value = "name", defaultValue = "World") name: String) =
		Hello(counter.incrementAndGet(), "Hello, $name")


	@Autowired
	lateinit var helloService: HelloService

	@GetMapping("/service")
	fun helloService() = helloService.getHello()

}


