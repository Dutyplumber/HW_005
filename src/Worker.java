

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Worker {

    String fio;
    String post;
    String email;
    String phone;
    int wage;
    int age;


    //Конструктор класса должен заполнять эти поля при создании объекта;

    public Worker (String fio, String post, String email, String phone, int wage, int age){
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }


    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

    public void showInfo(){
        System.out.println("ФИО сотрудника: " + fio);
        System.out.println("Пост сотрудника: " + post);
        System.out.println("Email сотрудника: " + email);
        System.out.println("Тел. сотрудника: " + phone);
        System.out.println("Зарплата сотрудника: " + wage);
        System.out.println("Возраст сотрудника: " + age+"\n");
    }

    //метод в классе, возвращающий значение возраста

    public int getAge()
    {
        return age;
    }

}
