# This code is proven correct...

def fun_game(list,k):
	""" choose k item from list one max other min and so on """
	list.sort()
	n=0
	start=0
	end=len(list)-1
	sum=0
	while(k!=n):
		if(n%2!=0):
			item=list[start]
			start=start+1
		else :
			item=list[end]
			end=end-1
		n=n+1
		sum=sum+item
	return sum
	
def cc(Graph,n):
	""" find the connected components of a graph with n vertices"""
	connected_components=[]
	not_visited=list(range(n))
	while(not_visited):
		connected_list=[]
		i=not_visited.pop()
		connected_list.append(i)
		q=[]
		q.append(i)
		while(q!=[]):
			j=q.pop(0)
			for i in range(n):
				if (Graph[i][j]==1):
					if i in not_visited:
						q.append(i)
						not_visited.remove(i)
						connected_list.append(i)
		connected_components.append(connected_list)
	#print("connected components :" ,connected_components)
	return connected_components

def p():
	n,m,K=map(int,input().split())
	Graph=[[0]*n for i in range(0,n)]
	for i in range(m):
		a,b=map(int,input().split())
		a,b=a-1,b-1
		Graph[a][b]=Graph[b][a]=1
	#print(Graph)
	musuem=list(map(int,input().split()))
	connected_components=cc(Graph,n)
	N=len(connected_components)
	if(N<K):
		return -1
	elif N==K:
		return sum(musuem)
	else:
		sum_mus=[]
		for c_list in connected_components:
			s=0
			for i in c_list:
				s=s+musuem[i]
			sum_mus.append(s)
	return fun_game(sum_mus,K)


print(p())
