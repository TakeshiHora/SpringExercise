package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.disaster.prefix.ReportClassification;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReportClassificationTest {

    @Test
    public void canGetMaxPriorityIfIdIsOne(){
        assertThat(ReportClassification.MaximumPriority,is(ReportClassification.getById(1)));
    }

    @Test
    public void canGetPriorityIfIdIsTwo(){
        assertThat(ReportClassification.Priority,is(ReportClassification.getById(2)));
    }

    @Test
    public void canGetRegularIfIdIsThree(){
        assertThat(ReportClassification.Regular,is(ReportClassification.getById(3)));
    }

    @Test
    public void canGetTrainingTestIfIdIsSeven(){
        assertThat(ReportClassification.TrainingTest,is(ReportClassification.getById(7)));
    }
}
