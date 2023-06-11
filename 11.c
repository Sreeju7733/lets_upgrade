#include <stdio.h>

void reverseString(char *str) {
  int len = strlen(str);
  char temp;
  for (int i = 0, j = len - 1; i < j; i++, j--) {
    temp = str[i];
    str[i] = str[j];
    str[j] = temp;
  }
}

int main() {
  char str[100];
  scanf("%s", str);
  reverseString(str);
  printf("%s", str);
  return 0;
}
