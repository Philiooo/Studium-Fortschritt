#include <stdio.h>

int main(){

        int alter, kategorie;

        printf("Bitte gebe dein Alter ein: ");
        scanf("%i", &alter);


        if(alter < 18){
                kategorie = 1;
        }else if(alter >= 18 && alter <= 65){
                kategorie = 2;
        }else if(alter > 65){
                kategorie = 3;
        }else{
                kategorie = 0;
        }

        switch(kategorie){
                case 1:
                        printf("Du bist minderjährig\n");
                        break;
                case 2:
                        printf("Du bist erwachsen\n");
                        break;
                case 3:
                        printf("Du bist Rentner\n");
                        break;
                default:
                        printf("ungültige eingabe\n");
        }
        return 0;
}
