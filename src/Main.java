import javax.print.attribute.standard.Severity;
public class Main {
    public static void main(String[] args) {
        var dog =8.0;
        System.out.println(dog);
        var cat =3.6;
        System.out.println(cat);
        var paper =763789;
        System.out.println(paper);
         dog = dog + 4;
        System.out.println(dog);
        cat = 3.6 + 4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog =3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var TheFirstBoxer = 78.2;
        var SecondBoxer = 82.7;
        System.out.println("общая масса двух бойцов" + (TheFirstBoxer + SecondBoxer));
        System.out.println("разница масс двух бойцов" + (SecondBoxer - TheFirstBoxer));
        System.out.println("вычетание из большей массы меньшей" + (SecondBoxer - TheFirstBoxer));
        System.out.println( "функция остаток от деления" + (SecondBoxer % TheFirstBoxer));
        var WorkingHours = 640;
        var EachEmployee = 8;
        System.out.println( "всего работников в компании -" +(WorkingHours / EachEmployee)+"человек");
        var PersonWorks = 80 + 94;
        System.out.println(PersonWorks);
        var EachEmpLoyee = 8;
        System.out.println("если в компании работает" + PersonWorks + "человек,то всего" + (PersonWorks * EachEmpLoyee) + "часов работы может быть поделено между сотрудниками ");

    }
}