package mentoring;

public class TutorialExecution {
    public static void main(String[] args) {
        Tutorial01 tu = new Tutorial01();
        tu.name= "nusrat";
        System.out.println(tu.name);
        System.out.println(tu.id);
        HIddenConstructor hidden = new HIddenConstructor();

        System.out.println(hidden.School);



    }
}
