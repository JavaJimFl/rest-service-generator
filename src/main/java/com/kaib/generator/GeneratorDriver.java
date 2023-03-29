package com.kaib.generator;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class GeneratorDriver {

	public static void main(String[] args) {

		final var objectMapper = new ObjectMapper(new YAMLFactory());
		objectMapper.findAndRegisterModules();
		objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE);

		try {
			final Configuration configuration = loadConfiguration(objectMapper, (new File("d:/temp/MyService.yaml")));
			final Generator generator = new Generator();
			generator.generate(configuration);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	private static Configuration loadConfiguration(final ObjectMapper objectMapper, File file) throws IOException {

		return objectMapper.readValue(file, Configuration.class);
	}
}
