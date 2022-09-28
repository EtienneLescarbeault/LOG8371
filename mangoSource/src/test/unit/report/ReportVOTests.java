package test.unit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.serotonin.mango.vo.report.ReportVO;
import com.serotonin.mango.Common;
import com.serotonin.mango.vo.report.ReportPointVO;
import java.util.ArrayList;
import java.util.List;
import com.serotonin.mango.web.dwr.beans.RecipientListEntryBean;

public class ReportVOTests {
	ReportVO reportVo = new ReportVO();
    @Test
	void getIdTest() {
		assertEquals(
			reportVo.getId(), Common.NEW_ID
		);
	}

    @Test
	void setIdTest() {
        reportVo.setId(15);
		assertEquals(
			reportVo.getId(), 15
		);
	}

    @Test
	void setGetUserIdTest() {
        reportVo.setUserId(15);
		assertEquals(
			reportVo.getUserId(), 15
		);
	}

    @Test
	void setGetNameTest() {
        reportVo.setName("Name");
		assertEquals(
			reportVo.getName(), "Name"
		);
	}

    @Test
	void getPointsEmptyTest() {
		assertTrue(
			reportVo.getPoints().isEmpty()
		);
	}

    @Test
	void setPointsTest() {
        ReportPointVO reportPoint = new ReportPointVO();
        List<ReportPointVO> points = new ArrayList<ReportPointVO>();
        points.add(reportPoint);
        points.add(reportPoint);
        reportVo.setPoints(points);
		assertEquals(
			reportVo.getPoints().size(), 2
		);
	}

    @Test
	void setGetIncludeEventTest() {
        reportVo.setIncludeEvents(1);
		assertEquals(
			reportVo.getIncludeEvents(), 1
		);
	}

    @Test
	void setGetIncludeUserCommentsTest() {
        reportVo.setIncludeUserComments(false);
		assertEquals(
			reportVo.isIncludeUserComments(), false
		);
	}

    @Test
	void setGetDateRangeTypeTest() {
        reportVo.setDateRangeType(5);
		assertEquals(
			reportVo.getDateRangeType(), 5
		);
	}

    @Test
	void setGetRelativeDateTypeTest() {
        reportVo.setRelativeDateType(1);
		assertEquals(
			reportVo.getRelativeDateType(), 1
		);
	}

    @Test
	void setGetPreviousPeriodCountTest() {
        reportVo.setPreviousPeriodCount(1);
		assertEquals(
			reportVo.getPreviousPeriodCount(), 1
		);
	}

    @Test
	void setGetPastPeriodTypeTest() {
        reportVo.setPastPeriodType(1);
		assertEquals(
			reportVo.getPastPeriodType(), 1
		);
	}

    @Test
	void setGetFromNoneTest() {
        reportVo.setFromNone(true);
		assertEquals(
			reportVo.isFromNone(), true
		);
	}

    @Test
	void setGetFromYearTest() {
        reportVo.setFromYear(1);
		assertEquals(
			reportVo.getFromYear(), 1
		);
	}

    @Test
	void setGetFromMonthTest() {
        reportVo.setFromMonth(1);
		assertEquals(
			reportVo.getFromMonth(), 1
		);
	}

    @Test
	void setGetFromDayTest() {
        reportVo.setFromDay(1);
		assertEquals(
			reportVo.getFromDay(), 1
		);
	}

    @Test
	void setGetFromHourTest() {
        reportVo.setFromHour(1);
		assertEquals(
			reportVo.getFromHour(), 1
		);
	}

    @Test
	void setGetFromMinuteTest() {
        reportVo.setFromMinute(1);
		assertEquals(
			reportVo.getFromMinute(), 1
		);
	}

    @Test
	void setGetToNoneTest() {
        reportVo.setToNone(true);
		assertEquals(
			reportVo.isToNone(), true
		);
	}

    @Test
	void setGetToYearTest() {
        reportVo.setToYear(1);
		assertEquals(
			reportVo.getToYear(), 1
		);
	}

    @Test
	void setGetToMonthTest() {
        reportVo.setToMonth(1);
		assertEquals(
			reportVo.getToMonth(), 1
		);
	}

    @Test
	void setGetToDayTest() {
        reportVo.setToDay(1);
		assertEquals(
			reportVo.getToDay(), 1
		);
	}

    @Test
	void setGetToHourTest() {
        reportVo.setToHour(1);
		assertEquals(
			reportVo.getToHour(), 1
		);
	}

    @Test
	void setGetToMinuteTest() {
        reportVo.setToMinute(1);
		assertEquals(
			reportVo.getToMinute(), 1
		);
	}

    @Test
	void setGetScheduleTest() {
        reportVo.setSchedule(true);
		assertEquals(
			reportVo.isSchedule(), true
		);
	}

    @Test
	void setGetSchedulePeriodTest() {
        reportVo.setSchedulePeriod(1);
		assertEquals(
			reportVo.getSchedulePeriod(), 1
		);
	}

    @Test
	void setGetScheduleCronTest() {
        reportVo.setScheduleCron("CroneValue");
		assertEquals(
			reportVo.getScheduleCron(),"CroneValue"
		);
	}

    @Test
	void setGetEmailTest() {
        reportVo.setEmail(true);
		assertEquals(
			reportVo.isEmail(), true
		);
	}

    @Test
	void setGetRecipientsTest() {
        RecipientListEntryBean recipientListEntryBean = new RecipientListEntryBean();
        List<RecipientListEntryBean> recipients = new ArrayList<RecipientListEntryBean>();
        recipients.add(recipientListEntryBean);
        recipients.add(recipientListEntryBean);
        reportVo.setRecipients(recipients);
		assertEquals(
			reportVo.getRecipients().size(), 2
		);
	}

    @Test
	void setGetIncludeData() {
        reportVo.setIncludeData(true);
		assertEquals(
			reportVo.isIncludeData(), true
		);
	}

    @Test
	void setGetZipData() {
        reportVo.setZipData(true);
		assertEquals(
			reportVo.isZipData(), true
		);
	}

    @Test
	void setGetRunDelayMinutesTest() {
        reportVo.setRunDelayMinutes(1);
		assertEquals(
			reportVo.getRunDelayMinutes(), 1
		);
	}
	}
