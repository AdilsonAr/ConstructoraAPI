package com.das.service;

import com.das.model.Notificacion;

public interface Observable {
	public abstract void myNotify(Notificacion n);
	public abstract void attach(Observer o);
	public abstract void detach(Observer o);
}
