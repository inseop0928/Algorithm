package com.jis.level1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MinMaxNumTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		
		int[] intArr = {3, 2, 6, 10, 234};
        Integer maxValue = Arrays.stream(intArr)
                .max()
                .getAsInt();
        

        Assertions.assertThat(maxValue).isEqualTo(235);
        
	}

}
