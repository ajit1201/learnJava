// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

string keyequate(string key, string text){
    int len = text.size();
	int len2 = key.size();
	int i = 0;
	while(key.size() != len){
	key.push_back(key[i%len]);	
	i++;
	}
	return key;
}

string encrypt(string text, string key){


	string encry;
	int len = text.size();
	for(int i = 0; i < len; i++){
	    char c = (text[i] + key[i])%26;
	    c += 'A';
	    encry.push_back(c);
	}
	return encry;
}

string decrypt(string text, string key){
    string decrypt;
    int len = text.size();
    for(int i = 0; i < len; i++){
        char c = (text[i] - key[i] + 26)%26;
        c += 'A';
        decrypt.push_back(c);
    }
    return decrypt;
}


int main() {
    // Write C++ code here
    // std::cout << "Hello world!";
    
    string text = "GEEKSFORGEEKS";
    string key = "AYUSH";
    string key1 = keyequate(key, text);
    string encryption = encrypt(text, key1);
    cout<<key1<<endl;
    cout<<encryption<<endl;
    cout<<decrypt(encryption, key1)<<endl;
    
    return 0;
}
