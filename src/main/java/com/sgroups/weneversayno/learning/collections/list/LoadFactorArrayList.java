package com.sgroups.weneversayno.learning.collections.list;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class LoadFactorArrayList {
	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<String>();
		System.out.println(getCapacity(list));
		list.add("Obj1");
		System.out.println(list);
		System.out.println(getCapacity(list));
		list.add("Obj2");
		System.out.println(list);
		list.add("Obj3");
		System.out.println(list);
		list.add("Obj4");
		System.out.println(list);
		list.add("Obj5");
		System.out.println(list);
		list.add("Obj6");
		System.out.println(list);
		list.add("Obj7");
		System.out.println(list);
		list.add("Obj8");
		System.out.println(list);
		list.add("Obj9");
		System.out.println(list);
		list.add("Obj10");
		System.out.println(list);
		System.out.println(getCapacity(list));
		list.add("Obj11");
		System.out.println(list);
		System.out.println(getCapacity(list));
		list.add("Obj12");
		System.out.println(list);
		list.add("Obj13");
		System.out.println(list);
		list.add("Obj14");
		System.out.println(list);
		list.add("Obj15");
		System.out.println(list);
		System.out.println(getCapacity(list));
		list.add("Obj16");
		System.out.println(list);
		System.out.println(getCapacity(list));
		System.out.println(getCapacity(list));
		((ArrayList<String>) list).ensureCapacity(500);
		System.out.println(getCapacity(list));
	}

	static int getCapacity(List<?> al) throws Exception {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		return ((Object[]) field.get(al)).length;
	}
}
