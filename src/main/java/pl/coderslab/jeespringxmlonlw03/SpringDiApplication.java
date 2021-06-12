package pl.coderslab.jeespringxmlonlw03;

// W uprzednio utworzonym projekcie dodaj plik konfiguracyjny Springa o nazwie beans.xml.
//Utwórz pakiety pl.coderslab.beans oraz pl.coderslab.app.
//Utwórz klasę SpringDiApplication z metodą main w pakiecie pl.coderslab.app.
//W metodzie main klasy SpringDiApplication utwórz obiekt kontekstu na podstawie konfiguracji.
//Uruchom i sprawdź działanie aplikacji.


// zad2
// Utwórz klasę HelloWorld w pakiecie pl.coderslab.beans z atrybutem typu String oraz nazwie message.
//Utwórz konstruktor ustawiający pole message, zdefiniuj gettery i settery.
//Utwórz ziarno w konfiguracji xml o nazwie helloWorld klasy pl.coderslab.beans.HelloWorld.
//Uzupełnij konfigurację ziaren, tak by wstrzyknąć za pomocą konstruktora do klasy HelloWorld dla atrybutu message wartość Witaj Spring.
//Pobierz ziarno w metodzie main a następnie wywołaj na nim metodę getMessage

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.jeespringxmlonlw03.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
        System.out.println(hw.getMessage());
        ctx.close();
    }
}
