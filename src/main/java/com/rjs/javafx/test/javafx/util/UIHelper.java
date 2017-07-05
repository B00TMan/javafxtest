package com.rjs.javafx.test.javafx.util;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;

import java.util.Optional;

/**
 * Created on 7/5/2017.
 *
 * @author Randy Joe
 */
public class UIHelper {
	public enum AlertResult {
		YES,
		NO,
		CANCEL
	}

	public static final String BOOTSTRAP_STYLE_LOC = "/styles/bootstrap3.css";

	public static AlertResult handleModified() {
		ButtonType yesButtonType = new ButtonType("Yes", ButtonBar.ButtonData.YES);
		ButtonType noButtonType = new ButtonType("No", ButtonBar.ButtonData.NO);
		ButtonType cancelButtonType = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
		Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION, null, yesButtonType, noButtonType, cancelButtonType);
		confirmAlert.setTitle("TDP Modified");
		confirmAlert.setHeaderText("Do you wish to save your current TDP first?");
		DialogPane dialogPane = confirmAlert.getDialogPane();
		dialogPane.getStylesheets().add(BOOTSTRAP_STYLE_LOC);
		Optional<ButtonType> result = confirmAlert.showAndWait();

		if (result.isPresent()) {
			if (result.get() == yesButtonType) {
				return AlertResult.YES;
			}
			else if (result.get() == noButtonType) {
				return AlertResult.NO;
			}
		}

		return AlertResult.CANCEL;
	}
}
