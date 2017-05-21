package problems.pecs.reports.dao;

import problems.pecs.reports.types.BasicReport;
import problems.pecs.reports.DatabaseMock;

import java.util.List;

/**
 * Created by mtumilowicz on 2017-05-20.
 */
public class BasicReportDAO {
    public static List<BasicReport> getEntities() {
        return DatabaseMock.getBasicReports();
    }
}
