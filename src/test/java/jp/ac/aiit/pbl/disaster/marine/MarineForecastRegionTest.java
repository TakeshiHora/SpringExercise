package jp.ac.aiit.pbl.disaster.marine;

import jp.ac.aiit.pbl.disaster.ashfall.WarningCode;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MarineForecastRegionTest {
    /**
     *
     */
    @Test
    public void CanGetMarineForecastRegionInCaseOf1000() {
        assertThat(MarineForecastRegion.NorthernJapaneseSeaSouthernOhootsukuSea, is(MarineForecastRegion.getById(1000)));
    }
    @Test
    public void CanGetMarineForecastRegionInCaseOf1040() {
        assertThat(MarineForecastRegion.SoyaKaikyo, is(MarineForecastRegion.getById(1040)));
    }
    @Test
    public void CanGetMarineForecastRegionInCaseOf1120() {
        assertThat(MarineForecastRegion.KurioOki, is(MarineForecastRegion.getById(1120)));
    }
    @Test
    public void CanGetMarineForecastRegionInCaseOf2000() {
        assertThat(MarineForecastRegion.SanrikuOki, is(MarineForecastRegion.getById(2000)));
    }
    @Test
    public void CanGetMarineForecastRegionInCaseOf4010() {
        assertThat(MarineForecastRegion.SetonaiKai, is(MarineForecastRegion.getById(4010)));
    }
    @Test
    public void CanGetMarineForecastRegionInCaseOf5210() {
        assertThat(MarineForecastRegion.HyugaNada, is(MarineForecastRegion.getById(5210)));
    }
    @Test
    public void CanGetMarineForecastRegionInCaseOf10000() {
        assertThat(MarineForecastRegion.Others, is(MarineForecastRegion.getById(10000)));
    }
    @Test
    public void CanGetMarineForecastRegionInCaseOfMoreThanMax() {
        assertThat(null, is(MarineForecastRegion.getById(10001)));
    }
    @Test
    public void CanGetMarineForecastRegionInCaseOfLessThanMin() {
        assertThat(null, is(MarineForecastRegion.getById(999)));
    }
}
