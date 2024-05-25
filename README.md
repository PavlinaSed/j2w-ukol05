# Task 5

Create a registration page for a summer camp for children. The page will contain a form, after submitting the form it will be validated. If the form is in order,
a page will be displayed with a recap of the information entered. If there is any error in the form, the form will be displayed again, the data entered by the user in the form will be filled in
and an error message will be displayed for the fields with errors.

1. Use this repository as a template from which to create a repository in your GitHub account, or continue with your assignment from the lesson.
1. Clone the repository **from your GitHub account** to your local machine.
1. Launch the cloned application and open the [http://localhost:8080/](http://localhost:8080/) page in your browser. You will see a page with the text "TODO".
1. Create a container (Java Bean) to store the `RegistrationForm` data. Store the gender and the selected tour as `String`, choose some code for the tour - e.g. `tour-1`, `tour-2`, etc.
1. Create a controller method that will receive form data in `RegistrationForm`.
1. Create an HTML form with the following data. The appearance of the form doesn't matter that much, but if you want to create a quite usable form without writing styles,
   you can use the Bootstrap library.
   Participant (child) information:
   * name (required)
   * last name (required)
   * date of birth (required)
   * gender (boy/girl - mandatory)
   * tour (e.g. 5th to 11th July, 12th to 18th July, 19th to 25th July - mandatory)
   * email to parents (optional)
   * phone number of parent (optional)
1. Configure the validation data from the form in Java.
1. Check the following conditions in the controller method. If they are not met, cause the appropriate error message to be printed for the appropriate field.
   * Age between 9 and 15 years (inclusive) - recall the code for calculating the age:
     ```java
     Period period = birthDate.until(LocalDate.now());
     int age = period.getYears();
     ```
1. Create a page to display the registration recap. You can copy the form page and use `span`s instead of `inputs`, or set the `readonly` attribute to the inputs.






# Úkol 5

Vytvoř stránku pro registraci na letní dětský tábor. Stránka bude obsahovat formulář, po jeho odeslání se provede validace. Pokud bude formulář v pořádku,
zobrazí se stránka s rekapitulací zadaných údajů. Pokud bude ve formuláři nějaká chyba, zobrazí se znovu formulář, údaje zadané uivatelem v něm budou vyplněné
a u políček s chybou bude vypsána chybová zpráva.  

1. Použij toto repository jako šablonu (Use this template), ze které si vytvoříš repository ve svém účtu na GitHubu, případně pokračuj ve svém úkolu z lekce.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Spusť si naklonovanou aplikaci a otevři v prohlížeči stránku [http://localhost:8080/](http://localhost:8080/). Zobrazí se stránka s textem „TODO“.
1. Vytvoř přepravku (Java Bean) pro uložení údajů formuláře `RegistraceForm`. Pohlaví a zvolený turnus ukládej jako `String`, pro turnus zvol nějaký kód – např. `turnus-1`, `turnus-2` apod.
1. Vytvoř metodu controlleru, která bude přijímat údaje z formuláře v `RegistraceForm`.
1. Vytvoř HTML formulář s následujícími údaji. Na vzhledu formuláře tolik nezáleží, pokud ale chceš bez psaní stylů vytvořit docela použitelný formulář,
   můžeš použít knihovnu Bootstrap.
   Údaje o účastníkovi (dítěti):
   * jméno (povinný údaj)
   * příjmení (povinný údaj)
   * datum narození (povinný údaj)
   * pohlaví (chlapec/dívka – povinný údaj)
   * turnus (např. 5. až 11. července, 12. až 18. července, 19. až 25. července – povinný údaj)
   * e-mail na rodiče (volitelný údaj)
   * telefon na rodiče (volitelný údaj)
1. Nakonfiguruj validaci údaj z formuláře v Javě.
1. V metodě controlleru zkontroluj následující podmínky. Pokud nebudou splněné, zařiď, aby se u příslušného políčka vypsala odpovídající chybová zpráva. 
   * věk mezi 9 a 15 roky (včetně) – připomínám kód pro výpočet věku:
     ```java
     Period period = birthDate.until(LocalDate.now());
     int vek = period.getYears();
     ```
1. Vytvoř stránku pro zobrazení rekapitulace registrace. Můžeš zkopírovat stránku s formulářem a místo `input`ů použít `span`y, případně inputům nastav atribut `readonly`.   
1. Zkontroluj, zda vše funguje.
1. *Commitni* a *pushnni* změny (výsledný kód) do svého repository na GitHubu.
1. Vlož odkaz na své repository jako řešení úkolu na portálu [Moje Czechitas](https://moje.czechitas.cz).

## Bootstrap
Pokud chceš vytvořit formulář, který bude vypadat docela rozumně, a nechceš vytvářet vlastní styly, můžeš použít [Bootstrap](https://getbootstrap.com/). Popis
vložení Bootstrapu do stránky je v dokumentaci na stránce [Introduction](https://getbootstrap.com/docs/5.2/getting-started/introduction/). Důležité je do
hlavičky stránky vložit element `<link>`odkazující na `bootstrap.min.css` (v kódu bude celá cesta, tak, jak je uvedená na stránkách Bootstrapu). Stránka dále
popisuje vložení JavaScriptové knihovny používané Bootstrapem, ta není pro formuláře potřeba.

Na další stránce je popis [formulářů v Bootstrapu](https://getbootstrap.com/docs/5.2/forms/overview/). Obvykle stačí najít si v dokumentaci vzorový kód, ten si
zkopírovat do své stránky a upravit jej – zejména upravit texty a atributy `name` a `id` u elementů `<input>` a atrinbut `for` u elementů `<label>`.

## Odkazy

* odkaz na stránku [Lekce 6](https://java.czechitas.cz/2023-podzim/java-2-online/lekce-6.html)
* Java SE 17 [Javadoc](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/) – dokumentace všech tříd, které jsou součástí základní Javy ve verzi 17.
* Dokumentace [Spring Boot](https://spring.io/projects/spring-boot#learn) – odsud je anotace `@SpringBootApplication` a třída `SpringApplication`.
* Dokumentace [Spring Framework](https://spring.io/projects/spring-framework#learn) – odsud jsou anotace `@Controller`, `@GetRequest` a třída `ModelAndView`.
* Dokumentace [Freemarker](https://freemarker.apache.org/docs/) – šablonovací systém pro HTML použitý v projektu.
* Dokumentace [podpora java.time pro Freemarker](https://github.com/lazee/freemarker-java-8) – knihovna pro použití `java.time` tříd ve Freemarkeru.
* Dokumentace [HTML formulářů](https://developer.mozilla.org/en-US/docs/Learn/Forms)
* [Bootstrap](https://getbootstrap.com) – jeden z CSS frameworků
* [Bootstrap Icons](https://icons.getbootstrap.com) – sada ikon pro použití na webu
* [Unsplash](https://unsplash.com) – obrázky a fotografie k použití zdarma
