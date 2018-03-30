"""def fun():
	n,k=map(int,input().split())
	l=list(map(int,input().split()))
	print(fun_2(l,k))
 
 

def fun_2(list,k,lower=1,upper=1000001):
	mid=(upper+lower)//2
	if(lower==upper):
		return lower
	sum=0
	for j in list:
            
		rem=j%mid
		if(rem==0):
			value=j//mid
		else:
			value=j//mid+1
		sum=sum+value
	if(sum>k):
		return fun_2(list,k,mid+1,upper)
	else:
		return fun_2(list,k,lower,mid)

"""
def fun_3():
    n,k=map(int,input().split())
    l=list(map(int,input().split()))
    lower=1
    upper=1000000001
    while(lower!=upper):
                sum=0
                mid=(lower+upper)//2
                for j in l:
                        rem=j%mid
                        if(rem==0):
                                value=j//mid
                        else:
                                value=j//mid+1

                        sum=sum+value
                if(sum>k):
                        lower=mid+1
                else:
                        upper=mid
    print(lower)

        
        
test=int(input())
for i in range(test):
    fun_3() 
