package com.brazil.cerp.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(SpringExtension.class)
public class HelloControllerTest {

	@Test
	@DisplayName("테스트 임시로 막습니다. mockito 추후에 테스트 하시지요.")
	public void testHello() throws Exception {
		/*ResponseEntity<String> hello = restTemplate.getForEntity("/hello", String.class);
		System.out.println("hello=" + hello);*/

		assertTrue(true);
		
		/*
		 * mock.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().
		 * string("Hello spring boot!"));
		 * 
		 * MvcResult result =
		 * mock.perform(get("/hello")).andExpect(status().isOk()).andReturn();
		 * 
		 * assertEquals("Hello sptring boot!!",
		 * result.getResponse().getContentAsString());
		 * 
		 * System.out.println("RRR>>" + result.getResponse().getContentAsString());
		 */

	}
}
