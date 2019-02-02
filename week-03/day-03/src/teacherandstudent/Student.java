package teacherandstudent;

public class Student {


    public void learn (){
        System.out.println("You have learned a lot today!");
    }

    public void question (Teacher teacher) {
        teacher.answer();
    }
}

