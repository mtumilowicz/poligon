package problems.pecs.dao;

import problems.pecs.reports.BasicReport;
import problems.pecs.DatabaseMock;

import java.util.List;

/**
 * Created by mtumilowicz on 2017-05-20.
 */
public class BasicReportDAO {
    public static List<BasicReport> getEntities() {
        return DatabaseMock.getBasicReports();
    }
}
