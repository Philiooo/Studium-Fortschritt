#include <stdio.h>

void funktion(int *a,int *b,int *x){

        int i=0;
        *a = x[0];
        *b = x[0];
        while(i<5){
                if(x[i] < *a){
                        *a = x[i];
                }
                if(x[i] > *b){
                        *b = x[i];
                }
                i++;
        }
}

int main(){

        int a;
        int b;
        int x[5];

        for(int i=0;i<5;i++){
                printf("Bitte geben Sie die %i.Zahl ein: ", i+1);
                scanf("%i", &x[i]);
        }

        funktion(&a,&b,x);

        printf("Die größte eingegebene Zahl ist %i, die kleinste %i", b,a);

        return 0;
}
