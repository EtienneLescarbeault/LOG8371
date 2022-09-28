package test.unit;

import java.awt.Paint;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.serotonin.mango.vo.report.ReportPointInfo;

public class ReportPointInfoTests {
	ReportPointInfo reportPointInfo = new ReportPointInfo();

    @Test
	void setGetReportPointIdTest() {
        reportPointInfo.setReportPointId(5);
		assertEquals(
			reportPointInfo.getReportPointId(), 5
		);
	}

    @Test
	void setGetDeviceNameTest() {
        reportPointInfo.setDeviceName("name");
		assertEquals(
			reportPointInfo.getDeviceName(), "name"
		);
	}

    @Test
	void getExtendedNameTest() {
        reportPointInfo.setDeviceName("name");
        reportPointInfo.setPointName("point");
		assertEquals(
			reportPointInfo.getExtendedName(), "name - point"
		);
	}

    @Test
	void setGetDataTypeTest() {
        reportPointInfo.setDataType(5);
		assertEquals(
			reportPointInfo.getDataType(), 5
		);
	}

    @Test
	void setGetColourTest() {
        reportPointInfo.setColour("red");
		assertEquals(
			reportPointInfo.getColour(), "red"
		);
	}

}