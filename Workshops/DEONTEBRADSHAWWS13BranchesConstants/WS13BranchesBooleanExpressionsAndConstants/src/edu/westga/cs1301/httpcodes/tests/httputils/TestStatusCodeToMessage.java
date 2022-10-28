package edu.westga.cs1301.httpcodes.tests.httputils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs1301.httpcodes.model.HttpUtils;

class TestStatusCodeToMessage {

	private HttpUtils httpUtils;
	
	@BeforeEach
	public void setup() {
		this.httpUtils = new HttpUtils();
	}
	
	@Test
	void testShouldHandle200OK() {
		assertEquals("OK", this.httpUtils.statusCodeToMessage(200));
	}
	
	@Test
	void testShouldHandle404NotFound() {
		assertEquals("Not Found", this.httpUtils.statusCodeToMessage(404));
	}
	
	@Test
	void testShouldHandle500InternalServerError() {
		assertEquals("Internal Server Error", this.httpUtils.statusCodeToMessage(500));
	}
	
	@Test
	void testShouldHandle400BadRequest() {
		assertEquals("Bad Request", this.httpUtils.statusCodeToMessage(400));
	}
	
	@Test
	void testShouldHandle301MovedPermanently() {
		assertEquals("Moved Permanently", this.httpUtils.statusCodeToMessage(301));
	}
	
	@Test
	void testShouldHandleUnknownCode() {
		assertEquals("Unknown Status Code", this.httpUtils.statusCodeToMessage(1000));
	}

}
