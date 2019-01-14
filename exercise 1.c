#include <stdio.h>

int main ( int argc, char** argv )
{
	printf("Number of argumetns: ");
	printf("%d\n", argc);
	printf("without program name: ");
	printf("%d\n", argc -1);
	return 0;
}