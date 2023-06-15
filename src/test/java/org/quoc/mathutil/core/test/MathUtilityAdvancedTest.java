/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quoc.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.quoc.mathutil.core.MathUtility;
import static org.quoc.mathutil.core.MathUtility.*;

public class MathUtilityAdvancedTest {
    
    // Hàm chuẩn bị bộ test data để sau đso fill vào hàm
    //assertE() ở dưới
    public static Object[][] initTestData(){
        Object testData[][] = {{0,1},
                               {1,1},
                               {2,2},
                               {4,24},
                               {6,720}};
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected){
        assertEquals(expected,getFactorial(n));
    }
    
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
        
        Executable gF = () -> MathUtility.getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class,
                () -> MathUtility.getFactorial(-5)); // hàm thuộc interface executable
                              // lambda cho nhanh
    }
    
}
