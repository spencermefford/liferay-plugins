/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.service.http;

import com.liferay.calendar.model.CalendarResource;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.List;

/**
 * @author    Eduardo Lundgren
 * @generated
 */
public class CalendarResourceJSONSerializer {
	public static JSONObject toJSONObject(CalendarResource model) {
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		jsonObject.put("uuid", model.getUuid());
		jsonObject.put("calendarResourceId", model.getCalendarResourceId());
		jsonObject.put("groupId", model.getGroupId());
		jsonObject.put("companyId", model.getCompanyId());
		jsonObject.put("userId", model.getUserId());
		jsonObject.put("userName", model.getUserName());

		Date createDate = model.getCreateDate();

		String createDateJSON = StringPool.BLANK;

		if (createDate != null) {
			createDateJSON = String.valueOf(createDate.getTime());
		}

		jsonObject.put("createDate", createDateJSON);

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObject.put("modifiedDate", modifiedDateJSON);
		jsonObject.put("classNameId", model.getClassNameId());
		jsonObject.put("classPK", model.getClassPK());
		jsonObject.put("classUuid", model.getClassUuid());
		jsonObject.put("name", model.getName());
		jsonObject.put("description", model.getDescription());
		jsonObject.put("active", model.getActive());

		return jsonObject;
	}

	public static JSONArray toJSONArray(
		com.liferay.calendar.model.CalendarResource[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (CalendarResource model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.liferay.calendar.model.CalendarResource[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (CalendarResource[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.liferay.calendar.model.CalendarResource> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (CalendarResource model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}