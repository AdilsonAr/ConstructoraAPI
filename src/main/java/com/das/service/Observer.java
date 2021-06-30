package com.das.service;

import com.das.model.Notificacion;

public interface Observer {
	public abstract void update(Notificacion n);
}
