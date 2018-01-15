/*
 * C Program to Check whether a given String is Palindrome or not 
 * using Recursion
 */
#include <stdio.h>
#include <string.h>
 
void check(char [], int);
 
int main()
{
    char word[15];
 
    printf("Enter a word to check if it is a palindrome\n");
    scanf("%s", word);
    check(word, 0);
 
    return 0;
}
 
void check(char word[], int index)
{
    int len = strlen(word) - (index + 1);
    if (word[index] == word[len])
    {
        if (index + 1 == len || index == len)
        {
            printf("The entered word is a palindrome\n");
            return;
        }
        check(word, index + 1);
    }
    else
    {
        printf("The entered word is not a palindrome\n");
    }
}
