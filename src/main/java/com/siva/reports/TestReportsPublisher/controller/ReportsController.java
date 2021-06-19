package com.siva.reports.TestReportsPublisher.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ReportsController {

	@Value("${test-allure-report-location}")
	private String reportsLocation;

	@Value("${test-allure-generate-location}")
	private String generatedLocation;

	@Value("${allure-location}")
	private String allureLocation;

	@GetMapping("/refresh")
	public synchronized void refresh() {
		String command = allureLocation + " generate " + reportsLocation + " --clean -o " + generatedLocation;
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command);
			processBuilder.redirectError();
			Process process = processBuilder.start();
			process.waitFor();
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}
