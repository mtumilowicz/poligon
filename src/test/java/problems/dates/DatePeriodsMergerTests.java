package problems.dates;

import org.junit.Test;
import problems.dates.DatePeriodsMerger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static utils.DatePeriodsContainer.*;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodsMergerTests {
    
    @Test
    public void mergeNull() {
        assertThat(new LinkedList<>(), is(DatePeriodsMerger.merge(null)));
    }
    
    @Test
    public void merge_period_1_2() {
        assertThat(new LinkedList<>(Collections.singletonList(period_1_2)), 
                is(DatePeriodsMerger.merge(new ArrayList<>(Collections.singletonList(period_1_2)))));
    }
    
    @Test
    public void merge_period_1_2_period_1_3() {
        assertThat(new LinkedList<>(Collections.singletonList(period_1_3)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_1_3, 
                        period_1_2)))));
    }

    @Test
    public void merge_period_1_3_period_1_2() {
        assertThat(new LinkedList<>(Collections.singletonList(period_1_3)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_1_2, period_1_3)))));
    }

    @Test
    public void merge_period_1_2_period_1_3_period_1_4() {
        assertThat(new LinkedList<>(Collections.singletonList(period_1_4)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(
                        period_1_2,
                        period_1_3,
                        period_1_4)))));
    }

    @Test
    public void merge_period_1_3_period_1_2_period_1_4() {
        assertThat(new LinkedList<>(Collections.singletonList(period_1_4)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(
                        period_1_3,
                        period_1_2,
                        period_1_4)))));
    }

    @Test
    public void merge_period_2_3_period_1_2_period() {
        assertThat(new LinkedList<>(Collections.singletonList(
                period_1_3)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_2_3, period_1_2)))));
    }

    @Test
    public void merge_period_1_2_period_3_4_period() {
        assertThat(new LinkedList<>(Arrays.asList(
                period_1_2,
                period_3_4)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_1_2, period_3_4)))));
    }

    @Test
    public void merge_period_3_4_period_1_2_period() {
        assertThat(new LinkedList<>(Arrays.asList(
                period_1_2,
                period_3_4)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_3_4, period_1_2)))));
    }

    @Test
    public void merge_period_1_2_period_2_3_period_3_4_period() {
        assertThat(new LinkedList<>(Collections.singletonList(
                period_1_4)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_1_2, period_2_3, period_3_4)))));
    }

    @Test
    public void merge_period_3_4_period_2_3_period_1_2_period() {
        assertThat(new LinkedList<>(Collections.singletonList(
                period_1_4)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_3_4, period_2_3, period_1_2)))));
    }

    @Test
    public void merge_period_1_2_period_2_3_period_4_5_period() {
        assertThat(new LinkedList<>(Arrays.asList(
                period_1_3,
                period_4_5)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_1_2, period_2_3, period_4_5)))));
    }

    @Test
    public void merge_period_4_5_period_2_3_period_1_2_period() {
        assertThat(new LinkedList<>(Arrays.asList(
                period_1_3,
                period_4_5)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_4_5, period_2_3, period_1_2)))));
    }

    @Test
    public void merge_period_1_oo_period_2_3_period_4_5_period() {
        assertThat(new LinkedList<>(Collections.singletonList(
                period_1_oo)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_1_oo, period_2_3, period_4_5)))));
    }

    @Test
    public void merge_period_4_5_period_2_3_period_1_oo_period() {
        assertThat(new LinkedList<>(Collections.singletonList(
                period_1_oo)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_4_5, period_2_3, period_1_oo)))));
    }

    @Test
    public void merge_period_1_oo_period_2_oo() {
        assertThat(new LinkedList<>(Collections.singletonList(
                period_1_oo)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_1_oo, period_2_oo)))));
    }

    @Test
    public void merge_period_2_oo_period_1_oo() {
        assertThat(new LinkedList<>(Collections.singletonList(
                period_1_oo)),
                is(DatePeriodsMerger.merge(new ArrayList<>(Arrays.asList(period_2_oo, period_1_oo)))));
    }
}
