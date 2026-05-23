//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

                var dog = 8.0;
                System.out.println(dog);
                dog = dog + 4.0;
                System.out.println(dog);
                dog = dog - 3.5;
                System.out.println(dog);

                var cat = 3.6;
                System.out.println(cat);
                cat = cat + 4.0;
                System.out.println(cat);
                cat = cat - 1.6;
                System.out.println(cat);


            var paper = 763789;
            System.out.println(paper);
            paper = paper + 4;
            System.out.println(paper);
            paper = paper - 7639;
            System.out.println(paper);

            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);

            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog  / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);

            var a = 82.7;
            var b = 78.2;
            var result = a + b;
            System.out.println("Общая масса" + result + "кг!");

            var x = 82.7;
            var y = 78.2;
            var weightDifference = x - y;
            System.out.println("Разница между массами" + weightDifference + "кг!");

            var n = 82.7;
            var m = 78.2;
            var remains = n % m;
            System.out.println("Остаток от деления между двумя весами" + remains + "кг!");

            var openingHours = 640;
            var hour = 8;
            var workers = openingHours / hour;
            System.out.println("Всего работников в компании - " + workers);

            var human = 80;
            var more = 94;
            var hours = 8;
            var general = human + more;
            var generalHours = general * hours;
            System.out.println("Если в компании работает  " + general + " человек, то всего " + generalHours + " часов работы может быть поделено между сотрудниками");




    }
}