package problems.pecs.reports.controller;

import com.google.common.base.Preconditions;
import problems.pecs.reports.types.BasicReport;
import problems.pecs.reports.types.ExtendedReport;
import problems.pecs.reports.types.FleetReport;
import problems.pecs.reports.dao.BasicReportDAO;
import problems.pecs.reports.dao.ExtendedReportDAO;
import problems.pecs.reports.dao.FleetReportDAO;

import java.util.Collection;

/**
 * Created by mtumilowicz on 2017-05-20.
 */
public class ReportController {
    public static void addBasicReports(Collection<? super BasicReport> c, Collection<? extends BasicReport> elements) {
        Preconditions.checkArgument(c != null);
        Preconditions.checkArgument(elements != null);
        
        c.addAll(elements);
    }

    public static void addAllBasicReports(Collection<? super BasicReport> reports) {
        addBasicReports(reports, BasicReportDAO.getEntities());
        //also possible:
        //addBasicReports(reports, ExtendedReportDAO.getEntities());
    }

    public static void addExtendedReports(Collection<? super ExtendedReport> c, Collection<? extends ExtendedReport> elements) {
        Preconditions.checkArgument(c != null);
        Preconditions.checkArgument(elements != null);

        c.addAll(elements);
    }

    public static void addAllExtendedReports(Collection<? super ExtendedReport> reports) {
        addExtendedReports(reports, ExtendedReportDAO.getEntities());
    }

    public static void addFleetReports(Collection<? super FleetReport> c, Collection<? extends FleetReport> elements) {
        Preconditions.checkArgument(c != null);
        Preconditions.checkArgument(elements != null);

        c.addAll(elements);
    }

    public static void addAllFleetReports(Collection<? super FleetReport> reports) {
        addFleetReports(reports, FleetReportDAO.getEntities());
    }
}
