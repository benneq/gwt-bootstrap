/*
 *  Copyright 2012 GWT Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.client.ui;

import com.github.gwtbootstrap.client.ui.base.ComplexWidget;
import com.github.gwtbootstrap.client.ui.base.Style;

/**
 * A Form
 * 
 * @author Dominik Mayer
 * 
 */
public class Form extends ComplexWidget {

	public enum Type implements Style {
		VERTICAL("vertical"), INLINE("inline"), SEARCH("search"), HORIZONTAL(
				"horizontal");

		private static final String PREFIX = "form-";

		private String className;

		private Type(String className) {
			this.className = PREFIX + className;
		}

		/**
		 * {@inheritDoc}
		 */
		public String get() {
			return className;
		}

	}

	public Form() {
		super("form");
	}

	public void setType(String type) {
		addStyleName("form-" + type);
	}
}