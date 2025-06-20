#include <stdio.h>

int main(){

        int a, b, zahl;

        printf("Bitte gebe einen Wert ein: ");
        scanf("%i", &a);

        printf("Bitte gebe einen Wert ein: ");
        scanf("%i", &b);

        printf("____________________________\n");
        printf("1. +  \n");
        printf("2. -  \n");
        printf("3. *  \n");
        printf("4. /  \n");
        printf("Bitte gebe eine Zahl ein: ");
        scanf("%i",&zahl);
        printf("____________________________\n");

        switch(zahl){
                case 1:
                        printf("%i + %i = %i\n", a,b,a+b);
                        break;
                case 2:
                        printf("%i - %i = %i\n", a,b,a-b);
                        break;
                case 3:
                        printf("%i * %i = %i\n", a,b,a*b);
                        break;
                case 4:
                        if(b == 0){
                                printf("Fehler: Division durch 0 ist nicht erlaubt\n");
                        }else{
                                printf("%i / %i = %i\n", a,b,a/b);
                        }
                        break;
                default:
                        printf("Falsche eingabe\n");
        }
        return 0;
}
