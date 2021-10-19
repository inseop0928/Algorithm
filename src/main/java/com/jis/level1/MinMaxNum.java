package com.jis.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxNum {

	public static void main(String[] args) {
		int[] numbers = {10, 55, 23,68, 2, 79, 101, 16,122,15, 82, 30, 45};
		
		int min = numbers[0];
		int max = numbers[0];
		int minPos = 0;
		int maxPos = 0;
		
		for(int i=0 ; i<numbers.length; i++ ) {
			
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i+1;
			}else if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}
		}
		
		//System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		//System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");
		
		
		
		int max1 = Arrays.stream(numbers).max().getAsInt();
		System.out.println(String.format("최대값 %d", max1));
		
		min = numbers[0];
		max = numbers[1];
		minPos = 0;
		maxPos = 0;
		

		
		
		
		for(int i=0 ; i<numbers.length; i++ ) {
			
			
			for(int j=i+1 ; j<numbers.length; j++) {
				int bfNum = numbers[i];
				int afNum = numbers[j];
				if(bfNum > afNum) {
					numbers[j] = bfNum;
					numbers[i] = afNum;
								
				}		
			}
		}
		
		
		System.out.println(Arrays.stream(numbers).mapToObj(Integer::toString).collect(Collectors.joining(",")));
	}
}
