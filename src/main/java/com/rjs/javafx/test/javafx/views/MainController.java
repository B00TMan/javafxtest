package com.rjs.javafx.test.javafx.views;

import com.rjs.javafx.test.javafx.util.FileExtensionFilter;
import com.rjs.javafx.test.javafx.util.UIHelper;
import com.rjs.javafx.test.services.TdpManager;
import de.felixroske.jfxsupport.FXMLController;
import de.felixroske.jfxsupport.GUIState;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.logging.Logger;

/**
 * Created on 7/5/2017.
 *
 * @author Randy Joe
 */
@FXMLController
public class MainController {
	private static final Logger LOGGER = Logger.getLogger(MainController.class.getName());

	@Autowired
	private TdpManager tdpManager;

	@FXML
	private VBox mainFrame;

	public MainController() {
	}

	@FXML
	public void newTDP() {
		if (tdpManager.isModified()) {
			switch (UIHelper.handleModified()) {
				case YES:
					tdpManager.saveTdp();

					break;

				case CANCEL:
					return;
			}
		}

		tdpManager.newTdp();
	}

	@FXML
	public void openTDP() {
		if (tdpManager.isModified()) {
			switch (UIHelper.handleModified()) {
				case YES:
					tdpManager.saveTdp();

					break;

				case CANCEL:
					return;
			}
		}

		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select TDP File");
		fileChooser.getExtensionFilters().addAll(FileExtensionFilter.TDP_FILTER);
		fileChooser.setSelectedExtensionFilter(FileExtensionFilter.TDP_FILTER);
		File selTDPFile = fileChooser.showOpenDialog(GUIState.getStage());
		tdpManager.openTdp(selTDPFile);
		tdpManager.setModified(true);

		if (selTDPFile != null) {
			// open TDP
			tdpManager.openTdp(selTDPFile);
		}
	}

	@FXML
	public void saveTDP() {
		tdpManager.saveTdp();
	}

	@FXML
	public void saveTDPAs() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save TDP As");
		fileChooser.getExtensionFilters().addAll(FileExtensionFilter.TDP_FILTER);
		fileChooser.setSelectedExtensionFilter(FileExtensionFilter.TDP_FILTER);
		File selTDPFile = fileChooser.showSaveDialog(GUIState.getStage());
	}

	@FXML
	public void closeTDP() {
		if (tdpManager.isModified()) {
			switch (UIHelper.handleModified()) {
				case YES:
					tdpManager.saveTdp();

					break;

				case CANCEL:
					return;
			}
		}

		tdpManager.closeTdp();
	}

	@FXML
	public void showExcelExportOptions() {

	}

	@FXML
	public void showPDFExportOptions() {

	}

	@FXML
	public void showExportBalloonedDwgOptions() {

	}

	@FXML
	public void showExportTDPOptions() {

	}

	@FXML
	public void showExportToNetInspectOptions() {

	}

	@FXML
	public void showExportToProLinkOptions() {

	}

	@FXML
	public void exitDiscus() {
		if (tdpManager.isModified()) {
			switch (UIHelper.handleModified()) {
				case YES:
					tdpManager.saveTdp();

					break;

				case CANCEL:
					return;
			}
		}

		GUIState.getStage().close();
	}
}
