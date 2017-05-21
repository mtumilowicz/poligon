package problems.pecs.reports.dao;

import problems.pecs.reports.DatabaseMock;
import problems.pecs.reports.types.FleetReport;

import java.util.List;

/**
 * Created by mtumilowicz on 2017-05-20.
 */
public class FleetReportDAO {
    public static List<FleetReport> getEntities() {
        return DatabaseMock.getFleetReports();
    }
}
