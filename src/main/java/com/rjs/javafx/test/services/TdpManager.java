package com.rjs.javafx.test.services;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.logging.Logger;

/**
 * Created on 7/5/2017.
 *
 * @author Randy Joe
 */
@Service
public class TdpManager {
	private static final Logger LOGGER = Logger.getLogger(TdpManager.class.getName());

	private boolean modified = false;

	public TdpManager() {
	}

	public boolean isModified() {
		return modified;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}

	public void newTdp() {
		LOGGER.info("New TDP...");
		modified = false;
	}

	public void openTdp(File tdpFile) {
		LOGGER.info("Opening TDP...");
		modified = false;
	}

	public void saveTdp() {
		LOGGER.info("Saving TDP...");
		modified = false;
	}

	public void closeTdp() {
		newTdp();
	}
}
