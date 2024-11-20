package com.skypro;

public class Main {

    public static void main(String[] args) {
        // Task #1
        /*У нашего банка есть сайт, на который можно зайти с компьютера или телефона, а также мобильное приложение.
        Каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему ссылку на скачивание приложения.
        Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение
        для обоих вариантов. Объявите переменную clientOS, которая равна 0 или 1. Где 0 — iOS, 1 — Android.
        При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
        Например, для iOS оно будет звучать так: «Установите версию приложения для iOS по ссылке».
        А для Android так: «Установите версию приложения для Android по ссылке».*/

        int clientOs = 0;

        switch (clientOs) {
            case 0 -> System.out.println("Install IOS version from the link");
            case 1 -> System.out.println("Install Android version from the link");
        }
     /* or like this, but switch looks like more beautiful
        if (clientOs == 1) {
            System.out.println("Install Android version from the link");
        } else if (clientOs == 0) {
            System.out.println("Install IOS version from the link");
        }*/

        // Task #2
        /*Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
        Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
        Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту
        при наличии двух условий — операционной системы телефона (iOS или Android) и года производства.
        Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
        Например, для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
        А для Android так: «Установите облегченную версию приложения для Android по ссылке».
        При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
        Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать любой желаемый год.
        **Важно**: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).*/

        int clientDeviceYear = 2013;
        boolean okDeviceYear = clientDeviceYear >= 2015 && clientDeviceYear <= 2022;

        if (okDeviceYear) {
            if (clientOs == 1) {
                System.out.println("Application will work correctly for Android");
            } else if (clientOs == 0) {
                System.out.println("Application will work correctly for IOS");
            }
        } else if (!okDeviceYear) {
            if (clientOs == 1) {
                System.out.println("Install light version for Android from link");
            } else if (clientOs == 0) {
                System.out.println("Install light version for IOS from link");
            }
        }
        // Task #3
        /*Напишите программу, которая определяет, является ли год високосным или нет.
        Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
        Программа должна определять, високосный год или нет, и выводить соответствующее сообщение: «... год является високосным».
        или «... год не является високосным».
        Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год.*/

        int year = 2000;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year isn't a leap year");
        }

        // Task #4
        /*Для наших клиентов мы организуем доставку банковских карт на дом с четкой датой доставки.
        Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
        Правила доставки такие:
        Доставка в пределах 20 км занимает сутки.
        Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        Напишите программу, которая выдает сообщение в консоль:
        "Потребуется дней: " + срок доставки
        Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.*/

        int deliveryDistance = 50;
        int deliveryDay = 1;

        boolean zone1 = deliveryDistance <= 20;
        boolean zone2 = deliveryDistance > 20 && deliveryDistance < 60;
        boolean zone3 = deliveryDistance >= 60 && deliveryDistance <= 100;

        if (zone1) {
            System.out.println("It will takes: " + deliveryDay + " day");
        } else if (zone2) {
            deliveryDay += 1;
            System.out.println("It will takes: " + deliveryDay + " day");
        } else if (zone3) {
            deliveryDay += 2;
            System.out.println("It will takes: " + deliveryDay + " day");
        }

        // Task #5
        /*Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        Например, 1 месяц (он же январь) принадлежит к сезону зима.
        Для написания программы используйте оператор switch.
        Для обозначения номера месяца используйте переменную monthNumber = 12.
        Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).*/

        int monthNumber = 5;

        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Is winter");
            case 3, 4, 5 -> System.out.println("Is spring");
            case 6, 7, 8 -> System.out.println("Is summer");
            case 9, 10, 11 -> System.out.println("Is Autumn");
            default -> System.out.println("This month not exist");
        }
    }
}
