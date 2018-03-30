def find(c,list,k,to_shift):
	#print(" in find ",c ,list,k,to_shift)
	gap_required=to_shift[1]-to_shift[0]+1
	start=0
	for (i,j) in list:
		gap=i-start-1
		start=j
		if(gap>=gap_required):
			list.remove(to_shift)
			return Test(c,list,0)
	gap=c-list[-1][1]
	if(gap>=gap_required):
		list.remove(to_shift)
		return Test(c,list,0)
	return False

def Test(c,list,k):
		prev=0
		#print("in Test",c,list,k)
		problamatic=[]
		for (i,j) in list:
			if(i<=prev):
				problamatic.append((i,j))
			prev=j
			#print(problamatic)
		if(not problamatic):
			return True
		if(len(problamatic)>2):
			return False
		if(k==0 and problamatic ):
			return False
		sum_required=0
		for(i,j) in list:
			sum_required=sum_required+(j-i+1)
		if(sum_required > c):
			return False
		to_shift=problamatic[0]
		a=list.index(to_shift)
		if(a>0 and len(problamatic)==1):
			return find(c,list,0,to_shift) or find(c,list,0,list[a-1])
		else:
			return find(c,list,0,to_shift)

         
c,n,k=map(int,input().split())
list=[]
for i in range(n):
	a,b=map(int,input().split())
	list.append((a,b))
list.sort()
if( Test(c,list,k)):
  print("Good")
else:
  print("Bad")