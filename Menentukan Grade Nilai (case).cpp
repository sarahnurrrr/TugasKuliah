#include <stdio.h>

int main()
{
int ipk;
printf("Input IPK Anda (1-4) :");
scanf("%i", &ipk);

switch(ipk)
{
	case 4:
	printf("Grade: Sangat Baik");
	break;
	case 3:
	printf("Grade: Baik");
	break;
	case 2:
	printf("Grade: Cukup");
	break;
	case 1:
	printf("Grade: Kurang");
	break;
	default:
	printf("IPK tidak masuk range");
}}
