#include <stdio.h>

int func(int *a, int *b){

        int tmp = *b;
        *b=*a;
        *a=tmp;
}

int main(){

        int a,b;

        printf("Bitte gebe die 1.Zahl ein: ");
        scanf("%i",&a);

        printf("Bitte gebe die 2.Zahl ein: ");
        scanf("%i",&b);

        printf("\nVor dem Tausch: %i %i\n",a,b);

        func(&a,&b);

        printf("Nach dem Tauschen: %i %i\n",a,b);

        return 0;
}
