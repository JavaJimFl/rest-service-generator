package com.kaib.generator;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Configuration {

	private String baseDirectory;
	private Service service;


	public Configuration() {
		super();
	}

	public String getBaseDirectory() {
		return baseDirectory;
	}

	public Service getService() {
		return service;
	}

	public void setBaseDirectory(String baseDirectory) {
		this.baseDirectory = baseDirectory;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
