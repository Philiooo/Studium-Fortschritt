#include <stdio.h>

int sucheZeichen(const char s[], char c){

        int i = 0;
        int zaehler = 0;

        while(s[i]!='\0'){
                if(s[i]==c)zaehler++;
        i++;
        }
        return zaehler;
}

int main(){
        const char laenge=10;
        char string[laenge];
        char zeichen;
        int anzahl;

        printf("\nBitte gebe ein Wort ein: ");
        scanf("%s", &string);

        printf("\nBitte geben Sie ein Buchstaben ein: ");
        scanf(" %c", &zeichen);

        anzahl=sucheZeichen(string,zeichen);

        printf("\nIn %s kommt %c %i-mal vor.",string,zeichen,anzahl);

        return 0;
}
