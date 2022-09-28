package test.unit;

import java.awt.Paint;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.serotonin.mango.vo.report.ReportPointVO;

public class ReportPointVOTests {
	ReportPointVO reportPointVo = new ReportPointVO();

    @Test
	void setGetPoinrIdTest() {
        reportPointVo.setPointId(5);
		assertEquals(
			reportPointVo.getPointId(), 5
		);
	}

    @Test
	void setGetColourTest() {
        reportPointVo.setColour("Red");
		assertEquals(
			reportPointVo.getColour(), "Red"
		);
	}

    @Test
	void setGetConsolidatedChartTest() {
        reportPointVo.setConsolidatedChart(true);
		assertEquals(
			reportPointVo.isConsolidatedChart(), true
		);
	}

}