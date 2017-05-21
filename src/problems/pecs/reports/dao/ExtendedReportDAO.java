package problems.pecs.reports.dao;

import problems.pecs.reports.DatabaseMock;
import problems.pecs.reports.types.ExtendedReport;

import java.util.List;

/**
 * Created by mtumilowicz on 2017-05-20.
 */
public class ExtendedReportDAO {
    public static List<ExtendedReport> getEntities() {
        return DatabaseMock.getExtendedReports();
    }
}
