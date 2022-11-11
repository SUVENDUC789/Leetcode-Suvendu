int check(char ch)
{
    char punch[] = "!\"#$%%&'()*+, -./:;<=>?@[\\]^_`{|}~";
    for (int i = 0; i < strlen(punch); i++)
    {
        if (punch[i] == ch)
        {
            return 1;
        }
    }
    return 0;
}
void Parse(char *p)
{
    int ln = 0;
    int index = 0;
    for (int i = 0; i < strlen(p); i++)
    {
        if (check(p[i]))
        {
            ln = 1;
            continue;
        }

        else if (!check(p[i]))
        {
            ln = 0;
        }

        if (ln == 0)
        {
            p[index] = p[i];
            index++;
        }
    }
    p[index] = '\0';

    for (int i = 0; i < strlen(p); i++)
    {
        if (!((p[i] >= 97) && (p[i] <= 122)))
        {
            p[i] += 32;
        }
    }
}

bool isPalindrome(char * p){
    Parse(p);
    for (int i = 0; i < strlen(p) / 2; i++)
    {
        if (p[i] != p[strlen(p) - 1 - i])
        {
            return false;
        }
    }
    return true;

}