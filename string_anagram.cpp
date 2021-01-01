// C++ program to check if two strings
// are anagrams of each other
#include <bits/stdc++.h>
using namespace std;
 
bool isAnagram(string c, string d)
{
    if (c.size() != d.size())
        return false;
    int count = 0;
 
    // Take sum of all characters of first String
    for (int i = 0; i < c.size(); i++) {
        count += c[i];
    }
 
    // Subtract the Value of all the characters of second
    // String
    for (int i = 0; i < d.size(); i++) {
        count -= d[i];
    }
 
    // If Count = 0 then they are anagram
    // If count > 0 or count < 0 then they are not anagram
    return (count == 0);
}
 
// Driver code
int main()
{
    char str1[] = "geeksforgeeks";
    char str2[] = "forgeeksgeeks";
   
    // Function call
    if (isAnagram(str1, str2))
        cout << "The two strings are anagram of each other";
    else
        cout << "The two strings are not anagram of each "
                "other";
 
    return 0;
}
