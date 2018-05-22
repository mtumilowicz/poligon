package problems.pecs.dao;

import problems.pecs.DatabaseMock;
import problems.pecs.reports.ExtendedReport;

import java.util.List;

/**
 * Created by mtumilowicz on 2017-05-20.
 */
public class ExtendedReportDAO {
    public static List<ExtendedReport> getEntities() {
        return DatabaseMock.getExtendedReports();
    }
}
