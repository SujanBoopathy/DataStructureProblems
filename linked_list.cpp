#include<iostream>
using namespace std;

class Node{
    public:
        int data;
        Node* next=nullptr;
};
void pushNode(Node** h,int data){
    Node* newNode=new Node();

    newNode->data=data;
    newNode->next=(*h);
    *h=newNode;

}
void popNode(Node** h){
    if(*h!=nullptr){
        Node* t=*h;
        *h=t->next;
        delete t;
    }
}
void printNode(Node** h){
    Node* t=*h;
    while(t->next){
        cout<<t->data<<"\t";
        t=t->next;
    }
}
int main(){
    Node* head=new Node();
    int exit=0,choice,data;
    do{
        cout<<"\nImplementation of Linked List : \n1.push() \n2.pop() \n3.display()\n Enter choice:";
        cin>>choice;
        switch(choice){
            case 1:
                cin>>data;
                pushNode(&head,data);
                break;
            case 2:
                popNode(&head);
                break;
            case 3:
                printNode(&head);
                break;
            default:
                cout<<"Invalid choice"<<endl;
        }
        cout<<"\nDo you want to quit(1|0) :";
        cin>>exit;
    }while(exit!=1);


    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int data;
        cin>>data;
        pushNode(&head,data);
    }
    printNode(&head);
    popNode(&head);
    printNode(&head);
    return 0;
}