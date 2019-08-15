package oop;

public class StudentExecution {
    public static void main(String[] args) {
        Studentinfo st = new Studentinfo();
        st.setAge(10);
        System.out.println(st.getAge());
        st.setName("Nusrat");
        System.out.println(st.getName());
        st.setDOB("02/02/1995");
        System.out.println(st.getDOB());

    }
}
