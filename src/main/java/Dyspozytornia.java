import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.UUID.randomUUID;

public class Dyspozytornia {
    Map<String,Zgloszenie> mapaZgloszen = new HashMap<>();

    public void dodajZgloszenie(String tresc, TypZgloszenia typZgloszenia){
//        - dodajZgloszenie(String tresc, TypZgloszenia typ):void
//        - która tworzy nową instancję "Zgłoszenia" i dodaje je do mapy
//                (spróbuj wymyślić unikalny identyfikator zgłoszenia)
//        Wskazówka:  http://www.baeldung.com/java-uuid
        Zgloszenie zgloszenie = new Zgloszenie(typZgloszenia,tresc,LocalTime.now());
   mapaZgloszen.put(String.valueOf(randomUUID()),zgloszenie);
    }

  // public List<Zgloszenie> zwróćNajaktualniejszeZgłoszenia(){
//        zwróćNajaktualniejszeZgłoszenia(int ilosc):List<Zgłoszenie> -
// metoda która sortuje zgłoszenia po czasie i zwraca 'ilość' zgłoszeń z parametru.

 //   }

//   List<Zgloszenie> zwróćZgłoszeniaTypu(TypZgloszenia typZgloszenia){
//
//   }
}
