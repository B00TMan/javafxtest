package com.rjs.javafx.test.javafx.util;

import javafx.stage.FileChooser;

/**
 * Created on 7/5/2017.
 *
 * @author Randy Joe
 */
public class FileExtensionFilter {
	private static final String PDF_EXTENSION = "pdf";
	private static final String TIFF_EXTENSION = "tiff";
	private static final String[] IMAGE_EXTENSIONS = {"png", "jpg", "jpeg", "bmp"};
	private static final String[] EXCEL_EXTENSIONS = {"xlsx", "xls"};

	public static final FileChooser.ExtensionFilter TDP_FILTER = new FileChooser.ExtensionFilter("TDP Files", "dis");
	public static final FileChooser.ExtensionFilter DRAWING_FILTER = new FileChooser.ExtensionFilter("Drawings", PDF_EXTENSION, TIFF_EXTENSION);
	public static final FileChooser.ExtensionFilter SPEC_FILTER = new FileChooser.ExtensionFilter("Specifications", PDF_EXTENSION, TIFF_EXTENSION);
	public static final FileChooser.ExtensionFilter IMAGE_FILTER = new FileChooser.ExtensionFilter("Images", IMAGE_EXTENSIONS);
	public static final FileChooser.ExtensionFilter EXCEL_FILTER = new FileChooser.ExtensionFilter("Excel Workbooks", EXCEL_EXTENSIONS);

}
