package com.rjs.javafx.test.services;

import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 7/5/2017.
 *
 * @author Randy Joe
 */
@Service
public class DiscusManager {
	@Autowired
	private TdpManager tdpManager;

	public DiscusManager() {
	}

	public void exitDiscus(Stage stage) {
	}
}
