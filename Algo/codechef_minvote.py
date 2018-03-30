def problem(n,list):
	sumlist=[0]*n
	answer=[0]*n
	sumlist[0]=list[0]
	for i in range(1,n):
		sumlist[i]=sumlist[i-1]+list[i]
	for i in range(n):
		count=0
		for j in range(n):
			if(j<i and list[j] >=sumlist[i-1]-sumlist[j]):
				count+=1
			elif(j>i and list[j] >=sumlist[j-1]-sumlist[i]):
				count+=1
		answer[i]=count
	print(*answer)


def problem2(n,list):
            sumlist=[0]*n
            sumlist[0]=list[0]
            for i in range(1,n):
                sumlist[i]=sumlist[i-1]+list[i]
            Graph=[[0]*n for i in range(n)]
            for i in range(n):
                for j in range(i):
                    diff=sumlist[i-1]-sumlist[j]
                    if(list[j]>=diff):
                        Graph[i][j]=1
                    if(list[i]>=diff):
                        Graph[j][i]=1
            for i in range(n):
                    print(sum(Graph[i]),end=" ")


def problem3(n,list):
        Graph=[0]*n
        for i in range(n):
                diff=0
                for j in range(i-1,-1,-1):
                        if(list[i]>=diff):
                                Graph[j]+=1
                                diff=diff+list[j]
                        else:
                                break
        for i in range(n):
                diff=0
                for j in range(i+1,n):
                        if(list[i]>=diff):
                                Graph[j]+=1
                                diff=diff+list[j]
                        else:
                                break
        print(*Graph)
    
test=int(input())
for i in range(test):
    n=int(input())
    l=list(map(int,input().split()))
    problem3(n,l)
 
