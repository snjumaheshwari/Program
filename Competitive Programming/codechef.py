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

test=int(input())
for i in range(test):
    n=int(input())
    l=list(map(int,input().split()))
    problem(n,l)

    
