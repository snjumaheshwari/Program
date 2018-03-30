
// BFS ALGORITHM
def BFS(i):
	for j in range(1,n+1):
		visited[j]=0
		parent[j]=-1
	q=[]
	visited[i]=1
	q.append(i)
	while(q!=[]):
		j=q.pop(0)
		for (j,k) in Edge_set:
			if (visited[k]==0):
				visited[k]=1
				parent[k]=j
				q.append(k)

	
def BFS_2(i):
	for j in range(1,n+1):
		level[j]=-1
		parent[j]=-1
	q=[]
	level[i]=0
	q.append(i)
	while(q!=[]):
		j=q.pop(0)
		for (j,k) in Edge_set:
			if (level[k]==-1):
				level[k]=1+level[j]
				parent[k]=j
				q.append(k)

				
"""

for j in range(1,n+1):
	visited[j]=0
	parent[j]=-1
count=0

def dfs(i):
	visited[i]=1
	pre[i]=count
	count=count+1
	for (j,k) in Edge_set:
		if (visited[k]==0):
			parent[k]=j
			dfs(j)
			post[i]=count
			count=count+1
"""				
