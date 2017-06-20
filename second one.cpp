using namespace std;
 
int main(){
    
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    long long n;
    cin >> n;
    
    pair<long long,pair<long long,long long> > p[n];
    for(long long i=0;i<n;i++){
        
        cin >> p[i].second.second;
        p[i].first = abs(p[i].second.second);
        
        if(p[i].second.second > 0)
        p[i].second.first = 0;
        else
        p[i].second.first = 1;
    }
    
    sort(p,p+n);
    
    for(long long i=0;i<n;i++){
        
        cout << p[i].second.second << " ";
    }
} 