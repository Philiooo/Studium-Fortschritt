#include <stdio.h>

int main(){
        int zahl;
        int n;

        printf("Wieviele Zahlen sollen eingegeben werden: ");
        scanf("%i", &zahl);

        int zahlen[zahl];

        for(int i=0;i<zahl;i++){
                printf("Bitte gebe %i-tes Element ein: ", i+1);
                scanf("%i", &zahlen[i]);
        }

        printf("Die eingegebenen Werte heißen: ");
        for(int i=0;i<zahl;i++){
                printf("%i, ", zahlen[i]);
        }

        return 0;
}
