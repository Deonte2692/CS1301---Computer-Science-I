package edu.westga.cs1301.httpcodes.tests.httputils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs1301.httpcodes.model.HttpUtils;

class TestGetStatusCodeCategory {

	private HttpUtils httpUtils;
	
	@BeforeEach
	public void setup() {
		this.httpUtils = new HttpUtils();
	}
	
	@Test
	public void testShouldBeInformationalResponseCategory() {
		assertEquals("informational response", httpUtils.getStatusCodeCategory(123));
	}
	
	@Test
	public void testShouldBeSuccessCategory() {
		assertEquals("success", httpUtils.getStatusCodeCategory(245));
	}
	
	@Test
	public void testShouldBeRedirectionCategory() {
		assertEquals("redirection", httpUtils.getStatusCodeCategory(316));
	}
	
	@Test
	public void testShouldBeClientErrorsCategory() {
		assertEquals("client errors", httpUtils.getStatusCodeCategory(477));
	}
	
	@Test
	public void testShouldBeServerErrorsCategory() {
		assertEquals("server errors", httpUtils.getStatusCodeCategory(503));
	}
	
	@Test
	public void testShouldBeInvalidCategory() {
		assertEquals("invalid status code category", httpUtils.getStatusCodeCategory(4567));
	}
}
