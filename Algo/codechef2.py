def other_to_dec(num,base=2):
    num=str(num)
    return int(num,base)

def fun(binary_list):
	L,R=map(int,input().split())
	s=""
	#print(binary_list,L,R)
	for i in range(31):
		zero=0
		one=0
		for j in range(L-1,R):
			if(binary_list[j][i]=='0'):
				zero+=1
			else:
				one+=1
		if(zero>=one):
			s=s+"1"
		else:
			s=s+"0"
	#print(s)
	print(other_to_dec(s))

def dec_to_base(num,base=2):
	s=""
	while(num!=0):
		rem=num%base
		num=num//base
		s=s+str(rem)
	n=len(s)
	s="0"*(31-n)+s[::-1]
	return s

def sum_(binary_list,n):
	ans=[]
	t=[0]*31
	ans.append(t)
	for i in range(n):
		t=list(binary_list[i])
		t=[int(k)+int(j) for (k,j) in zip(t,ans[i])]
		ans.append(t)
	#print(ans,len(ans))
	return ans

def fun_2(ans_list):
    L,R=map(int,input().split())
    t=[(i-j) for (i,j) in zip(ans_list[R],ans_list[L-1])]
    s=""
    for i in t:
        if 2*i<=(R-L+1):
            s=s+"1"
        else:
            s=s+"0"
    print(other_to_dec(s))
    
N,Q=map(int,input().split())
dlist=list(map(int,input().split()))
binary_list=list(map(dec_to_base,dlist))
ans= sum_(binary_list,N)
for i in range(Q):
    fun_2(ans)
 
