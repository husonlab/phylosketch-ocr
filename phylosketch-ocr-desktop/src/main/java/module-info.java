module phylosketch_ocr_desktop {
	requires javafx.graphics;
	requires phylosketch_ocr_api;
	requires org.bytedeco.tesseract;

	exports phylosketch.ocr.desktop;
}