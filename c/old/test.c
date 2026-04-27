#include <stdio.h>

int main() {
    int controle = 0, ind, num, menor;

    for (ind = 1; ind <= 51; ind++) {
        printf("Digite um número: ");
        scanf("%d", &num);
        controle++;

        if (controle == 1)
            menor = num;
        else
            if (num < menor)
                menor = num;
    }

    printf("Controle: %d\n", controle);
    printf("Índice: %d\n", ind);
    printf("Menor número: %d\n", menor);

    return 0;
}
