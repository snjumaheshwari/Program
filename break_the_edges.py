def tree_traversal(Tree,root,value):
    child=Tree[root]
    if(not child):
        pass
        #print(value[root])
    else:
        for i in child:
            tree_traversal(Tree,i,value)
        #print(value[root])
            

def sum_traversal(root):
    global Tree,sum_to_binary,value_to_binary,s_or
    child=Tree[root]
    if(not child):
        return (sum_to_binary[root],s_or[root])
    else:
        sum_to=[0]*20
        sum_or=0
        for i in child:
            sum_to=[sum(x) for x in zip(sum_to,sum_traversal(i)[0])]
            sum_or |= sum_traversal(i)[1]
            #print("test",sum_to)
        sum_to_binary[root]=[x+y for x,y in zip(sum_to,value_to_binary[root])]
        s_or[root]= sum_or | value_list[root]
        return (sum_to_binary[root],s_or[root])

def check(root,node,parent=None):
    print("in check",root,node,parent)
    if(value_list[root]==value_list[node]):
       return True
    if(parent==None):
        return False
    else:
        test_list=[x-y for x,y in zip(sum_to_binary[root],sum_to_binary[node])]
        for x,y in zip(test_list,sum_to_binary[node]):
           print(test_list,sum_to_binary[node])
           if((not x and y ) or (x and not y)):
                return False
        else:
            return True

def final_1(root,node,parent=None):
    # proved to be error prone..
    global Tree,count
    child=Tree[node]
    if(not child):
        if(s_or[node]==s_or[root] and check(root,node,parent)):
            count+=1
    else:
        for i in child:
            final_3(root,i,node)
        if(s_or[node]==s_or[root] and check(root,node,parent)):
            count+=1
            

        

def final_2():
    global Tree,N,root
    count=0
    for i in range(N):
        child=Tree[i]
        if(child):
            for j in child:
                if(s_or[j]!=s_or[root]):
                    pass
                elif(value_list[j]==value_list[root]):
                    count+=1
                    print(i,j)
                else:
                    test_list=[x-y for x,y in zip(sum_to_binary[root],sum_to_binary[j])]
                    print(test_list)
                    for x,y in zip(test_list,sum_to_binary[j]):
                        if((x==0 and y !=0) or (x !=0 and y==0)):
                            break
                    else:
                        count+=1
                        print(i,j)
    return count

def final_3():
    """ use level order traversal"""
    child=Tree[root]
    count=0
    while(child):
        i=child.pop(0)
        print(i)
        if(s_or[i]!=s_or[root]):
            pass
        elif(value_list[i]==value_list[root]):
            count+=1
            print("count increment on",i)
            child.extend(Tree[i])
        else:
            test_list=[x-y for x,y in zip(sum_to_binary[root],sum_to_binary[i])]
            print("test_list",test_list)
            for x,y in zip(test_list,sum_to_binary[i]):
                if((x==0 and y !=0) or (x !=0 and y==0)):
                    break
            else:
                count+=1
                print("count incremented on ",i)
            child.extend(Tree[i])
                    
    return count

def dec_to_base(num,base=2):
	s=""
	while(num!=0):
		rem=num%base
		num=num//base
		s=s+str(rem)
	n=len(s)
	s="0"*(20-n)+s[::-1]
	return tuple(map(int,s))


N=int(input())
value_list=list(map(int,input().split()))
def final_3():
    count=0
    return count


Tree=[[] for i in range(N)]
root=set(range(N))

for i in range(N-1):
    t1,t2=map(int,input().split())
    t1=t1-1
    t2=t2-1    
    root.discard(t2)
    Tree[t1].append(t2)

#print(Tree)
#print(root) # it's guerrented that root contains one element only..
root=root.pop()
value_to_binary=list(map(dec_to_base,value_list))
#print(value_to_binary)

#print("tree Traversal")
#tree_traversal(Tree,root,value_list)

sum_to_binary=[ (0,)*19 for i in range(N)]
s_or=[0 for i in range(N)]

# find sum to binary for each node...
    # initilaize with value for leaf node..
for i in range(N):
    if(not Tree[i]):
        sum_to_binary[i]=value_to_binary[i]
        s_or[i]=value_list[i]
            
# use postorder traversal(DFS) for rest...
sum_traversal(root)
print("sum ",sum_to_binary)
print(" sum of or ",s_or)
print(final_3())





