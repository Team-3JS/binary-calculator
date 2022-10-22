package com.codacum.springboothelloworld;

//import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DecimaltoOctalTest {
	@Test
    public void testOctal() {
    	DecimaltoOctal dto = new DecimaltoOctal();
    	String oct = dto.converttoOctal(520);
    	assertEquals(oct, "1011");
    }
}
