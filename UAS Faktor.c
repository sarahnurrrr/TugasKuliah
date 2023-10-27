//Faktor suatu bilangan
#include <stdio.h>
#include <conio.h>


main(){
    int a,b;
    printf("Masukkan Angka:");
    scanf("%i", &a);
	if(a>=1&&a<=1000000)
	{
		printf("\n");
		printf("Hasil Faktorisasi:");
		printf("\n");

		for(b=a; b>=1; b--)
		{
			if(a%b == 0)
			{
				printf("%i\n", b);
			}
		}
	}
	else{
		printf("Maaf Batas bilangan bulat adalah 1<=N<=1.000.000");
		getch();
	}
    getch();
}
