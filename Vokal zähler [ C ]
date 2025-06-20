#include <stdio.h>

int vokal(char t[]){
        int zaehler = 0;

        for(int i=0;i<50;i++){
                switch(t[i]){
                        case 'A':
                        case 'a': zaehler++;break;
                        case 'E':
                        case 'e': zaehler++; break;
                        case 'I':
                        case 'i': zaehler++; break;
                        case 'O':
                        case 'o': zaehler++; break;
                        case 'U':
                        case 'u': zaehler++; break;
                }
        }
        return zaehler;
}
int main(){

        char text[50];

        printf("Bitte gebe einen Text ein: ");
        scanf("%[^\n]", &text);

        printf("Es sind %i Vokale.", vokal(text));

        return 0;

}
