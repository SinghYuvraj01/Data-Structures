#include <iostream>
using namespace std;

class Node
{
public:
    int value;
    Node *left;
    Node *right;

public:
    Node(int value)
    {
        this->value = value;
        this->left = NULL;
        this->right = NULL;
    }
};

// Function to do inorder traverasl
void inOrder(Node *head)
{
    Node *temp = head;
    if (temp == NULL)
    {
        return;
    }

    inOrder(temp->left);
    cout << temp->value << " ";
    inOrder(temp->right);
}

// Function to do inorder traverasl
void PreOrder(Node *head)
{
    Node *temp = head;
    if (temp == NULL)
    {
        return;
    }

    cout << temp->value << " ";
    PreOrder(temp->left);
    PreOrder(temp->right);
}

// Function to do inorder traverasl
void PostOrder(Node *head)
{
    Node *temp = head;
    if (temp == NULL)
    {
        return;
    }

    PostOrder(temp->left);
    PostOrder(temp->right);
    cout << temp->value << " ";
}

int main()
{
    Node *a = new Node(1);
    Node *b = new Node(2);
    Node *c = new Node(3);
    Node *d = new Node(4);
    Node *e = new Node(5);
    Node *f = new Node(6);

    a->left = b;
    a->right = c;
    b->left = d;
    b->right = e;
    c->left = f;

    // Funciton to do inOrder traversal
    void inOrder(Node * head);
    // inOrder(a);

    // Funciton to do PreOrder traversal
    void PreOrder(Node * head);
    // PreOrder(a);

    // Funciton to do PostOrder traversal
    void PostOrder(Node * head);
    PostOrder(a);

    return 0;
}