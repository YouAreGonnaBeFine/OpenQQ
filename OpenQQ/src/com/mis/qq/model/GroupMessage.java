package com.mis.qq.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * 群消息
 */
@Data
public class GroupMessage {

	private long groupId;

	private long time;

	private String content;

	private long userId;

	private Font font;

	public GroupMessage(JSONObject json) {
		JSONArray content = json.getJSONArray("content");
		this.font = content.getJSONArray(0).getObject(1, Font.class);
		this.content = content.getString(1);
		this.time = json.getLongValue("time");
		this.groupId = json.getLongValue("group_code");
		this.userId = json.getLongValue("send_uin");
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

}
