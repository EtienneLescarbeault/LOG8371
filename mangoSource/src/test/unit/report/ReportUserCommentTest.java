package test.unit;

import java.awt.Paint;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.serotonin.mango.vo.report.ReportUserComment;
import com.serotonin.web.taglib.DateFunctions;

public class ReportUserCommentTest {
	ReportUserComment reportUserComment = new ReportUserComment();

    @Test
	void getPrettyTimeTest() {
        reportUserComment.setTs(10L);
		assertEquals(
			reportUserComment.getPrettyTime(),  DateFunctions.getTime(10L)
		);
	}

    @Test
	void setGetUserNameTest() {
        reportUserComment.setUsername("Name");
		assertEquals(
			reportUserComment.getUsername(), "Name"
		);
	}

    @Test
	void setGetCommentTypeTest() {
        reportUserComment.setCommentType(5);
		assertEquals(
			reportUserComment.getCommentType(), 5
		);
	}

    @Test
	void setGetTypeKeyTest() {
        reportUserComment.setTypeKey(5);
		assertEquals(
			reportUserComment.getTypeKey(), 5
		);
	}
    
    @Test
	void setGetPointNameTest() {
        reportUserComment.setPointName("Name");
		assertEquals(
			reportUserComment.getPointName(), "Name"
		);
	}

    @Test
	void setGetTsTest() {
        reportUserComment.setTs(10L);
		assertEquals(
			reportUserComment.getTs(), 10L
		);
	}

    @Test
	void setGeCommentTest() {
        reportUserComment.setComment("Comment");
		assertEquals(
			reportUserComment.getComment(), "Comment"
		);
	}

}