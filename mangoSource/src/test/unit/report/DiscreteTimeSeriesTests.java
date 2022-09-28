package test.unit;

import java.awt.Paint;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.serotonin.mango.vo.report.DiscreteTimeSeries;
import com.serotonin.mango.view.text.TextRenderer;

import java.util.Collections;
import java.util.List;

import com.serotonin.mango.rt.dataImage.PointValueTime;
import com.serotonin.mango.rt.dataImage.types.MangoValue;

public class DiscreteTimeSeriesTests {
	String name = "Name";
	TextRenderer textRenderer = null; 
	Paint paint = null; 

	DiscreteTimeSeries obj = new DiscreteTimeSeries(name, textRenderer, paint);
    @Test
	void getNameTest() {
		assertEquals(
			obj.getName(), "Name"
		);
	}

	@Test
	void getpaintTest() {
		assertEquals(
			obj.getPaint(), null
		);
	}

	@Test
	void getEmptyValueTimesTest() {
		assertTrue(
			obj.getValueTimes().isEmpty()
		);
	}

	@Test
	void addValueTimesNullTest() {
		obj.addValueTime(null);
		assertTrue(
			obj.getValueTimes().isEmpty()
		);
	}

	@Test
	void addValueTimesTest() {
		PointValueTime pointValue = new PointValueTime( true , 10L);
		obj.addValueTime(pointValue);
		assertEquals(
			obj.getValueTimes().size(), 1
		);
	}

	@Test
	void getDiscreteValueCountTest() {
		PointValueTime pointValue = new PointValueTime( true , 10L);
		obj.addValueTime(pointValue);
		assertEquals(
			obj.getDiscreteValueCount(), 1
		);
	}

	@Test
	void getValueIndexTest() {
		MangoValue mangoValue = null;
		PointValueTime pointValue = new PointValueTime( mangoValue , 10L);
		obj.addValueTime(pointValue);
		assertEquals(
			obj.getValueIndex(mangoValue), -1
		);
	}
}
