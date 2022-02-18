// Kiem tra do thi co huong co chu trinh hay khong
#include<bits/stdc++.h>   
using namespace std; 
int V, E; //tap dinh va tap canh cua do thi
vector <int> *adj;//danh sach ke cua do thi
bool *visited;//danh dau cac dinh chua tham 
bool *recStack; //danh dau cac dinh chua tham 
void Graph_Adj(void) {	
	cin>>V>>E;//doc so dinh va so canh cua do thi;
	adj = new vector<int>[V+1];
	for(int i=0;i<E; i++){
		int u, v;//u, v la dinh dau,dinh cuoi cua canh
		cin>>u>>v;
		adj[u].push_back(v);//them v vao ke(u)
	}
} 
//thiet lap gia tri cho visited & RecStack
void Init(void) {
    bool *visited = new bool[V+1]; 
    bool *recStack = new bool[V+1]; 
    for(int i = 0; i < V; i++) { 
        visited[i] = false; 
        recStack[i] = false; 
    } 	
} 
// Ham duyet theo chieu sau: DFS(v)
bool DFS(int v) { 
    if(visited[v] == false) { 
        // danh dau dinh hien tai da tham nhu mot phan trong RecStack
        visited[v] = true; //danh dau dinh v da tham
        recStack[v] = true; //danh dau v thuoc RecStack  
        for(int i = 0; i<adj[v].size(); ++i) { 
            if ( !visited[adj[v][i]] && DFS(adj[v][i]) ) 
                return true; 
            else if (recStack[adj[v][i]]) 
                return true; 
        }   
    } 
    recStack[v] = false;  // loai dinh ra khoi reStack 
    return false; 
} 
/*
void DFS(int u) { //thuat toan DFS de qui
	cout<<u<<" "; chuaxet[u]=false;
	for(int v=0; v<adj[u].size(); v++){
		if(chuaxet[adj[u][v]]) 
			DFS(adj[u][v]);
	}
}*/
bool isCyclic() { 	
    for(int i = 0; i < V; i++) 
        if (DFS(i)) 
            return true;   
    return false; 
} 
 
int main() { 
    // V=4, E = 6
    Graph_Adj(); Init();
    if(isCyclic()) cout<<"True"<<endl;
    else cout<<"False"<<endl;    
    /*
    g.addEdge(0, 1); 
    g.addEdge(0, 2); 
    g.addEdge(1, 2); 
    g.addEdge(2, 0); 
    g.addEdge(2, 3); 
    g.addEdge(3, 3); */
} 
