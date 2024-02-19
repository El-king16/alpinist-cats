package CatAndMouse;
import CatAndMouse.Cat;
import CatAndMouse.Mouse;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cat ananas = new Cat(20, "Ананас", 6, 4);
        Cat chugyn = new Cat(15, "Чугун", 5, 1);
        Cat catboss = new Cat(3, "мистер Людвиг", 15, 0);

        Mouse m1 = new Mouse(20);
        Mouse m2 = new Mouse(25);
        Mouse m3 = new Mouse(14);
        Mouse m4 = new Mouse(6);
        int a;
        int mice;
        int attack;

        System.out.println("Выберите кота:\n1 - ананас\n2 - чугун\n3 - босс");
        int catChoise = sc.nextInt();
        switch (catChoise){
            case 1:
                System.out.println(ananas.getName()+", всего мышов: "+ananas.getTotal());
                System.out.println("Ваше действие? Погнатся за мышью - 1, Напасть на кота - 2");
                a = sc.nextInt();
                switch (a){
                    case 1:
                        System.out.println("За какой из 4х мышей хотите угнатся?");
                        mice = sc.nextInt();
                        switch (mice){
                            case 1:
                                if (ananas.getSpeed() > m1.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+ananas.getName());
                                    System.out.print(ananas.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 2:
                                if (ananas.getSpeed() > m2.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+ananas.getName());
                                    System.out.print(ananas.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 3:
                                if (ananas.getSpeed() > m3.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+ananas.getName());
                                    System.out.print(ananas.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 4:
                                if (ananas.getSpeed() > m4.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+ananas.getName());
                                    System.out.print(ananas.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                        }
                    case 2:
                        System.out.println("На кого нападаем? Чугунчик - 1, Людвик - 2");
                        attack = sc.nextInt();
                        switch (attack){
                            case 1:
                                if (ananas.getWeight() > chugyn.getWeight()){
                                    System.out.println("Вы отнимаете у кота "+chugyn.getName()+" "+ chugyn.getTotal()+" мышов");
                                    System.out.print("У вашего кота ");
                                    System.out.println(ananas.getTotal()+chugyn.getTotal());
                                    System.out.print("У противника ");
                                    System.out.println(chugyn.getTotal() - chugyn.getTotal());
                                }else {
                                    System.out.println("Вы дрищ :((");
                                }
                                break;
                            case 2:if (ananas.getWeight() > catboss.getWeight()){
                                System.out.println("Вы отнимаете у кота "+catboss.getName()+" "+ catboss.getTotal()+" мышов");
                                System.out.print("У вашего кота ");
                                System.out.println(ananas.getTotal()+catboss.getTotal());
                                System.out.print("У противника ");
                                System.out.println(catboss.getTotal() - catboss.getTotal());
                            }else {
                                System.out.println("Вы дрищ :((");
                            }
                            break;
                        }
                }
                break;
            case 2:
                System.out.println(chugyn.getName()+", всего мышов: "+chugyn.getTotal());
                System.out.println("Ваше действие? Погнатся за мышью - 1, Напасть на кота - 2");
                a = sc.nextInt();
                switch (a){
                    case 1:
                        System.out.println("За какой из 4х мышей хотите угнатся?");
                        mice = sc.nextInt();
                        switch (mice){
                            case 1:
                                if (chugyn.getSpeed() > m1.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+chugyn.getName());
                                    System.out.print(chugyn.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 2:
                                if (chugyn.getSpeed() > m2.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+chugyn.getName());
                                    System.out.print(chugyn.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 3:
                                if (chugyn.getSpeed() > m3.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+chugyn.getName());
                                    System.out.print(chugyn.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 4:
                                if (chugyn.getSpeed() > m4.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+chugyn.getName());
                                    System.out.print(chugyn.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                        }break;
                    case 2:
                        System.out.println("На кого нападаем? Ананас - 1, Людвик - 2");
                        attack = sc.nextInt();
                        switch (attack){
                            case 1:
                                if (chugyn.getWeight() > ananas.getWeight()){
                                    System.out.println("Вы отнимаете у кота "+ananas.getName()+" "+ ananas.getTotal()+" мышов");
                                    System.out.print("У вашего кота ");
                                    System.out.println(chugyn.getTotal()+ananas.getTotal());
                                    System.out.print("У противника ");
                                    System.out.println(ananas.getTotal() - ananas.getTotal());
                                }else {
                                    System.out.println("Вы дрищ :((");
                                }
                                break;
                            case 2:if (chugyn.getWeight() > catboss.getWeight()){
                                System.out.println("Вы отнимаете у кота "+catboss.getName()+" "+ catboss.getTotal()+" мышов");
                                System.out.print("У вашего кота ");
                                System.out.println(chugyn.getTotal()+catboss.getTotal());
                                System.out.print("У противника ");
                                System.out.println(catboss.getTotal() - catboss.getTotal());
                            }else {
                                System.out.println("Вы дрищ :((");
                            }
                                break;
                        }break;
                }
                break;
            case 3:
                System.out.println(catboss.getName()+", всего мышов: "+catboss.getTotal());
                System.out.println("Ваше действие? Погнатся за мышью - 1, Напасть на кота - 2");
                a = sc.nextInt();
                switch (a){
                    case 1:
                        System.out.println("За какой из 4х мышей хотите угнатся?");
                        mice = sc.nextInt();
                        switch (mice){
                            case 1:
                                if (catboss.getSpeed() > m1.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+catboss.getName());
                                    System.out.print(catboss.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 2:
                                if (catboss.getSpeed() > m2.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+catboss.getName());
                                    System.out.print(catboss.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 3:
                                if (catboss.getSpeed() > m3.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+catboss.getName());
                                    System.out.print(catboss.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                            case 4:
                                if (catboss.getSpeed() > m4.getSpeed()){
                                    System.out.println("Вы поймали мышу!!!");
                                    System.out.print("Теперь у "+catboss.getName());
                                    System.out.print(catboss.getTotal()+1);
                                    System.out.println("мышей");
                                }else {
                                    System.out.println("Мыш слишком быстрая");
                                }
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("На кого нападаем? Ананас - 1, Чугунчик - 2");
                        attack = sc.nextInt();
                        switch (attack){
                            case 1:
                                if (catboss.getWeight() > ananas.getWeight()){
                                    System.out.println("Вы отнимаете у кота "+ananas.getName()+" "+ ananas.getTotal()+" мышов");
                                    System.out.print("У вашего кота ");
                                    System.out.println(catboss.getTotal()+ananas.getTotal());
                                    System.out.print("У противника ");
                                    System.out.println(ananas.getTotal() - ananas.getTotal());
                                }else {
                                    System.out.println("Вы дрищ :((");
                                }
                                break;
                            case 2:if (catboss.getWeight() > chugyn.getWeight()){
                                System.out.println("Вы отнимаете у кота "+chugyn.getName()+" "+ chugyn.getTotal()+" мышов");
                                System.out.print("У вашего кота ");
                                System.out.println(catboss.getTotal()+chugyn.getTotal());
                                System.out.print("У противника ");
                                System.out.println(chugyn.getTotal() - chugyn.getTotal());
                            }else {
                                System.out.println("Вы дрищ :((");
                            }
                                break;
                        }break;
                }
                break;
        }
    }





}
