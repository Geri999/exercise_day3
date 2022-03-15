package zad1;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Point x = new Point(4, 7);
        Point y = new Point(-4, 12);
        Point z = new Point(0, 17);
        double radius = 13;

        List<Shape> figures = new ArrayList<>();

        figures.add(new Circle(x,radius));
        figures.add(new Circle(y,radius));
        figures.add(new Triangle(x,y,z));
        figures.add(new Triangle(z,y,x));
        figures.add(new Section(z,y));

//        figures.forEach(Shape::printSummary);
        figures.forEach(shape->shape.printSummary(shape));
        //https://www.emathhelp.net/en/calculators/algebra-2/circle-calculator/
        //https://www.triangle-calculator.com/?what=vc


        String description = """
                
                1.	Stworzyć nowy projekt oparty o Maven. Projekt powinien używać Javy w wersji 17.
                2.	Stworzyć rekord Point reprezentujący punkt na płaszczyźnie
                    a.	składowymi rekordu powinny być współrzędne x i y (obydwie typu double)
                    b.	rekord powinien dodatkowo zawierać metodę o sygnaturze: String distance(Point p) służącą do wyliczania odległości od drugiego punktu
                3.	Utworzyć rekord Circle reprezentujący koło
                    a.	składowymi rekordu powinny być obiekt Point reprezentujący środek koła oraz wielkość typu double będąca promieniem koła
                    b.	konstruktor powinien sprawdzać czy przekazany promień nie jest ujemny - jeżeli jest to powinien zostać rzucony wyjątek
                4.	Dodać interfejs Shape reprezentujący ogólne możliwości figur na płaszczyźnie zawierający metodę String getArea() służącą do obliczenia pola powierzchni figury
                5.	Zaimplementować interfejs Shape w rekordzie Circle
                6.	Stworzyć abstrakcyjną klasę Polygon reprezentującą wielokąt o dowolnej liczbie wierzchołków.
                7.	Zaimplementować interfejs Shapew klasie Polygon
                8.	Uniemożliwić implementację interfejsu Shape innym klasom niż Circle i Polygon. W celu sprawdzenia czy blokada działa, spróbować dołożyć klasę Square reprezentującą kwadrat i sprawdzić że próba implementacji przez nią interfejsu Shape powoduje błąd
                9.	Stworzyć klasę Section reprezentującą odcinek (reprezentowany przez dwa punkty) i dziedziczącą po klasie Polygon
                10.	Stworzyć klasę Triangle reprezentującą trójkąt (reprezentowany przez trzy punkty) - również dziedziczącą po klasie Polygon
                11.	Zablokować możliwość dziedziczenia po klasie Polygon przez inne klasy niż Section i Triangle. Ponownie zweryfikować poprawność blokady próbując dziedziczyć po klasie Polygon w klasie Square
                12.	W interfejsie Shape dodać nową metodę String getDiameter() służącą do obliczenia średnicy koła opisanego na danej figurze
                    a.	Zapewnić domyślną implementację metody getDiameter()Implementacja powinna sprawdzać po kolei czy dane Shape jest typu Circle, Section czy Triangle i wypisywać dla jakiego obiektu została zawołana.
                    b.	W implementacji użyć instrukcji switch z wykorzystaniem pattern matching (konstrukcja z Javy 17)
                13.	Napisać testy jednostkowe do stworzonych klas
                """;
        System.out.println(description);

    }
}