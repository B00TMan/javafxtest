package com.rjs.javafx.test;

import com.rjs.javafx.test.javafx.views.MainAppView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 * Created on 7/5/2017.
 *
 * @author Randy Joe
 */
@SpringBootApplication
//public class Test1App extends AbstractJavaFxApplicationSupport implements CommandLineRunner {
public class Test1App extends AbstractJavaFxApplicationSupport {
	private static final Logger LOGGER = Logger.getLogger(Test1App.class.getName());

	public Test1App() {
	}

/*
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		LOGGER.info("timestamp: " + sdf.format(new Date()));
	}
*/

	public static void main(String[] args) {
//		ApplicationContext ctx = SpringApplication.run(Test1App.class, args);
		launchApp(Test1App.class, MainAppView.class, args);
	}
}
