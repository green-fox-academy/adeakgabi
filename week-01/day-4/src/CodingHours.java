public class CodingHours {
    public static void main(String[] args) {

        int hoursPerDay = 6;
        int semesterLength = 17;
        int daysPerWeek = 5;
        int hoursPerSemester = (hoursPerDay * semesterLength * daysPerWeek);

        System.out.println(hoursPerSemester);

        int avarageWorkHours = 52;
        int workHoursPerSemester = (avarageWorkHours * 17);

        //100*510/884

        System.out.println(100. * hoursPerSemester / workHoursPerSemester + "%");




    }
}
