#include <stdio.h>

long faku(int n){
        long erg = 1;

        printf("Aufruf für %i\n");

        if (n==0){
                printf("\nRücklauf beginnt");
                return 1;
        }
        else{
                erg = n*faku(n-1);
                printf("\nRücklauf: Wert = %li", erg);
                return erg;
        }
}
int main(){
        int wert;
        printf("\nBitte Wert eingeben: ");
        scanf("%i", &wert);

        printf("\nDie Fakultät von %i ist %ln\n", wert, faku(wert));
        return 0;
}
