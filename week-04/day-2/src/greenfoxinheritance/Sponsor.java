package greenfoxinheritance;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire(){
        hiredStudents +=1;
    }

    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        hiredStudents = 0;
    }

    public Sponsor(){
        super();
        company = "Google";
        hiredStudents = 0;
    }


}
