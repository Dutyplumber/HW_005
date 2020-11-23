public class Main {



    public static void main(String[] args){

        //Создать массив из 5  сотрудников

        Worker[] workers = new Worker[5];

        workers[0] = new Worker(
                "Фанис Абдурахманович Цой",
                "директор",
                "abdula@mail.ru",
                "0001",
                100,
                50
        );

        workers[1] = new Worker(
                "Лариса Ивановна Сюсь",
                "замдиректора",
                "sus@mail.ru",
                "0002",
                90,
                25
        );

        workers[2] = new Worker(
                "Мойша Займулатович Иванов",
                "бухгалтер",
                "moisha@mail.ru",
                "0003",
                50,
                45
        );

        workers[3] = new Worker(
                "Ляля Патрикеевна Смирнова",
                "уборщица",
                "lala@mail.ru",
                "0004",
                10,
                37
        );

        workers[4] = new Worker(
                "Петр Никанорович Горбунков",
                "слесарь",
                "petr@mail.ru",
                "0004",
                30,
                41
        );

        //С помощью цикла вывести информацию только о сотрудниках старше 40 лет

        for (int i=0; i < workers.length; i++){
            if (workers[i].getAge() > 40){workers[i].showInfo();}
        }



    }



}
