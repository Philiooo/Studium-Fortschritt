#include <stdio.h>
int main(){
        int x;
        int y;
        int sum=0;


        printf("Berechne x + y\n");

        printf("Bitte gebe eine Wert für x ein:");
        scanf("%i", &x);

        printf("Bitte gebe einen Wert für y ein:");
        scanf("%i", &y);

        sum=x+y;

        printf("\nDie Summe von %i und %i ist %i.\n",x,y,sum);

        return 0;
}
