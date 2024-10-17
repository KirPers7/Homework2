public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        System.out.println(boxerFirst + boxerSecond);
        System.out.println(boxerSecond - boxerFirst);
        System.out.println();

        //Задача 7
        System.out.println("Задача 7");
        System.out.println(boxerSecond%boxerFirst);
        System.out.println();

        //Задача 8
        System.out.println("Задача 8");
        var employeesCount = 640/8;
        System.out.println("Всего работников в компании - " + employeesCount + " человек");
        employeesCount = 94;
        System.out.println("Если в компании работает " + employeesCount + " человек, то всего " + employeesCount*8 + " часов работы может быть поделено между сотрудниками");
    }
}