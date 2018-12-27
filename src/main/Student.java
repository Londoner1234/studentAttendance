/**
 * Created by meudecc on 15/02/2017.
 * Modified 
 * -Thomas Woodhouse
 * Log 
 * Added line 15 to check equal to 0 
 * Removed line 18 to check < 50  
 * Changed line 20 from <= to < 
 */
public class Student {

    public enum AttendanceGrade {ABSENT, VERY_POOR, POOR, AVERAGE, GOOD, VERY_GOOD};

    public AttendanceGrade getAttendanceGrade(int attendance) {
        if (attendance < 0 || attendance > 100) throw new IllegalArgumentException();
        if (attendance == 0) return AttendanceGrade.ABSENT; //Added this Line
        if (attendance < 30) return AttendanceGrade.VERY_POOR;
        //if (attendance < 50) return AttendanceGrade.POOR;  //Removed this line
        if (attendance < 70) return AttendanceGrade.AVERAGE;
        if (attendance < 90) return AttendanceGrade.GOOD; //Change from <= to < 
        return AttendanceGrade.VERY_GOOD;
    }
}
