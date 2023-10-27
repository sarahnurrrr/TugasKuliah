#include<stdio.h>
#include<conio.h>

void main(){
int max=5;

for(int j=1; j<=max; j++){
	for(int i=1; i<=(max-j)+1; i++){
		printf("%i", i);
  	}
 	for(int i=j;i>1;i--){
  		printf("* ");
  	}
  	printf("\n");
}

}
