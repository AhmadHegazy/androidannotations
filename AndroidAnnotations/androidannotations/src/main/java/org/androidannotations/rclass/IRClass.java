/**
 * Copyright (C) 2010-2014 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.rclass;

import java.util.Locale;

public interface IRClass {

	public enum Res {
		LAYOUT, ID, STRING, ARRAY, COLOR, ANIM, BOOL, DIMEN, DRAWABLE, INTEGER, MOVIE, MENU, RAW;
		public String rName() {
			return toString().toLowerCase(Locale.ENGLISH);
		}
	}

	IRInnerClass get(Res res);

}
