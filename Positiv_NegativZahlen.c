#include <stdio.h>

int positiv(int p[10]){

        int psum = 0;

        for(int i=0;i<10;i++){
                if(p[i] > 0){
                        psum += p[i];
                }
        }
        return psum;
}

int negativ(int p[10]){

        int nsum = 0;

        for(int i=0;i<10;i++){
                if(p[i] < 0){
                        nsum += p[i];
                }
        }
        return nsum;
}

int main(){

        int p[10];

        for(int i=0;i<10;i++){
                printf("Bitte geben Sie die %i.Zahl ein: ", i+1);
                scanf("%i", &p[i]);
        }
        printf("Die Summe der positiven Zahlen ist: %i\n", positiv(p));
        printf("Die Summe der negativen Zahlen ist: %i\n", negativ(p));

        return 0;

}
