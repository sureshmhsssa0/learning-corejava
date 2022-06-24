package com.sgroups.weneversayno.learning.map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class LoadFactorHashMap {

	public static void main(String[] args) throws Exception {
		Map<String, Integer> mapCapacity = new HashMap<String, Integer>();
//		System.out.println(getCapacity(mapCapacity));
		mapCapacity.put("Obj1", 1);
		System.out.println(mapCapacity);
		System.out.println(getCapacity(mapCapacity));
		mapCapacity.put("Obj2", 2);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj3", 3);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj4", 4);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj5", 5);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj6", 6);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj7", 7);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj8", 8);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj9", 9);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj10", 10);
		System.out.println(mapCapacity);
		System.out.println(getCapacity(mapCapacity));
		mapCapacity.put("Obj11", 11);
		System.out.println(mapCapacity);
		System.out.println(getCapacity(mapCapacity));
		mapCapacity.put("Obj12", 12);
		System.out.println(getCapacity(mapCapacity));
		System.out.println(mapCapacity);
		mapCapacity.put("Obj13", 13);
		System.out.println(getCapacity(mapCapacity));
		System.out.println(mapCapacity);
		mapCapacity.put("Obj14", 14);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj15", 15);
		System.out.println(mapCapacity);
		System.out.println(getCapacity(mapCapacity));
		mapCapacity.put("Obj16", 16);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj17", 17);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj18", 18);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj19", 19);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj20", 20);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj21", 21);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj22", 22);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj23", 23);
		System.out.println(mapCapacity);
		System.out.println(getCapacity(mapCapacity));
		mapCapacity.put("Obj24", 24);
		System.out.println(mapCapacity);
		System.out.println(getCapacity(mapCapacity));
		mapCapacity.put("Obj25", 25);
		System.out.println(mapCapacity);
		System.out.println(getCapacity(mapCapacity));
		mapCapacity.put("Obj26", 26);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj27", 27);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj28", 28);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj29", 29);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj30", 30);
		System.out.println(mapCapacity);
		mapCapacity.put("Obj31", 31);

		System.out.println(mapCapacity);
		System.out.println(getCapacity(mapCapacity));
		System.out.println(getCapacity(mapCapacity));
//		((LinkedmapCapacity<String>) mapCapacity).hugeCapacity(500);
		System.out.println(getCapacity(mapCapacity));
	}

	static int getCapacity(Map<?, ?> mapCapacity) throws Exception {
		Field field = HashMap.class.getDeclaredField("table");
		field.setAccessible(true);
		return ((Object[]) field.get(mapCapacity)).length;
	}
}
