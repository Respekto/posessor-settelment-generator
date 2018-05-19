package model;

import java.time.Year;
import java.util.List;

public class IndividualReport {
    Year yearOfSettlement;
    String ownerName;
    String subjectName;
    String subjectAdress;
    String subjectShare;

    List<Costs> costs;
    List<Revenues> revenues;
}
