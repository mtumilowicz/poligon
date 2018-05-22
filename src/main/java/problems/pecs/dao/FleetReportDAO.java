package problems.pecs.dao;

import problems.pecs.DatabaseMock;
import problems.pecs.reports.FleetReport;

import java.util.List;

/**
 * Created by mtumilowicz on 2017-05-20.
 */
public class FleetReportDAO {
    public static List<FleetReport> getEntities() {
        return DatabaseMock.getFleetReports();
    }
}
