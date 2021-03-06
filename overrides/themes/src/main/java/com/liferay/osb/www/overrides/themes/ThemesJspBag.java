/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.osb.www.overrides.themes;

import com.liferay.portal.custom.jsp.bag.BaseCustomJspBag;

import org.osgi.service.component.annotations.Component;

/**
 * @author Ryan Schuhler
 */
@Component(
	immediate = true,
	property = {
		"context.id=ThemesJspBag", "context.name=Themes JSP Bag",
		"service.ranking:Integer=100"
	}
)
public class ThemesJspBag extends BaseCustomJspBag {
}