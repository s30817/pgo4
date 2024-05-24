import java.sql.Array;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        StudentGroup sg=new StudentGroup();
        sg.nazwa="13";


        Student st=new Student();
        st.imie="Jakub";
        st.nazwisko="Trawiasty";
        st.indexNumber="s48437";
        st.email="trawa.trawa@gmail.com";
        st.oceny= new ArrayList<>();
        st.oceny.add(3.5);
        st.oceny.add(4.5);
        st.oceny.add(5.0);
        double srednia= st.calculateAvarage();

        Student st2=new Student();
        st2.imie="Andrzej";
        st2.nazwisko="Warszawski";
        st2.indexNumber="s34534";
        st2.email="s34534@gmail.com";
        st2.oceny= new ArrayList<>();
        st2.oceny.add(4.0);
        st2.oceny.add(3.0);
        st2.oceny.add(4.0);
        double srednia2= st2.calculateAvarage();

        Student st3=new Student();
        st3.imie="Bartosz";
        st3.nazwisko="Kasprzak";
        st3.indexNumber="s37177";
        st3.email="s37177@gmail.com";
        st3.oceny= new ArrayList<>();
        st3.oceny.add(5.0);
        st3.oceny.add(4.0);
        st3.oceny.add(5.0);
        double srednia3=st3.calculateAvarage();

        try {
            sg.addStudent(st);
            sg.addStudent(st2);
            sg.addStudent(st3);

        }
        catch (IllegalStateException blad){
            System.out.println(blad.getMessage());
        }



    }
}