package com.nit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationFactory {
	@Autowired
	Map<String, Notifier> map;

	public Notifier getNotifier(String type) {
		return map.get(type);
	}
}
