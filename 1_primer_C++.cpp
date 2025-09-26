#include <iostream>
#include <vector>
#include <cctype> 
using namespace std;

int main() {
    vector<char> original = { 'a', '1', 'b', '2', 'c', '3' };
    vector<char> letters; 
    vector<char> numbers;

    for (char i : original) { 
        if (isalpha(i)) { 
            letters.push_back(i);
        }
        else if (isdigit(i)) {  
            numbers.push_back(i); 
        }
    }

    original.clear(); 

    for (char i : letters) { 
        cout << i;
    }
    cout << endl;

    for (char i : numbers) {
        cout << i;
    }
    cout << endl;

    return 0;
}
