package com.mis.qq.callback;

import com.mis.ins.scan.Control;
import com.mis.qq.model.DiscussMessage;
import com.mis.qq.model.GroupMessage;
import com.mis.qq.model.Message;

public class MessageCallbackImpl implements MessageCallback {
	
	Control control = new Control();
	

	@Override
	public void onMessage(Message message) {
		System.out.println(message.getContent());
	}

	@Override
	public void onGroupMessage(GroupMessage message) {
		
		System.out.println(message.getContent());
	}

	@Override
	public void onDiscussMessage(DiscussMessage message) {
		System.out.println(message.getContent());

	}
}
