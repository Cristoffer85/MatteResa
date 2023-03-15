/*
Du bor i Göteborg och vill köpa en TV.
* En butik i Varberg erbjuder 15% rabatt på en cool TV till priset 6990:- Men då får du alltså köra från Göteborg till Varberg, för att handla det i butiken.
* En butik i Göteborg erbjuder samma modell till priset 7200:-
* Bilen drar 8 liter per 10 mil.Med tanke på att bensinen kostar 16.53 och det är 76 kilometer till Varberg, hur mycket sparar du om du åker till Varberg?

Lägg upp all data i variabler och räkna ut priset på TVn om du åker till Varberg.
*/

public class Main {
    public static void main(String[] args) {

// Deklarera variabler
double bensinpris = 16.53;
double bensinforbrukning = 8;
double kmTillVarberg = 76;
double prisVarberg = 6990;
double prisGoteborg = 7200;

// Räkna ut priset på TVn om du åker till Varberg
        double prisVarbergMedBensin = (bensinpris * (kmTillVarberg/10) * (bensinforbrukning/10) + prisVarberg);
        double varbergMedBensinAndBack = (bensinpris * ((kmTillVarberg *2) /10) * (bensinforbrukning/10) + prisVarberg);

// Skriv ut priset på TVn om du åker till Varberg
        System.out.println("Priset på TVn om du åker till Varberg är: " + prisVarbergMedBensin);
        System.out.println("Priset på TVn om du åker till Varberg och tillbaka är: " + varbergMedBensinAndBack);

// Skriv ut priset på TVn om du köper den i Göteborg
        System.out.println("Priset på TVn om du köper den i Göteborg är: " + prisGoteborg);
    }
}
