/*
 *  OCRServiceIOS.java Copyright (C) 2025 Daniel H. Huson
 *
 *  (Some files contain contributions from other authors, who are then mentioned separately.)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package phylosketch.ocr.ios;


import javafx.scene.image.Image;
import phylosketch.ocr.api.OCRService;

import java.util.List;

/**
 * interface to OCR
 * Daniel Huson, 11.2025
 */
public class OCRServiceIOS implements OCRService {

	/**
	 * get words in an image
	 *
	 * @param image the image
	 * @return the words
	 */
	@Override
	public List<Word> getWords(Image image) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
