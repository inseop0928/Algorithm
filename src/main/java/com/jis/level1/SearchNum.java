package com.jis.level1;

public class SearchNum {
	
	public static void main(String[] args) {
		
		
		
		//숫자가 정렬된 상태이므로 중간의 값을 선택후 나누면서 범위를 좁힐수 있다.
		//한번 비교 할때 마다 1/2씩 범위가 좁혀진다.
		int[] numbers = {12, 25, 31, 48, 54, 66, 70,71,80, 83, 95, 108 , 121};
		
		
		int target = 70;
		
		int startIdx = 0;
		int endIdx = numbers.length-1;
		
		int modIdx = (startIdx+endIdx)/2; 
		
		int temp = numbers[modIdx];
		
		while(startIdx<=endIdx) {
			
			
			
			if(temp == target) {
				break;
			}else if(temp > target) {
				endIdx = modIdx -1;
			}else {
				startIdx = modIdx +1;
			}
			
			modIdx = (startIdx+endIdx)/2;
			temp = numbers[modIdx]; 
			
		}
		
		modIdx++;
		System.out.println("찾는 수는 " + modIdx + "번째 존재");
	}
}
