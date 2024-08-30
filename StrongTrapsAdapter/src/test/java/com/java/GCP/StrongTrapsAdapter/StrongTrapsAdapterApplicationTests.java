package com.java.GCP.StrongTrapsAdapter;

import com.java.GCP.StrongTrapsAdapter.controller.StrongController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StrongController.class)
class StrongTrapsAdapterApplicationTests {
	//
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	public void testHelloWorld() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
	}

	@Test
	public void testRecieveTestData() throws Exception {
		// Create JSON string to send in the request
		String json = "{\"name\": \"John Doe\", \"age\": 30}";

		mockMvc.perform(MockMvcRequestBuilders.post("/test-json")
						.contentType(MediaType.APPLICATION_JSON)
						.content(json))
				.andExpect(status().isOk()) // Expect HTTP 200 OK
				.andExpect(MockMvcResultMatchers.content().string("Person data received successfully")); // Expect specific response content
	}
}
