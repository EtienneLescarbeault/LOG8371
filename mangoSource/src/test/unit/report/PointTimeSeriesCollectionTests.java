package test.unit;

import java.awt.Paint;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.jfree.data.time.TimeSeries;
import com.serotonin.mango.vo.report.PointTimeSeriesCollection;

import com.serotonin.mango.vo.report.DiscreteTimeSeries;
import com.serotonin.mango.view.text.TextRenderer;

public class PointTimeSeriesCollectionTests {
	PointTimeSeriesCollection obj = new PointTimeSeriesCollection();

    @Test
	void hasDataEmptyTest() {
		assertEquals(
			obj.hasData(), false
		);
	}

    @Test
	void hasDiscreteEmptyTest() {
		assertEquals(
			obj.hasDiscreteData(), false
		);
	}

    @Test
	void hasNumericEmptyTest() {
		assertEquals(
			obj.hasNumericData(), false
		);
	}

    
    @Test
	void addNumericTimeSeriesTest() {
        obj.addNumericTimeSeries(new TimeSeries("Time Series")) ;
		assertEquals(
			obj.hasNumericData(), true
		);
	}

    @Test
	void discretTimeSeriesTest() {
        String name = "Name";
	    TextRenderer textRenderer = null; 
	    Paint paint = null; 
	    DiscreteTimeSeries discreteTimeSeries = new DiscreteTimeSeries(name, textRenderer, paint);
        obj.addDiscreteTimeSeries(discreteTimeSeries) ;
		assertEquals(
			obj.hasDiscreteData(), true
		);
        assertEquals(
			obj.getDiscreteSeriesCount(), 1
		);
        assertEquals(
			obj.getDiscreteTimeSeries(0), discreteTimeSeries
		);
	}

    @Test
	void hasMultiplePointTest() {
        assertEquals(
			obj.hasMultiplePoints(), false
		);
        String name = "Name";
	    TextRenderer textRenderer = null; 
	    Paint paint = null;
        DiscreteTimeSeries discreteTimeSeries = new DiscreteTimeSeries(name, textRenderer, paint);
        obj.addDiscreteTimeSeries(discreteTimeSeries) ;
        assertEquals(
			obj.hasMultiplePoints(), false
		);
        obj.addDiscreteTimeSeries(discreteTimeSeries) ;
         assertEquals(
			obj.hasMultiplePoints(), true
		);
	}

    @Test
	void getNumericPaintTest() {
        assertEquals(
			obj.getNumericPaint(), null
		);
        obj.addNumericTimeSeries(new TimeSeries("Time Series")) ;
		assertEquals(
			obj.getNumericPaint().size(), 1
		);
	}
}