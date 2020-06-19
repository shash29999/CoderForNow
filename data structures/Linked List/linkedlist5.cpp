// Deleting the nth node and Reverse using recursion
#include<bits/stdc++.h>
using namespace std;

struct  Node
{
    int data;
    Node* next;
};

Node* Insert(Node* Head, int pos, int val){
    Node* temp = new Node;
    temp->data = val;
    temp->next = NULL;    
    Node* temp1;
    temp1 = Head;      
    
    if(Head == NULL){
        
        Head = temp;
    }
    else
    {
        for(int i = 1; i < pos-1; i++){
            temp1 = temp1->next;
        }
        temp->next = temp1->next;
        temp1->next = temp;        
    }   
    return Head;   
}

void Print(Node* Head){
    cout<< "The list is:  ";
    while (Head != NULL)
    {
        cout << Head->data << " ";
        Head = Head->next;
    }
    cout << endl;
}
// Reverse using recursion
void Reverse(Node* Head){
    Node* temp = Head;
    if(temp == NULL){
        Head = temp;
        return;
    }

    Reverse(temp->next);
    Node* temp1 = temp;
    temp1->next = temp->next;
    temp->next = temp1;


}

int main(){
    srand(time(NULL));
    Node* Head = NULL;
    int n, x, pos = 0, wish = 1;
    cout<< "How many Numbers you want to Enter ? ";
    cin >> n;
    for(int i = 0; i < n; i++){
        pos++;
        x = rand()%100;
        Head = Insert(Head, pos, x);
        Print(Head);
    }    
    cout << "-----------------------------------------------------------------------------------------------------------------"  <<endl;
    cout<< "After Reversing : \n";  
    Reverse(Head);  
    Print(Head);
}