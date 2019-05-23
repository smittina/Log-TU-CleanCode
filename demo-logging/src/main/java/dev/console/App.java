package dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4j");
		LOG.info("Implémentation LogBack");
		new AppService().executer("valeur 1");
	}

}
