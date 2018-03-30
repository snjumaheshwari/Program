def codechef():
	""" cleaning up"""
	test=int(input())
	for i in range(test):
		n,k=map(int,input().split())
		finished_list=set(map(int,input().split()))
		job_list=set(range(1,n+1))
		job_left=job_list-finished_list
		chef=[]
		assistant=[]
		n=0
		for i in sorted(job_left):
			if(n%2==0):
				chef.append(i)
			else:
				assistant.append(i)
			n=n+1
		print(*chef)
		print(*assistant)
		
def codechef_2():
	""" racing hourses """
	test=int(input())
	for i in range(test):
		waste=int(input())
		hourse_list=list(map(int,input().split()))
		hourse_list.sort()
		min_diff=1000000000
		for i in range(1,waste):
			diff=hourse_list[i]-hourse_list[i-1]
			if(diff<min_diff):
				min_diff=diff
		print(min_diff)

		
def codechef_5():
	""" Nuclear Reactors""" # not getting correct output .. don't know why ?
	num,limit,digits=map(int,input().split())
	list=[0]*digits
	i=0
	while(num!=0):
		x=num%(limit+1)
		num=num//(limit+1)
		list[i]=x
		i=i+1
	print(*list)