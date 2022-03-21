#include<iostream>
#include<string>
#include<stack>
#include<locale>
using namespace std;

int pred(char s1){
    if(s1=='+' || s1=='-')
        return 1;
    else if (s1=='*' || s1=='/')
        return 2;
    else if(s1=='^')
        return 3;
    else
        return 0;
}

string infixToPostfix(string s){
    string postfix="";
    stack<char> stk;
    stk.push('#');
    string::iterator it;

    for(it=s.begin();it<=s.end();it++){
        if(isalnum(char(*it))){
            postfix+=*it;
        }
        else if(char(*it)=='('){
            stk.push('(');
        }
        else if(char(*it)=='^'){
            stk.push('^');
        }
        else if(char(*it)==')'){
            while(stk.top()!='#' && stk.top() != '('){
                postfix+=stk.top();
                stk.pop();
            }
            stk.pop();
        }
        else{
            if(pred(*it)>pred(stk.top())){
                stk.push(*it);
            }
            else{
                while(stk.top() !='#' && pred(*it)<=pred(stk.top())){
                    postfix+=stk.top();
                    stk.pop();
                }
                stk.push(*it);
            }
        }
    }

    while(stk.top() != '#'){
        postfix+=stk.top();
        stk.pop();
    }
    return postfix;
    
}

int main(){
    string s;
    cin>>s;
    
    string postfix=infixToPostfix(s);
    cout<<postfix<<endl;
    return 0;
}