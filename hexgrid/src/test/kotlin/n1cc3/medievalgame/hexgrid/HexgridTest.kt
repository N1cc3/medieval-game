package n1cc3.medievalgame.hexgrid

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@RunWith(MockitoJUnitRunner::class)
class HexgridTest {

	private lateinit var mockMvc: MockMvc

	@InjectMocks
	lateinit var api: Api

	@Before
	fun setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(api).build()
	}

	@Test
	fun testDistance() {
		mockMvc.perform(get("/hexgrid/distance/0/0/0/0"))
			.andExpect(content().string("0"))
		mockMvc.perform(get("/hexgrid/distance/0/0/1/0"))
			.andExpect(content().string("1"))
		mockMvc.perform(get("/hexgrid/distance/0/0/2/0"))
			.andExpect(content().string("2"))
		mockMvc.perform(get("/hexgrid/distance/0/0/1/1"))
			.andExpect(content().string("2"))
		mockMvc.perform(get("/hexgrid/distance/0/0/1/2"))
			.andExpect(content().string("2"))
		mockMvc.perform(get("/hexgrid/distance/0/0/1/3"))
			.andExpect(content().string("3"))
	}

}