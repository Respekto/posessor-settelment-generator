package model;

import io.swagger.annotations.ApiModel;

import java.time.Year;
import java.util.List;

@ApiModel(description = "Individual Report details")
public class IndividualReport {
    Year yearOfSettlement;
    String ownerName;
    String subjectName;
    String subjectAddress;
    String subjectShare;

//    List<Costs> costs;
//    List<Revenues> revenues;
}
