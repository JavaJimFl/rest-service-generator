package com.kaib.generator;

import java.util.EnumSet;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Service {

	private String basePackage;
	private String configPackage;
	private String description;
	private String name;

	private EnumSet<Operation> operations;

	public Service() {
		super();
	}

	public String getBasePackage() {
		return basePackage;
	}

	public String getConfigPackage() {
		return configPackage;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public EnumSet<Operation> getOperations() {
		return operations;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

	public void setConfigPackage(String configPackage) {
		this.configPackage = configPackage;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOperations(EnumSet<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
