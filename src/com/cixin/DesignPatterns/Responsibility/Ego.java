package com.cixin.DesignPatterns.Responsibility;

public class Ego extends Self {
	public void decision(String thing, int level) {
		if("thing1".equals(thing) && level==2 )
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("����һ������");
			nextDecidor.decision(thing, level);
		}
	}
}