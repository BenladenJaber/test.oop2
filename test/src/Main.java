public class Main {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.name = " Ahmad";
//        p.SayHello("ahmad");
//        p.name = " Ahmad";
//        System.out.println(p.name);
        Person p1 = new Person();
        p1.name = " Atta";
        p1.SayHello();// ----result ----->ata
        Person p2 = new Person();
        p2.name = "Essa";
        p2.SayHello(); //----result ----->essa
        Person p3 = p1;
        p3.name = " kamal";
        p3.SayHello();// ----result ----->ata
        p1.SayHello();// ----result ----->ata

        Person p4 = null;
        p4.name = "fares";
        p4.SayHello();//Exception  Cannot assign field "name" because "p4" is null;


    }
}