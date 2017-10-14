package test.intervals;

import org.junit.Test;
import problems.intervals.IntervalsMerger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static utils.IntervalsContainer.*;

/**
 * Created by mtumilowicz on 2017-10-14.
 */
public class IntervalsMergerTests {
    @Test
    public void mergeNull() {
        assertThat(new LinkedList<>(), is(IntervalsMerger.merge(null)));
    }

    @Test
    public void merge_interval_1_2() {
        assertThat(new LinkedList<>(Arrays.asList(interval_1_2)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_1_2)))));
    }

    @Test
    public void merge_interval_1_2_interval_1_3() {
        assertThat(new LinkedList<>(Arrays.asList(interval_1_3)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_1_3,
                        interval_1_2)))));
    }

    @Test
    public void merge_interval_1_3_interval_1_2() {
        assertThat(new LinkedList<>(Arrays.asList(interval_1_3)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_1_2, interval_1_3)))));
    }

    @Test
    public void merge_interval_1_2_interval_1_3_interval_1_4() {
        assertThat(new LinkedList<>(Arrays.asList(interval_1_4)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(
                        interval_1_2,
                        interval_1_3,
                        interval_1_4)))));
    }

    @Test
    public void merge_interval_1_3_interval_1_2_interval_1_4() {
        assertThat(new LinkedList<>(Arrays.asList(interval_1_4)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(
                        interval_1_3,
                        interval_1_2,
                        interval_1_4)))));
    }

    @Test
    public void merge_interval_2_3_interval_1_2_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_3)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_2_3, interval_1_2)))));
    }

    @Test
    public void merge_interval_1_2_interval_3_4_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_2,
                interval_3_4)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_1_2, interval_3_4)))));
    }

    @Test
    public void merge_interval_3_4_interval_1_2_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_2,
                interval_3_4)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_3_4, interval_1_2)))));
    }

    @Test
    public void merge_interval_1_2_interval_2_3_interval_3_4_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_4)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_1_2, interval_2_3, interval_3_4)))));
    }

    @Test
    public void merge_interval_3_4_interval_2_3_interval_1_2_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_4)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_3_4, interval_2_3, interval_1_2)))));
    }

    @Test
    public void merge_interval_1_2_interval_2_3_interval_4_5_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_3,
                interval_4_5)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_1_2, interval_2_3, interval_4_5)))));
    }

    @Test
    public void merge_interval_4_5_interval_2_3_interval_1_2_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_3,
                interval_4_5)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_4_5, interval_2_3, interval_1_2)))));
    }

    @Test
    public void merge_interval_1_oo_interval_2_3_interval_4_5_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_oo)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_1_oo, interval_2_3, interval_4_5)))));
    }

    @Test
    public void merge_interval_4_5_interval_2_3_interval_1_oo_interval() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_oo)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_4_5, interval_2_3, interval_1_oo)))));
    }

    @Test
    public void merge_interval_1_oo_interval_2_oo() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_oo)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_1_oo, interval_2_oo)))));
    }

    @Test
    public void merge_interval_2_oo_interval_1_oo() {
        assertThat(new LinkedList<>(Arrays.asList(
                interval_1_oo)),
                is(IntervalsMerger.merge(new ArrayList<>(Arrays.asList(interval_2_oo, interval_1_oo)))));
    }
}
