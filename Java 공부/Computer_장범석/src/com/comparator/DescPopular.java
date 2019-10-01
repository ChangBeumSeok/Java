package com.comparator;

import java.util.Comparator;

import com.part.Hardware;

public class DescPopular implements Comparator<Hardware>{

	@Override
	public int compare(Hardware o1, Hardware o2) {
		return o2.getPopular() - o1.getPopular();
	}

	
}
