/*
 *  OCR.java Copyright (C) 2025 Daniel H. Huson
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

package phylosketch.ocr.api;

import javafx.scene.image.Image;

import java.util.List;
import java.util.ServiceLoader;

public final class OCR {

	private static final OCRService INSTANCE = ServiceLoader
			.load(OCRService.class)
			.findFirst()
			.orElseGet(() -> new OCRService() {
				@Override
				public List<Word> getWords(Image image) throws Exception {
					throw new RuntimeException("No OCRService implementation found");
				}

				@Override
				public boolean isAvailable() {
					return false;
				}
			});

	public static OCRService get() {
		return INSTANCE;
	}

	private OCR() {
	}
}
