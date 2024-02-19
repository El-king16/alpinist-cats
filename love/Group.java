package love;
import love.Mount;
import love.People;
import java.util.Scanner;
import java.util.ArrayList;


public class Group {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);



            System.out.println("Идет ли набор в группу или нет?");
            String a = sc.nextLine();
            if (a.equalsIgnoreCase("да") || a.equalsIgnoreCase("lf")){

                    System.out.println("Выберите одну из трёх групп(1, 2, 3, 0 - выход), чтобы добавить нового члена группы:");
                    int b = sc.nextInt();


                                switch (b) {
                                        case 1:
                                                oneArr();
                                                break;
                                        case 2:
                                                twoArr();
                                                break;
                                        case 3:
                                                threeArr();
                                                break;
                                        case 0:
                                                System.exit(0);
                                        default:
                                                System.out.println("Неверный выбор!");

                                }


            }
    }
    private static void oneArr(){

            Mount elbrus = new Mount("Эльбрус", "Россия", 5600);


            People[] firstGroup = new People[3];
            firstGroup[0] = new People("Бобер", 52, "Варшава");
            firstGroup[1] = new People("Маления", 1000, "Элден");
            firstGroup[2] = new People("Влад", 23, "Омск");
            if (firstGroup[0] == null || firstGroup[1] == null || firstGroup[2] == null){
                    System.out.println("Новый член группы:");

                    People newp = new People("Игорь", 33, "Минск");
                    firstGroup[2] = newp;
                    System.out.println(newp.getName()+"!");

            }else {
                    System.out.println("Группа переполнена!");
            }
            System.out.println("Все члены первой группы:");
            for (People f : firstGroup){
                    System.out.println(f.getName()+", "+f.getAge()+" лет, из города "+f.getAddress());

            }
            System.out.println("Отправляются на гору: "+elbrus.getName()+", в стране: "+elbrus.getCountry());
    }
    private static void twoArr(){

            Mount everest = new Mount("Эверест", "Тибет", 8800);


            People[] secondGroup = new People[3]; //vtoraya gruppa
            secondGroup[0] = new People("Саня", 17, "Санкт-Петербург");
            secondGroup[1] = new People("Фуфeлшмерц", 40, "Денвиль");
            secondGroup[2] = null;

            if (secondGroup[0] == null || secondGroup[1] == null || secondGroup[2] == null){
                    System.out.println("Новый член группы:");

                    People newp = new People("Игорь", 33, "Минск");
                    secondGroup[2] = newp;
                    System.out.println(newp.getName()+"!");
            }else {
                    System.out.println("Группа переполнена!");
            }
            for (People f : secondGroup){
                    System.out.println(f.getName()+", "+f.getAge()+" лет, из города "+f.getAddress());

            }
            System.out.println("Отправляются на гору: "+everest.getName()+", в стране: "+everest.getCountry());
    }
    private static void threeArr(){

            Mount alpes = new Mount("Альпы", "Швейцария", 4800);

            People[] thirdGroup = new People[3]; //третья группа

            thirdGroup[0] = new People("Гарри", 21, "Нью-Йорк");
            thirdGroup[1] = new People("Филл", 29, "Хельсинки");
            thirdGroup[2] = null;

            if (thirdGroup[0] == null || thirdGroup[1] == null || thirdGroup[2] == null){
                    System.out.println("Новый член группы:");

                    People newp = new People("Игорь", 33, "Минск");
                    thirdGroup[2] = newp;
                    System.out.println(newp.getName()+"!");
            }else {
                    System.out.println("Группа переполнена!");
            }
            for (People f : thirdGroup){
                    System.out.println(f.getName()+", "+f.getAge()+" лет, из города "+f.getAddress());

            }
            System.out.println("Отправляются на гору: "+alpes.getName()+", в стране: "+alpes.getCountry());
    }

}
