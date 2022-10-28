package edu.westga.cs1301.httpcodes.tests.httputils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs1301.httpcodes.model.HttpUtils;

public class TestIsInternetInformationServiceCustomCode {

	private HttpUtils httpUtils;
	
	@BeforeEach
	public void setup() {
		this.httpUtils = new HttpUtils();
	}

	@Test
	public void testShouldIncludeStatusCode440() {
		assertTrue(this.httpUtils.isInternetInformationServiceCustomCode(440));
	}

	@Test
	public void testShouldIncludeStatusCode449() {
		assertTrue(this.httpUtils.isInternetInformationServiceCustomCode(449));
	}
	
	@Test
	public void testShouldIncludeStatusCode451() {
		assertTrue(this.httpUtils.isInternetInformationServiceCustomCode(451));
	}
	
	@Test
	public void testShouldNotIncludeSomethingOtherThan440Or449Or451() {
		assertFalse(this.httpUtils.isInternetInformationServiceCustomCode(200));
	}
}
