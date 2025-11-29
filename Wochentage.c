#include <stdio.h>


int main(){
        int i;



        do{

        printf("1: Montag\n");
        printf("2: Dienstag\n");
        printf("3: Mittwoch\n");
        printf("4: Donnerstag\n");
        printf("5: Freitag\n");
        printf("6: Samstag\n");
        printf("7: Sonntag\n");
        printf("Auswahl:");
        scanf("%i", &i);

        switch(i){
                case 1: printf("Montag, da musst du arbeiten.\n");
                             break;
                case 2: printf("Dienstag, das musst du arbeiten.\n");
                              break;
                case 3: printf("Mittwoch, da musst du arbeiten.\n");
                               break;
                case 4: printf("Donnerstag, da muss gearbeitet werden.\n");
                                 break;
                case 5: printf("Freitag, da muss gearbeitet werden.\n");
                              break;
                case 6: printf("Samstag, da hast du frei.\n");
                              break;
                case 7: printf("Sonntag, da hast du frei.\n");
                              break;
                case 8: printf("Beenden!");
                        break;
                default:
                        printf("Wähle eine gültige Zahl\n");
        }
        }while(i!=8);


        return 0;
}
