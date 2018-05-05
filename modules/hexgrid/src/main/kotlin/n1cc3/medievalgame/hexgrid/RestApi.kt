package n1cc3.medievalgame.hexgrid

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/hexgrid"])
class RestApi {

	@GetMapping("/hex")
	fun hex() = "hexagooons"

}


