#include <stdio.h>

int main(){

        int geheimzahl = 42;
        int versuch = 3;
        int zahl;

        printf("Wilkommen beim Zahlenraten\n");

        while(versuch>0){
                printf("Gib deine Zahl ein: ");
                scanf("%i", &zahl);

                if(zahl == geheimzahl){
                        printf("Juhuu, du hast die Zahl erfolgreich erraten\n");
                        return 0;
                }else{
                        versuch--;
                        if(versuch > 0){
                                printf("Falsch, versuche es erneut. Du hast noch %i Versuch(e)\n", versuch);
                        }else{
                                printf("Falsch, keine Versuche mehr übrig. Die richtige Zahl war %i\n", geheimzahl);
                        }
                }
        }
        return 0;
}
