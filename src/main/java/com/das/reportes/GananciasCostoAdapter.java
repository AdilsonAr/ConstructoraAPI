package com.das.reportes;

import com.das.constants.Money;
import com.das.model.Proyecto;

public class GananciasCostoAdapter extends CalculadoraCostos implements CalculadoraGanancias{

	@Override
	public double getGanancias(Proyecto p) {
		return getCostos(p)*Money.GANANCIAS.getValor();
	}

}
