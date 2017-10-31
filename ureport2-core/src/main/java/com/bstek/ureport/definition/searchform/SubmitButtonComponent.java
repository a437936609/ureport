/*******************************************************************************
 * Copyright (C) 2017 Bstek.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.bstek.ureport.definition.searchform;

/**
 * @author Jacky.gao
 * @since 2017年10月24日
 */
public class SubmitButtonComponent extends ButtonComponent{
	@Override
	public String initJs(RenderContext context) {
		StringBuilder sb=new StringBuilder();
		sb.append("$('#"+context.buildComponentId(this)+"').click(function(){");
		sb.append("alert('reset')");
		sb.append("");
		sb.append("");
		sb.append("});");
		return sb.toString();
	}
}