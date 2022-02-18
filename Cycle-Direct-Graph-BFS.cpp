// Su dung BFS iiem tra do thi co huong co chu trinh hay khong
#include <bits/stdc++.h> 
using namespace std; 
//Tao lop do thi  
class Graph { 
    int V; // so luong dinh      
    list <int>* adj; //bieu dien danh sach ke  
public: 
    Graph(int V); // Constructor       
    void addEdge(int u, int v); //them canh vao do thi  
    bool isCycle(); //ham kiem tra chu trinh
};   
Graph::Graph(int V) { 
    this->V = V; //thiet lap tap dinh
    adj = new list<int>[V]; //thiet lap danh sach ke
} 
//them canh vao do thi
void Graph::addEdge(int u, int v) { 
    adj[u].push_back(v); 
}   
// kiem tra do thi co chu trinh hay khong 
bool Graph::isCycle() { 
    // tao vector luu ban dinh bac vao cua tung dinh
    // thiet lap ban dau  V dinh la 0
    vector<int> in_degree(V, 0);   
    // Traverse adjacency lists to fill indegrees of 
    // vertices. This step takes O(V+E) time 
    for (int u = 0; u < V; u++) { 
        for (int v : adj[u]) 
            in_degree[v]++; 
    } 
  
    // Create an queue and enqueue all vertices with 
    // indegree 0 
    queue<int> q; 
    for (int i = 0; i < V; i++) 
        if (in_degree[i] == 0) 
            q.push(i); 
  
    // Initialize count of visited vertices 
    int cnt = 0; 
  
    // Create a vector to store result (A topological 
    // ordering of the vertices) 
    vector<int> top_order; 
  
    // One by one dequeue vertices from queue and enqueue 
    // adjacents if indegree of adjacent becomes 0 
    while (!q.empty()) { 
  
        // Extract front of queue (or perform dequeue) 
        // and add it to topological order 
        int u = q.front(); 
        q.pop(); 
        top_order.push_back(u); 
  
        // Iterate through all its neighbouring nodes 
        // of dequeued node u and decrease their in-degree 
        // by 1 
        list<int>::iterator itr; 
        for (itr = adj[u].begin(); itr != adj[u].end(); itr++) 
  
            // If in-degree becomes zero, add it to queue 
            if (--in_degree[*itr] == 0) 
                q.push(*itr); 
  
        cnt++; 
    } 
  
    // Check if there was a cycle 
    if (cnt != V)  
        return true; 
    else
        return false; 
} 
  
// Driver program to test above functions 
int main() 
{ 
    // Create a graph given in the above diagram 
    Graph g(6); 
    g.addEdge(0, 1); 
    g.addEdge(1, 2); 
    g.addEdge(2, 0); 
    g.addEdge(3, 4); 
    g.addEdge(4, 5); 
  
    if (g.isCycle()) 
        cout << "Yes"; 
    else
        cout << "No"; 
  
    return 0; 
} 
