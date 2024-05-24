import java.util.ArrayList;
public class StudentGroup {
    public String nazwa;
    private ArrayList<Student>listaStudentow;
    private int maxNumberOfPeople=15;
    public StudentGroup(){
        this.listaStudentow=new ArrayList<>();

    }

    public void addStudent(Student student){
        if (listaStudentow.size()>=maxNumberOfPeople){
            throw new IllegalArgumentException("Osiągnięto maksymalną ilość osób w tej grupie");

        }
        if (listaStudentow.contains(student)){
            throw new IllegalArgumentException("Ten student jest już w tej grupie");
        }
        listaStudentow.add(student);
        student.groups=this;
    }
}