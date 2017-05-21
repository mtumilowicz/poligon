package problems.pecs.reports;

import problems.pecs.reports.types.BasicReport;
import problems.pecs.reports.types.ExtendedReport;
import problems.pecs.reports.types.FleetReport;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-05-20.
 */
public class DatabaseMock {
    public static List<BasicReport> getBasicReports() {
        return new LinkedList<>(Arrays.asList(new BasicReport(), new BasicReport(), new BasicReport()));
    }

    public static List<ExtendedReport> getExtendedReports() {
        return new LinkedList<>(Arrays.asList(new ExtendedReport(), new ExtendedReport(), new ExtendedReport()));
    }

    public static List<FleetReport> getFleetReports() {
        return new LinkedList<>(Arrays.asList(new FleetReport(), new FleetReport(), new FleetReport()));
    }
}
