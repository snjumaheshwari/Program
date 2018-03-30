def fun(list):
	zero_total,one_total=0,0
	duplicate_list=[]
	count=0
	one_index=[]
	zero_index=[]
	for i in list:
		if(i%2==0):
			zero_total+=1
			duplicate_list.append(-1)
			zero_index.append(count)
		else:
			one_total+=1
			duplicate_list.append(1)
			one_index.append(count)
		count+=1
	max_possible_answer=min(zero_total,one_total)*2
	if(zero_total<=one_total):
		return fun2(zero_index,0,zero_total,max_possible_answer)
	else:
		return fun2(one_index,0,one_total,max_possible_answer)
		
		
def fun2(list,start,end,maximum):
	print(list,start,end,maximum)
	if(end<start or maximum ==0):
		return False

	if(list[end-1]-list[start]+1<=maximum):
		return maximum
	if(end==start):
		return "one"
	elif(list[start+1]-list[start] >=list[end-1]-list[end-2]):
		# leave start ...
		return fun2(list,start+1,end,maximum-2)
	else:
		#leave end..
		return fun2(list,start,end-1,maximum-2)
		
		
def fun3(list):
	zero_total,one_total=0,0
	duplicate_list=[]
	count=0
	for i in list:
		if(i%2==0):
			zero_total+=1
			duplicate_list.append(-1)
		else:
			one_total+=1
			duplicate_list.append(1)
			one_index.append(count)
		count+=1
	max_possible_answer=min(zero_total,one_total)*2
	s=max_possible_answer
	print(max_possible_answer)
	ans=0
	sum_duplicate_list=[0]
	su=0
	for i in duplicate_list:
		su=su+i
		sum_duplicate_list.append(su)
	print(sum_duplicate_list)

	while(s!=0):
		for shift in range(0,count-s+1):
			if(sum_duplicate_list[shift+s]-sum_duplicate_list[shift]==0):
				ans+=1
		s=s-2
	return ans

